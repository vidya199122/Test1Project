package selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Broken_links {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//capture links from a webpage
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total number of links"+links.size());
		
		
		for(int i=0; i<links.size();i++) {
		//by using href attribute we can get URL of required link 
			WebElement w=links.get(i);  //i=0 1 2 3 4 .....;
			String url= w.getAttribute("href"); // every link attribute name is = href
			verify(url);
		}
		
		
	}	
  public static void verify(String linkUrl) //
  {
	//predifined class 
		
// class
	  
   try {
	  
	   URL url =new URL(linkUrl);
	  //create a connection using url object 'link' 
	HttpURLConnection httpc= (HttpURLConnection)url.openConnection();
   
	httpc.setConnectTimeout(3000);
    
	//establish connection
	httpc.connect();
	
	// after establish connection we have   
    if(httpc.getResponseCode()==200)
    {
    	System.out.println(linkUrl+ " "+httpc.getResponseMessage());
    }

if(httpc.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
{
	System.out.println(linkUrl+ "--"+"broken link");
 
   }
   }
   catch (Exception e) 
    {
		
		
	}
	
	
   }
	
	}
	
