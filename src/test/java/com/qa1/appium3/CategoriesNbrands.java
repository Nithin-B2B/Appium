package com.qa1.appium3;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class CategoriesNbrands extends Openapp2
{
	@Test
	public void hpc() throws InterruptedException
	{
		driver.findElement(By.xpath("//android.view.View[@content-desc='Categories']")).click();
         Thread.sleep(2000);
		List<MobileElement> categ=driver.findElementsByClassName("android.widget.ImageView");
	
         System.out.println("The categories present in the page is :" +categ.size());
         
         for(MobileElement categ1:categ)
         {
        	 System.out.println(categ1.getAttribute("content-desc"));
         }
		
	}

	@Test
	public void ic() throws InterruptedException
	{
		driver.findElement(By.xpath("//android.view.View[@content-desc='Brands']")).click();
		Thread.sleep(2000);
		List<MobileElement> bad=driver.findElements(By.xpath("android.widget.ImageView"));
		
		System.out.println("The brands present in the page is " +bad.size());
		
		for(MobileElement band1:bad)
		{
			System.out.println(band1.getAttribute("content-desc"));
		}
	}
	
}
	