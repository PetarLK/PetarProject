package pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TravelsCarsExtrasPage extends BasicPage {
	
	public TravelsCarsExtrasPage(WebDriver driver) {
		super(driver);
	}

	private By addBtn = By.cssSelector("a[data-task='create']");
	private By saveAndReturnBtn = By.cssSelector("a[data-task='save']");
	private By addImgBtn = By.name("xcrud-attach");
	private By name = By.cssSelector(".xcrud-input.form-control");
	private By status = By.cssSelector("select");
	private By price = By.cssSelector("input[data-pattern='numeric']");
	private By extrasAdd = By.cssSelector(".xcrud-row.xcrud-row-0");
	private By errorMsg = By.cssSelector(".xcrud-message.error");
	
	public WebElement getUploadInput() {
		return this.driver.findElement(this.addImgBtn);
	}
	public void uploadPicture(String path) {
		getUploadInput().sendKeys(new File(path).getAbsolutePath());
	}
	public WebElement getAddImgBtn () {
		return driver.findElement(this.addImgBtn);
	}
	public WebElement getAddBtn () {
		return driver.findElement(this.addBtn);
	}
	public WebElement getSaveAndReturnBtn() {
		return driver.findElement(this.saveAndReturnBtn);
	}
	public void setName (String Name) {
		driver.findElement(this.name).sendKeys(Name);
	}
	public void setPrice (String Price) {
		driver.findElement(this.price).sendKeys(Price);
	}
	public void setStatus(String noOrYes) {
		WebElement statusSET = driver.findElement(this.status);
		Select active = new Select(statusSET);
		active.selectByVisibleText(noOrYes);
	}
	public boolean isExtrasAdded () {
		boolean add = false;
		WebElement newExtras = driver.findElement(this.extrasAdd);
		if(newExtras.getText().contains("Seat Warmer")) {
			add = true;
		}
		return add;
	}
	public boolean errorMsgWhenTextIsInPriceField() {
		try {
			return this.driver.findElement(this.errorMsg) != null;
		} catch (Exception e) {
			return false;
		}
	}
}
