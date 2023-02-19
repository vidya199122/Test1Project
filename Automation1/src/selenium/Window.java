package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.google.co.in");
		dr.manage().window().maximize();
		Thread.sleep(4000);
   

		dr.findElement(By.tagName("input")).click();
	Actions ac=new Actions(dr);
	
		
		
		
	
	}

}
