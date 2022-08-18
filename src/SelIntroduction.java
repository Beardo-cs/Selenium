import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome - ChromeDriver extends ->methods  close get.
		//Firefox - FirefoxDriver extends ->methods close get.
		//Safari - SaariDriver extends -> methods close get.
		//WebDriver close get.
		//WebDriver methods + class methods.
		
		//chrome driver path
		System.setProperty("webdriver.chrome.driver", "/home/mahi/Downloads/chromedriver");
		
		//chrome driver path
		//System.setProperty("webdriver.gecko.driver", "/home/mahi/Downloads/geckodriver");
		
		//webdriver.chrome.driver -> value of path.
		WebDriver driver = new ChromeDriver();
		
		//webdriver.gecko.driver -> value of path.
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		//get title
		String tit = driver.getTitle();
		System.out.println(tit);
		
		//verify URL
		System.out.println(driver.getCurrentUrl());
		
		//close chromeDriver for closing of current tab.
		driver.close();
		
		//close all associated tabs after running on test scripts.
		driver.quit();

	}

}