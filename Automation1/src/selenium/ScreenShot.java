package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScreenShot {

		public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		//file is predifened class ,a is veriable reference to takescreenshot;
		//TakesScreenshot,getScreenshotAs is interface methods, 
		//driver- we have to give web driver reference as driver bcz we have to take screenshot google page;
		//OutputType- interface, we have to import that from selenium;
	//	FILE is interface method(outputType)  
		//file t is reference for path to where we have to store the image;
		//fileUtils is predifend class , we have to import from apache fileutils, its not java or selenium;
		//copy file is static method bcz it's call by classname. and we have store the taken screenshot in folder;
		File a =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File t=new File("C:/Users/SONY/Desktop/k.bmp");
		FileUtils.copyFile(a, t);

	}

}
