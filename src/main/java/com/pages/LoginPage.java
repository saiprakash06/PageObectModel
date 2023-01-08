package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class LoginPage extends Base {

	// Creating Object repository
	private By Uessdf= By.name("username"); //--> Normal By. notation for POM
	// driver.findElement(Uessdf).sendKeys("asdf");

	@FindBy(name = "username")
	WebElement UserName;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement LoginButton;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions

	public String validateLoginPageTitle() {

		return driver.getTitle();

	}

	public HomePage login(String uName, String uPassword) {
		UserName.sendKeys(uName);
		Password.sendKeys(uPassword);
		LoginButton.click();
		return new HomePage();
	}

}
