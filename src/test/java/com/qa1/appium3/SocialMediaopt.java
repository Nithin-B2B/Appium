package com.qa1.appium3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SocialMediaopt extends Openapp2 {
@Test
	public void socialmed()
	{
	 


		driver.findElement(By.xpath("//android.view.View[@content-desc='Account']")).click();
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
		//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click();
		
		driver.findElement(By.xpath("//android.view.View[@content-desc='Settings']")).click();
		
		driver.findElement(By.xpath("//android.view.View[@index=3]")).click();// for social media opt-in/opt-out
		
		driver.findElementByAccessibilityId("Yes").click();
		
		driver.findElement(By.xpath("//android.widget.Button[@index=0]")).click();
		
		 
		
		
	}
	
}
