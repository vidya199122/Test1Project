package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_L {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/chromedriver/chromedriver.exe" );
  WebDriver Driver=new ChromeDriver();
  Driver.get("https://www.google.co.in");
  Driver.manage().window().maximize();
//  Driver.findElement(By.tagName("a")).click();
  //Driver.findElement(By.tagName("input")).click();
 Driver.findElement(By.name("search")).sendKeys("t-shirts");
 // WebElement searchbox= Driver.findElement(By.tagName("input"));
 // searchbox.sendKeys("t-shirts");
   
 //  WebElement v=Driver.findElement(By.id("voiceSearchButton"));
  // v.sendKeys("hello");
 
  
  
	
	}

}
