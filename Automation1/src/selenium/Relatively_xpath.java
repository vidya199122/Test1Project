package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relatively_xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");

		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in");
		
		d.manage().window().maximize();
	WebElement g=d.findElement(By.xpath("/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
    // Thread.sleep(3000);

		
	g.sendKeys("jeans");
	
	
	
	}

}
