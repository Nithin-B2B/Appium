package com.qa1.appium3;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class EditShcart extends Openapp2
{
	@Test
	public void cartedit() throws InterruptedException
	{
		//driver.findElement(By.xpath("//android.view.View[@content-desc='Cart']")).click();
		driver.findElement(By.xpath("//android.view.View[@bounds='[360,1314][522,1386]']")).click();
	Thread.sleep(3000);
		//driver.findElement(By.xpath("//android.view.View[@clickable='true'][2]")).click();//[1] for HPC
		//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Proceed']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Edit']")).click();
		
		driver.findElement(By.xpath("//android.widget.Button[@index=9]")).click();
		driver.findElement(By.xpath("//android.widget.Button[@index=2]")).click();
		driver.findElement(By.xpath("//android.widget.Button[@index=6]")).click();
		
		List<MobileElement> sum=driver.findElementsByClassName("android.view.View");
		System.out.println("The no of components are  :" +sum.size());
		
		for(MobileElement sum1:sum)
		{
			System.out.println(sum1.getAttribute("content-desc"));
			
		}
	}
	

}
