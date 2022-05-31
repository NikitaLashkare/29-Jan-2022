package AmazonTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pomClasses.AmazonLoginPage;
import pomClasses.ApplicationHeader;

public class VerifyAmazonPage {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","I:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		AmazonLoginPage amazonLoginPage = new AmazonLoginPage(driver);
		amazonLoginPage.loginAccount();
		amazonLoginPage.sendID();
		amazonLoginPage.clickOnContinues();
		amazonLoginPage.sendPassword();
		amazonLoginPage.clickOnsignInSubmit();
		
		
		ApplicationHeader applicationHeader = new ApplicationHeader(driver);
		applicationHeader.ClickOnAll();				
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		Assert.assertEquals("https://www.amazon.in/?ref_=nav_ya_signin&", url);
		Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in" , title);
//		System.out.println("Pass");
//		System.out.println("Failed");
		Thread.sleep(5000);
		
		applicationHeader.ClickOnbestSellers();
		Thread.sleep(5000);
		String url1=driver.getCurrentUrl();
		String title1=driver.getTitle();
		System.out.println(url1);
		System.out.println(title1);
//		
//		applicationHeader.ClickOnmobiles();
//		
//		applicationHeader.ClickOncustomerService();
//		
		
	}

}
