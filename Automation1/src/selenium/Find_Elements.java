package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Elements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.amazon.in");
		d.manage().window().maximize();
		Thread.sleep(3000);
		//Wait wait= new FluentWait(WebDriver driver);
		
		
		//Boolean ab=d.findElement(By.linkText("Mobiles")).isEnabled();
		//boolean ab=d.findElement(By.className("hm-icon-label")).isDisplayed();
    String ab=d.findElement(By.linkText("Mobiles")).getText();
		
		System.out.println(ab);
		d.close();
	}

}
