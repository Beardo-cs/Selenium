import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","/home/qqa0407/Downloads/chromedriver" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector("a[class=blinkingText]")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();
		
		String parentID = it.next();
		
		String childID = it.next();
		
		driver.switchTo().window(childID);
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		String mailID = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(parentID);
		
		System.out.println(mailID);
		
		driver.findElement(By.id("username")).sendKeys(mailID);		
		
		
		
		
		
		

	}

}
