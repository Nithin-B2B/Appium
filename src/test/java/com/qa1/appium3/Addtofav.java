package com.qa1.appium3;

import org.apache.commons.digester.plugins.strategies.FinderFromClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Addtofav extends Openapp2
{

	@Test
	public void fav() throws InterruptedException
	{
		driver.findElement(By.xpath("//android.widget.EditText[@text='What are you looking for?']")).click();
		   driver.findElement(By.xpath("//android.widget.EditText[@text='What are you looking for?']")).sendKeys("67082157");
		   Thread.sleep(2000);
		   driver.hideKeyboard();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("(//android.widget.Button[@clickable='true'])[2]")).click();
		   
		   driver.findElement(By.xpath("//android.view.View[@content-desc='Account']")).click();
		   driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click();
		    driver.findElement(By.xpath("//android.view.View[@content-desc='Favourites']")).click();
			   driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click();
			   driver.findElement(By.xpath("(//android.widget.Button[@content-desc='Buy Now'])[1]")).click();

			   driver.findElement(By.xpath("//android.widget.EditText[@text=0]")).click();
			   driver.findElement(By.xpath("//android.widget.EditText[@text=0]")).sendKeys("3");
			   driver.findElement(By.xpath("//android.widget.Button[@index=20]")).click();
			   
			   driver.findElement(By.xpath("//android.view.View[@index=4]")).click();
			   driver.findElement(By.xpath("//android.widget.Button[@content-desc='Proceed']")).click();
			   driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click();
			   
			   driver.findElement(By.xpath("//android.widget.Button[@content-desc='Confirm Order']")).click();
			   
			   driver.findElement(By.xpath("//android.widget.Button[@content-desc='Ok']")).click();

			   
		   
	}
}
