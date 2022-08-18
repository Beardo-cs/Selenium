import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/qqa0407/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
        
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        
        driver.findElement(By.xpath("//a[@value='CCU']")).click();
        
        Thread.sleep(2000);
        
        // If indexes won't be used use parent child traverse
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        
        //it parent and child traverse but giving space bw two xpath.
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        
        
        
		

	}

}
