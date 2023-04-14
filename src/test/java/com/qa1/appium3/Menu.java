package com.qa1.appium3;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

public class Menu  extends Openapp2{
	
	@Test
	public void footer()
	{
		//driver.getPageSource();

	    //The viewing size of the device
	    Dimension size = driver.manage().window().getSize();

	    //Starting y location set to 80% of the height (near bottom)
	    int starty = (int) (size.height * 0.80);
	    //Ending y location set to 20% of the height (near top)
	    int endy = (int) (size.height * 0.20);
	    //x position set to mid-screen horizontally
	    int startx = size.width / 2;

	    new TouchActions(driver)
	            .down(startx, starty)
	            .move(startx, endy)
	            .release()
	            .build()
	            .perform();
                /*List<WebElement> foot=driver.findElementsByClassName("android.view.View");
		System.out.println("The elements in home menu : "+foot.size());
		for(WebElement foot1:foot)
		{
			System.out.println(foot1.getAttribute("content-desc"));
		}*/
	}

}
