
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/qqa0407/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

		driver.manage().window().maximize();

		// driver.manage().deleteAllCookies();

		/*
		 * and then click any button or url to navigate to homepage and then verify url
		 * of the homepge
		 */

		// driver.manage().addCookie("vikram");

		// File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		TakesScreenshot src =((TakesScreenshot)driver);
//		//FileUtils.copyFile(src,new File("~/Pictures/Screenshot/Screenshot.png"));
//		File SrcFile=src.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination

//            File DestFile=new File("~/Pictures/Screenshot/Screenshot.png");
//
//            //Copy file at destination
//
//            FileUtils.copyFile(SrcFile, DestFile);
//            
		String filename = "/home/qqa0407/Pictures/Screenshot/" + "google" + ".png";
		// viewFiles.click();
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(filename), true);

	}

}
