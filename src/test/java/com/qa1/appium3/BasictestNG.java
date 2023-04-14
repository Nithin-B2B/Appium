package com.qa1.appium3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class BasictestNG extends Openapplication{
	
	@Test
	public void demo() throws InterruptedException
	{
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
	     driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).click();
	     driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).sendKeys("b2b45@gmail.com");
	     driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
	     driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).click();
	     driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).sendKeys("Manila123");
	     
	     driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
	     
	     driver.findElement(By.xpath("//android.widget.ImageView[@index=1]")).click();  
	     
	     driver.findElement(By.xpath("//android.widget.Button[@content-desc='Yes']")).click();
	     Thread.sleep(10000);
	     
	    // driver.findElement(By.xpath("//android.view.View[@content-desc='Invalid Outlet/Invite Code']"));
	     
	     driver.findElement(By.xpath("//android.widget.Button[content-desc='skip']")).click();
	     
	     driver.findElement(By.className("//android.view.View[@index=4]")).click(); 
	}
}
