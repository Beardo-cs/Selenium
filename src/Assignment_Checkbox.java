import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/qqa0407/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
        
        
 
        
        for(int i=0;i<2;i++) {
        	
        
        	List<WebElement> chckboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        for(WebElement check : chckboxes) {
        	
        	if(check.isSelected()) {
        	
        		
        		check.click();
        		System.out.println("The checkbox is selection state is - " + check.isSelected());
        		
        		
        		
        	}
        	else
        	{
        		
        		check.click();
        		System.out.println("The checkbox is selection state is - " + check.isSelected());
        		
        	}
        	
        }
        }
        
        List<WebElement> chckboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        System.out.println("Count of the checkbox is "+ chckboxes.size());
	}
        

	}
