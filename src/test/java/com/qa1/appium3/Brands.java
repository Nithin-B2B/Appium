package com.qa1.appium3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Brands extends Openapp2{
	@Test
	public void bran() throws InterruptedException
	{
		driver.findElement(By.xpath("//android.view.View[@content-desc='Categories']")).click();
		
		driver.findElement(By.xpath("//android.view.View[@content-desc='Brands']")).click();
		
		List<WebElement> band=driver.findElementsByClassName("android.widget.ImageView");
		 System.out.println("Buttons are avialable in brand screen: "+band.size());
			Thread.sleep(5000);
			
		for(WebElement band1:band)
		{
			System.out.println(band1.getAttribute("content-desc"));
		}
		Thread.sleep(5000);
	}
	
	

}
