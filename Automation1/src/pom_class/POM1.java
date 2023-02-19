package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM1 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		
		driver1.get("https://www.google.co.in");
	
	    driver1.manage().window().maximize();
	    Thread.sleep(4000);
	 
	
	    POM2 pm=new POM2(driver1);
	    pm.search();
	    
	    Thread.sleep(3000);
	    POM3 pm1=new POM3(driver1);
	    pm1.gmail();
	
	}
	
}