package SeleniumUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.TestException;

import java.time.Duration;

public class SeleniumWrappers extends BaseTest {
	
	//Webelement element = driver.findElement(locator);
	//element.clicl();
	
	
	public void click(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			WebElement element = driver.findElement(locator);
			element.click();
		}catch(NoSuchElementException e) {
			
		}
		
	//	driver.findElement(locator).click();
		
		
	}
	
	public void sendKeys(By locator, String text ) {
		
		driver.findElement(locator).sendKeys(text);
		
	}
	
	public void hoverElement(By locator) {
		
		try {
			WebElement element = driver.findElement(locator);
		    Actions action = new Actions(driver);
			action.moveToElement(element).perform();
		}catch(Exception e) {
			new TestException(e.getMessage());
			
		}
		
	}
	
	public WebElement getWebElement(By locator) {
		
		return driver.findElement(locator);
	}

}
