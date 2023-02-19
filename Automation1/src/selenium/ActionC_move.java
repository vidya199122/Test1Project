package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionC_move {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.amazon.in");
		dr.manage().window().maximize();
		Thread.sleep(4000);
		
	WebElement s=dr.findElement(By.id("searchDropdownBox"));
		
		Actions f=new Actions(dr);
		f.moveToElement(s).click().build().perform();
		
		//f.click().perform(); instead of this we can write directly.
	
		Thread.sleep(4000);
		dr.close();
		
		

	}

}
