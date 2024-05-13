package testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobject.Homepage;


public class test_case_one extends baseclass{
	
		
	



@Test(priority = 1)
void page() 
{
	
	logger.info("*******starting*");
	Homepage t1 = new Homepage(driver);

	t1.setusername("Admin");
	logger.info("******entering username ********");
	t1.setpassword("admin123");
	logger.info("******entering password********");
	t1.setclick();
	logger.info("******clicking button********");
	
}}
