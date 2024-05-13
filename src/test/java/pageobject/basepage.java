package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basepage {

	
	WebDriver driver;
	
	public basepage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver,this);
		
		
	}
	
	
	
	
	
}
