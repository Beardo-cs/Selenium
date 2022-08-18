import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/qqa0407/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
          driver.findElement(By.id("autosuggest")).sendKeys("ind");
        
        Thread.sleep(3000);
        
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        
        //enhanced for loop
        for(WebElement option : options)
        {
        	if(option.getText().equalsIgnoreCase("India")) {
        		option.click();
        		break;
        	}
        }
		
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        
        driver.findElement(By.xpath("//a[@value='DEL']")).click();
        
        Thread.sleep(2000);
        
        // If indexes won't be used use parent child traverse
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        
        //it parent and child traverse but giving space bw two xpath.
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
        
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
        	System.out.println("Itz selected");
            Assert.assertTrue(true);
            
        }
        else
        {
        	Assert.assertFalse(false);
        }
        
        driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
        driver.findElement(By.id("divpaxinfo")).click();
        
        for(int j=1; j<5; j++) {
        	
        	driver.findElement(By.id("hrefIncChd")).click();
        }
        
        driver.findElement(By.id("btnclosepaxoption")).click();
WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticDropdown);
		
		dropdown.selectByIndex(3);
		
		System.out.println(dropdown.getFirstSelectedOption().getText());  // get already selected
		//selectall for multiselect 
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText()); 
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
        
        driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
        System.out.println("Completed");

	}

}
