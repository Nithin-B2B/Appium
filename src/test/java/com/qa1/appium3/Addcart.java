package com.qa1.appium3;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Addcart extends Openapp2

{
	
	@Test
             public void cart() throws InterruptedException
             
             {
     	 //driver.findElement(By.xpath("//android.view.View[@content-desc='Categories']")).click();
            	 //driver.findElement(By.xpath("//android.widget.ImageView[@index=0]")).click();
            	 driver.findElement(By.xpath("//android.widget.EditText[@text='What are you looking for?']")).click();
            	 driver.findElement(By.xpath("//android.widget.EditText[@text='What are you looking for?']")).sendKeys("21018836");
            	 
            	 
            	 Thread.sleep(10000); 
            	 driver.hideKeyboard();
 
            	 driver.findElement(By.xpath("//android.widget.Button[@index=1]")).click();//add to fav
            	  
            	// driver.findElement(By.xpath("//android.widget.ImageView[@index=1]")).click();
            	 
            	 driver.findElement(By.xpath("//android.widget.Button[@content-desc='Buy Now']")).click();
            	 driver.findElement(By.xpath("//android.widget.EditText[@text=0]")).click();
            	 driver.findElement(By.xpath("//android.widget.EditText[@text=0]")).sendKeys("5");
            		
            	driver.findElement(By.xpath("//android.widget.Button[@index=17]")).click(); 
            	 
            	//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Buy Now']")).click();
            	//driver.findElement(By.xpath("//android.widget.EditText[@index=9]")).click();
            	//driver.findElement(By.xpath("//android.widget.EditText[@index=9]")).sendKeys("5");
            	//driver.findElement(By.xpath("//android.widget.Button[@index=17]")).click();
            	
            	//driver.findElement(By.xpath("//android.view.View[@index=3]")).click();
            	//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Confirm Order']")).click();
            	 //driver.findElement(By.xpath("//android.widget.Button[@content-desc='Ok']")).click();
            	
            	//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Track your Order']")).click();
            	
            	//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Continue Shopping']")).click();
            //driver.findElement(By.xpath("(//android.widget.Button)[4]")).click();
            	//List<WebElement> db=(List<WebElement>) driver.findElementsByClassName("//android.widget.Button");
               // System.out.println("The favorites available in :"+db.size());
             }


	@Test
	public void  favourites()
	       {
		
		  //driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
        		driver.findElement(By.xpath("//android.view.View[@content-desc='Account']")).click();
        		 driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
       driver.findElement(By.xpath("//android.view.View[@content-desc='Favourites']")).click();
       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 
       driver.findElement(By.xpath("//android.widget.Button[@content-desc='Buy Now']")).click();
    driver.findElement(By.xpath("//android.widget.EditText[@index=9]")).click();
   	driver.findElement(By.xpath("//android.widget.EditText[@index=9]")).sendKeys("5");
   driver.findElement(By.xpath("//android.widget.Button[@index=17]")).click();
   	driver.findElement(By.xpath("//android.widget.Button[@content-desc='View Cart']")).click();
	 driver.findElement(By.xpath("//android.widget.Button[@content-desc='Skip']")).click(); 

   	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Confirm Order']")).click();
   	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Ok']")).click();
                
	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Track your Order']")).click();
            driver.findElement(By.xpath("//android.widget.Button[@index=0]")).click();
                
             } 
}



