package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.base.Base;
import com.home_page.Homepage;
import com.login_page.Login;

public class Home_Test extends Base
{
	Login log;
	Homepage home;

	public Home_Test()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialize();
		log=new Login();
		home=log.login(pro.getProperty("username"), pro.getProperty("password"));
	}
	
	@Test
	public void verify_homepage_title()
	{
		Assert.assertEquals(home.verify_homepage_title(), "Cogmento CRM","Home page title does not match");
	}
	
	
}
