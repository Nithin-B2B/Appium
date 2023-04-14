package com.qa1.appium3;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;

public class Openapp {
 
	 public AndroidDriver driver;
	@BeforeTest
	public void testappium() throws MalformedURLException, InterruptedException{
		
		
		DesiredCapabilities capabilities=new DesiredCapabilities(); 
		capabilities.setCapability("DeviceName", "253290ed");
		//File file= new File("app",System.getProperty("user.dir")+"/application/"+"ULPH_UAT_10.2.14_108.apk");
		File file=new File("C:\\Users\\vxuser\\Downloads\\ULPH_UAT_10.3.4_114.apk");
		capabilities.setCapability("app",file.getAbsolutePath());
		/* capabilities.setCapability("appWaitPackage", " com.vxceed.xnapp.tindahanclub.uat2");
		 capabilities.setCapability("appPackage", " com.vxceed.xnapp.tindahanclub.uat2");
		 capabilities.setCapability("appWaitActivity","com.vxceed.goordr.MainActivity");
		
		 capabilities.setCapability("appActivity","com.vxceed.goordr.MainActivity");
		 capabilities.setCapability("appWaitDuration", 10000);*/
	
		
		 driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities); 
		 driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS); 
		 
		/*List< WebElement> button=driver.findElementsByClassName("android.widget.Button");
		 System.out.println("Buttons are avialable in homescreen: "+button.size());
		 
		 driver.findElement(By.xpath("//android
		 .widget.Button[@content-desc='Skip']")).click();*/
	Thread.sleep(2000);
	
	/*driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click();   
    
    
    driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
    
    driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
    
    driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).click();
    driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).sendKeys("b2b.17@gmail.com");
    driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
    
    driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
    
    driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).click();
    driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).sendKeys("Manila123");
    
    driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
    driver.findElement(By.xpath("//android.widget.ImageView[@index=0]")).click();  
   
		Thread.sleep(3000);
	 

    
    driver.findElement(By.xpath("//android.widget.Button[@index=4]")).click();*/
	
	
	
	}
	
	@AfterTest
	public void logout() {
		
		driver.findElement(By.xpath("//android.view.View[@content-desc='Account']")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc='Logout']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Yes']")) .click();
		
	}
	
}
