package selenium;






import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");

		
      Point p=new Point(200,300);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		
		Dimension d=new Dimension(400,400);
	     driver.manage().window().setSize(d);
		

	}

}
