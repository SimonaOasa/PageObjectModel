package Tests;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework.Utils.PropertiesFileProcessor;
import PageObjects.LoginPage;
import PageObjects.MenuPage;
import SeleniumUtils.BaseTest;

public class DataProviderExample extends BaseTest {

	String USER = PropertiesFileProcessor.readPropertiesFile("user", "credentials.properties");
	String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "credentials.properties");
	
	@DataProvider(name= "testDataForLogin")
	public Object [][] loginTestData() {
		
		Object [][] data= new Object [4][3];
					
		data[0][0] = USER;
		data[0][1] = PASS;
		data[0][2] = true;
		
		
		data[1][0] = "UserGresit";
		data[1][1] = PASS;
		data[1][2] = false;
				
		data[2][0] = USER;
		data[2][1] = PASS;
		data[2][2] = true;
		
		data[3][0] = USER;
		data[3][1] = "ParolaGresita";
		data[3][2] = false;
		
		return data;
		
		
		/*
		 * int number = new int [6]
		 *     number = {1, 4, 3, 7, 8, 9}
		 *     index  =  0  1  2  3  4  5
		 *     number[2] => 3
		 *       
		 * int [][]number = new int[4][3]
		 *         number = {{1,4,2}, {2,4,5}, {3,2,1}, {9,8,7} }
		 *         index        0        1        2        3 
		 *         index      0 1 2    0 1 2    0 1 2    0 1 2
		 *    number [2][0]  ==> 3 
		 */
	}
	
	@Test(dataProvider = "testDataForLogin")
	public void loginTest(String username, String password, boolean expected) {
		
		MenuPage menu = new MenuPage(driver);
		
		//menu.navigateTo(menu.loginLink);
		menu.click(menu.loginLink);
		LoginPage login = new LoginPage(driver);
		//Thread.sleep(2000);
		login.loginInApp(username, password);
		
		if(expected) {
			assertTrue(login.checkMsgIsDisplayed(login.successLoginMsg));
			login.click(login.logoutBtn);
		}else {
			assertTrue(login.checkMsgIsDisplayed(login.errorLoginMsg));
			login.click(login.closeLoginPopUp);
		}
		
		//assertTrue(login.checkMsgIsDisplayed(login.errorLoginMsg));
		
		//login.logoutFromApp();
	
}
}
