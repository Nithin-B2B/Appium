package com.qa1.appium3;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;

public class Openapplication {
	
 public AndroidDriver driver;
 @BeforeTest
   public void Creed() throws MalformedURLException
   {
	DesiredCapabilities capabilities=new DesiredCapabilities(); 
	capabilities.setCapability("DeviceName", "253290ed");
	File file=new File("C:\\Users\\vxuser\\Downloads\\ULPH_UAT_10.4.15_126.apk");
	capabilities.setCapability("app",file.getAbsolutePath());
	 driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities); 
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
   }
 
 public void logout2()
 {
	 driver.findElement(By.xpath("//android.view.View[@content-desc='Account']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
		driver.findElement(By.xpath("//android.view.View[@content-desc='Logout']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Yes']")) .click();
 }
}
