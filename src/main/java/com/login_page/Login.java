package com.login_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.home_page.Homepage;

public class Login extends Base
{
	@FindBy(xpath="//*[@id='ui']/div/div/form/div/div[1]/div/input")
	WebElement username;
	
	@FindBy(xpath="//*[@id='ui']/div/div/form/div/div[2]/div/input")
	WebElement password;
	
	@FindBy(xpath="//*[@id='ui']/div/div/form/div/div[3]")
	WebElement login_button;
	
	@FindBy(xpath="//*[@id='ui']/div/div/div[1]/a")
	WebElement forgot_password_button;
	
	public Login()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean forgotpassword_button_displayed()
	{
		boolean displayed=forgot_password_button.isDisplayed();
		return displayed;
	}
	
	public String gettitle()
	{
		return driver.getTitle();
	}
	
	public Homepage login(String user,String paswd)
	{
		username.sendKeys(user);
		password.sendKeys(paswd);
		login_button.click();
		return new Homepage();
	}

}
