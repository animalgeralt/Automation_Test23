package pagesetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageSetup {
	
	WebDriver driver;
	
	@FindBy(id="email")	
	WebElement emailField;
	
	@FindBy(id="pass")
	WebElement passField;
	
	@FindBy(name="login")
	WebElement LoginBtn;
	
	@FindBy(xpath="//a[@data-testid=\"open-registration-form-button\"]")
	WebElement NewAccountButton;
	
	public LoginPageSetup(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void EnterEmail(String email)
	{
		emailField.sendKeys(email);
	}
	
	public String pagetitle()
	{
		return driver.getTitle();
	}
	
	public void EnterPassword(String password)
	{
		passField.sendKeys(password);
	}
	public void ClickLoginBtn()
	{
		LoginBtn.click();
	}
	public boolean emailfieldvisible()
	{
		return emailField.isDisplayed();
	}
	public boolean passwordfieldvisisble()
	{
		return passField.isDisplayed();
	}
	public boolean loginbtnvisible()
	{
		return LoginBtn.isDisplayed();
	}
	public boolean createnewaccountbuttonvisible()
	{
		return NewAccountButton.isDisplayed();
	}
	

}
