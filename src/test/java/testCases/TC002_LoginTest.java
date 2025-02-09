package testCases;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class TC002_LoginTest extends BaseClass
{

	@Test
	public void verify_login() throws InterruptedException
	{
		try {
		 //HomePage
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		//Login
		LoginPage lp=new LoginPage(driver);
		lp.setEmail("narayanbiswas86@gmail.com");
		Thread.sleep(4000);
		lp.setPassword("Clayton2019!");
		Thread.sleep(4000);
		lp.clickLogin();
		Thread.sleep(4000);
		
		//MyAccount
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetPage = macc.isMyAccountPageExists();
		Assert.assertTrue(targetPage);
		}
		catch (Exception e)
		{
			Assert.fail();
		}
	}
}
