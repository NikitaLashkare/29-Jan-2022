package AmazonTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClasses.AmazonLoginPage;
import pomClasses.ApplicationHeader;

public class TestApplication {
	WebDriver driver;
	ApplicationHeader applicationHeader;
	AmazonLoginPage amazonLoginPage;

	@BeforeClass
	public void launchTheBrowser()
	{
		System.setProperty("webdriver.chrome.driver","I:\\chromedriver.exe");
		driver =new ChromeDriver();
	}
	
	@BeforeMethod
	public void loginToApplication() throws InterruptedException
	{
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(1000);
		amazonLoginPage = new AmazonLoginPage(driver);
		amazonLoginPage.loginAccount();
		amazonLoginPage.sendID();
		amazonLoginPage.clickOnContinues();
		amazonLoginPage.sendPassword();
		amazonLoginPage.clickOnsignInSubmit();
		
		applicationHeader = new ApplicationHeader(driver);
	}
	
	@Test
	public void verifyClickOnAll()
	{
		
		applicationHeader.ClickOnAll();				
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		Assert.assertEquals("https://www.amazon.in/?ref_=nav_ya_signin&", url);
		Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in" , title);
	}
	
	@Test
	public void verifyClickOnbestSellers() throws InterruptedException
	{
		Thread.sleep(1000);
		applicationHeader.ClickOnbestSellers();				
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		Assert.assertEquals("https://www.amazon.in/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2", url);
		Assert.assertEquals("Amazon.in Bestsellers: The most popular items on Amazon",title);
	}
//	@Test
//	public void verifyClickOnmobiles()
//	{
//		applicationHeader.ClickOnmobiles();				
//		String url=driver.getCurrentUrl();
//		String title=driver.getTitle();
//		System.out.println(url);
//		System.out.println(title);
//		Assert.assertEquals("",url);
//		Assert.assertEquals(" " ,title);
//		
//	}
//	@Test 
//	public void verifyClickOncustomerService()
//	{
//		applicationHeader.ClickOncustomerService();				
//		String url=driver.getCurrentUrl();
//		String title=driver.getTitle();
//		System.out.println(url);
//		System.out.println(title);
//		Assert.assertEquals
//		Assert.assertEquals
//	}
//	
//	@AfterMethod
//	public void clickOnList()
//	{
//		applicationHeader.clickOnList();
//	}
//	
//	@AfterClass
//	public void logout()
//	{
//		applicationHeader.ClickOnsignOut();
//		
//	}
	
}
