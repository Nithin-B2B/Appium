package com.qa1.appium3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Addcartofanotherprovider extends Openapp2 {
	@Test
	public void iccart() throws InterruptedException
	{
		 driver.findElement(By.xpath("//android.widget.EditText[@text='What are you looking for?']")).click();
		   driver.findElement(By.xpath("//android.widget.EditText[@text='What are you looking for?']")).sendKeys("cornet");
		   Thread.sleep(30000);
		   driver.hideKeyboard();
		   
		   driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View")).click();
		   //driver.findElement(By.xpath("//android.view.View[@index=1]")).click();
		  // driver.findElement(By.xpath("//android.view.View[@index=1]")).clear();
		   //driver.findElement(By.xpath("//android.widget.EditText[@index=0']")).click();
		 //  driver.findElement(By.xpath("//android.widget.EditText[@index=0']")).clear();
		   driver.findElement(By.xpath("//android.widget.EditText[@text='What are you looking for?']")).click();
		   driver.findElement(By.xpath("//android.widget.EditText[@text='What are you looking for?']")).sendKeys("cornet"); 
		   Thread.sleep(5000);
		   
		   driver.findElement(By.xpath("(//android.widget.Button[@content-desc='Buy Now'])[2]")).click();
		   
		   driver.findElement(By.xpath("//android.widget.EditText[@text=0]")).click();
		   driver.findElement(By.xpath("//android.widget.EditText[@text=0]")).sendKeys("3");
		    
		   driver.findElement(By.xpath("//android.widget.Button[@index=18]")).click();
		   driver.findElement(By.xpath("//android.view.View[@index=3]")).click();
		   
		   List<WebElement> multicart=driver.findElementsByClassName("android.view.View");
		   System.out.println("The Elements present : " + multicart.size());
		   
		   for(WebElement multicart1:multicart)
		   {
			   System.out.println(multicart1.getAttribute("content-desc"));
			   
		   }
		   
		  
	}

}
