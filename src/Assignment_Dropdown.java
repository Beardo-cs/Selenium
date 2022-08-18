import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/qqa0407/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//driver.findElement(By.id("autocomplete")).click();
		
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	    
	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 

		
		
				
		

	}

}
