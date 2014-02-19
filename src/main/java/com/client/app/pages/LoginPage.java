
package com.client.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
WebDriver driver;

    
    @FindBy(id = "com.dmi.notification:id/edt_username")
    private WebElement usernameField;
    
    @FindBy(id = "com.dmi.notification:id/edt_password")
    private WebElement passwordField;
    
    @FindBy(className = "Button")
    private WebElement loginButton;
    
   
    public void inputUsername(){
    	usernameField.click();
    	usernameField.sendKeys("gkumar@dminc.in");
    }
    
    public void inputPasswordField(){
    	passwordField.click();
    	passwordField.sendKeys("123");
    }
    
    public void login() {
    	
    	loginButton.click();             
    	WebDriverWait wait = new WebDriverWait(driver,80);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("com.dmi.notification:id/action_custom_title")));
		
    }
    
  
   }
