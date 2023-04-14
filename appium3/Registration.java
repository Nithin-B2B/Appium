package com.qa1.appium3;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Registration extends Openapp{ 
	
	@Test
	public void AppiumTest() throws MalformedURLException, InterruptedException
	{
		/*DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability("DEVICE_NAME", "emulator-5554");
		cap.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"/application/"+"ULPH_UAT_10.2.10_106.apk");
		cap.setCapability("autoGrantPermissions",true);
		
		AndroidDriver driver =new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"),cap);
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);*/
		//Register
		//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click();
		 
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Register here']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Family Name']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Family Name']")).sendKeys("Mayjdu");
		driver.findElement(By.xpath("//android.widget.EditText[@text='First Name']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='First Name']")).sendKeys("Moyufgn");
	    driver.findElement(By.xpath("//android.widget.Switch[@index=2]")).click();
	    driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
	    
	    driver.findElement(By.xpath("//android.widget.EditText[@text='Email']")).click();
	    driver.findElement(By.xpath("//android.widget.EditText[@text='Email']")).sendKeys("b2bph4.93@gmail.com");
	    driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();

	    driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).click();
	    driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).sendKeys("Manila123");
	    driver.findElement(By.xpath("//android.widget.EditText[@text='Confirm Password *']")).click();
	    driver.findElement(By.xpath("//android.widget.EditText[@text='Confirm Password *']")).sendKeys("Manila123");
	    
	     
       driver.findElement(By.xpath("//android.widget.Button[@content-desc='DONE']")).click();
        
   
       //Login
       
    	//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click();   
      
       
       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
       
     //  driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
       
       driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).click();
       driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).sendKeys("b2bph4.93@gmail.com");
       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
       
      // driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
       
       driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).click();
       driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).sendKeys("Manila123");
       
       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
       // enroll
       driver.findElement(By.xpath("//android.widget.ImageView[@index=1]")).click();
       
       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Yes']")).click();
       Thread.sleep(40000);
       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Verify']")).click();
       
       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Relogin']")).click();
       //Relogin
       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
       driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).click();
       driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).sendKeys("b2bph4.93@gmail.com");
       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
       driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).click();
       driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).sendKeys("Manila123");
       
       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
       
       driver.findElement(By.xpath("//android.widget.Button[@index=5]")).click();  
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//android.widget.Button[content-desc='skip']")).click();
       
       driver.findElement(By.className("//android.view.View[@index=4]")).click(); 

       
       

	

}
}
