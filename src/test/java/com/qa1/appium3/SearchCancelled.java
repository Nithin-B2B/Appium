package com.qa1.appium3;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

public class SearchCancelled extends Openapp2
{   
	@Test
	public void history1()
	{
		driver.findElement(By.xpath("//android.view.View[@content-desc='Account']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
		driver.findElement(By.xpath("//android.view.View[@content-desc='All Orders']")).click();
		
		
		int startX = 350; //change
		int endX = 350;   //these
		int startY = 1300; //to match your
		int endY = 250;   //swipe direction
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("command", "input");
		params.put("args", Lists.newArrayList("swipe", startX,
		        startY, endX, endY));

		while (driver.findElements(By.xpath("//*[contains(@content-desc,'Submitted')]")).size() == 0) {
		    driver.executeScript("mobile: shell", params);   
		}
		
		driver.findElement(By.xpath("//*[contains(@content-desc,'Submitted')]")).click();
	}

}
