package com.qa1.appium3;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.mobile.NetworkConnection;
import org.openqa.selenium.mobile.NetworkConnection.ConnectionType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Network {
	@Test
		public void db() throws MalformedURLException
		{
		
			DesiredCapabilities capabilities=new DesiredCapabilities(); 
			capabilities.setCapability("DeviceName", "253290ed");
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);

		NetworkConnection mobileDriver = (NetworkConnection) driver;
		 if (mobileDriver.getNetworkConnection() != ConnectionType.AIRPLANE_MODE) {
		   // enabling Airplane mode
		   mobileDriver.setNetworkConnection(ConnectionType.AIRPLANE_MODE);
		 }
		}

}
