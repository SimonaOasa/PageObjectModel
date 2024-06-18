package Tests;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import SeleniumUtils.BaseTest;

public class JavascriptExecutorExample extends BaseTest{

	//@Test
	public void example1() {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//app.click(null);
		
		//alternativa pt click() 
	//	jse.executeScript("arguments[0].click()", app.getWebElement(app.menu.searchIcon));
		
		//alternativa pt sendKeys
	//	jse.executeScript("arguments[0].value='Storm'", app.getWebElement(app.menu.searchInput));
		//alternativa pt click() 
		//jse.executeScript("arguments[0].click()", app.getWebElement(app.menu.searchIcon));
		
		
	/*	jse.executeScript("arguments[0].click();"
				+ "arguments[1].value='Storm';"
				+ "arguments[0].click();", 
				app.getWebElement(app.menu.searchIcon),
				app.getWebElement(app.menu.searchInput));
		*/ 
		
		jse.executeScript("document.getElementsByClassName('icon-search')[0].click();"
				+ "document.getElementsByClassName('search_field')[0].value='cooking';"
				+ "document.getElementsByClassName('icon-search')[0].click();");
		
		//alternativa pt isDisplayed()
		
		String visible = jse.executeScript("return document.getElementsByClassName('post_title')[0].childNodes[0].checkVisibility()")
				.toString();
		
		System.out.println(visible);
		assertEquals(visible, "true");
		
		boolean isVisible = Boolean.parseBoolean(visible);
		
		assertTrue(isVisible);
		
		//alternativa pt get text 
		
		String bookTitle = jse.executeScript("return document.getElementsByClassName('post_title')[0].childNodes[0].innerText")
		.toString();
		
		System.out.println(bookTitle);
		
		jse.executeScript("document.getElementsByClassName('post_title')[0].childNodes[0].click()");
		
		//alternativa pt get current url 
		//driver.getCurrentUrl();
		String currentUrl = jse.executeScript("return document.URL").toString();
		System.out.println(currentUrl);
		//alternativa pt get title 
		String currentPageTitle = jse.executeScript("return document.title").toString();
		System.out.println(currentPageTitle);
		
        jse.executeScript("window.scrollBy(0,800)");
        jse.executeScript("document.getElementById('tab-title-reviews').children[0].click()");
        
		//alternativa pt isSelected()
		String isSelected = jse.executeScript("return document.getElementById('wp-comment-cookies-consent').checked")
				.toString();
		
		System.out.println(isSelected);
		
		//alternativa pt isEnabled ()
		
		String isEnabled = jse.executeScript("return document.getElementById('author').disabled")
				.toString();
		System.out.println(isEnabled);
		
	}
	
	@Test
	public void example2() {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		String alertaJs = "window.obj = function(){alert('Alerta!!!')}; window.obj.call()";
		
		jse.executeScript(alertaJs);
		//jse.executeScript
	}
	
	
	
}
