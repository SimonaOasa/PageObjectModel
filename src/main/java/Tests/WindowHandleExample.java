package Tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.sun.tools.javac.util.List;

import SeleniumUtils.BaseTest;

public class WindowHandleExample extends BaseTest {
	
	
	@SuppressWarnings("restriction")
	@Test
	public void windowHandleExample() {
		
		driver.get("https://keybooks.ro/event/seminar-of-modern-art/");
		
		
		app.scrollVertically(800);
		
		System.out.println("Current window before tab: " + driver.getWindowHandle());
		
		System.out.println("All open windows : " + driver.getWindowHandles()); 
		driver.switchTo().frame(app.getWebElement(app.genericEvent.mapFrame));
		app.click(app.genericEvent.viewLargerMapLink);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		System.out.println("----------------------------------");
		
		System.out.println("Current window: " + driver.getWindowHandle());
		
		System.out.println("All open windows after tab : " + driver.getWindowHandles());
		
		System.out.println("----------------------------------");
		
		//@SuppressWarnings("restriction")
		List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(browserTabs.get(1));
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.xpath("//span[text()='Accept all']")).click();
		driver.findElement(By.id("searchboxinput")).clear();
		driver.findElement(By.id("searchboxinput")).sendKeys("forest");
		driver.findElement(By.id("searchbox-searchbutton")).click();
		
		
		Thread.sleep(5000); 
		
		driver.close();
		
		Thread.sleep(2000);
		
		System.out.println("Current window : " + driver.getWindowHandle());
		//
		System.out.println("All open windows after tab : " + driver.getWindowHandles());
		driver.switchTo().frame(app.getWebElement(app.genericEvent.mapFrame));
		app.click(app.genericEvent.viewLargerMapLink);
		//
		
		driver.switchTo().window(browserTabs.get(0));
		
		app.click(app.genericEvent.viewLargerMapLink);
		
		
		
	}
	

}
