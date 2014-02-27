package com.client.app.login;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import com.client.app.common.CommonFunctions;
import com.client.app.pages.LoginPage;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;

public class LoginToDMIStepDefsTest {

    WebDriver driver;
    public  CommonFunctions cn = new CommonFunctions();
    public  LoginPage lp = new LoginPage();
	
	public LoginToDMIStepDefsTest() throws MalformedURLException, InterruptedException
	    {
		    	//TO-DO - class constructor to fetch values from Config.properties
		 		 cn.setUp();
	  }


@Given("^I am on the login screen and has no content$")
public void I_am_on_the_login_screen_and_has_no_content() throws Throwable {
	
	 lp.inputUsername();
    throw new PendingException();
}

@When("^I login using user name and password$")
public void I_login_using_user_name_and_password() throws Throwable {
	
	lp.inputPasswordField();
    throw new PendingException();
}

@Then("^I will be taken to DMI application$")
public void I_will_be_taken_to_DMI_application() throws Throwable {
	
	lp.login();
    throw new PendingException();
}
}
       
  