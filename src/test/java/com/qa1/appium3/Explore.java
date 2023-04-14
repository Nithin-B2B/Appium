package com.qa1.appium3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Explore extends Openapplication
{
	@Test
	public void  exp()
	{
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Explore']")).click();
	
	driver.findElement(By.xpath("//android.widget.ImageView[1]")).click();
	
	}

}