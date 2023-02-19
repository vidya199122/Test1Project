package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Total_numLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		
List<WebElement> w=	driver.findElements(By.tagName("a"));
		System.out.println(w.size());
		
		for(int i=0;i<w.size();i++) {
			String c=w.get(i).getText();
			Thread.sleep(3000);
			System.out.println(c);
			driver.close();
			
		}

	}

}
