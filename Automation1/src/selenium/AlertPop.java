package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		
		dr.get("http://demo.guru99.com/test/delete_customer.php ");
	
	dr.manage().window().maximize();
	Thread.sleep(3000);
	dr.findElement(By.name("cusid")).sendKeys("arvind");
	
	Thread.sleep(4000);
	dr.findElement(By.name("submit")).click();
	Thread.sleep(4000);
	
	Alert alt=dr.switchTo().alert();
//	alt.dismiss();
	//alt.accept();
	
  String s=alt.getText();
	System.out.println(s);

	dr.close();
	
	}

}
