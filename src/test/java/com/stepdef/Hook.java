package com.stepdef;

import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass {
	@Before
	public static void loadDriver(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuvaraj\\workspace\\CucumberFirst\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	@After
	public static void browserClose(){
		//driver.close();
	}

}
