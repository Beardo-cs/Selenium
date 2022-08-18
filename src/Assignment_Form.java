import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_Form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/home/qqa0407/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Mahendiran");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Mahendiran.msp@gmail.com");

		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("1234567890");

		driver.findElement(By.id("exampleCheck1")).click();

		driver.findElement(By.id("exampleFormControlSelect1")).click();

		Thread.sleep(1000);

		/*
		 * driver.findElement(By.xpath("//option[contains(text(),'Male')]")).click();
		 * 
		 * driver.findElement(By.id("inlineRadio1")).click();
		 */

		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));

		Select abc = new Select(dropdown);

		abc.selectByVisibleText("Male");

		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("24022000");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Thread.sleep(1000);

		System.out.println(
				driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	}

}
