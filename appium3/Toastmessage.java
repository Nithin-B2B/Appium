 package com.qa1.appium3;

import org.openqa.selenium.By; 
import org.testng.Assert;
import org.testng.annotations.Test;

public class Toastmessage extends Openapp {

	@Test
	public void toast() throws InterruptedException
	{
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click();   
	       
	       
	       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
	       
	       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
	       
	       driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).click();
	       driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).sendKeys("b2b.18@gmail.com");
	       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
	       
	       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
	       
	       driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).click();
	       driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).sendKeys("manila123");
	       
	       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
	    //Thread.sleep(4000);
	      String toastmessage=driver.findElement(By.xpath("(//android.view.View)[1]")).getAttribute("text");
	Assert.assertEquals(toastmessage, " Login Failed ");
	
	}
}
