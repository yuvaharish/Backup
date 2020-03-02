package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static void loadUrl(){
		driver.get("https://www.phptravels.net/admin");
	}
	
	public static void click(WebElement element){
		element.click();
	}
	
	public static void sendkyes(WebElement element,String text){
		element.sendKeys(text);
	}
	
	public static void action(WebElement element){
		Actions acc= new Actions(driver);
		acc.moveToElement(element).perform();
	}
	
	public static void select(WebElement element,int index){
		Select sc= new Select(element);
		sc.selectByIndex(index);
	}
}
