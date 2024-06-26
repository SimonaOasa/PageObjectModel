package Tests;
import org.testng.annotations.*;
import static org.testng.Assert.assertEquals;

import SeleniumUtils.BaseTest;
public class DropdownTest extends BaseTest{

	@Test(priority=1 , groups = "UserMangementFunctionality")
	public void selectByValueTest() {
		app.click(app.menu.shopLink);
		app.shop.selectByValue("date");
		assertEquals(app.shop.getSelectedOption(), "Sort by latest");
	}
	

	@Test(priority=2, groups = "UserMangementFunctionality")
	public void selectByVisibleTextTest() {
		app.click(app.menu.shopLink);
		app.shop.selectByVisibleText("Sort by popularity");
		assertEquals(app.shop.getSelectedOption(), "Sort by popularity");
	}
	
	@Test(priority=3, groups = "UserMangementFunctionality")
	public void selectByIndexTest() {
		app.click(app.menu.shopLink);
		app.shop.selectByIndex(5);
		assertEquals(app.shop.getSelectedOption(), "Sort by price: high to low");
	}
	
}
