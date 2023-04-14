package com.qa1.appium3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SwitchProvider extends Openapp {
	@SuppressWarnings("unchecked")
	@Test
	public void provider()
	{
		driver.findElement(By.xpath("//android.widget.ImageView[@index=0]")).click();
		
		
		List<WebElement>pro=driver.findElementsByClassName("android.widget.ImageView");//2
		System.out.println("Switch providers are : "+pro.size());
		for(WebElement pro1:pro)
		{
			System.out.println(pro1.getAttribute("bounds"));
		}
		driver.findElement(By.xpath("//android.widget.ImageView[@index=2]")).click();
	} 
	

}
