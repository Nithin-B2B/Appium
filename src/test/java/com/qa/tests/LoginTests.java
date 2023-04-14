package com.qa.tests;


import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.AvailableDistributor;
import com.qa.pages.EmailPage;
import com.qa.pages.ExplorePage;
import com.qa.pages.LoginPage;
import com.qa.pages.PwdPage;
import com.qa.pages.RegisterPage;

import qa.mobile.BaseTest;

public class LoginTests extends BaseTest {
	LoginPage loginPage;
	EmailPage emailPage;
	PwdPage pwdPage;
	AvailableDistributor availDisPage;
	ExplorePage explorePage;
	RegisterPage registerpage;
	
	 @BeforeClass
	  public void beforeClass() {
	  }

	  @AfterClass
	  public void afterClass() {
	}

	  @BeforeMethod
	  public void beforeMethod(Method m) {
		 loginPage=new LoginPage();
		 System.out.println("\n" + "***********starting test: " +m.getName());
	  }

	  @AfterMethod
	  public void afterMethod() {
	  }
	  
	
		@Test(enabled=false)
	  public void avoid() throws InterruptedException
	  {
			Thread.sleep(3000);
		  loginPage.avoidCookies();
	  }
	  
		
	  
	
	 @Test(enabled=false)
	  public void explore1() throws InterruptedException
	  {
		 availDisPage=explorePage.exp();
			Thread.sleep(8000);
			availDisPage.select();  
	  }
	@Test(priority = 1) 
  public void invalidusername() throws InterruptedException {
		Thread.sleep(5000);
		emailPage=loginPage.pressLoginBtn();
		emailPage.enterClick();
		emailPage.enterEmail("b2b.17@gmail.com");
		pwdPage=emailPage.pressClickBtn();
		pwdPage.enterpwd("Test123");
		availDisPage=pwdPage.login();
		Thread.sleep(2000);
	
		String actualErrTxt=pwdPage.getErrTxt(); 
		String expectedErrTxt="Invalid User Name/Password";
		System.out.println("actual error txt -" +actualErrTxt +"\n" +"expected error txt -" +expectedErrTxt);
		Assert.assertEquals(actualErrTxt, expectedErrTxt);
		
		
		
  }
	@Test(priority = 2)
public void validusername() throws InterruptedException {
		
		pwdPage.clear1();
		Thread.sleep(2000);
		pwdPage.enterpwd("Manila123");
		availDisPage=pwdPage.login();
		Thread.sleep(3000);
		availDisPage.select(); // For already enrolled users
		/*String actualdistrTitle=availDisPage.getTitle();
		String expecteddisTitle="RT-MONTANA DISTRIBUTORS CORPOR";
		System.out.println("actual error txt -" +actualdistrTitle +"\n" +"expected error txt -" +expecteddisTitle);
		Assert.assertEquals(actualdistrTitle, expecteddisTitle);*/
		
  }
	@Test(enabled= false)
	public void selectprovider()
	{
		availDisPage.select1();//For HPC
		//availDisPage.select2(); // For IC
		//availDisPage.select3();
	}
   @Test(enabled= false)
	public void invalidoutletcode()
	{
		availDisPage.outlet("214568");
		availDisPage.invite("123456");
		availDisPage.verify();
		String actualErrTxt=availDisPage.geterrTxt5(); 
		String expectedErrTxt="Invalid Outlet/Invite Code";
		System.out.println("actual error txt -" +actualErrTxt +"\n" +"expected error txt -" +expectedErrTxt);
		Assert.assertEquals(actualErrTxt, expectedErrTxt);
		
	}
@Test(enabled= false)
	public void validoutletCode()
	
	{
	availDisPage.outlet("201649");
	availDisPage.invite("339486");
	availDisPage.verify();
	
	String actualsuccMsg=availDisPage.geterrTxt5(); 
	String expectedsuccMsg="Your registration is pending enrollment with company. You will receive SMS/Email notification once enrollment is successful.";
	System.out.println("actual success message -" +actualsuccMsg +"\n" +"expected success message -" +expectedsuccMsg);
	Assert.assertEquals(actualsuccMsg, expectedsuccMsg);
	
	}

 @Test (enabled = false)
 	public void forgotPassword() throws InterruptedException
 	{
	 emailPage=loginPage.pressLoginBtn();
	 emailPage.enterClick();
	 emailPage.enterEmail("b2b.840@gmail.com");
	 pwdPage=emailPage.pressClickBtn();
	 pwdPage.forget();
	 Thread.sleep(10000);
	 registerpage=new RegisterPage();
	 registerpage.Pass("Test1234");
	 registerpage.cPass("Test1234");
	 
	 
	 
	 
 	}
	
}
