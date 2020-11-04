package com.contacts_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Contactspage extends Base
{
	@FindBy(xpath="//th[text()='Category']")
	WebElement verify_category;
	
	public Contactspage()
	{
		PageFactory.initElements(driver, this);
	}
	
public boolean verify_category_text()
{
	return verify_category.isDisplayed();
	
}
	

}
