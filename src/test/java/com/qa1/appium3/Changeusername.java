package com.qa1.appium3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidElement;

public class Changeusername extends Openapp2 {
	@Test
	public void un()
	{
		driver.findElement(By.xpath("//android.view.View[@content-desc='Account']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
		
		driver.findElement(By.xpath("(//android.view.View[@content-desc='Account'])[1]")).click();
		
		driver.findElement(By.xpath("//*[ contains(@text,'Mobile')]")).click();
		driver.findElement(By.xpath("//*[ contains(@text,'Mobile')]")).sendKeys("8245658972");
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Save Changes\"]")).click();
		
		AndroidElement pass=(AndroidElement) driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']"));
		pass.click();
		pass.sendKeys("Manila123");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Ok']")).click();
		
		
	}
}
