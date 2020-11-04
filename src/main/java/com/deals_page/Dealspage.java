package com.deals_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Dealspage extends Base {

	@FindBy(xpath = "//*[@id='dashboard-toolbar']/div[2]/div/a[3]/button/i")
	WebElement New_Button;

	public Dealspage() {
		PageFactory.initElements(driver, this);
	}

	public void click_New_Button() {
		New_Button.click();
	}
}
