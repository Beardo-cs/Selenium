package streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamWebTable {

	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/home/qqa0407/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		
		//capture text of all webElements into new(Original) list.
		List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort on the original list of step 3 -> sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		//compare original list vs sorted list.
		Assert.assertTrue(originalList.equals(sortedList));
		
		//scan the name column with getText-> Beans -> print the price of the Rice.
		//Single Pge
//		List<String> price = elementList.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceVeg(s))
//		.collect(Collectors.toList());
//		//to print filtered value 
//		price.forEach(a->System.out.println(a));
		
		//to check all the page
		List<String> price;
		//scan the name which is present in all the page or not.
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			price = rows.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeg(s))					.collect(Collectors.toList());
//					to print filtered value 
			price.forEach(a->System.out.println("Price of the Rice  "+a));
			if(price.size()<1) {
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
				
			}
					
			
		}
		while(price.size()<1);
		

	}

	private static String getPriceVeg(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
