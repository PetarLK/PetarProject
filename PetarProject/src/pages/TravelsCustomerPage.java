package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsCustomerPage extends BasicPage {
	
	public TravelsCustomerPage(WebDriver driver) {
		super(driver);
	}
	
	private By editCustomer = By.cssSelector("[title='Edit']");
	private By searchBtn = By.cssSelector(".xcrud-search-toggle");
	private By searchInput = By.cssSelector(".xcrud-searchdata");
	private By addNewCustomer = By.cssSelector("button[type='submit']");
	private By rowCheck = By.cssSelector(".xcrud-row.xcrud-row-0");
	
	public boolean isEditSuccessful (String text) {
		boolean edit = false;
		WebElement checkEdit = driver.findElement(this.rowCheck);
		if(checkEdit.getText().contains(text)) {
			edit = true;
		}
		return edit;
	}
	public boolean isAddSuccessful (String text) {
		boolean add = false;
		WebElement checkAdd = driver.findElement(this.rowCheck);
		if(checkAdd.getText().contains(text)) {
			add = true;
		}
		return add;
	}
	public WebElement getAddNewCustomer () {
		return driver.findElement(this.addNewCustomer);
	}
	public WebElement getSearchBtn () {
		return driver.findElement(this.searchBtn);
	}
	public void setSearch (String search) {
		WebElement inputSearch = driver.findElement(this.searchInput);
		inputSearch.sendKeys(search);
		inputSearch.sendKeys(Keys.ENTER);
	}
	public WebElement getEditCustomer () {
		return driver.findElement(this.editCustomer);
	}
}
