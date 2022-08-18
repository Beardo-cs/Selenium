import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Give me the count of the link
		//Count of the link only in footer section 
		System.setProperty("webdriver.chrome.driver", "/home/qqa0407/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		
		//3 Get count of link in the limited scope 
		WebElement columndriver = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//4click on each link of the column and check if the links are open
		for(int i =1; i < columndriver.findElements(By.tagName("a")).size(); i++) {
			
			String clickonLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLink);
			Thread.sleep(5000l);
			
		}
		
		//5. Open link on new tab by clicking on control button and click
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();
		
		while(it.hasNext()) {
			
			driver.switchTo().window(it.next()); //NEXT WINDOW IT WILL GO
			System.out.println(driver.getTitle()); // GET TITLE OF THE WINDOW.
			
		}
		

	}

}
