package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Index {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.amazon.in" );
		Thread.sleep(3000);
		
		WebElement t=d.findElement(By.xpath("//a[@class='nav-a  '][4]"));
		t.click();
		
		
		Thread.sleep(3000);
		
		d.navigate().back();
		d.close();

	}

}
