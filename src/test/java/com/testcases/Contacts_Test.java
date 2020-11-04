package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.contacts_page.Contactspage;
import com.home_page.Homepage;
import com.login_page.Login;

public class Contacts_Test extends Base {
	Login log;
	Homepage home;
	Contactspage contact;

	public Contacts_Test() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialize();
		log = new Login();
		home = log.login(pro.getProperty("username"), pro.getProperty("password"));
		contact = home.click_contact_link();

	}

	@Test
	public void verify_Category() {
		boolean verify_text = contact.verify_category_text();
		Assert.assertTrue(verify_text);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

}
