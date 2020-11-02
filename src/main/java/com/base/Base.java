package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.timeout.Timeout;

public class Base
{
	public static WebDriver driver;
	public static Properties pro;
	
	public Base() 
	{
		try {
			pro=new Properties();
			FileInputStream fis=new FileInputStream("D:\\Selenium\\Page_Object\\src\\main\\java\\com\\config\\input");
			pro.load(fis);
		}
				 catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}
	
	public static void initialize()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Jar\\chromedriver.exe");
		driver=new ChromeDriver();
		String browser=pro.getProperty("url");
		driver.manage().timeouts().implicitlyWait(Timeout.test_timeout, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(browser);
		
	}

}
