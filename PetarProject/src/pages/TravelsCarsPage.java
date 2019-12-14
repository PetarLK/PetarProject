package pages;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class TravelsCarsPage extends BasicPage {
	
	public TravelsCarsPage(WebDriver driver) {
		super(driver);
	}
	
	private By card = By.cssSelector(".xcrud-row");
	private By order = By.cssSelector(".form-control.input-sm");
	private By upload = By.cssSelector(".dz-hidden-input");
	private By uploadImgs = By.cssSelector("a[href='https://www.phptravels.net/admin/cars/gallery/Ford-Focus-2014']");
	private By addPhotos = By.cssSelector("a[href='#UploadPhotos']");
	private By photoCheck = By.cssSelector(".img-responsive.colorbox.cboxElement");
	
	public WebElement getUploadImgs () {
		return driver.findElement(this.uploadImgs);
	}
	public WebElement getAddPhotos () {
		return driver.findElement(this.addPhotos);
	}
	public WebElement getUpload () {
		return driver.findElement(this.upload);
	}
	public void uploadPicture(String path) {
		getUpload().sendKeys(new File(path).getAbsolutePath());
	}

	public boolean isNumberOfRentedCars10 () {
		boolean NmbrOfCars = false;
		WebElement card = driver.findElement(this.card);
		List<WebElement> cards = driver.findElements(this.card);
		System.out.println(cards.size());
			if (cards.size() == 10) {
				NmbrOfCars = true;
			}
		return NmbrOfCars;
	}
	public boolean isTotalNumberOfRentedCarsMoreThen50 () {
		boolean NmbrOfCars50 = false;
		int sum = 0;
		WebElement orderNmbr = driver.findElement(this.order);
		List<WebElement> orders = driver.findElements(this.order);
		for (int i = 0; i < orders.size(); i++) {
			String str = orders.get(i).getAttribute("value");
			System.out.println("{"+str+"}");
			int number = Integer.valueOf(str);
			sum += number;
		}
		if (sum > 50) {
			NmbrOfCars50 = true;
		}
	return NmbrOfCars50;
	}
	public boolean isPhotoAdded(String photo) {
		boolean added = false;
		WebElement newPhoto = driver.findElement(this.photoCheck);
		if (newPhoto.getAttribute("src").contains(photo)) {
			added = true;
		}
		return added;
	}
}
