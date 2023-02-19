package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_getText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
          d.get("https://www.amazon.in");
          d.manage().window().maximize();
          Thread.sleep(4000);
	
          //xpath by text;
          //d.findelement("//tagname[text()='textname']"));
          
      String text =d.findElement(By.xpath("//a[text()='Mobiles']")).getText();
      System.out.println(text);
          Thread.sleep(3000);
          d.close();
          
	  
	}

}
