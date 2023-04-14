package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.mobile.BaseTest;

public class HomePage extends BaseTest 
{
   @AndroidFindBy(xpath="//android.widget.EditText") private MobileElement search;
   
   public HomePage searchproduct(String code)
  
   {
	   click(search);
	sendKeys(search, code);
	return this;
   }

   @AndroidFindBy(accessibility = "No products found") private MobileElement errTxt6;
public String getErrTxt6() 
{
	return getAttribute(errTxt6, "content-desc");
}

@AndroidFindBy(accessibility = "Skip") private MobileElement skip;
public HomePage skip1()
{ 
	click(skip);
	return  this;
}
@AndroidFindBy(xpath="//*[contains(@content-desc,'21009476')]") private MobileElement product;

public String product1()
{
	click(product);
	return getAttribute(product,"content-desc");
	

}
@AndroidFindBy(xpath="(//android.widget.EditText[@text=0])[1]") private MobileElement insertq;
public HomePage insert1(String input) throws InterruptedException 
{
	click(insertq);
	sendKeys(insertq,input);
	 click(addTocart);
	 
	
	return this;
}

@AndroidFindBy(xpath="//*[contains(@content-desc,'Add to Cart')]") private MobileElement addTocart;
@AndroidFindBy(xpath="//*[contains(@content-desc,'Cart')]") private MobileElement viewCart;

public HomePage VieCart()
{
	click(viewCart);
	return this;
}

/* public HomePage addcart()
 {
	 click(addTocart);
	 return this;

}*/
@AndroidFindBy(accessibility = "Apply Coupon & Voucher") private MobileElement apply;
@AndroidFindBy(xpath="(//*[contains(@content-desc ,'446.43 Amount Off')])[1]") private MobileElement Loyalty;
@AndroidFindBy(accessibility = "Apply Coupons") private MobileElement applycoupons;

public HomePage apployvoucher()
{
	click(Loyalty);
	
	return this;
}

public HomePage appcoupnvoucher()
{
	click(apply);
	return this;
}

public HomePage Applycoupons1()
{
	click(applycoupons);
	return this;
	
}

@AndroidFindBy(xpath="//android.widget.Button[@index=6]") private MobileElement detials;
public HomePage Seedetials()
{
	click(detials);
	return this;
}
@AndroidFindBy(accessibility = "Remove") private MobileElement removecoupon;

public HomePage couponRemove()
{
	click(removecoupon);
	return this;
}

@AndroidFindBy(accessibility = "Confirm Order") private MobileElement OrderConfirm;
@AndroidFindBy(accessibility = "Ok") private MobileElement ok;

public HomePage confirmOrder()
{
	click(OrderConfirm);
	click(ok);
	return this;
}

@AndroidFindBy(xpath="Order Placed") private MobileElement orderSuccessMessage;

public String SuccessMessage()
{
	return getAttribute(orderSuccessMessage, "content-desc");
}

@AndroidFindBy(accessibility = "Account") private MobileElement account;

public HomePage NavigateToAccount()
{
	click(account);
	return this;
}

@AndroidFindBy(accessibility = "Categories") private MobileElement category;;
 public HomePage NavigateToCategories()
 {
	 click(category);
	 return this;
	 
 }
 @AndroidFindBy(accessibility = "Home") private MobileElement home;
 
 public HomePage NavigateTohome()
 {
	 click(home);
	 return this;
 }
 
 @AndroidFindBy(accessibility = "Continue Shopping") private MobileElement ContShop;
 public HomePage ContinueShopping()
 {
	 click(ContShop);
	 return this; 
 }


}
