package com.qa1.appium3;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Registration {
	
	public AndroidDriver driver;
	@Test
	public void AppiumTest() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "253290ed");
		cap.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"/application/"+"ULPH_UAT_10.1.48_100_4.apk");
		cap.setCapability("autoGrantPermissions",true);
		
		AndroidDriver driver =new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"),cap);
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		//Register
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Register here']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Family Name']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Family Name']")).sendKeys("Mau");
		driver.findElement(By.xpath("//android.widget.EditText[@text='First Name']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='First Name']")).sendKeys("Moon");
	    driver.findElement(By.xpath("//android.widget.Switch[@index=2]")).click();
	    driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
	    
	    driver.findElement(By.xpath("//android.widget.EditText[@text='Email']")).click();
	    driver.findElement(By.xpath("//android.widget.EditText[@text='Email']")).sendKeys("b2b.64@gmail.com");
	    driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();

	    driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).click();
	    driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).sendKeys("Manila123");
	    driver.findElement(By.xpath("//android.widget.EditText[@text='Confirm Password *']")).click();
	    driver.findElement(By.xpath("//android.widget.EditText[@text='Confirm Password *']")).sendKeys("Manila123");
	    
       driver.findElement(By.xpath("//android.widget.Button[@content-desc='DONE']")).click();
       //Login
       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
       driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).click();
       driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).sendKeys("b2b.64@gmail.com");
       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
       driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).click();
       driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).sendKeys("Manila123");
       
       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
       // enroll
       driver.findElement(By.xpath("//android.widget.ImageView[@index=1]")).click();
       
       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Yes']")).click();
       Thread.sleep(40000);
       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Verify']")).click();
       
       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Relogin']")).click();
       //Relogin
       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
       driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).click();
       driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).sendKeys("b2b.64@gmail.com");
       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
       driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).click();
       driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).sendKeys("Manila123");
       
       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
       
       driver.findElement(By.xpath("//android.widget.Button[@index=5]")).click();  
       

	

}
}
