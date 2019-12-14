package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import pages.LoginPage;
import pages.TravelsCarsExtrasPage;
import pages.TravelsMenuPage;

public class TravelsCarsExtrasTest extends BasicTest {
	
	@BeforeTest
	public void setup() throws InterruptedException {
		super.setup();
		driver.get(baseURL);
		Thread.sleep(2000);
	
		LoginPage lp = new LoginPage(driver);
		lp.loginData();
		Thread.sleep(2000);
	}

	@Test (priority = 5)
	public void newExtras() throws InterruptedException {
		TravelsMenuPage tm = new TravelsMenuPage(driver);
		tm.getCarsBtn().click();
		Thread.sleep(2000);
		tm.getExtras().click();
		
		TravelsCarsExtrasPage tce = new TravelsCarsExtrasPage(driver);
		tce.getAddBtn().click();
		Thread.sleep(2000);
		tce.setName("Seat Warmer");
		tce.setStatus("Yes");
		tce.setPrice("40");
		tce.uploadPicture("images\\PhotoExtras.jpg");
		Thread.sleep(2000);
		tce.getSaveAndReturnBtn().click();
		Thread.sleep(2000);
		
		Assert.assertEquals(tce.isExtrasAdded(), true);
		
	}
	@Test (priority = 10)
	public void priceText() throws InterruptedException {		
		TravelsCarsExtrasPage tce = new TravelsCarsExtrasPage(driver);
		tce.getAddBtn().click();
		Thread.sleep(2000);
		tce.setName("GPS");
		tce.setPrice("Forty");
		tce.getSaveAndReturnBtn().click();
		Thread.sleep(2000);
		
		Assert.assertTrue(tce.errorMsgWhenTextIsInPriceField());
		
	}
}
