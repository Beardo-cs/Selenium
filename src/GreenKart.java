import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKart {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/home/qqa0407/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(5));
		
		
		
		
		String[] items = {"Cucumber", "Brocolli", "Beetroot"};
		
		GreenKart g = new GreenKart();
		
		additems(driver, items);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));
		
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}
	public static void additems(WebDriver driver, String[] items) {
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		
		for (int i = 0; i < products.size(); i++) {
			
			String[] names = products.get(i).getText().split("-");
			//Format it to get actuaal vegetable name.
			//Convert array into array list for easy search.
			//Check whether name you extracted is present in arraylist or not.
			
			String formattedText = names[0].trim();
			
			
			List itemsneededlist = Arrays.asList(items);
			
			if (itemsneededlist.contains(formattedText)) {
				
				//click on add to cart.   
				//dynamic changing of text below will not work so traverse
				
				//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				driver.findElements(By.xpath("//div[@class='product-action'] /button")).get(i).click();
				
				int j=0;
				if(j==items.length) {
					break;
				}

			}
		}
	}

}
