import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/home/qqa0407/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("password")).sendKeys("learning");
		
		driver.findElement(By.xpath("//span[contains(text(),'User')]")).click();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		
		driver.findElement(By.id("okayBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select.form-control")));
		
		WebElement dropdown = driver.findElement(By.cssSelector("select.form-control"));
		
		Select abc = new Select(dropdown);
		
		abc.selectByVisibleText("Consultant");
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("terms")));
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("signInBtn")).click();
		
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("button[class='btn btn-info']")));
		
		Thread.sleep(10000);
		
		
		
		List<WebElement> options = driver.findElements(By.cssSelector("button[class='btn btn-info']"));
				
				for(WebElement option: options) {
					option.click();
				}
				
				driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
				
		
	}

}
