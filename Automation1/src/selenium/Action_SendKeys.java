package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_SendKeys {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
    	WebDriver dr= new ChromeDriver();
	
    //	dr.manage().window().maximize();
    	dr.get("https://www.amazon.in");
    	dr.manage().window().maximize();
    	
    	
    	dr.findElement(By.id("searchDropdownBox")).click();
		Thread.sleep(4000);
		
		Actions ac=new Actions(dr);

		 for(int i=1;i<=9;i++) {
			 ac.sendKeys(Keys.ARROW_DOWN).build().perform();
			 Thread.sleep(1000);
		 }
		 
		 for(int i=1;i<=6;i++) {
			 ac.sendKeys(Keys.ARROW_UP).build().perform();
			 Thread.sleep(3000);
		 }
		 ac.sendKeys(Keys.ENTER).build().perform();
	//	 dr.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]/div/div")).click();
		dr.close();
	}

}
