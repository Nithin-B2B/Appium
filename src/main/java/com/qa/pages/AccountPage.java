package com.qa.pages;



import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.mobile.BaseTest;

public class AccountPage extends BaseTest

{
   /*@AndroidFindBy(accessibility="Facebook") private MobileElement facebook;
   
   public AccountPage NaviogateToFacebook()
   {
	   click(facebook);
	   return this;
   }*/
   
  
   
   @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
           ".scrollIntoView(new UiSelector().content-desc('Facebook'))")
private MobileElement facebookElement;

public AccountPage scrollToFacebookButton()  
{
      click(facebookElement);
      return this;
}

@AndroidFindBy(xpath="(//android.view.View[@content-desc='Account'])[1]") private MobileElement account1;

public AccountPage account2()
{
	click(account1);
	return this;
}


@AndroidFindBy(xpath="//*[contains(@text,'First Name')]") private MobileElement editfn;
public AccountPage firname(String Change,String change1)
{
	click(editfn);
	sendKeys(editfn, Change);
	
	click(editln);
	sendKeys(editln, change1);
	click(savechange);
	click(update); 
	
	return this;
}

@AndroidFindBy(xpath="//*[contains(@text,'Last Name')]")private MobileElement editln;

@AndroidFindBy(accessibility = "Save Changes") private MobileElement savechange;

@AndroidFindBy(accessibility = "Ok") private MobileElement update;

@AndroidFindBy(accessibility = "Profile Updated Successfully.") private MobileElement updateMessage;

public String getupdateMessage()
{
	return getAttribute(updateMessage, "content-desc"); 
}


}
