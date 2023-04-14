package com.qa1.appium3;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
 
public class Openapp2 {
	public AndroidDriver driver;
	@BeforeTest
	public void testappium2() throws MalformedURLException, InterruptedException{
		
		
		DesiredCapabilities capabilities=new DesiredCapabilities(); 
		capabilities.setCapability("DeviceName", "253290ed");
		//File file= new File("app",System.getProperty("user.dir")+"/application/"+"ULPH_UAT_10.2.14_108.apk");
		File file=new File("C:\\Users\\vxuser\\Downloads\\ULPH_UAT_10.4.1_113.apk");
		capabilities.setCapability("app",file.getAbsolutePath());
		/* capabilities.setCapability("appWaitPackage", " com.vxceed.xnapp.tindahanclub.uat2");
		 capabilities.setCapability("appPackage", " com.vxceed.xnapp.tindahanclub.uat2");
		 capabilities.setCapability("appWaitActivity","com.vxceed.goordr.MainActivity");
		
		 capabilities.setCapability("appActivity","com.vxceed.goordr.MainActivity");
		 capabilities.setCapability("appWaitDuration", 10000);*/
	
		
		 driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities); 
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
}
}
