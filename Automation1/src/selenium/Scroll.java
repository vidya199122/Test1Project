package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		
		dr.get("https://www.amazon.in");
        dr.manage().window().maximize();
        Thread.sleep(4000);
	
	JavascriptExecutor j= (JavascriptExecutor)dr;
/*	j.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(3000);
	 j.executeScript("window.scrollBy(0,2150)");
	Thread.sleep(4000);
	j.executeScript("window.scrollBy(0,-1000)");
//	Thread.sleep(2000);
	*/
//	WebElement clk=dr.findElement(By.linkText("Mobiles"));
	
	//j.executeScript("arguments[0].click()", clk );
	
	WebElement searchBox=dr.findElement(By.id("twotabsearchtextbox"));
	j.executeScript("arguments[0].value='shirts'",searchBox);
	
	
	
	}
	

}
