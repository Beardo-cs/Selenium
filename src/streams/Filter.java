package streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/qqa0407/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
		
		//only 1 result after entered of rice
		List<WebElement> filteredLists = veggies.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		
	
		//1 result only come after stream filter
		
		Assert.assertEquals(veggies.size(), filteredLists.size());
		

	}

}
