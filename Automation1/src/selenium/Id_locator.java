package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/chromedriver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
	
	 
		d.get("https://www.amazon.in");
	 
	     d.manage().window().maximize();
	    Thread.sleep(4000);
	    
	
 	 d.findElement(By.name("field-keywords")).sendKeys("t-shirt");
 	 Thread.sleep(4000);
 	 
 	 d.close();

	}	
	
}