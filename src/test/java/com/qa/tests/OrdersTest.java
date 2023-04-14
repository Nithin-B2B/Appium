package com.qa.tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.OrdersPage;

import qa.mobile.BaseTest;

public class OrdersTest extends BaseTest
{
	
	HomePage homepage;
    OrdersPage orderspage;
	@BeforeMethod
	
	void beforeMethod(Method m)
	{
		 homepage=new HomePage();
		System.out.println("**********'''Starting tests - " +m.getName());
	}
	
	@Test(enabled=false)
	public void searchorder() throws InterruptedException
	{
	homepage.skip1();
	homepage.skip1();
	OrdersPage orderspage=new OrdersPage();
	orderspage.searchbar("20091933");
	orderspage.BuyProduct();
	orderspage.InputQuan("6");
	orderspage.addToCartButn();
	orderspage.Viewcart();
	HomePage homepage=new HomePage();
	homepage.skip1();
	
	orderspage.confirmOrder();
	
	 String actualmessage=homepage.SuccessMessage();
	 String expectedmessage="Order Placed";
	 System.out.println("actual message after placing order is " +actualmessage +"\n"+ "expected message after placing order is "+expectedmessage);
	
	 
	}
	@Test

	public void orderplaceThroughcategories() throws InterruptedException
	{
		HomePage homepage=new HomePage();
		homepage.skip1();
		homepage.skip1();
		homepage.NavigateToCategories();
		OrdersPage orderspage=new OrdersPage();
		orderspage.allCate();
		homepage.skip1();
		orderspage.SearchInCateg();
	
		orderspage.searchbar("20091933");
		orderspage.BuyProduct();
		orderspage.InputQuan("6");
		orderspage.addToCartButn();
		Thread.sleep(5000);
		orderspage.Back();
		orderspage.Viewcart();
		homepage.skip1();
		
		orderspage.confirmOrder();
		
		 String actualmessage=homepage.SuccessMessage();
		 String expectedmessage="Order Placed";
		 System.out.println("actual message after placing order is " +actualmessage +"\n"+ "expected message after placing order is "+expectedmessage);
		 Assert.assertEquals(actualmessage, expectedmessage);
		
		
		
	}
	
	
	
	
	
	
}
