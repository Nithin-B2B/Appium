package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.mobile.BaseTest;

public class EmailPage extends BaseTest{
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile number']")).click();
	
	@AndroidFindBy(className="android.widget.EditText") private MobileElement EmailTxtField;
	//public String getTitle() {
		//return getAttribute(EmailTxtField,"text");
		
	//}
	 
	public EmailPage enterClick()
	 {
		 click(EmailTxtField);
		 return  this;
		 
	 }
	@AndroidFindBy(className="android.widget.EditText") private MobileElement EmailTxtField1;
	
	public EmailPage enterEmail(String username) {
	
		sendKeys(EmailTxtField1, username);
		return this;
	}
	//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
@AndroidFindBy(xpath="//android.widget.Button[@content-desc='Next']") private MobileElement Nextbtn;
	
	public PwdPage pressClickBtn() {
		click(Nextbtn);
		return new PwdPage();
	}
	

}
