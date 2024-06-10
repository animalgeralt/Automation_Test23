package logintest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pagesetup.LoginPageSetup;
import utils.BaseFile;


public class facebooktest extends BaseFile{
	
	@Test
     public void testURLValidation()
    {
	  String expected="https://www.facebook.com/";
	  String actual=driver.getCurrentUrl();
	  Assert.assertEquals(actual,expected,"URL Validation failed");
    }
	
	@Test
	public void testtitleValidation()
	{
		LoginPageSetup logpage = new LoginPageSetup(driver);
		String ExpectedTitle = "Facebook – log in or sign up";
		String ActualTitle= logpage.pagetitle();
		Assert.assertEquals(ActualTitle,ExpectedTitle, "Title validation failed");
	}
	
	@Test
	public void testInputFieldValidation()
	{
		LoginPageSetup logpage =new LoginPageSetup(driver);
		Assert.assertTrue(logpage.emailfieldvisible(),"Email Input Field is not displayed");
		Assert.assertTrue(logpage.passwordfieldvisisble(),"Password Field is not displayed");;
	}
	
	@Test
	public void testLoginButtonValidation()
	{
		LoginPageSetup logpage= new LoginPageSetup(driver);
		Assert.assertTrue(logpage.loginbtnvisible(),"Login Button is not displayed");
	}
	
	@Test
	public void testCreateNewAccountButton()
	{
		LoginPageSetup logpage=new LoginPageSetup(driver);
		Assert.assertTrue(logpage.createnewaccountbuttonvisible(),"New Account Button is not displayed");
	}
  
}
