package com.qa1.appium3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ApplyLoyalty  extends Openapp2
{
	@Test
public void al() throws InterruptedException
{
	driver.findElement(By.xpath("//android.view.View[@content-desc='Categories']")).click();
	driver.findElement(By.xpath("//*[contains(@content-desc, 'Panluto')]")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 

	driver.findElement(By.xpath("(//android.widget.Button[@content-desc='Buy Now'])[1]")).click();
	
	driver.findElement(By.xpath("//android.widget.EditText[@text, '0']")).click();
	
	driver.findElement(By.xpath("//android.widget.EditText[@text, '0']")).sendKeys("5");
	 driver.findElement(By.xpath("//*[contains(@content-desc , 'Add to Cart')]")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//android.view.View[@content-desc='4']")).click();
	 
	 
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 

	 driver.findElement(By.xpath("//android.widget.Button[@content-desc='Apply Coupon & Voucher']")).click();
	 driver.findElement(By.xpath("(//*[contains(@content-desc,  'Loyalty Voucher')])[2]")).click();
	 driver.findElement(By.xpath("//android.widget.Button[@content-desc='Apply Coupons']")).click();
	 driver.findElement(By.xpath("//android.widget.Button[@index=6]")).click();
	 
	 driver.findElement(By.xpath("//android.widget.Button[@content-desc='Confirm Order']")).click();
	 driver.findElement(By.xpath("//android.widget.Button[@content-desc='Ok']")).click();
	 
	 driver.findElement(By.xpath("//android.widget.Button[@content-desc='Continue Shopping']")).click();
	 
	 driver.findElement(By.xpath("(//android.widget.Button[@index=0])[1]")).click();
}

}
