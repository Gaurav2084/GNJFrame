
package com.client.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
WebDriver driver;

private WebElement  usernameField = driver.findElement(By.id("com.dmi.notification:id/edt_username"));
private WebElement passwordField = driver.findElement(By.id("com.dmi.notification:id/edt_password"));
private WebElement loginButton = driver.findElement(By.className("Button"));
   
    
   
    public void inputUsername(){
    	 WebDriverWait wait = new WebDriverWait(driver,80);
         wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("android.widget.EditText")));
         usernameField.click();
    	 usernameField.sendKeys("gkumar@dminc.in");
    }
    
    public void inputPasswordField(){
    	passwordField.click();
    	passwordField.sendKeys("123");
    }
    
    public void login() {
    	WebDriverWait wait = new WebDriverWait(driver,80);
    	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("Button")));
    	loginButton.click();             
    	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("com.dmi.notification:id/action_custom_title")));
		
    }
    
  
   }
