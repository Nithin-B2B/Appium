package com.qa1.appium3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa1.appium.Mainpage;

public class Login extends Openapp{
	

@Test
	public void appium() throws InterruptedException
	
	
		{
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
	@SuppressWarnings("unused")
	Mainpage mainpage=new Mainpage(driver); 
			
			//Mainpage.loginField("login");
		       Mainpage.emailField("b2b.18@gmail.com"); 
		       Mainpage.nextButton("nextt");
		       Mainpage.passField("pass");
		       Mainpage.loginclick("log");
		       Mainpage.providerclick("select");
		     
		       
		       
		       //driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
		       
		       //driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).click();
		       //driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).sendKeys("b2b.18@gmail.com");
		       //driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
		       
		      // driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
		       
		       //driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).click();
		       //driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).sendKeys("Manila123");
		       
		       //driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
		       //driver.findElement(By.xpath("//android.widget.ImageView[@index=0]")).click();  
		      
				Thread.sleep(3000);
			  
		
		       
		       //driver.findElement(By.xpath("//android.widget.Button[@index=4]")).click();
		       //driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
		
		}
}
