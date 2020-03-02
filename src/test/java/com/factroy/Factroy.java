package com.factroy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class Factroy extends BaseClass {

	public Factroy() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//*[@name='email'])[1]")
	private WebElement userName;
	@FindBy(xpath = "//*[@name='password']")
	private WebElement password;
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement login;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
