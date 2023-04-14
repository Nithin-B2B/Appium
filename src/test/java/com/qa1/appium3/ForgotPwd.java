package com.qa1.appium3;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class ForgotPwd extends Openapplication
{

	@Test
	public void fpwd() throws InterruptedException
	{
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
	       driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).click();
	       driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).sendKeys("b2b.18@gmail.com");
	       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
	       
	       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Forgot Password']")).click();
	       Thread.sleep(10000);
	       List<MobileElement> pass=(List<MobileElement>) driver.findElementsByClassName("android.view.View");
	       System.out.println(pass.size());
	       
	       for(MobileElement pass1:pass)
	       {
	    	   System.out.println(pass1.getAttribute("content-desc"));
	       }
	       List<MobileElement> pas=(List<MobileElement>) driver.findElementsByClassName("android.widget.Button");
	       System.out.println(pas.size());
	       
	       for(MobileElement pas1:pas) 
	       {
	    	   System.out.println(pas1.getAttribute("content-desc"));
	       }
	       List<MobileElement> pa=(List<MobileElement>) driver.findElementsByClassName("android.widget.EditText");
	       System.out.println(pa.size());
	       
	       for(MobileElement pa1:pa)
	       {
	    	   System.out.println(pa1.getAttribute("text"));
	       }
	       
	       driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).click();
	       driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).sendKeys("Manila1234");
	       driver.findElement(By.xpath("//android.widget.EditText[@text='Confirm Password *']")).click();
	       driver.findElement(By.xpath("//android.widget.EditText[@text='Confirm Password *']")).sendKeys("Manila1234");
	       
	       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Save New Password']")).click();
	       
	       
	}
	
}
