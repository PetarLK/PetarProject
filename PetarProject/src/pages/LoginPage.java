package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ExcelUtils;

public class LoginPage extends BasicPage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	private By email = By.cssSelector("input[name='email']");
	private By password = By.cssSelector("input[name='password']");
	private By loginBtn = By.cssSelector("button[data-wow-delay='s']");
	private By checkBox = By.cssSelector(".checkbox"); // Remember me checkbox
	private By forgotPW = By.id("link-forgot");
	
	public void setEmail(String email) {
		this.driver.findElement(this.email).sendKeys(email);
	}
	public void setPassword(String password) {
		this.driver.findElement(this.password).sendKeys(password);
	}
	public void clickOnLogin() {
		this.driver.findElement(this.loginBtn).click();
	}
	public void checkRememberMe () {
		this.driver.findElement(this.checkBox).click();
	}
	public void clickOnForgotPassword () {
		this.driver.findElement(this.forgotPW).click();
	}
	public void loginData() {
		ExcelUtils ex = new ExcelUtils();
		ex.setExcell("C:\\Users\\Petar\\Documents\\GitProject\\Project\\PetarProject\\Username.xlsx");
		ex.setWorkSheet(0);
		for (int i = 1; i < ex.getRowNumber(); i++)
		{
			this.setEmail(ex.getDataAt(i, 0));
			this.setPassword(ex.getDataAt(i, 1));
			clickOnLogin();
		}
		ex.closeExcell();
	}
	
}
