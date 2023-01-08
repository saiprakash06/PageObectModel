package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class HomePage extends Base {
	
	@FindBy(xpath="User: Prakash Sai")
	WebElement UserNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement NewcontactsLink;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifHomePageTitle() {
		return driver.getTitle();
	}
	
	
	public ContactsPage clickOnContactsLink() {
		
		contactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOndealsLink() {
		dealsLink.click();
		return new DealsPage();
	}
	
	
	public void clickOnNewContacts() {
		Actions actions = new Actions(driver);
		actions.moveToElement(contactsLink).build().perform();
		NewcontactsLink.click();
	}
		
	

}
