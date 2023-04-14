package com.qa1.appium3;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Openexistingapp {
	
	@SuppressWarnings("rawtypes")
	public AndroidDriver driver;
	
	@SuppressWarnings("rawtypes")
	@Test
	public void test() throws MalformedURLException{
		
		
		DesiredCapabilities cap=new DesiredCapabilities(); 
		cap.setCapability("DeviceName", "253290ed");

		
		cap.setCapability("appPackage", "com.vxceed.xnapp.tindahanclub.uat2");
		cap.setCapability("appActivity","com.vxceed.goordr.MainActivity ");
		
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap); 
	    driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS); 
		
	    
	    
		
}
}

