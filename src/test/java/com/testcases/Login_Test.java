package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.home_page.Homepage;
import com.login_page.Login;
import com.timeout.Timeout;

public class Login_Test extends Base
{
	
		Login log;
		
	public Login_Test()
	{
		super();
		
	}

	@BeforeMethod
	public void setup()
	{
		initialize();
		log=new Login();
	}
	
	@Test
	public void login_pagetitle()
	{
		Assert.assertEquals(log.gettitle(), "Cogmento CRM");
	}
	
	@Test
	public void forgotpassword_button_displayed()
	{
		boolean button_displayed=log.forgotpassword_button_displayed();
		Assert.assertTrue(button_displayed);
	}

	@Test
	public void login()
	{
		Homepage home=log.login(pro.getProperty("username"), pro.getProperty("password"));
	}

	@AfterMethod
	public void shutdown() throws InterruptedException
	{
		Thread.sleep(Timeout.thread_sleep);
		driver.quit();
	}

	}


