package com.qa1.appium3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Termsacc  extends Openapp2
{
	@Test
public void tc()
{
	driver.findElement(By.xpath("//android.view.View[@content-desc='Account']")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
	driver.findElement(By.xpath("//android.view.View[@content-desc='Terms']")).click();
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Got it']")).click();
}
}
