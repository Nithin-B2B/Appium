package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.mobile.BaseTest;

public class WhiteSpaceRegistration extends BaseTest
{
	
	@AndroidFindBy(accessibility="No") private MobileElement noBtn;
	
	public WhiteSpaceRegistration NoButton()
	{
		click(noBtn);
		return this;
	}

	@AndroidFindBy(xpath="//android.widget.EditText[@text='Building *']") private MobileElement BuildingName;
	
	public WhiteSpaceRegistration enterBuildingName(String Bname)
	{
		click(BuildingName);
		sendKeys(BuildingName, Bname);
		
		return this;
	}
	@AndroidFindBy(xpath="(//*[contains(@content-desc,'Manila')])[1]") private MobileElement selectLoc;
	
	public WhiteSpaceRegistration SelectLocation()
	{
		click(selectLoc);
		return this;
	}
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Document Number']") private MobileElement docNum;
	
	public WhiteSpaceRegistration EnterDocNo(String number)
	{
		click(docNum);
		sendKeys(docNum, number);
		return this;
		
	}
	
	@AndroidFindBy(accessibility = "Select Document DTI/Business Permit") private MobileElement SelDoctype;
	@AndroidFindBy(accessibility = "Voter ID") private MobileElement selectDoc;
	public WhiteSpaceRegistration SelectDocumentType()
	{
		click(SelDoctype);
		click(selectDoc);
		return this;
	}
	
	@AndroidFindBy(accessibility = "Upload Document") private MobileElement uploadDoc;
	
	@AndroidFindBy(accessibility = "Upload from Library") private MobileElement docFromLib;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@index=0])[7]") private MobileElement slectPic;
	
	public WhiteSpaceRegistration UploadDocument()
	{
		click(uploadDoc);
		click(docFromLib);
		click(slectPic);
		
		return this;
	}
}
