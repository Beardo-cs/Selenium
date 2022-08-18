import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumIntro {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/qqa0407/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Mahendiran");
		driver.findElement(By.name("inputPassword")).sendKeys("mahe1234");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Mahi");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Mahe124@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("mahemahe124@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9944181956");
		driver.findElement(By.cssSelector("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	}

}
