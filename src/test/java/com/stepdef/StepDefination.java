package com.stepdef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.baseclass.BaseClass;
import com.factroy.Factroy;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination extends BaseClass {
	Factroy login=new Factroy();
	
	
	@Given("User in login page")
	public void user_in_login_page() {
	    loadUrl();
	    
	}	

	@When("Enter the usernames and passwords")
	public void enter_the_usernames_and_passwords(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> asmaps=dataTable.asMaps(String.class,String.class);
		// List<String>aslist=dataTable.asList();
	    sendkyes(login.getUserName(), asmaps.get(0).get("username"));
	    sendkyes(login.getPassword(), asmaps.get(0).get("password"));
	}
	
	@When("Click the login button")
	public void click_the_login_button() {
	   click(login.getLogin());
	}

	@Then("User is on Home Page")
	public void user_is_on_Home_Page() {
	    System.out.println("Login successfully");
	}


}
