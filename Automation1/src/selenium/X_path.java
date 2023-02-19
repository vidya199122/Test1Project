package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
	
		d.get("https//www.amazon.in");
	     Thread.sleep(3000);
	     
	     //d.findElements("\\tagname[@attributename='attributevlaue']"));
	     d.manage().window().maximize();  //by xpath attributename and attribute value;
	  d.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("t.shirts");
		
		

	}

}
