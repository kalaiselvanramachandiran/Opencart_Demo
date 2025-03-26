package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	//locating and intializing the webelement 
	@FindBy(xpath = "((//span[normalize-space()='My Account'])[1]")
	WebElement myAccount;
	@FindBy(xpath="//a[normalize-space()='Register'])[1]")
	WebElement clkRegister;
	
	// Action Methods
	public void clickMyAccount() {
		myAccount.click();
	}
	public void clickRegister() {
		clkRegister.click();
	}

}
