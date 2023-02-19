package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ac_send_keys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		Boolean w=driver.findElement(By.id("email")).isEnabled();
		System.out.println(w);
		
       driver.findElement(By.id("email")).sendKeys("abcd");
       Thread.sleep(4000);
		
       Actions ac=new Actions(driver);
       
       ac.sendKeys(Keys.TAB).build().perform();
		 driver.close();
		
		

	}

}
