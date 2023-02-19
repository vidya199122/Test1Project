package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.uitestpractice.com/Students/Actions");
	
	driver.manage().window().maximize();
	WebElement el=driver.findElement(By.id("draggable"));
	WebElement el1=driver.findElement(By.id("droppable"));
	Thread.sleep(4000);
	
	Actions ac=new Actions(driver);
	ac.dragAndDrop(el, el1).perform();
	
	
		
	
	
	}

}
