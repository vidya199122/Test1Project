package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname_L {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//webdriver variable can hold the chrome driver class object because chromedriver is class implement the webdriver interface;
		//is an interface , object we are just up casted chromedriver in webdriver;
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		//driver.findElement(By.tagName("button")).click();
		driver.findElement(By.tagName("a")).click();
		
	}

}
