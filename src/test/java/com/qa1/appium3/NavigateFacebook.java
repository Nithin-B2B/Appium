package com.qa1.appium3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class NavigateFacebook extends Openapp2{


@Test
public void facebook()
	{
	
	try 
	{
	driver.findElement(By.xpath("//android.view.View[@content-desc='Account']")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
	
       	Dimension dimension=driver.manage().window().getSize();
        int start_x=(int) (dimension.width*0.5);
        int start_y=(int) (dimension.height*0.8);
        
        int end_x=(int) (dimension.width*0.5);
        int end_y=(int) (dimension.height*0.4); 
        
        TouchAction touch=new TouchAction(driver);
        touch.press(PointOption.point(start_x,start_y))
        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
        .moveTo(PointOption.point(end_x,end_y)).release().perform();

 
	 driver.findElement(By.xpath("//android.view.View[@content-desc='Facebook']")).click();
	
	
	}
	catch (Exception e)
	{

	 // TODO Auto-generated catch block

	 e.printStackTrace();

	 }
}
}
