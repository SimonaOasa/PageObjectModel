package testdata.utils;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjects.MenuPage;
import SeleniumUtils.BaseTest;

public class DataProviderBooksSearchTest extends BaseTest {

	@Test(dataProviderClass = DataProviderClass.class, 
			dataProvider = "booksNameAndPictureProvider")
	public void searchBookAndAssertPicture(String bookName, String bookPicture) throws InterruptedException {
		
		MenuPage menu = new MenuPage(driver);
		menu.search(bookName); 
		
		Thread.sleep(3000);
		//"div[data-image*='"+bookPicture+"']"
		WebElement element = driver.findElement(By.cssSelector("div[data-image*='"+bookPicture+"']"));
		assertTrue(element.isDisplayed());
	}
	
}
