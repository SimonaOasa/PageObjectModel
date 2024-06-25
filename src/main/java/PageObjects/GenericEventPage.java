package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SeleniumUtils.BaseTest;


public class GenericEventPage extends BaseTest {
	
	public WebDriver driver;
	

	
	public GenericEventPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public By mapFrame = By.tagName("iframe");
	public By viewLargerMapLink = By.linkText("View larger map");

}
