package com.qa1.appium3;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class AllOrderhistory extends Openapp2 
{
	@Test
	public void history()
	{
		driver.findElement(By.xpath("//android.view.View[@content-desc='Account']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
		driver.findElement(By.xpath("//android.view.View[@content-desc='All Orders']")).click();
		
		List<MobileElement> hist=driver.findElementsByClassName("android.widget.ImageView");
		System.out.println("The order details shown " +hist.size());
		
	for(MobileElement hist1:hist)
	{
		System.out.println(hist1.getAttribute("content-desc"));
	}
	driver.findElement(By.xpath("//android.widget.Button[@index=0]")).click();
		
	}

}
