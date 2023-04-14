package com.qa1.appium3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BarCodeScanner extends Openapp2 
{
@Test
public void scan()
{
   //driver.findElement(By.xpath("//android.widget.ImageView[@index=0]")).click();
	driver.findElement(By.xpath("//android.view.View[@bounds='[622,109][657,144]']")).click();
	driver.findElement(By.xpath("//android.widget.Button[@text='Allow']")).click();
	driver.findElement(By.xpath("//android.widget.Button[@text='Cancel']")).click();

//driver.findElementById("00000000-0000-002f-0000-003100000004");
}
}
 