package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC001_AccountRegistrationTest {
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		ChromeOptions options = new ChromeOptions();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
	}
//	@AfterClass
//	public void tearDown()
//	{
//		driver.quit();
//	}
	@Test
	public void verify_Account_Registration()
	{
		HomePage hp=new HomePage(driver);
		hp.clickRegister();
		hp.clickMyAccount();
		AccountRegistrationPage ap=new AccountRegistrationPage(driver);
		ap.setFirstName("kalai");
		ap.setLastName("xyz");
		ap.setEmail("aksl@gmail.com");
		ap.setPassword("Kalai@123");
		ap.clickPrivacy();
		ap.clickButton();
		String confirmsg=ap.getConfirmMsg();
		Assert.assertEquals(confirmsg, "Your Account Has Been Created!");
	}

}
