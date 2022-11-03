package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(className = "Sign In")
	public
	WebElement linkLogin;
	@FindBy(id = "email" )
	WebElement txtEmail;
	@FindBy(id="password")
	WebElement txtPassword;
	@FindBy(id="Sign In")
	WebElement btnSignIn;
	@FindBy(className = "Sign Out")
	public
	WebElement linkLogout;
	@FindBy(xpath = "//li[contains(text(),'Authentication failed.')]")
	WebElement lblAuthError;
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
}
