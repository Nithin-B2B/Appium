package com.qa1.appium3;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
 
public class Openapp2 
{
	@SuppressWarnings("rawtypes")
	public AppiumDriver driver;
	@SuppressWarnings("rawtypes")
	@BeforeTest
	public void testappium2() throws MalformedURLException, InterruptedException{
		
		
		DesiredCapabilities capabilities=new DesiredCapabilities(); 
		capabilities.setCapability("DeviceName", "253290ed");
		File file=new File("C:\\Users\\vxuser\\Downloads\\ULPH_UAT_10.4.16_128.apk");
		capabilities.setCapability("app",file.getAbsolutePath());
		 driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities); 
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);  
		 
		 driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
		 
		 driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).click();
		 
		 driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).sendKeys("b2b.20@gmail.com");
		 driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
		 
		 
		 List<WebElement> bn2=driver.findElementsByClassName("android.widget.EditText");
		 System.out.println("Text are avialable in password field: "+bn2.size());
		 
		for(WebElement bn3:bn2)
		{
			System.out.println(bn3.getAttribute("text"));
			 if(bn3.getAttribute("text").equals("Password *")) 
			 { 
				 bn3.click();
				 bn3.sendKeys("Manila1234");
			 }	 
		}
	

		 driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
		  driver.findElement(By.xpath("//android.widget.ImageView[@index=0]")).click();// Index=1 for IC
		  Thread.sleep(35000);
		  
		  driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
		  driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
	
}


@AfterTest
public void logout() {
	driver.findElement(By.xpath("//android.view.View[@content-desc='Account']")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
	driver.findElement(By.xpath("//android.view.View[@content-desc='Logout']")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Yes']")) .click();
}
}

