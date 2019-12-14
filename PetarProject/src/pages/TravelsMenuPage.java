package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsMenuPage extends BasicPage {
	
	public TravelsMenuPage(WebDriver driver) {
		super(driver);
	}

	private By dashboardBtn = By.cssSelector("a[href='https://www.phptravels.net/admin']");
	private By updatesBtn = By.cssSelector("a[href='https://www.phptravels.net/admin/updates/']");
	private By modulesBtn = By.cssSelector("a[href='https://www.phptravels.net/admin/settings/modules/']");
	private By toursBtn = By.cssSelector("a[href='#Tours']");
	private By tours2Btn = By.cssSelector("a[href='https://www.phptravels.net/admin/tours']");
	private By toursAddNew = By.cssSelector("a[href='https://www.phptravels.net/admin/tours/add']");
	private By carsBtn = By.cssSelector("a[href='#Cars']");
	private By cars2Btn = By.cssSelector("a[href='https://www.phptravels.net/admin/cars']"); // Cars in Cars menu
	private By extrasBtn = By.cssSelector("a[href='https://www.phptravels.net/admin/cars/extras']");
	private By couponsBtn = By.cssSelector("a[href='https://www.phptravels.net/admin/coupons/']");
	private By newsletterBtn = By.cssSelector("a[href='https://www.phptravels.net/admin/newsletter/']");
	private By bookingsBtn = By.cssSelector("a[href='https://www.phptravels.net/admin/bookings/']");
	private By accountsBtn = By.cssSelector("ul#social-sidebar-menu > li:nth-of-type(5)");
	private By customersBtn = By.cssSelector("a[href='https://www.phptravels.net/admin/accounts/customers/']");

	public WebElement getAccounts () {
		return driver.findElement(this.accountsBtn);
	}
	public WebElement getCustomers() {
		return driver.findElement(this.customersBtn);
	}
	public WebElement getTours2Btn () {
		return driver.findElement(this.tours2Btn);
	}
	public WebElement getExtras() {
		return driver.findElement(this.extrasBtn);
	}
	public WebElement getDashboardBtn () {
		return driver.findElement(this.dashboardBtn);
	}
	public WebElement getUpdatesBtn () {
		return driver.findElement(this.updatesBtn);
	}
	public WebElement getModulesBtn () {
		return driver.findElement(this.modulesBtn);
	}
	public WebElement getToursBtn () {
		return driver.findElement(this.toursBtn);
	}
	public WebElement getToursAddNewBtn () {
		return driver.findElement(this.toursAddNew);
	}
	public WebElement getCouponsBtn () {
		return driver.findElement(this.couponsBtn);
	}
	public WebElement getNewsletterBtn () {
		return driver.findElement(this.newsletterBtn);
	}
	public WebElement getBookingsBtn () {
		return driver.findElement(this.bookingsBtn);
	}
	public WebElement getCarsBtn() {
		return driver.findElement(this.carsBtn);
	}
	public WebElement getCarsBtn2() {
		return driver.findElement(this.cars2Btn);
	}
	
}
