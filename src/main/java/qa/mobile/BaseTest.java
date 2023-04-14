package qa.mobile;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.utils.Testutils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BaseTest {
	
	
	@SuppressWarnings("rawtypes")
	protected static AppiumDriver driver;
	protected static  Properties props;
	InputStream inputStream;
	
	public BaseTest() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
 //@Parameters({"deviceName"})
  @SuppressWarnings({ "rawtypes" })
@BeforeTest
  public void beforeTest() throws Exception
  {
	  try 
	  {
		  props =new Properties();
		  String propFileName="config.properties";
		  
		  inputStream=getClass().getClassLoader().getResourceAsStream(propFileName);
		  props.load(inputStream);
		  
		  	DesiredCapabilities capabilities=new DesiredCapabilities();
		  	//capabilities.setCapability("platformVersion","Android");
			capabilities.setCapability("DeviceName","253290ed");
			//capabilities.setCapability("appPackage", "com.vxceed.xnapp.tindahanclub.uat2");
			//capabilities.setCapability("appActivity","com.vxceed.goordr.MainActivity ");
			 capabilities.setCapability("automationName",props.getProperty("androidAutomationName"));
			 File file=new File("C:\\Users\\vxuser\\Downloads\\ULPH_UAT_10.4.16_132.apk");
			 capabilities.setCapability("app",file.getAbsolutePath());
			 driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities); 
			 
			// String sessionId=driver.getSessionId().toString();
			 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
	  }
	  catch(Exception e)
	  {
		 e.printStackTrace();
	  }
	  
  }
 
 public void WaitForVisibility(MobileElement e) {
	 WebDriverWait wait=new WebDriverWait(driver ,Testutils.WAIT);
	 wait.until(ExpectedConditions.visibilityOf(e));
	 
 }
 
 public void click(MobileElement e) {
	 WaitForVisibility(e);
	 e.click();
 }
 
 public void sendKeys(MobileElement e, String txt) {
	 WaitForVisibility(e);
	 e.sendKeys(txt);
 }
 public String getAttribute(MobileElement e, String attribute) {
	 WaitForVisibility(e);
	 return e.getAttribute(attribute);
 }

  @AfterTest
  public void afterTest() {
	 // driver.quit();
  }

}
