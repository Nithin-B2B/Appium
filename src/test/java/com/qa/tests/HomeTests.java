package com.qa.tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;

import qa.mobile.BaseTest;

public class HomeTests extends BaseTest
{
 HomePage homepage;
 

 @BeforeMethod
 public void beforeMethod(Method m) {
	 homepage=new HomePage();
	 System.out.println("\n" + "***********starting test: " +m.getName()); 
	 
 }
	
 @Test(enabled = false)
 public void invaliditemcode()
 
 {
	 homepage.skip1();
	 homepage.skip1();
	 
	 homepage.searchproduct("21456863");

		String actualErrTxt=homepage.getErrTxt6(); 
		String expectedErrTxt="No products found";
		System.out.println("actual error txt -" +actualErrTxt +"\n" +"expected error txt -" +expectedErrTxt);
		Assert.assertEquals(actualErrTxt, expectedErrTxt);
 }
 
 @Test(enabled = false)
 public void validitemcode() throws InterruptedException
 {
	 Thread.sleep(5000);
	 homepage.searchproduct("21009476");
	 
	 String actualProductdesc=homepage.product1();
	 String expectedProductdes=" 21009476 KNORR SINIGANG ORIGINAL(6+1) ₱63.00";
	System.out.println("actual Product desc" +actualProductdesc +"\n" + "expected Product des" +expectedProductdes); 
	Assert.assertEquals(actualProductdesc, expectedProductdes);

 }
 
 @Test(enabled = false)
 public void inputquantity() throws InterruptedException
 {
	 homepage.insert1("5");
	 homepage.VieCart();
	 homepage.skip1();
	 homepage.appcoupnvoucher();
	 homepage.Applycoupons1();
	 homepage.Seedetials();//To see the details of items,gross total,discount,taxes and coupons applied.
	 homepage.couponRemove();
	 
 }
 
 @Test(priority = 0)
 
 public void navigateToCart()
 {
	 homepage.skip1();
	 homepage.skip1();
	 homepage.VieCart();
	 homepage.confirmOrder();
	 
	 String actualmessage=homepage.SuccessMessage();
	 String expectedmessage="Order Placed";
	 System.out.println("actual message after placing order is " +actualmessage +"\n"+ "expected message after placing order is "+expectedmessage);;
	Assert.assertEquals(actualmessage, expectedmessage);		 
	 
 }
 
	
}
