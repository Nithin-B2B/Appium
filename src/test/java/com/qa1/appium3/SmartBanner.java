package com.qa1.appium3;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

public class SmartBanner extends Openapp2
{@Test
public void smb()
{
	int startX = 350; //change
	int endX = 350;   //these
	int startY = 1200; //to match your
	int endY = 350;   //swipe direction
	Map<String, Object> params = new HashMap<String, Object>();
	params.put("command", "input");
	params.put("args", Lists.newArrayList("swipe", startX,
	        startY, endX, endY));

	while (driver.findElements(By.xpath("//*[contains(@content-desc,'Smart Banner')]")).size() == 0) {
	    driver.executeScript("mobile: shell", params);   
	}
	driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[0,1028][720,1298]']")).click();
}
}
