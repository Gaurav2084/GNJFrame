package com.client.app.login;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@Cucumber.Options(format = { "json-pretty:target/cucumber-report-StepDefinitionSupport.json" }, glue = { "com.client.app.common",
//"com.client.app.pages" }, features = { "src/test/resources/com/client/app/Android/01_LoginToDMI.feature" })
@Cucumber.Options(features = "classpath:LoginToDMI.feature" )

public class LoginToDMIStepDefsSteps {

}
