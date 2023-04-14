package com.qa1.appium3;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

public class CategoriesPage extends Openapp2
{

@SuppressWarnings("unchecked")
@Test
public void Category() throws InterruptedException 
{
	  
	driver.findElement(By.xpath("//android.view.View[@content-desc='Categories']")).click();
	driver.findElement(By.xpath("//android.widget.ImageView[2]")).click();
	//driver.findElement(By.xpath("//android.widget.ImageView[@index=0]")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().content-desccontains(\"Out of Stock\").instance(0))").click();

	int startX = 350; //change
	int endX = 350;   //these
	int startY = 1200; //to match your
	int endY = 350;   //swipe direction
	Map<String, Object> params = new HashMap<String, Object>();
	params.put("command", "input");
	params.put("args", Lists.newArrayList("swipe", startX,
	        startY, endX, endY));

	while (driver.findElements(By.xpath("//*[contains(@content-desc,'Out of Stock')]")).size() == 0) {
	    driver.executeScript("mobile: shell", params);
	    
	    
	}
    driver.findElement(By.xpath("//*[contains(@content-desc,'Out of Stock')]")).click();


	/*List<WebElement> cate=driver.findElementsByClassName("android.widget.ImageView");
	 System.out.println("Buttons are avialable in categories screen: "+cate.size());
		Thread.sleep(5000);
		
	
	
		System.out.println(((WebElement) cate).getAttribute("content-desc"));
	
	Thread.sleep(5000);*/
}
}
