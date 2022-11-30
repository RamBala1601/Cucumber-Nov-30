package org.testrunner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOLogin extends BaseClass {
	
	public POJOLogin() {
		PageFactory.initElements(driver, this);
	}
	
	// Facebook
	
	@FindBy(id="email")
	private WebElement username;

	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginbutton;
	

	
	// Flipkart

	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath="(//span[text()='Login'])[2]")
	private WebElement login;

	// Mail ID Create New Account
	
	@FindBy(xpath="//input[@type='text'][1]")
	private WebElement firstname;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement usermail;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	private WebElement passmail;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement confirmmail;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getUsermail() {
		return usermail;
	}

	public WebElement getPassmail() {
		return passmail;
	}

	public WebElement getConfirmmail() {
		return confirmmail;
	}
	

}
