package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	//locating elements
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstname;
	@FindBy(xpath="(//input[@id='input-lastname'])[1]")
	WebElement txtLastname;
	@FindBy(xpath="(//input[@id='input-email'])[1]")
	WebElement txtemail;
	@FindBy(xpath="(//input[@id='input-password'])[1]")
	WebElement txtPassword;
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement ContinueButton;
	@FindBy(xpath="//input[@name='agree']")
	WebElement BtnPrivacy;
	
	@FindBy(xpath="(//h1[normalize-space()='Your Account Has Been Created!'])[1]")
	WebElement ConfirmMsg;
	
	//Action methods
	
	public void setFirstName(String fname)
	{
		txtFirstname.sendKeys(fname);
		
	}
	public void setLastName(String lname)
	{
		txtLastname.sendKeys(lname);
	}
	public void setEmail(String email)
	{
		txtemail.sendKeys(email);
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void clickPrivacy()
	{
		BtnPrivacy.click();
	}
	
	public void clickButton()
	{
		ContinueButton.click();
	}
	public String getConfirmMsg()
	{
		try {
			return(ConfirmMsg.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}


}
