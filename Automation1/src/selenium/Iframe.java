package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/chromedriver/chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		dr.manage().window().maximize();
		
		dr.switchTo().frame(0);
		dr.findElement(By.linkText("org.openqa.selenium.bidi")).click();
		
		Thread.sleep(3000);
		
		dr.switchTo().parentFrame();
		
		Thread.sleep(5000);
		
		dr.switchTo().frame(2);
		dr.findElement(By.linkText("Credentials")).click();
		
	}

}
