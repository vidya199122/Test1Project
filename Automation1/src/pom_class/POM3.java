package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM3 {
	
	@FindBy(xpath="//a[@class='gb_d']") private WebElement GMAIL;
	
	POM3(WebDriver driver1){
		
		PageFactory.initElements(driver1, this);
	}

	public void gmail() {
		
		GMAIL.click();
	}
}
