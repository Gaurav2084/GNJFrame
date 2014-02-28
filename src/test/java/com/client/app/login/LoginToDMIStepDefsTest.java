package com.client.app.login;
import java.net.MalformedURLException;

import com.client.app.common.CommonFunctions;
import com.client.app.pages.LoginPage;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class LoginToDMIStepDefsTest {
  
   
    
	public LoginToDMIStepDefsTest() throws MalformedURLException, InterruptedException
	    {
		CommonFunctions cn = new CommonFunctions();
		cn.setUp();

	  }


@Given("^I am on the login screen and has no content$")
public void I_am_on_the_login_screen_and_has_no_content() throws MalformedURLException, InterruptedException   {
	LoginPage lp = new LoginPage();
	 lp.inputUsername();
	     
}

@When("^I login using user name and password$")
public void I_login_using_user_name_and_password() {
	
	LoginPage lp = new LoginPage();
	lp.inputPasswordField();
    
}

@Then("^I will be taken to DMI application$")
public void I_will_be_taken_to_DMI_application()  {
	LoginPage lp = new LoginPage();
	lp.login();
}
}
       
  