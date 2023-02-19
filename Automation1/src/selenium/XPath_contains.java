package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_contains {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in");
		d.manage().window().maximize();
	 
	WebElement g=d.findElement(By.xpath("//a[contains(text(),'Fashion')]"));
	g.click();
	Thread.sleep(4000);
	
	d.navigate().back();
	Thread.sleep(5000);
		d.close();
		WebElement h=g;
		System.out.println(h.getText());
		
		
	
	
	}
}
