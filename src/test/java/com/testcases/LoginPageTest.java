package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.Base;
import com.pages.HomePage;
import com.pages.LoginPage;

public class LoginPageTest extends Base {

	LoginPage loginPage;
	HomePage homePage;

	@BeforeMethod
	public void SetUP() {

		initalization();
		loginPage = new LoginPage();

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Parameters({ "first-name" })
	@Test( groups = { "functest"})
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");

	}

	@Test(priority = 2)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("userName"), prop.getProperty("passWord"));
	}

}
