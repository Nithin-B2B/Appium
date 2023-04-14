package com.qa.tests;

import java.lang.reflect.Method;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.pages.AccountPage;
import com.qa.pages.HomePage;

import qa.mobile.BaseTest;

public class AccountPageTests  extends BaseTest
{
AccountPage accountpage;
HomePage homepage;
  
@BeforeMethod
 void beforeMethod(Method m)
{
	homepage=new HomePage();
	System.out.println("**********'''Starting tests - " +m.getName());
}

@Test(priority = 0)

public void navigatefacebook() throws InterruptedException
{
	Thread.sleep(8000);

	homepage.skip1();
	homepage.skip1();
	homepage.NavigateToAccount();
	homepage.skip1();
	accountpage=new AccountPage();
	
	
	                                                                                                                           
	//accountpage.scrollToFacebookButton();
	
}



@Test(priority = 2)
public void editing()
{
	accountpage.account2();
	accountpage.firname("myaccount", "PH");
	
	 String actualupdationmessage=accountpage.getupdateMessage();
	 String expextedupdationmessage=" Profile Updated Successfully.";
	System.out.println("actual update mess" +actualupdationmessage +"\n" + "expected update mess" +expextedupdationmessage); 
	
}



	
}
