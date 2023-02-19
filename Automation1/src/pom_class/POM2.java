package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2 {
	
	@FindBy(xpath="//input[@name='q']") private WebElement SEARCH;
	
	public POM2(WebDriver driver1) {
		
	PageFactory.initElements(driver1, this);
	
	
	}
	
	
	public void search() {
		
		SEARCH.sendKeys("selenium");
	}

}
