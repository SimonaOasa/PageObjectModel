package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import SeleniumUtils.BaseTest;

public class IframeExample extends BaseTest {
	
	@Test
	public void iframeTest() throws InterruptedException {
		
		app.click(app.menu.contactsLink);
		
		driver.switchTo().frame(app.getWebElement(app.contacts.mapFrame));
		
		app.click(app.contacts.zoomInBtn);
		Thread.sleep(2000);
		app.click(app.contacts.zoomInBtn);
		
		driver.switchTo().defaultContent();
		app.sendKeys(app.contacts.nameField, "TEST TEST");
		
		//drag and drop map
				driver.switchTo().frame(app.getWebElement(app.contacts.mapFrame));
				app.click(app.contacts.zoomInBtn);
				Thread.sleep(2000);
				app.click(app.contacts.zoomInBtn);
		
		Actions action = new Actions(driver);
		
		action 
		    .moveToElement(app.getWebElement(By.cssSelector("div[aria-label='Map']")))
		    .clickAndHold()
		    .pause(Duration.ofSeconds(2))
		    //.moveByOffset(250, 0)
		    //.moveByOffset(250,0)
		    .pause(Duration.ofSeconds(2))
		    .moveByOffset(100, 250)
		    .moveByOffset(100, 250)
		    .release()
		    .perform();
		
	}
	

}
