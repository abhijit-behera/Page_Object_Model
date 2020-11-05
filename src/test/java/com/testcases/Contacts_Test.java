package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.contacts_page.Contactspage;
import com.home_page.Homepage;
import com.login_page.Login;
import com.timeout.Timeout;

public class Contacts_Test extends Base {
	Login log;
	Homepage home;
	Contactspage contact;

	public Contacts_Test() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialize();
		log = new Login();
		home = log.login(pro.getProperty("username"), pro.getProperty("password"));
		contact = home.click_contact_link();
		Thread.sleep(Timeout.thread_sleep);

	}

//	@Test
//	public void verify_Category() {
//		boolean verify_text = contact.verify_category_text();
//		Assert.assertTrue(verify_text);
//	}
//	
	@Test
	public void click_new_button_select_dropdown()
	{
		contact.click_new();
		try {
			Thread.sleep(Timeout.thread_sleep);
			contact.click_country_value();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
//	@AfterMethod
//	public void teardown()
//	{
//		driver.close();
//	}

}
