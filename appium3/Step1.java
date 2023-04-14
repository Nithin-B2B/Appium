package com.qa1.appium3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Step1 extends Openapp2 {
@Test
	public void step()
	{
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click();   
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Register here']")).click();
		List< WebElement> button=driver.findElementsByClassName("android.widget.EditText");
		 System.out.println("Textfields are avialable in step1 of rgistration: "+button.size());
		 
		for(WebElement button2:button)
		{
			System.out.println(button2.getAttribute("text")); 
		}
	
	
} 
}
