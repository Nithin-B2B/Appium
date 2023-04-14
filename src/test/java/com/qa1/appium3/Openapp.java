package com.qa1.appium3;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Openapp {
 
	public AndroidDriver driver;

	@BeforeTest
	public void abc() throws MalformedURLException {
		
		
		DesiredCapabilities capabilities=new DesiredCapabilities(); 
		capabilities.setCapability("DeviceName", "253290ed");
		//File file= new File("app",System.getProperty("user.dir")+"/application/"+"ULPH_UAT_10.2.14_108.apk");
		File file=new File("C:\\Users\\vxuser\\Downloads\\ULPH_UAT_10.4.12_122.apk");
		capabilities.setCapability("app",file.getAbsolutePath());
		/* capabilities.setCapability("appWaitPackage", " com.vxceed.xnapp.tindahanclub.uat2");
		 capabilities.setCapability("appPackage", " com.vxceed.xnapp.tindahanclub.uat2");
		 capabilities.setCapability("appWaitActivity","com.vxceed.goordr.MainActivity");
		
		 capabilities.setCapability("appActivity","com.vxceed.goordr.MainActivity");*/
	
		
		 driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities); 
		 driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS); 
	} 
		@Test
		public void aaab() throws InterruptedException
		{
			
		
		List<WebElement> buttn=driver.findElementsByClassName("android.widget.Button");
		 System.out.println("Buttons are avialable in homescreen: "+buttn.size());
		 
		for(WebElement buttn1:buttn)
		{
			System.out.println(buttn1.getAttribute("content-desc")); 
		}
		List<WebElement> buttn1=driver.findElementsByClassName("android.view.View");
		 System.out.println("Text are avialable in homescreen: "+buttn1.size());
		 
		for(WebElement buttn2:buttn1)
		{
			System.out.println(buttn2.getAttribute("content-desc"));
		}
		 
		List<WebElement> buttn3=driver.findElementsByClassName("android.widget.ImageView");
		 System.out.println("Image are avialable in homescreen: "+buttn3.size());
		 
		for(WebElement buttn4:buttn3)
		{
			System.out.println(buttn4.getAttribute("content-desc"));
		}
		 
	Thread.sleep(2000);
	
    
    
    driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
	}
	@SuppressWarnings("unchecked")
	@Test
    public void acd() {
    	
    
	List<WebElement> buttn7=driver.findElementsByClassName("android.view.View");
	 System.out.println("display are avialable in Email or mobile no.: "+buttn7.size());
	 
	for(WebElement buttn8:buttn7)
	{
		System.out.println(buttn8.getAttribute("content-desc"));
	}
	List<WebElement> buttn9=driver.findElementsByClassName("android.widget.EditText");
	 System.out.println("Text are avialable in Email or mobile no.: "+buttn9.size());
	 
	for(WebElement buttn10:buttn9)
	{
		System.out.println(buttn10.getAttribute("text"));
		 if(buttn10.getAttribute("text").equals("Email or mobile number")) {
			 buttn10.click();
			 buttn10.sendKeys("b2b.18@gmail.com");
		 }	 
	}
	 List<WebElement> buttn5=driver.findElementsByClassName("android.widget.Button");
	 System.out.println("Buttons are avialable in Email or mobile no.: "+buttn5.size());
	 
	for(WebElement buttn6:buttn5)
	{
		System.out.println(buttn6.getAttribute("content-desc"));
		
	
		 if(((WebElement) buttn6).getAttribute("content-desc").equals("Next"))
		 {
			 ((WebElement) buttn6).click();
		 }
	}
}
     
    //driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).click();
    @SuppressWarnings("unchecked")
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).sendKeys("b2b.18@gmail.com");
   // driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
    @Test
	public void ade()
	{
	
	List<WebElement> bn=driver.findElementsByClassName("android.view.View");
	 System.out.println("display are avialable in password field: "+bn.size());
	 
	for(WebElement bn1:bn)
	{
		System.out.println(bn1.getAttribute("content-desc"));
	}
	List<WebElement> bn2=driver.findElementsByClassName("android.widget.EditText");
	 System.out.println("Text are avialable in password field: "+bn2.size());
	 
	for(WebElement bn3:bn2)
	{
		System.out.println(bn3.getAttribute("text"));
		 if(bn3.getAttribute("text").equals("Password *")) 
		 {
			 bn3.click();
			 bn3.sendKeys("Manila123");
		 }	 
	}
	 List<WebElement> bn4=driver.findElementsByClassName("android.widget.Button");
	 System.out.println("Buttons are avialable in password field: "+bn4.size());
	 
	for(WebElement bn5:bn4)
	{
		System.out.println(bn5.getAttribute("content-desc"));
		
		 /*if(bn5.getAttribute("content-desc").equals("Login"))
		 {
			 bn5.click();
		 }*/
	}
     
    //driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).click();
   //.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).sendKeys("Manila123");
    
    driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
	}
    @Test
    public void aef() throws InterruptedException
    {
    driver.findElement(By.xpath("//android.widget.ImageView[@index=0]")).click(); //For HPC 
    //driver.findElement(By.xpath("//android.widget.ImageView[@index=1]")).click(); //For IC

		Thread.sleep(3000);
    

    
    driver.findElement(By.xpath("//android.widget.Button[@index=4]")).click();
    
	  driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
	  driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
    }
	
	
	
	
	
	@AfterTest
	public void logout() {
		driver.findElement(By.xpath("//android.view.View[@content-desc='Account']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
		driver.findElement(By.xpath("//android.view.View[@content-desc='Logout']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Yes']")) .click();
	}
	}
	

