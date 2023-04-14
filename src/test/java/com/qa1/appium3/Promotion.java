package com.qa1.appium3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Promotion extends Openapp2
{
	@Test
    public void promo()
    {
		driver.findElement(By.xpath("//android.view.View[@content-desc='Account']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
    	driver.findElement(By.xpath("//android.view.View[@content-desc='Promotions']")).click();
    	driver.findElement(By.xpath("//android.widget.ImageView[@index=0]")).click();
    	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Quick Buy']")).click();
    	driver.findElement(By.xpath("//android.widget.Button[@content-desc='View Cart']")).click();
    	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Apply Coupon & Voucher']")).click();
    }
	
}
