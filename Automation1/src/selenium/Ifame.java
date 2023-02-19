package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ifame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		dr.manage().window().maximize();
		
		Thread.sleep(4000);

	//	dr.switchTo().frame(0);
	//	Thread.sleep(5000);
	//	dr.findElement(By.linkText("org.openqa.selenium")).click();
		
		int iframesCount = dr.findElements(By.tagName("iframe")).size();

		System.out.println(iframesCount);
		dr.quit();

		
	}

}
