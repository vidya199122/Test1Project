package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_shot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\chromeD\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://www.facebook.com/");
		
	
				
		driver.manage().window().maximize();
			
		Thread.sleep(2000);
				
		File a =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		File b = new File("C:/Users/SONY/Desktop/screenshot.bmp");
				
		FileUtils.copyFile(a, b);
				
				
		

	}

}
