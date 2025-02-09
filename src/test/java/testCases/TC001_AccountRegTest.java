package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC001_AccountRegTest extends BaseClass {

	@Test
	public void verify_account_registration() throws InterruptedException
	{
		HomePage hp= new HomePage(driver);
		Thread.sleep(4000);
		hp.clickMyAccount();
		Thread.sleep(4000);
		hp.clickRegister();
		
		AccountRegistrationPage regpage= new AccountRegistrationPage(driver);
		 regpage.setFirstName(randomeString().toUpperCase());
		 Thread.sleep(4000);
		 regpage.setLastName(randomeString().toUpperCase());
		 Thread.sleep(4000);
		 regpage.setEmail(randomeString()+"@gmail.com");
		 Thread.sleep(4000);
		 regpage.setTelephone(randomeNumber());
		 Thread.sleep(4000);
		 
		 String password = randomeAlphabetic();
		 
		 regpage.setPassword(password);
		 Thread.sleep(4000);
		 regpage.setConfirmPassword(password);
		 Thread.sleep(4000);
		 regpage.setPrivacyPolicy();
		 Thread.sleep(4000);
		 regpage.clickContinue();
		 Thread.sleep(4000);
		 String confmsg = regpage.getConfirmationMsg();
		 Assert.assertEquals(confmsg,"Your Account Has Been Created!");
		 
	}
}
