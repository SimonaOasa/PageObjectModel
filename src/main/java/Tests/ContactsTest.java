package Tests;

import org.testng.annotations.Test;

import SeleniumUtils.BaseTest;


public class ContactsTest extends BaseTest {
	
	@Test(groups = "UserMangementFunctionality")
	public void sendMessageFromContactFormTest() {
		
		app.click(app.menu.contactsLink);
		app.sendKeys(app.contacts.nameField, "Harry Potter");
		app.sendKeys(app.contacts.emailField, "harry@howgarths.com");
		app.sendKeys(app.contacts.subjectField, "Admission");
		app.sendKeys(app.contacts.msgField, "Can I join?");
		app.click(app.contacts.submitBtn);
		
		app.contacts.sendMessage("Ion", "ion@ion.com", "Salut", "Ce mai faci?");
	}
	

}
