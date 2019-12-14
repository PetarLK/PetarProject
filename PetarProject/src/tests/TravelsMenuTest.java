package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TravelsCarsExtrasPage;
import pages.TravelsMenuPage;

public class TravelsMenuTest extends BasicTest {
	@BeforeTest
	public void setup() throws InterruptedException {
		super.setup();
		driver.get(baseURL);
		Thread.sleep(2000);
	
		LoginPage lp = new LoginPage(driver);
		lp.loginData();
		Thread.sleep(2000);
	}
	
	@Test (priority = 1)
	public void basicLogin() throws InterruptedException {
		TravelsMenuPage mp = new TravelsMenuPage(driver);
		mp.getDashboardBtn().click();
		
		Assert.assertEquals(driver.getTitle(), "Dashboard");
	}
	
	@Test (priority = 2)
	public void clickOnUpdatesCheck() throws InterruptedException {
		TravelsMenuPage mp = new TravelsMenuPage(driver);
		mp.getUpdatesBtn().click();
		
		Assert.assertEquals(driver.getTitle(), "Updates");
	}
	
	@Test (priority = 3)
	public void clickOnModulesCheck() throws InterruptedException {
		TravelsMenuPage mp = new TravelsMenuPage(driver);
		mp.getModulesBtn().click();
		
		Assert.assertEquals(driver.getTitle(), "Modules");
	}
	@Test (priority = 4)
	public void clickOnTourssCheck() throws InterruptedException {
		TravelsMenuPage mp = new TravelsMenuPage(driver);
		mp.getToursBtn().click();
		mp.getTours2Btn().click();
		
		Assert.assertEquals(driver.getTitle(), "Tours Management");
	}
	@Test (priority = 5)
	public void clickOnCouponsCheck() throws InterruptedException {
		TravelsMenuPage mp = new TravelsMenuPage(driver);
		mp.getCouponsBtn().click();
		
		Assert.assertEquals(driver.getTitle(), "Coupon Codes Management");
	}
	@Test (priority = 6)
	public void clickOnNewsletterCheck() throws InterruptedException {
		TravelsMenuPage mp = new TravelsMenuPage(driver);
		mp.getNewsletterBtn().click();
		
		Assert.assertEquals(driver.getTitle(), "Newsletter Management");
	}
	@Test (priority = 7)
	public void clickOnBookingsCheck() throws InterruptedException {
		TravelsMenuPage mp = new TravelsMenuPage(driver);
		mp.getBookingsBtn().click();
		
		Assert.assertEquals(driver.getTitle(), "Booking Management");
	}
}
