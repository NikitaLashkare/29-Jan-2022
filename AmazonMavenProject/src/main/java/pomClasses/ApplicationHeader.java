package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationHeader {
	
	WebDriver driver;
	WebDriverWait wait;

	@FindBy (xpath = "//a[@id='nav-hamburger-menu']" ) private WebElement all;
	@FindBy (xpath = "(//a[text()='Best Sellers']" ) private WebElement bestSellers ;
	@FindBy (xpath = "//a[text()='Mobiles']" ) private WebElement mobiles;
	@FindBy (xpath = "(//a[text()='Customer Service'])[1]" ) private WebElement customerService;
	@FindBy (xpath = "//a[@id='nav-link-accountList']") private WebElement loginAccount;
	@FindBy (xpath = "//span[text()='Sign Out']") private WebElement signOut;
	
	public ApplicationHeader(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnAll()
	{
//		wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.visibilityOf(all));
		all.click();
	}
	
	public void ClickOnbestSellers()
	{
//		wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.visibilityOf(bestSellers));
		bestSellers.click();
	}
	
	public void ClickOnmobiles()
	{	
//		wait=new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.visibilityOf(mobiles));
		mobiles.click();
	}
	public void ClickOncustomerService()
	{
//		wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.visibilityOf(customerService));
		customerService.click();
	}
	public void clickOnList()
	{
		Actions act =new Actions(driver);
		act.moveToElement(loginAccount).moveToElement(signOut).click().build().perform();
	}
	public void ClickOnsignOut()
	{
		signOut.click();
	}
}
