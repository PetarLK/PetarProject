package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import pages.BasicPage;

public class Scroll extends BasicPage{
	
	public Scroll(WebDriver driver) {
		super(driver);
	}

	public void scrollTillTheEndOfThePage () {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
}






