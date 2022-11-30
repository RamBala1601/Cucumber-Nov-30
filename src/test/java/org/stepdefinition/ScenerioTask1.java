package org.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testrunner.BaseClass;
import org.testrunner.POJOLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class ScenerioTask1 extends BaseClass {
	POJOLogin l;
	
	@Given("Launch the browser and max window")
	public void launch_the_browser_and_max_window() {
	 Browserlaunch();
	 windowMax();
	}


	@When("Launch the url of the application")
	public void launch_the_url_of_the_application() {
	   loadUrl("https://www.facebook.com/");
	}

	@When("pass the valid username in email field")
	public void pass_the_valid_username_in_email_field(DataTable d) throws IOException {
	   l=new POJOLogin();
	   Map<String, String> m = d.asMap(String.class, String.class);
	   passTxt(l.getUsername(),m.get("username") );
	}

	@When("pass the invalid password in password field")
	public void pass_the_invalid_password_in_password_field(DataTable dt) throws IOException {
	    l=new POJOLogin();
	    List<Map<String, String>> ms = dt.asMaps(String.class, String.class);
	    passTxt(l.getPassword(),ms.get(1).get("password"));
	}

	@When("click the login button")
	public void click_the_login_button() {
	    l=new POJOLogin();
	    btnClick(l.getLoginbutton());
	}

	@Then("close the browser")
	public void close_the_browser() {
		closeChrome();
	   
	}



}
