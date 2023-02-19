package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ""
				+ "");
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.amazon.in");
		dr.manage().window().maximize();
		Thread.sleep(4000);
		WebElement a=dr.findElement(By.id("icp-language-settings"));
		
		
		Select s= new Select(a);
		
		s.selectByValue("New Releases");
	
	
	
	}
			

}
