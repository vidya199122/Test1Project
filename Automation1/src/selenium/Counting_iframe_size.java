package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Counting_iframe_size {

	public static void main(String[] args) throws InterruptedException {

  System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		
		

         	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.omayo.blogspot.com");

		Thread.sleep(3000);
		int iframesCount = driver.findElements(By.tagName("iframe")).size();

		System.out.println(iframesCount);

		driver.quit();

		}

		
		
	}


