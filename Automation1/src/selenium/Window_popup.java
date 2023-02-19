package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Window_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://demo.guru99.com/popup.php ");
		dr.manage().window().maximize();
		Thread.sleep(4000);
   
		dr.findElement(By.linkText("Click Here")).click();
		Thread.sleep(3000);
		
		
		
		Set<String> s=dr.getWindowHandles();
		Iterator<String> it=s.iterator();
		
		it.next();
		String w2=it.next();
		
		dr.switchTo().window(w2);
		Thread.sleep(4000);
		
		dr.findElement(By.name("emailid")).sendKeys("garav.3n@gmail.com");
		
			Thread.sleep(4000);
		
			dr.findElement(By.name("btnLogin")).click();
			
			Thread.sleep(4000);
		
			
			
	}

}
