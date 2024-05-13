package testcase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class baseclass {

	public WebDriver driver;;
	
	public Logger logger;
	public Properties p;
	
	@BeforeClass
	@Parameters({"os","browser"})
	
	public void setup(String os,String br) throws IOException
	{
		 logger = LogManager.getLogger(getClass().getName());
	        logger.info("WebDriver initialized");
	        
	        FileReader file = new FileReader("C:\\Users\\Mickey\\eclipse-workspace\\opencart\\rsource\\config.properties");
	        p = new Properties();  
	        p.load(file);
	        
	        
	        switch(br.toLowerCase()) {
	        case"chrome" : driver = new ChromeDriver(); break;
	        case "firefoxdriver" :  driver =new FirefoxDriver(); break;	        }
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get(p.getProperty("appurl"));
	}


	@AfterClass
	public void teardown()
	{
	driver.quit();	

	}
}
