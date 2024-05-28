package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SeleniumUtils.SeleniumWrappers;

public class LoginPage extends SeleniumWrappers{
	
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		}
	
	//locatori / webelements 
	public By userField = By.id("log");
	public By passField = By.id("password");
	public By submitButton = By.className("submit_button");
	public By successLoginMsg = By.cssSelector("div[class*='sc_infobox_style_success']");
	public By errorLoginMsg = By.cssSelector("div[class*='sc_infobox_style_error']");
	public By logoutBtn = By.linkText("Logout");
	
	
	//metode specifice 
	public void loginInApp(String username, String password) {
		
		driver.findElement(userField).sendKeys(username);
		driver.findElement(passField).sendKeys(password);
		//driver.findElement(submitButton).click();
		click(submitButton);
		
	}
	
	public boolean checkMsgIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
						
	}
	
	//public void logoutFromApp() {
		//driver.findElement(logoutBtn).click();
	//}

}
