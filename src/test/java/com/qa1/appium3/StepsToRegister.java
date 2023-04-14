package com.qa1.appium3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class StepsToRegister extends Openapplication { 
@SuppressWarnings("unchecked")
@Test
	public void ample()//Step1 of registration
	
	{
	
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Register here']")).click();
	List<WebElement>b1=driver.findElementsByClassName("android.view.View");//1
	System.out.println("Text present in step1: "+b1.size());
	for(WebElement b2:b1)
	{
		System.out.println(b2.getAttribute("content-desc"));
	}
	
	List<WebElement>b3=driver.findElementsByClassName("android.widget.Button");//2
	System.out.println("buttons  present in step1: "+b3.size());
	for(WebElement b4:b3)
	{
		System.out.println(b4.getAttribute("content-desc"));
	}
	
	List<WebElement>b5=driver.findElementsByClassName("android.widget.Switch");//3
	System.out.println("switch present in step1: "+b5.size());
	for(WebElement b6:b5)
	{
		System.out.println(b6.getAttribute("content-desc"));
	}
		
	List< WebElement> button=driver.findElementsByClassName("android.widget.Button");//4
		 System.out.println("Textfields are avialable in step1 of registration: "+button.size());
		 
		for(WebElement button2:button)
		{	 
			
			System.out.println(button2.getAttribute("text")); 
		
	 if(button2.getAttribute("text").equals("First Name")) {
		 button2.click();
		
	 }}
} 


@SuppressWarnings("unchecked")
@Test
 
public void ballot() //Step 2 of registration
{
  //driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click();   

  	//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Register here']")).click();
  	driver.findElement(By.xpath("//android.widget.EditText[@text='Family Name']")).click();
  	driver.findElement(By.xpath("//android.widget.EditText[@text='Family Name']")).sendKeys("ftyi");
  	driver.findElement(By.xpath("//android.widget.EditText[@text='First Name']")).click();
  	driver.findElement(By.xpath("//android.widget.EditText[@text='First Name']")).sendKeys("nuth");
  	driver.findElement(By.xpath("//android.widget.Switch[@index=2]")).click();
  	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();

	List< WebElement> button=driver.findElementsByClassName("android.widget.EditText");
	 System.out.println("Textfields are avialable in step2 of registration: "+button.size());
	 
	for(WebElement button2:button)
	{ 
		System.out.println(button2.getAttribute("text"));  
	}
	
	List<WebElement> bt=driver.findElementsByClassName("android.widget.EditText");
	System.out.println("Textfields are avialable in step2 of reg:  "+button.size());
	for(WebElement bu2:bt)
	{
		System.out.println(bu2.getAttribute("text")); 
		
		if(bu2.getAttribute("text").equals("Email")) {
			 bu2.click();
			 bu2.sendKeys("b2b47@gmail.com");
		 }
	}
	
}
@SuppressWarnings("unchecked")
@Test
public void chariot() throws InterruptedException//Step 3 of registration
{
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
	List<WebElement> dim=driver.findElementsByClassName("android.widget.EditText");
	System.out.println("Password fields are available in step3 is:  "+dim.size());
	
	for(WebElement dim1:dim)
		
	{
		System.out.println(dim1.getAttribute("text"));
	
	}
	driver.findElement(By.xpath("//android.widget.EditText[@index=4]")).click();
	driver.findElement(By.xpath("//android.widget.EditText[@index=4]")).sendKeys("Manila123");
	driver.findElement(By.xpath("//android.widget.EditText[@index=5]")).click();
	driver.findElement(By.xpath("//android.widget.EditText[@index=5]")).sendKeys("Manila123");
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='DONE']")).click();
	
	Thread.sleep(20000);
	
}


/*public void demand()//Step 4 of registration
{
       List<WebElement> b7=(List<WebElement>) driver.findElementByClassName("android.view.View");
       System.out.println("Text in step4 : " +b7.size());
       
       for(WebElement b8:b7)
       {
    	   System.out.println(b8.getAttribute("content-desc"));
       } */
	


@Test

public void fruit() throws InterruptedException  //For relogin
{
	 driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
     driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).click();
     driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).sendKeys("b2b47@gmail.com");
     driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
     driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).click();
     driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).sendKeys("Manila123");
     
     driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
     
     driver.findElement(By.xpath("//android.widget.ImageView[@index=1]")).click();  
     driver.findElement(By.xpath("//android.widget.Button[@content-desc='Yes']")).click();
     driver.findElement(By.xpath("//android.widget.Button[@content-desc='Verify']")).click();
     Thread.sleep(10000);
     
     driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
     driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).click();
     driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).sendKeys("b2b47@gmail.com");
     driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
     driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).click();
     driver.findElement(By.xpath("//android.widget.EditText[@text='Password *']")).sendKeys("Manila123");

     
     driver.findElement(By.xpath("//android.widget.Button[@content-desc='Accept']")).click();
     driver.findElement(By.xpath("//android.widget.Button[content-desc='skip']")).click();


}


}