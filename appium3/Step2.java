package com.qa1.appium3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Step2 extends Openapp2 {
@Test
	public void mail()  {
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click();   
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Register here']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Family Name']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Family Name']")).sendKeys("May");
		driver.findElement(By.xpath("//android.widget.EditText[@text='First Name']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='First Name']")).sendKeys("Moy");
	    driver.findElement(By.xpath("//android.widget.Switch[@index=2]")).click();
	    driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
		
			List< WebElement> button=driver.findElementsByClassName("android.widget.EditText");
			 System.out.println("Textfields are avialable in step2 of registration: "+button.size());
			 
			for(WebElement button2:button)
			{ 
				System.out.println(button2.getAttribute("text"));  
			}
			
			List<WebElement> bt=driver.findElementsByClassName("android.widget.ImageView");
			System.out.println("Textfields are avialable in step2 of reg:  "+button.size());
			for(WebElement bu2:bt)
			{
				System.out.println(bu2.getAttribute("text")); 
				
				if(bu2.getAttribute("text").equals("Mobile")) {
					 bu2.click();
					 bu2.sendKeys("9345093460");
				 }
			}
	}
	
}
