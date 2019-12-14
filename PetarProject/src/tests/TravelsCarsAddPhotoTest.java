package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TravelsCarsPage;
import pages.TravelsMenuPage;

public class TravelsCarsAddPhotoTest extends BasicTest{
	
	@BeforeTest
	public void setup() throws InterruptedException {
		super.setup();
		driver.get(baseURL);
		Thread.sleep(2000);
	
		LoginPage lp = new LoginPage(driver);
		lp.loginData();
		Thread.sleep(2000);
	}
	
	@Test
	public void addPhoto() throws InterruptedException {
		TravelsMenuPage tm = new TravelsMenuPage(driver);
		tm.getCarsBtn().click();
		tm.getCarsBtn2().click();
		
		TravelsCarsPage tc = new TravelsCarsPage(driver);
		tc.getUploadImgs().click();
		tc.getAddPhotos().click();
		tc.uploadPicture("images\\PhotoCars.jpg");
		Thread.sleep(2000);
		
		Assert.assertEquals(tc.isPhotoAdded("PhotoCars"), true);
	}
}
