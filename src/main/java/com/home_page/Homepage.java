package com.home_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.contacts_page.Contactspage;
import com.deals_page.Dealspage;

public class Homepage extends Base 
{
	@FindBy(xpath="//span[text()='Partha Mishra']")
	WebElement verify_username;

	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement click_contact;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement click_deals;
	
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verify_homepage_title()
	{
		return driver.getTitle();
	}
	
	public String verify_username()
	{
		return verify_username.getText();
	}
	
	public Contactspage click_contact_link()
	{
		click_contact.click();
		return new Contactspage();
	}
	
	public Dealspage click_deals_link()
	{
		click_deals.click();
		return new Dealspage();
	}
}
