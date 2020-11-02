package com.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.login_page.Login;

public class Login_Page
{
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
	public void login()
	{
		log.login(pro.getProperty("username"), pro.getProperty("password"));
	}

	@AfterTest
	public void shutdown()
	{
		driver.quit();
	}

	}

}
