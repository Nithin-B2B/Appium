package com.qa1.appium3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class firstorder extends Openapp2
{
@Test
public void feedback()
{
	driver.findElement(By.xpath("//android.view.View[@content-desc='Categories']")).click();

	driver.findElement(By.xpath("//android.widget.ImageView[@index=0]")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
	driver.findElement(By.xpath("(//android.widget.Button[@content-desc=\"Buy Now\"])[1]")).click();
	driver.findElement(By.xpath("//android.widget.EditText[@text=0]")).click();
	driver.findElement(By.xpath("//android.widget.EditText[@text=0]")).sendKeys("3");
    driver.findElement(By.xpath("//android.widget.Button[@index=18]")).click();
    driver.findElement(By.xpath("//android.widget.Button[@content-desc='View Cart']")).click();
    driver.findElement(By.xpath("//android.widget.Button[@content-desc='Finish']")).click();
    driver.findElement(By.xpath("//android.widget.Button[@content-desc='Confirm Order']")).click();
    driver.findElement(By.xpath("//android.widget.Button[@content-desc='Ok']")).click();
    
    driver.findElement(By.xpath("//android.view.View[@index=6]")).click();
    driver.findElement(By.xpath("//android.widget.Button[@content-desc='Submit']")).click();
    
    driver.findElement(By.xpath("//android.view.View[@content-desc='I couldnt order the way i wanted.']")).click();
    
    driver.findElement(By.xpath("//android.widget.Button[@content-desc='Close']")).click();
    
    
}
	
}
