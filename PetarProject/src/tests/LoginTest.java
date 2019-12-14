package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;



public class LoginTest extends BasicTest {
	
	@Test
	public void basicLogin() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(2000);
		
		LoginPage lp = new LoginPage(driver);
		lp.loginData();
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.getTitle(), "Dashboard");
	}
}
