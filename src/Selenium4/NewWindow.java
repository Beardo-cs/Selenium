package Selenium4;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/qqa0407/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//driver.switchTo().newWindow(WindowType.TAB); opens new tab in the same window.
		
		driver.switchTo().newWindow(WindowType.WINDOW); //opens new window 
		
		Set<String> windowID = driver.getWindowHandles();
		

		Iterator <String> id = windowID.iterator();
		
		String parentID = id.next();
		
		String childID = id.next();
		
		driver.switchTo().window(childID);
		
		driver.get("https://www.rahulshettyacademy.com/");
		
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
		
		driver.switchTo().window(parentID);
		
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		
		name.sendKeys(courseName);
		
		File file = name.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("logo.png"));
		
		int nameHeight = name.getRect().getDimension().getHeight();
		
		int nameWidth = name.getRect().getDimension().getWidth();
		
		System.out.println("The height and width of Name Field = " + nameHeight +"*"+ nameWidth);
		
		
		
		
		


		
	}

}
