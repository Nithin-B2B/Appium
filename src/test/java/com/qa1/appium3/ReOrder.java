package com.qa1.appium3;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class ReOrder extends Openapp2
{
     @Test
	public void buyagain() throws InterruptedException
	{  
    	 
    	 
    	 driver.findElement(By.xpath("//android.view.View[@content-desc='Account']")).click();
 		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
 		driver.findElement(By.xpath("//android.view.View[@content-desc='All Orders']")).click();
 		for(int i=0;i<=2;i++)
   	 {
		driver.findElement(By.xpath("//android.widget.ImageView[@index=0]")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Buy Again']")).click();
		driver.findElement(By.xpath("//android.widget.Switch[@index=5]")).click();
		driver.findElement(By.xpath("//android.widget.Button[@index=25]")).click();
 		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 

		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Confirm Order']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Ok']")).click();
		Thread.sleep(35000);
		List<MobileElement> loyl=driver.findElementsByClassName("android.view.View");
		System.out.println(loyl.size());
		
		for(MobileElement loyl1:loyl)
		{
			System.out.println(loyl1.getAttribute("content-desc"));
		}
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Continue Shopping']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@index=0]")).click();
    	 }

	}
}
