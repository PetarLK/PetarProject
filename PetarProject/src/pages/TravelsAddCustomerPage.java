package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TravelsAddCustomerPage extends BasicPage{
	
	public TravelsAddCustomerPage(WebDriver driver) {
		super(driver);
	}

	private By inputFirstName = By.cssSelector("input[name='fname']");
	private By inputLastName = By.cssSelector("input[name='lname']");
	private By inputEmail = By.cssSelector("input[name='email']");
	private By inputPassword = By.cssSelector("input[name='password']");
	private By inputMobileNmbr = By.cssSelector("input[name='mobile']");
	private By inputAdress1 = By.cssSelector("input[name='address1']");
	private By inputAdress2 = By.cssSelector("input[name='address2']");
	private By country = By.cssSelector("select[name='country']");
	private By status = By.cssSelector("select[name='status']");
	private By emailNewsletterSubscriber = By.cssSelector("input[class='checkbox']");
	private By submitBtn = By.cssSelector(".panel-footer .btn");
	
	public void setCountry(String Country) {
		WebElement countrySET = driver.findElement(this.country);
		Select countrySet = new Select(countrySET);
		countrySet.selectByVisibleText(Country);
	}
	
	public void setStatus(String Status) {
		WebElement statusSET = driver.findElement(this.status);
		Select SETstatus  = new Select(statusSET);
		SETstatus.selectByVisibleText(Status);
	}
	
	public void setFirstName (String firstname) {
		WebElement firstName = driver.findElement(this.inputFirstName);
		firstName.clear();
		firstName.sendKeys(firstname);
	}
	public void setLastName (String lastname) {
		WebElement lastName = driver.findElement(this.inputLastName);
		lastName.clear();
		lastName.sendKeys(lastname);
	}
	public void setEmail (String email) {
		WebElement eMail = driver.findElement(this.inputEmail);
		eMail.clear();
		eMail.sendKeys(email);
	}
	public void setPassword (String password) {
		WebElement pw = driver.findElement(this.inputPassword);
		pw.clear();
		pw.sendKeys(password);
	}
	public void setMobileNmbr (String mobile) {
		WebElement mobileNmbr = driver.findElement(this.inputMobileNmbr);
		mobileNmbr.clear();
		mobileNmbr.sendKeys(mobile);
	}
	public void setAdress1 (String adress1) {
		WebElement adrs1 = driver.findElement(this.inputAdress1);
		adrs1.clear();
		adrs1.sendKeys(adress1);
	}
	public void setAdress2 (String adress2) {
		WebElement adrs2 = driver.findElement(this.inputAdress2);
		adrs2.clear();
		adrs2.sendKeys(adress2);
	}
	public WebElement getSubmitBtn () {
		return driver.findElement(this.submitBtn);
	}
	public void checkEmailNewsletterSubscriber () {
		driver.findElement(this.emailNewsletterSubscriber).click();
	}
}
