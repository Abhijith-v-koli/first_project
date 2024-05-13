package open_cart_2024.opencart;

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
