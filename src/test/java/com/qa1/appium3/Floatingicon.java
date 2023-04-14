package com.qa1.appium3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Floatingicon extends Openapp2 {

	@Test
	public void floicon()
	{
		 driver.findElement(By.xpath("//android.widget.Button[@index=2]")).click();
		 
		 List<WebElement> flo=driver.findElementsByClassName("android.view.View");
		 System.out.println("Buttons are :" +flo.size());
	
		 for(WebElement flo1:flo)
		 {
			 System.out.println(flo1.getAttribute("content-desc"));
			 
			 if(flo1.getAttribute("content-desc").equals("Contact Us"))
			 {
				 flo1.click();
			 }
			 
		 }
	}
		 @Test
		 public void message()
		 {
			 
			
		 List<WebElement> conus=(List<WebElement>) driver.findElementByClassName("android.widget.EditText");
		 
		 for(WebElement conus1:conus)
		 {
			 System.out.println(conus1.getAttribute("text"));
			 
			 if(conus1.getAttribute("text").equals("Enter your message here..."))
			 {
				 conus1.click();
				 conus1.sendKeys("hi");
			 }
		 }
		 //driver.findElement(By.xpath("//android.widget.EditText[@index=1']")).sendKeys("hi");
		 driver.findElement(By.xpath("//android.widget.Button[@content-desc='Send Message']")).click();
		 
		 driver.findElement(By.xpath("//android.widget.Button[@content-desc='Close']")).click();
		 }
	
}
