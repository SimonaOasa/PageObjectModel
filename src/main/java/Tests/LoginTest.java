package Tests;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;

import Framework.Utils.PropertiesFileProcessor;
import PageObjects.LoginPage;
import PageObjects.MenuPage;
import SeleniumUtils.BaseTest;


public class LoginTest extends BaseTest{
    
	String USER = PropertiesFileProcessor.readPropertiesFile("user", "credentials.properties");
	String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "credentials.properties");
	
	@Test(priority=1)
	public void loginTest() throws InterruptedException {
		
		MenuPage menu = new MenuPage(driver);
		
		//menu.navigateTo(menu.loginLink);
		menu.click(menu.loginLink);
		LoginPage login = new LoginPage(driver);
		Thread.sleep(2000);
		login.loginInApp(USER, PASS);
		
		assertTrue(login.checkMsgIsDisplayed(login.successLoginMsg));
		login.click(login.logoutBtn);
		//login.logoutFromApp();
	}
	
	@Test(priority=2)
    public void invalidloginTest() throws InterruptedException {
		
		MenuPage menu = new MenuPage(driver);
		
		//menu.navigateTo(menu.loginLink);
		menu.click(menu.loginLink);
		LoginPage login = new LoginPage(driver);
		login.loginInApp(USER, "12312313");
		Thread.sleep(2000);
		assertTrue(login.checkMsgIsDisplayed(login.errorLoginMsg));
		
	}
	
	
}
