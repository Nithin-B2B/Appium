package com.qa1.appium3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class LoyaltyRedeem extends Openapp2
{
	@Test
	public void edeem()
	{
		driver.findElement(By.xpath("//android.view.View[@content-desc='Account']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Details']")).click();
		List<MobileElement> details=driver.findElementsByClassName("android.view.View");
		System.out.println("The attributes present in page are :" +details.size());
		
		for(MobileElement details1:details)
		{
			System.out.println(details1.getAttribute("content-desc"));
		}
		
		driver.findElement(By.xpath("//android.view.View[@content-desc='Redeem']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Select Points']")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc='500 Points']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Redeem']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Got it']")).click();
	}
	@Test
	public void history()
	{
		driver.findElement(By.xpath("//android.view.View[@content-desc='History']")).click();
		List<WebElement> points=driver.findElementsByClassName("android.view.View");
		System.out.println("pints history"+ points.size());
		
		for(WebElement points1:points)
			
			
		{
			System.out.println(points1.getAttribute("content-desc"));
		}
	}

}
