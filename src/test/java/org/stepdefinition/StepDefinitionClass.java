package org.stepdefinition;

import org.testrunner.BaseClass;
import org.testrunner.POJOLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionClass extends BaseClass  {
	POJOLogin l;
	
	@Given("To launch the browser and max window")
	public void to_launch_the_browser_and_max_window() {
		Browserlaunch();
		windowMax();
	    
	}

	@When("To launch the url of the application")
	public void to_launch_the_url_of_the_application() {
		loadUrl("https://www.facebook.com/");
	   
	}

	@When("To pass the valid username in email field")
	public void to_pass_the_valid_username_in_email_field() {
		l=new POJOLogin();
		passTxt(l.getUsername(), "bala");
	    
	}

	@When("To pass the invalid password in password field")
	public void to_pass_the_invalid_password_in_password_field() {
		l=new POJOLogin();
		passTxt(l.getPassword(), "3456789765");
	   
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		l=new POJOLogin();
		btnClick(l.getLoginbutton());
	    
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeChrome();
	   
	}

	@When("To launch the url of application")
	public void to_launch_the_url_of_application() {
	    loadUrl("https://www.facebook.com/");
	}

	@When("Pass the positive and negative {string} in email field")
	public void pass_the_positive_and_negative_in_email_field(String email) {
		l=new POJOLogin();
		passTxt(l.getUsername(), email);
	}

	@When("Pass the positive and negative {string} in password field")
	public void pass_the_positive_and_negative_in_password_field(String pass) {
		l=new POJOLogin();
		passTxt(l.getPassword(), pass);
	}
	
	@When("Click the login button")
	public void click_the_login_button() {
		l=new POJOLogin();
		btnClick(l.getLoginbutton());
	}

	@Then("Close the browser")
	public void close_the_browser() {
	    
	}

	

}
