package com.contacts_page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Base;

public class Contactspage extends Base
{
	JavascriptExecutor js;
	
	@FindBy(xpath="//th[text()='Category']")
	WebElement verify_category;
	
	@FindBy(xpath="//*[@id='dashboard-toolbar']/div[2]/div/a/button")
	WebElement click_new_contacts;
	
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[10]/div[1]/div/div/div/div[1]/i")
	WebElement phone_dropdown;
	
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[10]/div[1]/div/div/div/div[1]/div[2]/div[226]/span")
	WebElement select_value;
	
	public Contactspage()
	{
		PageFactory.initElements(driver, this);
	}
	
public boolean verify_category_text()
{
	return verify_category.isDisplayed();
	
}

public void click_new()
{
	click_new_contacts.click();
       
}

public void click_country_value()
{
	js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", phone_dropdown);
	phone_dropdown.click();
	select_value.click();
	
}


	

}
