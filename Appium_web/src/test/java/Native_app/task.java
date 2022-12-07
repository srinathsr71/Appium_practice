package Native_app;

import java.net.MalformedURLException;
import java.net.URL;
import static java.time.Duration.ofSeconds;

import org.openqa.selenium.By;
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
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class task {
	
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

	
	@Test(enabled=true)
	public void test1() throws InterruptedException {
		//Locators
		driver.findElementByAccessibilityId("App").click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.id("android:id/text1")).click();
		Thread.sleep(3000);
		AndroidElement size=driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)");
		System.out.println(size.getSize());
		Thread.sleep(4000);
		driver.findElementByAndroidUIAutomator("text(\"Custom Title\")").click();
		Thread.sleep(3000);
		driver.findElement(By.className("android.widget.EditText")).clear();
		Thread.sleep(3000);
		driver.findElement(By.className("android.widget.EditText")).sendKeys("srinath");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Right is always right\"]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Right is always right\"]")).sendKeys("hello world");
		Thread.sleep(3000);
		driver.hideKeyboard();
		
	}
	
@Test
public void test2() throws InterruptedException {
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(4000);
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"SetWallpaper\"))").click();
	Thread.sleep(4000);
	driver.findElement(MobileBy.AccessibilityId("Randomize")).click();
	Thread.sleep(4000);
	driver.findElementByAndroidUIAutomator("text(\"SET WALLPAPER\")").click();
	Thread.sleep(4000);
	driver.pressKey(new KeyEvent(AndroidKey.HOME));
	Thread.sleep(5000);
	driver.findElement(MobileBy.AccessibilityId("Views")).click();
	Thread.sleep(5000);
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rotating Button\"))").click();
	Thread.sleep(5000);
	
	//TouchAction tg=new TouchAction(driver);
	
	
	
	
//	AndroidElement ex=driver.findElementByAndroidUIAutomator("text(\"0.0\")");
//	AndroidElement ey=driver.findElementByAndroidUIAutomator("text(\"248.0\")");
//	
//	tg.longPress(longPressOptions().withElement(element(ex)).withDuration(ofSeconds(5))).moveTo(element(ey)).release().perform();
//	Thread.sleep(10000);

//	AndroidElement et=driver.findElementByAndroidUIAutomator("text(\"0.0\")");
//	AndroidElement eu=driver.findElementByAndroidUIAutomator("text(\"455.0\")");
//	
//	tg.longPress(longPressOptions().withElement(element(et)).withDuration(ofSeconds(5))).moveTo(element(eu)).release().perform();	
//	Thread.sleep(10000);
//	
//	AndroidElement ee=driver.findElementByAndroidUIAutomator("text(\"10.0\")");
//	AndroidElement ew=driver.findElementByAndroidUIAutomator("text(\"20.0\")");
//	
//	tg.longPress(longPressOptions().withElement(element(ee)).withDuration(ofSeconds(5))).moveTo(element(ew)).release().perform();	
//	Thread.sleep(10000);
//
//
//	AndroidElement ef=driver.findElementByAndroidUIAutomator("text(\"10.0\")");
//	AndroidElement eg=driver.findElementByAndroidUIAutomator("text(\"20.0\")");
//	
//	tg.longPress(longPressOptions().withElement(element(ef)).withDuration(ofSeconds(5))).moveTo(element(eg)).release().perform();	
//	Thread.sleep(10000);
//	
//	AndroidElement em=driver.findElementByAndroidUIAutomator("text(\"0.0\")");
//	AndroidElement en=driver.findElementByAndroidUIAutomator("text(\"360.0\")");
//	
//	tg.longPress(longPressOptions().withElement(element(em)).withDuration(ofSeconds(5))).moveTo(element(en)).release().perform();	
//	Thread.sleep(10000);
//	
//	AndroidElement el=driver.findElementByAndroidUIAutomator("text(\"0.0\")");
//	AndroidElement ep=driver.findElementByAndroidUIAutomator("text(\"360.0\")");
//	
//	tg.longPress(longPressOptions().withElement(element(el)).withDuration(ofSeconds(5))).moveTo(element(ep)).release().perform();	
//	Thread.sleep(10000);
//	
//	AndroidElement ez=driver.findElementByAndroidUIAutomator("text(\"0.0\")");
//	AndroidElement ed=driver.findElementByAndroidUIAutomator("text(\"272.0\")");
//	
//	tg.longPress(longPressOptions().withElement(element(ez)).withDuration(ofSeconds(5))).moveTo(element(ed)).release().perform();	
//	Thread.sleep(10000);
//	



}
	
	

	
}





















