package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.base.Base;
import com.deals_page.Dealspage;
import com.home_page.Homepage;
import com.login_page.Login;

public class Deals_Test extends Base {
	Login log;
	Homepage home;
	Dealspage deals;

	public Deals_Test() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialize();
		log = new Login();
		home = log.login(pro.getProperty("username"), pro.getProperty("password"));
		deals = home.click_deals_link();
	}

	@Test
	public void click_new_button()
	{
		deals.click_New_Button();
	}

}
