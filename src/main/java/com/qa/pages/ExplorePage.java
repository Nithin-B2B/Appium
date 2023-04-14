package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.mobile.BaseTest;

public class ExplorePage extends BaseTest 
{
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='Explore']") private MobileElement expl;
	
	public AvailableDistributor exp()
	{
		click(expl);
		return new AvailableDistributor();
		
	}
	
	
	
	
}
