package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage {
	
	WebDriver driver;
	
	@FindBy (xpath = " //input[@id='ap_email'] " ) private WebElement id;
	@FindBy (xpath = " //input[@id='continue'] " ) private WebElement continues;
	@FindBy (xpath = " //input[@type='password']" ) private WebElement password;
	@FindBy (xpath = "//input[@id='signInSubmit']" ) private WebElement signInSubmit;
	@FindBy (xpath = "//a[@id='nav-link-accountList']") private WebElement loginAccount;
	
	public AmazonLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void sendID()
	{
		id.sendKeys("8830430750");
	}
	public void clickOnContinues()
	{
		continues.click();
	}
	public void sendPassword()
	{
		password.sendKeys("123456789");
	}
	public void clickOnsignInSubmit()
	{
		signInSubmit.click();
	}
	public void loginAccount()
	{
		loginAccount.click();
	}
	
}
