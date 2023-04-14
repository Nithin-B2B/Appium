package com.qa1.appium3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AccDel extends Openapp2
{
	@Test
	public void del()
	{
		driver.findElement(By.xpath("//android.view.View[@content-desc='Account']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
		driver.findElement(By.xpath("//android.view.View[@content-desc='Settings']")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc='Delete Account']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Delete Account']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).sendKeys("Manila123");
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Ok']")).click();

		
		
	}
	
	
}
