package com.qa.pages;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindByAllSet;
import qa.mobile.BaseTest;

public class RegisterPage extends BaseTest {
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='Register here']") private MobileElement register;
	
	public RegisterPage registermain()
	{
		click(register);
		return this;
	}
	
	@AndroidFindBy(xpath="(//android.widget.EditText)[1]") private MobileElement FirstName;
	@AndroidFindBy(xpath="(//android.widget.EditText)[2]") private MobileElement FamilyName;
	@AndroidFindBy(xpath="//android.widget.Switch") private MobileElement TcToggle;
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='Next']") private MobileElement Next1;
	@AndroidFindBy(accessibility="We cannot proceed unless you agree to T&C and Privacy Policy") private MobileElement errTxt1;
	@AndroidFindBy(xpath="//*[contains(@text,'Email')]") private MobileElement email1;
	@AndroidFindBy(accessibility="This email address is invalid") private MobileElement errTxt2;
	@AndroidFindBy(xpath="(//*[contains(@text,'Password *')])[1]" )private MobileElement pass1;
	@AndroidFindBy(xpath="//*[contains(@text,'Confirm Password *')]") private MobileElement pass2;
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='DONE']") private MobileElement Done;
	@AndroidFindBy(accessibility="Password mismatch") private MobileElement errTxt3;
	@AndroidFindBy(accessibility="Validation successful. Please login.") private MobileElement SuccTxt;
	@AndroidFindByAllSet(value = {
	@AndroidFindAll(value= {@AndroidBy(accessibility ="At least one uppercase letter"),
			                @AndroidBy(accessibility ="At least 8 character in length"),
			                @AndroidBy(accessibility = "At least one lowercase")}) }) private List<MobileElement> errTxt4;	
	
	

	
	public RegisterPage Firstn(String fin)
	{
		click(FirstName);
		sendKeys(FirstName,fin); 
		return this;
	}
	
	public RegisterPage Familyn(String fan)
	{
		click(FamilyName);
		
		sendKeys(FamilyName,fan);
		return this;
	}
	public RegisterPage Toggle()
	{
		click(TcToggle);
		return this;
	}
	public RegisterPage Nst()
	{
		click(Next1);
		return this;
	}
	public  String getErrTxt1() 
	{
		  return getAttribute(errTxt1,"content-desc");
	}
	public RegisterPage Emailnew(String mail)
	{
		click(email1);
		sendKeys(email1,mail);
		return this;
	}
	public String getErrTxt2()
	{
		return getAttribute(errTxt2, "content-desc");
	}
	public RegisterPage Pass(String npass)
	{
		click(pass1);
		sendKeys(pass1, npass);
		return this;
	}
	public RegisterPage cPass(String cpass)
	{
		click(pass2);
		sendKeys(pass2, cpass);
		return this;
	}
	public RegisterPage Ddone()
	{
		click(Done);
		return this;
	}
	public  String getErrTxt3() 
	{
		  return getAttribute(errTxt3,"content-desc");
	}
	public  String getSuccTxt() 
	{
		  return getAttribute(SuccTxt,"content-desc");
	}

	public String getErrTxt4() {
		
		return getAttribute(errTxt4,"content-desc");
	}

	private String getAttribute(List<MobileElement> errTxt4, String attribute) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
