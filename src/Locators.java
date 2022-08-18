import java.time.Duration;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;





public class Locators {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

//implicit wait - 2 seconds time out

System.setProperty("webdriver.chrome.driver", "/home/qqa0407/Downloads/chromedriver");

WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

driver.get("https://rahulshettyacademy.com/locatorspractice/");

driver.findElement(By.id("inputUsername")).sendKeys("mahendiran");

driver.findElement(By.name("inputPassword")).sendKeys("123456789");

driver.findElement(By.className("signInBtn")).click();

System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

driver.findElement(By.linkText("Forgot your password?")).click();

Thread.sleep(1000);//

driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("mahi");

driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("mahendiran.msp@gmail.com");

driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("mahendiranmahi2420@gmail.com");

driver.findElement(By.xpath("//form/input[3]")).sendKeys("9944181956");

driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

System.out.println(driver.findElement(By.cssSelector("form p")).getText());

driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

Thread.sleep(1000);

driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Mahi");

driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

driver.findElement(By.id("chkboxOne")).click();

driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

}



}

