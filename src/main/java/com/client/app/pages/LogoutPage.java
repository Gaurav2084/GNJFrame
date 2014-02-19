
package com.client.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LogoutPage {
WebDriver driver;

    

    
    @FindBy(className = "Button")
    private WebElement logoutButton;
    
   
        
    public void logout() {
    	
    	logoutButton.click();             
    	WebDriverWait wait = new WebDriverWait(driver,80);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("com.dmi.notification:id/edt_username")));
    }
    
  
   
}
