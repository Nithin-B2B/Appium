package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.mobile.BaseTest;

public class AvailableDistributor extends BaseTest {

	@AndroidFindBy(xpath="//android.widget.ImageView[@index=0]") private MobileElement Titl;
	public AvailableDistributor select() {
		click(Titl);
		return this;
		
	}
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@index=1]") private MobileElement provider;
	
	public AvailableDistributor select1() {
		click(provider);
		return this;
	}
	
	@AndroidFindBy(accessibility ="Available Provider Selecta Ice Cream") private MobileElement provider1;
	
	public AvailableDistributor select2()
	{
		click(provider1);
		return this;

	}
 
	@AndroidFindBy(accessibility ="Yes" ) private MobileElement service;
	
	public AvailableDistributor select3()
	{
		click(service);
		return this;
		
	}
	
	@AndroidFindBy(xpath="//*[contains(@text,'Outlet Code')]") private MobileElement enterOutletCode;
	@AndroidFindBy(xpath="//*[contains(@text,'Invite Code')]") private MobileElement enterInviteCode;
	@AndroidFindBy(accessibility ="Verify") private MobileElement verifyacc;
	@AndroidFindBy(accessibility ="Invalid Outlet/Invite Code") private MobileElement errTxt5;
	@AndroidFindBy(accessibility = "Your registration is pending enrollment with company. You will receive SMS/Email notification once enrollment is successful.") private MobileElement succMsg;
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='Relogin']") private MobileElement relog;
	
	public AvailableDistributor outlet(String ocode)
	{
		click(enterOutletCode);
		sendKeys(enterOutletCode,ocode);
		return this;
	}
	
	public AvailableDistributor invite(String icode)
	{
		click(enterInviteCode);
		sendKeys(enterInviteCode,icode);
		return this;
	}
	
	public AvailableDistributor verify()
	{
		click(verifyacc);
		return this;
	}
	
	public String geterrTxt5()
	{
		return getAttribute(errTxt5, "content-desc");
	}
	
	public String getsuccMsg()
	{
		return getAttribute(succMsg, "content-desc");
	}
	public AvailableDistributor Relogin()
	{
		click(relog);
		return this;
	}
	

}
