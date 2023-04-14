package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.mobile.BaseTest;

public class LoginPage  extends BaseTest {
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='Login']") private MobileElement Loginbttn;
	
		public EmailPage pressLoginBtn() {
			click(Loginbttn);
			return new EmailPage(); 
		}
@AndroidFindBy(accessibility = "Skip") private MobileElement Skip;

	public LoginPage pressSkip()
	{
		click(Skip);
		return this;
		
	}
	
	@AndroidFindBy(id = "com.vxceed.xnapp.tindahanclub.uat2:id/collapse_button") private MobileElement Cookies;
	
	public LoginPage avoidCookies()
	{
		click(Cookies);
		return this;
	}
	// driver.findElement(By.xpath("//android.widget.Button[@content-desc='Login']")).click();
	 
	 /*driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).click();
	 
	 driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).sendKeys("b2b.20@gmail.com");
	 driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
	 
	 
	 List<WebElement> bn2=driver.findElementsByClassName("android.widget.EditText");
	 System.out.println("Text are avialable in password field: "+bn2.size());
	 
	for(WebElement bn3:bn2)
	{
		System.out.println(bn3.getAttribute("text"));
		 if(bn3.getAttribute("text").equals("Password *")) 
		 { 
			 bn3.click();
			 bn3.sendKeys("Manila1234");
		 }	 
	}*/
}
