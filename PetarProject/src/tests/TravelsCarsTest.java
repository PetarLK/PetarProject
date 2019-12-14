package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TravelsCarsPage;
import pages.TravelsMenuPage;

public class TravelsCarsTest extends BasicTest {
	
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
	public void nmbrOfRentedCars() throws InterruptedException {
		TravelsMenuPage tm = new TravelsMenuPage(driver);
		tm.getCarsBtn().click();
		tm.getCarsBtn2().click();
		
		TravelsCarsPage tc = new TravelsCarsPage(driver);
		
		Assert.assertEquals(tc.isNumberOfRentedCars10(), false);
	}
	
	@Test (priority = 10)
	public void totalNmbrOfRentedCars() throws InterruptedException {
		TravelsMenuPage tm = new TravelsMenuPage(driver);
		tm.getCarsBtn().click();
		tm.getCarsBtn2().click();
		
		TravelsCarsPage tc = new TravelsCarsPage(driver);
		
		Assert.assertEquals(tc.isTotalNumberOfRentedCarsMoreThen50(), false);
	}
}
