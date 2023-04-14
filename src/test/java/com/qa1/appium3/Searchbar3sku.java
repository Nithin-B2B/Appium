package com.qa1.appium3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Searchbar3sku extends Openapp2 
{
	@Test
	public void key() throws InterruptedException
	{
   driver.findElement(By.xpath("//android.widget.EditText[@text='What are you looking for?']")).click();
   driver.findElement(By.xpath("//android.widget.EditText[@text='What are you looking for?']")).sendKeys("nit");
   Thread.sleep(2000);
   driver.hideKeyboard();
   Thread.sleep(5000);
   
   /*List<WebElement> sku= driver.findElementsByClassName("android.widget.ImageView");
   System.out.println("Sku are : " +sku.size());
   
   for(WebElement sku1:sku)
   {
	System.out.println(sku1.getAttribute("content-desc"));
	
   }*/
   
   //----For search sku not in the list
   List<WebElement> skun= driver.findElementsByClassName("android.view.View");
   
   for(WebElement skun1:skun)
   {
	   System.out.println(skun1.getAttribute("content-desc"));
	   if(skun1.getAttribute("content-desc").equals("No products found"))
	   {
		   System.out.println("PASS");
	   }
   }

	}

}
