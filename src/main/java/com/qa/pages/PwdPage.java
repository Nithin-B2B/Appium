package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.mobile.BaseTest;

public class PwdPage extends BaseTest{
	
 @AndroidFindBy(xpath="//android.widget.EditText[@index='3']") private MobileElement passTxt;
 
 
  public PwdPage enterpwd(String password)
  {
	  
	  sendKeys(passTxt ,password);
	 
	  return this;
  }
	
  @AndroidFindBy(xpath="//*[contains(@content-desc,'Login')]") private MobileElement Lgnbtn;
  
  public AvailableDistributor login() {
	  click(Lgnbtn);
	return new AvailableDistributor() ;
	 
  }
  
  @AndroidFindBy(accessibility = "Invalid User Name/Password") private MobileElement errTxt;
  
  public String getErrTxt() {
	  return getAttribute(errTxt,"content-desc");
  }

public PwdPage clear1() 
{
	click(passTxt);
	passTxt.clear();
	
	return this;
	
}

@AndroidFindBy(accessibility = "Forgot Password") private MobileElement frpwd;

public PwdPage forget()
{
	click(frpwd);
	return this;
}







	 
}
