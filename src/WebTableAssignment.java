import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/qqa0407/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		System.out.println(driver.findElements(By.xpath("//table[@name='courses'] /tbody /tr")).size());
		
		System.out.println(driver.findElements(By.xpath("//table[@name='courses'] /tbody /tr /th")).size());
		
		System.out.println(driver.findElement(By.xpath("//table[@name='courses'] /tbody /tr[3]")).getText());
	}

}
