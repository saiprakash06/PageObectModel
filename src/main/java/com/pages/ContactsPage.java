package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Base;

public class ContactsPage extends Base {

	@FindBy(xpath = "//td[contains(text(),'Contacts')]")
	WebElement ContactsLabel;

	@FindBy(id = "first_name")
	WebElement FirstName;

	@FindBy(id = "surname")
	WebElement LastName;

	@FindBy(name = "client_lookup")
	WebElement company;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Save']")
	WebElement SaveButton;
	
	

	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean verifyContactsLabel() {

		return ContactsLabel.isDisplayed();

	}

	public void createNewContact(String title, String fName, String LName, String Company) {
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
		FirstName.sendKeys(fName);
		LastName.sendKeys(LName);
		company.sendKeys(Company);
		SaveButton.click();

	}

}
