package com.qa1.appium3;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Homepage1 extends Openapp2{
	
	@SuppressWarnings("unchecked")
	@Test
	public void page() throws MalformedURLException{
		  
		
		 
		List< WebElement> button=driver.findElementsByClassName("android.widget.Button");
		 System.out.println("Buttons are avialable in homescreen: "+button.size());
		 
		 driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click();
		 
		 
		/* for(int i = 0;i<button.size();i++)
		 {
			 System.out.println(button.get(i).getAttribute("content-desc"));
		 
		 if(button.get(i).getAttribute("Login").equals("Login"))
		 {
			 button.get(i).click(); 
		 }  
		  
	}}*/
		 
		 for(WebElement button1 : button) {
			 System.out.println(button1.getAttribute("content-desc"));
			 
			// if(button1.getAttribute("content-desc").equals("Login")) {
				// button1.click();
			 //}
		 }
		 
	}

}
