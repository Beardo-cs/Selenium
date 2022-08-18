import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/home/qqa0407/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(
				By.cssSelector("div[id='checkbox-example'] fieldset label[for='bmw'] input[id='checkBoxOption1']"))
				.click();

		String text = driver.findElement(By.cssSelector("div[id='checkbox-example'] fieldset label[for='bmw']"))
				.getText();
		System.out.println(text);

		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));

		Select dropdown = new Select(staticDropdown);

		dropdown.selectByVisibleText(text);
		
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(text);
		
		driver.findElement(By.id("alertbtn")).click();
		
	    System.out.println(driver.switchTo().alert().getText().split(",")[0].split(" ")[1]);
	    
	    driver.switchTo().alert().accept();
	}

}
