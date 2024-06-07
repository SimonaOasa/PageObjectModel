package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import SeleniumUtils.BaseTest;

public class XpathExample2 extends BaseTest{

	@Test
	public void xpathExample() {
		
		//parent 
		
		driver.findElement
		(By.xpath("//a[@href='#popup_login']/parent::li[@class='menu_user_login']"));
		
	}
	
}
