package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TravelsAddCustomerPage;
import pages.TravelsCarsPage;
import pages.TravelsCustomerPage;
import pages.TravelsMenuPage;
import utils.Scroll;

public class TravelCustomerTest extends BasicTest {
	
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
	public void editCustomer() throws InterruptedException {
		Scroll scroll = new Scroll(driver);
		
		TravelsMenuPage tm = new TravelsMenuPage(driver);
		tm.getAccounts().click();
		Thread.sleep(2000);
		tm.getCustomers().click();
		
		TravelsCustomerPage tc = new TravelsCustomerPage(driver);
		tc.getSearchBtn().click();
		tc.setSearch("Lilly");
		Thread.sleep(2000);
		tc.getEditCustomer().click();
		
		TravelsAddCustomerPage tac = new TravelsAddCustomerPage(driver);
		tac.setFirstName("Katarina");
		tac.setCountry("Serbia");
		scroll.scrollTillTheEndOfThePage();
		tac.getSubmitBtn().click();
		
		tc.getSearchBtn().click();
		tc.setSearch("Katarina");
		Thread.sleep(2000);
		
		Assert.assertEquals(tc.isEditSuccessful("Katarina"), true);
	}
	
}
