package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        
        
        
       WebElement hide=driver.findElement(By.id("hide-textbox"));
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        
        jse.executeScript("window.scrollBy(0,200)");
        Thread.sleep(4000);
        jse.executeScript("arguments[0].click()", hide);

	}

}
