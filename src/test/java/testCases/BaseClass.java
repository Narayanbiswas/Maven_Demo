package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public WebDriver driver;
	
	@BeforeClass
	
	public void setup()
	{
		
		
		   driver = new ChromeDriver();
		    driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
			driver.get("https://tutorialsninja.com/demo/");
					
			driver.manage().window().maximize();
					
	}
	
	@AfterClass
	public void tearup()
	{
		driver.quit();
	}
	
	public String randomeString()
	{
		
		
		String generatedstring = RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
	}
	
	public String randomeNumber()
	
	{
		
		String generatednumber = RandomStringUtils.randomNumeric(10);
		return generatednumber;
	}
public String randomeAlphabetic()
	
	{
	String generatedstring = RandomStringUtils.randomAlphabetic(5);	
	String generatednumber = RandomStringUtils.randomNumeric(10);
		return (generatedstring +"@"+ generatednumber);                               
	}
}
