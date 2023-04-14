 package com.qa1.appium3;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class Toastmessage extends Openapplication {

	@Test
	public void toast() throws InterruptedException, IOException
	{
		 
	       
	       
	       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
	       
	       
	       driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).click();
	       driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).sendKeys("b2b.18@gmail.com");
	       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
	       
	       MobileElement elem1 = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']"));

		    org.openqa.selenium.Point point = elem1.getCenter();
		    int centerX = point.getX();
		    int centerY = point.getY();

		    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		    BufferedImage image = ImageIO.read(scrFile);
		    // Getting pixel color by position x and y 
		    int clr1 = image.getRGB(centerX,centerY); 
		    int red1   = (clr1 & 0x00ff0000) >> 16; 
		    int green1 = (clr1 & 0x0000ff00) >> 8;
		    int blue1  =  clr1 & 0x000000ff;
		    System.out.println("Red Color value = "+ red1);
		    System.out.println("Green Color value = "+ green1);
		    System.out.println("Blue Color value = "+ blue1);
	       
	       driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).click();
	       driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).sendKeys("manila123");
	       
	       driver.findElement(By.xpath("//android.widget.Button[@index=0]")).click();//eye icon click action
	       
	       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
	  Thread.sleep(6000);
	    
	    List<WebElement> b12=(List<WebElement>) driver.findElementsByClassName("android.view.View");
	    System.out.println( b12.size());
	    
	    for(WebElement b13:b12)
	    {
	    	System.out.println(b13.getAttribute("content-desc"));
	    		
	    }
	    WebElement toastView = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Invalid User Name/Password\"]"));
	    String text = toastView.getAttribute("content-desc");
	}
	      //WebElement toastmessage=driver.findElement(By.xpath("(//android.view.View[@content-desc='Login Failed Invalid User Name/Password']"));
	     //System.out.println(toastmessage.getAttribute("content-desc"));
	     
	     
	      
	      //Assert.assertEquals(toastmessage, " Login Failed ");
	
	
	//android.view.View[@content-desc="Invalid Outlet/Invite Code"]
	   @Test
	    public void colour() throws IOException
	    {
	    MobileElement elem = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']"));

	    org.openqa.selenium.Point point = elem.getCenter();
	    int centerX = point.getX();
	    int centerY = point.getY();

	    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	    BufferedImage image = ImageIO.read(scrFile);
	    // Getting pixel color by position x and y 
	    int clr = image.getRGB(centerX,centerY); 
	    int red   = (clr & 0x00ff0000) >> 16;
	    int green = (clr & 0x0000ff00) >> 8;
	    int blue  =  clr & 0x000000ff;
	    System.out.println("Red Color value = "+ red);
	    System.out.println("Green Color value = "+ green);
	    System.out.println("Blue Color value = "+ blue);
	}
}
