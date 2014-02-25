

package com.client.app.common;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;




public class CommonFunctions {	
	public   WebDriver driver;
	   
	public void setUp() throws MalformedURLException, InterruptedException{
        
        //Set up desired capabilities and pass the Android app-activity and app-package to Appium
       DesiredCapabilities capabilities = new DesiredCapabilities();
       capabilities.setCapability("device","Android");
       capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
       capabilities.setCapability(CapabilityType.VERSION, "4.2.2");
       capabilities.setCapability(CapabilityType.PLATFORM, "Windows");
       capabilities.setCapability("app-package", "com.dmi.notification"); // This is package name of your app (you can get it from apk info app)
       capabilities.setCapability("app-activity", "com.dmi.notification.view.activity.SplashScreen"); // This is Launcher activity of your app (you can get it from apk info app)
          //Create RemoteWebDriver instance and connect to the Appium server.
       driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
       //return(driver);
   }
	
	public void installapp() {
		  
			//TO-DO
		    }
	 
	 public void uninstallapp() {
		  
			//TO-DO
		    }
	 
	 public void launchapp() {
		  
			//TO-DO
		    }
	 
	 public void runonbackground() {
		  
			//TO-DO
		    }
	 
	 public void killapp() {
		  
			//TO-DO
		    }
}
