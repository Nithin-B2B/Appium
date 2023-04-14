package com.qa.pages;

import org.aspectj.lang.annotation.AdviceName;
import org.aspectj.weaver.ast.Or;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.mobile.BaseTest;

public class OrdersPage extends BaseTest
{
	@AndroidFindBy(xpath="//android.widget.EditText[@text='What are you looking for?']") private MobileElement search;
	
	public OrdersPage searchbar(String itemcode)
	{
		click(search);
		sendKeys(search, itemcode);
		return this;
	}
	
	@AndroidFindBy(accessibility = "Buy Now") private MobileElement Buy;
	
	public OrdersPage BuyProduct()
	{
		click(Buy);
		return this;
	}
	
	@AndroidFindBy(xpath="(//android.widget.EditText[@text=0])[1]") private MobileElement inputq;
	
	public OrdersPage InputQuan(String no)
	{
		click(inputq);
		sendKeys(inputq,no);
		return this;
	}
	
	@AndroidFindBy(xpath="//*[contains(@content-desc, 'Add to Cart')]") private MobileElement Addcart;
	
	public OrdersPage  addToCartButn()
	{
		click(Addcart);
		return this;
	}
	
	@AndroidFindBy(xpath="//*[contains(@content-desc, 'Cart')]") private MobileElement Cart;
	
	@AndroidFindBy(xpath="//*[contains(@content-desc, 'Unilever')]") private MobileElement cartproviderhpc;
	@AndroidFindBy(xpath="//*[contains(@content-desc,'Selecta Ice Cream')]") private MobileElement cartIcProvider;
	@AndroidFindBy(accessibility = "Proceed") private MobileElement proceedbtn;
	public OrdersPage Viewcart() throws InterruptedException
	{
		Thread.sleep(22000);
		click(Cart);
	
		click(cartproviderhpc);//For HPC
		//click(cartIcProvider);//For IC
		click(proceedbtn);
		return this;
	}
	
	@AndroidFindBy(accessibility = "Confirm Order") private MobileElement confirm;
	@AndroidFindBy(accessibility = "Ok") private MobileElement okbtn;
	
	public OrdersPage confirmOrder() throws InterruptedException
	{
		click(confirm);
		Thread.sleep(3000);
		click(okbtn);
		return this;
	}
	@AndroidFindBy(xpath="//*[contains(@content-desc, 'All')]") private MobileElement catall;
	
	public OrdersPage allCate()
	{
		click(catall);
		return this;
	}
	
	@AndroidFindBy(xpath="(//android.view.View[@index=2])[1]") private MobileElement Searchincat;
	
	public OrdersPage SearchInCateg()
	{
		click(Searchincat);
		return this;
	}
	
	@AndroidFindBy(xpath="(//android.widget.Button[@index=0])[1]") private MobileElement backbtn;
	
	public OrdersPage Back()
	{
		click(backbtn);
		return this;
	}

}
