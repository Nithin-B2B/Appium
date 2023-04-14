package com.qa.tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.RegisterPage;

import qa.mobile.BaseTest;

public class RegisterTests  extends BaseTest
{
	RegisterPage registerPage;
	@BeforeMethod
	public void beforeMethod(Method m) {
		 registerPage=new RegisterPage();
		 System.out.println("\n" + "***********starting test: " +m.getName());
	  }
 @Test(priority =0)
 public void step1withoutTC() 
 {
	 registerPage.registermain();
	 registerPage.Firstn("test");
	 registerPage.Familyn("nAi");
	 registerPage.Nst();
	
	 String actualErrTxt=registerPage.getErrTxt1();
		String expectedErrTxt="We cannot proceed unless you agree to T&C and Privacy Policy";
		System.out.println("actual error txt -" +actualErrTxt +"\n" +"expected error txt -" +expectedErrTxt);
		Assert.assertEquals(actualErrTxt, expectedErrTxt);
	 
 }
 @Test(priority = 1)
 public void step1withTC() throws InterruptedException
 {
	 Thread.sleep(3000);
	 registerPage.Toggle();
	 registerPage.Nst();
 }
 @Test(priority=2)
 public void step2inavalidmail()
 {
	 registerPage.Emailnew("nimngmail.com");
	 registerPage.Nst();
	 String actualErrTxt=registerPage.getErrTxt2();
		String expectedErrTxt="This email address is invalid";
		System.out.println("actual error txt -" +actualErrTxt +"\n" +"expected error txt -" +expectedErrTxt);
		Assert.assertEquals(actualErrTxt, expectedErrTxt);
	 
 }
 @Test(priority = 3)
 public void step2validmail() throws InterruptedException
 {
	 Thread.sleep(2000);
	 registerPage.Emailnew("buv@6.com");
	 registerPage.Nst();
	 System.out.println("Step2 succefully completed");
 }
 @Test(priority = 4)
 public void step3invalidpassword() throws InterruptedException
 {
	 Thread.sleep(2000);
	 registerPage.Pass("Test1234");
	 registerPage.cPass("Test123");
	 registerPage.Ddone(); 
	 
	 String actualErrTxt=registerPage.getErrTxt3();
		String expectedErrTxt="Password mismatch";
		System.out.println("actual error txt -" +actualErrTxt +"\n" +"expected error txt -" +expectedErrTxt);
		Assert.assertEquals(actualErrTxt, expectedErrTxt);
	 
	 
 }@Test(priority = 5)
 public void step3notfollowingpasswordrequirement()
 {
	 registerPage.Pass("123456");
	 registerPage.cPass("123456");
	 registerPage.Ddone();
	 driver.hideKeyboard();
	 String actualErrTxt=registerPage.getErrTxt4();
	 String expectedErrTxt="At least 8 character in length,At least one lowercase,At least one uppercase letter";
	 System.out.println("actual error txt -"+actualErrTxt +"\n" +"expected error txt -" +expectedErrTxt);
	 Assert.assertEquals(actualErrTxt, expectedErrTxt);
 }
 
 @Test(priority=6)
 public void step3validpassword()throws InterruptedException
 {
	 Thread.sleep(2000);
	 registerPage.Pass("Test1234");
	 registerPage.cPass("Test1234");
  registerPage.Ddone();
  Thread.sleep(8000);
  
	 String actualSuccTxt=registerPage.getSuccTxt();
		String expectedSuccTxt="Validation successful. Please login.";
		System.out.println("actual success txt -" +actualSuccTxt +"\n" +"expected success txt -" +expectedSuccTxt);
		Assert.assertEquals(actualSuccTxt, expectedSuccTxt);
	   
 }
 
	
}
