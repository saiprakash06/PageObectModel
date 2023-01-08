package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.ExtentReport.ExtentReportsDemo;
import com.aventstack.extentreports.ExtentReports;
import com.base.Base;
import com.pages.ContactsPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.util.TestUtil;

public class HomePageTest extends Base {

	LoginPage loginPage;

	HomePage homepage;

	TestUtil testutil;

	ContactsPage contactspage;

	@BeforeMethod
	public void SetUP() {

		initalization();
		testutil = new TestUtil();
		loginPage = new LoginPage();
		homepage = loginPage.login(prop.getProperty("userName"), prop.getProperty("passWord"));
		testutil.swithToFrame();

	}

	@AfterMethod

	public void tearDown() {
		ExtentReports extentReports;
		//extentReports = ExtentReportsDemo.report();
		//extentReports.flush();
		driver.close();
	}

	@Test(priority = 1)
	public void verifyHomepageTitleTest() {
		String title = homepage.verifHomePageTitle();

		Assert.assertEquals(title, "CRMPRO");
	}

	@Test(priority = 2)
	public void clickOnContactsLinkTest() {

		contactspage = homepage.clickOnContactsLink();

	}

}
