import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/qqa0407/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
        System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
        
        Assert.assertFalse(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
        
//        Boolean yes = driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected();
//        
//        if(yes) {
//        	
//        	System.out.println("Selected");
//        	
//        	
//        }
//        else 
//        {
//        	System.out.println("Unselected");
//        }
        driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
        
        System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
        
        Assert.assertTrue(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
        
        System.out.println(driver.findElements(By.cssSelector("input[type= 'checkbox']")).size());

	}

}
