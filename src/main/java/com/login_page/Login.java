package com.login_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Login extends Base
{
	@FindBy(xpath="//*[@id='ui']/div/div/form/div/div[1]/div/input")
	WebElement username;
	
	@FindBy(xpath="//*[@id='ui']/div/div/form/div/div[2]/div/input")
	WebElement password;
	
	@FindBy(xpath="//*[@id='ui']/div/div/form/div/div[3]")
	WebElement login_button;
	
	public Login()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login(String user,String paswd)
	{
		username.sendKeys(user);
		password.sendKeys(paswd);
		login_button.click();
	}

}
