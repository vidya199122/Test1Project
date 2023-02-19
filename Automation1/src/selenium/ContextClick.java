package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement r=driver.findElement(By.id("twotabsearchtextbox"));

		
		Actions ac=new Actions(driver);
		ac.contextClick(r).perform();
		Thread.sleep(4000);
		ac.contextClick(r).click().build().perform();
		
		
		driver.close();

	}

}
