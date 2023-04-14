package com.qa1.appium3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TrackOrder extends Openapp2 {
	@Test
	public void track() 
	{
		
		driver.findElement(By.xpath("//android.view.View[@content-desc='Account']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc='All Orders']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Search order']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Search order']")).sendKeys("xo4032-53293");
		driver.findElement(By.xpath("//android.widget.ImageView[@index=0]")).click();
		
		List<WebElement> details=driver.findElementsByClassName("android.view.View");
		System.out.println("The order details page contains :" +details.size());
		
		for(WebElement details1:details)
		{
			System.out.println(details1.getAttribute("content-desc"));
		}
		
		driver.findElement(By.xpath("//android.widget.Button[@index=0]")).click();
		driver.findElement(By.xpath("//android.widget.Button[@index=0]")).click();


	}

}
