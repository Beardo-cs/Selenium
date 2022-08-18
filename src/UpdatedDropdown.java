import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/qqa0407/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
		
        driver.findElement(By.id("divpaxinfo")).click();
        
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        
        Thread.sleep(1000);
        int i=1;
        while(i<5)
        {
        	driver.findElement(By.id("hrefIncAdt")).click();
        	
        	i++;
        }
        
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        
        for(int j=1; j<5; j++) {
        	driver.findElement(By.id("hrefIncChd")).click();
        }
        
        


        driver.findElement(By.id("btnclosepaxoption")).click();
}
}
