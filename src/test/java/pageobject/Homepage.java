package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends basepage
{

	public Homepage(WebDriver d) {
		super(d);}
		// TODO Auto-generated constructor stub
	@FindBy(xpath="//input[@placeholder='Username']") 
	WebElement user_name;
	
	@FindBy(xpath ="//input[@placeholder='Password']")
	WebElement user_password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement user_click;
	
	
	public void setusername(String username)
	{
		user_name.sendKeys(username);
	}
	public void setpassword(String  passworrd)
	{
		user_password.sendKeys(passworrd);
	}
	public void setclick()
	{
		user_click.click();
	}

}
