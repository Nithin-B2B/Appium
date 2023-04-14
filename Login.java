package com.qa1.appium3;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Login {
	
	public AndroidDriver driver;

	public void AppiumTest() throws MalformedURLException, InterruptedException
		{
			DesiredCapabilities cap =new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
			cap.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"/application/"+"ULPH_UAT_10.2.10_106.apk");
			cap.setCapability("autoGrantPermissions",true);
			
			AndroidDriver driver =new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"),cap);
			driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click();   
		      
		       
		       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
		       
		       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
		       
		       driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).click();
		       driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).sendKeys("b2bph4.93@gmail.com");
		       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
		       
		       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
		       
		       driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).click();
		       driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).sendKeys("Manila123");
		       
		       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
		       driver.findElement(By.xpath("//android.widget.Button[@index=5]")).click();  
		       Thread.sleep(3000);
		       
		       driver.findElement(By.xpath("//android.widget.Button[content-desc='skip']")).click();
		
		}
}
