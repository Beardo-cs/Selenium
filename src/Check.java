import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/home/qqa0407/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/shop");

		//WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));

		List<WebElement> options = driver.findElements(By.cssSelector("button[class='btn btn-info']"));

		for (WebElement option : options) {
			option.click();
		}

	}

}
