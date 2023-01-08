package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Base;
import com.pages.ContactsPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.util.TestUtil;

public class ContactsPageTest extends Base {

	LoginPage loginPage;

	HomePage homepage;

	TestUtil testutil;

	ContactsPage contactspage;

	@BeforeMethod
	public void SetUP() {

		initalization();
		testutil = new TestUtil();
		loginPage = new LoginPage();
		contactspage = new ContactsPage();
		homepage = loginPage.login(prop.getProperty("userName"), prop.getProperty("passWord"));
		testutil.swithToFrame();
		// contactspage = homepage.clickOnContactsLink();

	}

	@AfterMethod

	public void tearDown() {
		driver.close();
	}

	@Test(priority = 1)

	public void verifyContactsLabel() {

		Assert.assertTrue(contactspage.verifyContactsLabel());

	}

	@Test(priority = 1)
	public void validateCreateNewContact() {
		homepage.clickOnNewContacts();
		contactspage.createNewContact("Mr.", "Sai", "Prakash", "ValueMo");
	}

	@DataProvider
	public void getTestData() {
		

	}
	
	@Test
	
	public void add() {
		
	}

}
