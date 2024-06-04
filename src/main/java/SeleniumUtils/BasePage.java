package SeleniumUtils;

import PageObjects.ContactsPage;
import PageObjects.LoginPage;
import PageObjects.MenuPage;
import PageObjects.ShopPage;

public class BasePage extends SeleniumWrappers{

	public MenuPage menu = new MenuPage(driver);
	
	//menu.navigateTo(menu.loginLink);
	//menu.click(menu.loginLink);
	public LoginPage login = new LoginPage(driver);
	public ContactsPage contacts = new ContactsPage(driver);
	public ShopPage shop = new ShopPage(driver);
	
}