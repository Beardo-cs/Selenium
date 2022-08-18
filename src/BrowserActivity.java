import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/qqa0407/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		

		driver.get("https://rahulshettyacademy.com/locatorspractice/"); //It will wait all the components to load, inbuilt sync wait
		
		driver.navigate().to("https://google.com"); //Doesn't wait once any one component loaded.
		
		driver.navigate().back();
		
		driver.navigate().forward();


	}

}
