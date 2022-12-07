package Native_app;


import java.net.MalformedURLException;
import java.net.URL;
import static java.time.Duration.ofSeconds;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
public class demo_nativeapp_opertions {
	AndroidDriver<AndroidElement> driver;	
	@BeforeTest	
		public void details() throws MalformedURLException{
			
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
			dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"io.appium.android.apis");
			dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"io.appium.android.apis.ApiDemos");
			driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
			
		}
	@Test(enabled=false)
	public void keyboardactions() throws InterruptedException {
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		
	}
	@Test(enabled=false)
	public void swap_Drapanddropaction() throws InterruptedException {
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Date Widgets")).click();
		driver.findElement(MobileBy.AccessibilityId("2. Inline")).click();
		
		driver.findElement(MobileBy.AccessibilityId("12")).click();
		
		AndroidElement on=driver.findElement(MobileBy.AccessibilityId("15"));
		
		AndroidElement tw=driver.findElement(MobileBy.AccessibilityId("45"));
		
		TouchAction tee=new TouchAction(driver);
		
		tee.longPress(longPressOptions().withElement(element(on)).withDuration(ofSeconds(3))).moveTo(element(tw)).release().perform();
		
		driver.findElementByAndroidUIAutomator("text(\"PM\")").click();
		
		//drag and drop actions
		
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Drag and Drop")).click();
		
		AndroidElement doe1=driver.findElement(MobileBy.id("io.appium.android.apis:id/drag_dot_1"));
		AndroidElement doe2=driver.findElement(MobileBy.id("io.appium.android.apis:id/drag_dot_3"));
		Thread.sleep(3000);
		tee.longPress(longPressOptions().withElement(element(doe2)).withDuration(ofSeconds(5))).moveTo(element(doe1)).release().perform();
		
		
		
		
		
	}
	
	@Test
	public void switchapp() throws InterruptedException
	{
		
		driver.findElement(MobileBy.AccessibilityId("OS")).click();
		
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("SMS Messaging")).click();
		
		driver.findElement(MobileBy.id("io.appium.android.apis:id/sms_recipient")).sendKeys("(555) 521-5554");
		
		driver.findElement(MobileBy.id("io.appium.android.apis:id/sms_content")).sendKeys("Hi Welcome Madhavi");
		
		
		driver.findElement(MobileBy.AccessibilityId("Send")).click();
		
		
		driver.activateApp("com.google.android.apps.messaging");
		
		String M=driver.findElement(MobileBy.id("com.google.android.apps.messaging:id/conversation_snippet")).getText();
		
	System.out.println(M);
	
	driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
	Thread.sleep(3000);
	driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
	Thread.sleep(3000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	driver.pressKey(new KeyEvent(AndroidKey.HOME));
	
	
	
	}
	
	@Test(enabled=true)
	public void notification() throws InterruptedException {
		driver.openNotifications();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Open quick settings.")).click();
	
		TouchAction tee=new TouchAction(driver);
		Thread.sleep(10000);

		tee.longPress(PointOption.point(1045,621)).moveTo(PointOption.point(25, 612)).release().perform();
		
	}
	@Test
	public void scroll2() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.openNotifications();
		AndroidElement ele=driver.findElementByAccessibilityId("Open quick settings.");
		ele.click();
		TouchAction TA=new TouchAction(driver);
		//TA.longPress(longPressOptions().withElement(element(ele)).withDuration(ofSeconds(3))).moveTo(PointOption.point(0, scrollend)).release().perform();
		AndroidElement ele2=driver.findElement(MobileBy.id("com.android.systemui:id/tile_page"));
		Thread.sleep(3000);
		Double Screenwidthend= ele2.getSize().getWidth() * 0.9 ;
		int scrollover=Screenwidthend.intValue();
		Thread.sleep(3000);
		TA.longPress(longPressOptions().withElement(element(ele2)).withDuration(ofSeconds(3))).moveTo(PointOption.point(0, scrollover)).release().perform();
		Thread.sleep(3000);
	}
	@Test
	public void scroll3() throws InterruptedException
	{
	  driver.openNotifications();
	  AndroidElement ele=driver.findElementByAccessibilityId("Open quick settings.");
	  ele.click();
		//WebElement ele=driver.findElement(By.id("com.android.systemui:id/header_date"));
		 Double Screenheightend= ele.getSize().getHeight() * 0.8 ;
			int scrollend =Screenheightend .intValue();	
			TouchAction TA=new TouchAction(driver);	
			Thread.sleep(3000);
			TA.longPress(longPressOptions().withElement(element(ele)).withDuration(ofSeconds(3))).moveTo(PointOption.point(0, scrollend)).release().perform();
	}
	
}
