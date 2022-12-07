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
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
public class demo_native_app_operations {
	
	
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
	@Test
	public void testcase2() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		driver.findElement(MobileBy.AccessibilityId("Expandable Lists")).click();
		AndroidElement tr=driver.findElement(MobileBy.AccessibilityId("1. Custom Adapter"));
		TouchAction ty=new TouchAction(driver);
		
		ty.tap(tapOptions().withElement(element(tr))).perform();
		AndroidElement sd=driver.findElement(MobileBy.AndroidUIAutomator("new UISelector.text(\"Fish Names\")"));
		ty.longPress(longPressOptions().withElement(element(sd)).withDuration(ofSeconds(3))).release().perform();
		driver.findElementByAndroidUIAutomator("text(\"Sample Action\")").click();

	}
	@Test
	public void testcase3() {
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		driver.findElementByAndroidUIAutomator("new UIScrollable(new UISelector()).scrollIntoView(text(\"WebView\"))").click();
	}
	@Test(enabled=true)
	public void dropdown() throws InterruptedException
	{
		
			driver.findElement(MobileBy.AccessibilityId("Views")).click();
			Thread.sleep(3000);
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Spinner\"))").click();
			Thread.sleep(3000);
			driver.findElement(MobileBy.id("io.appium.android.apis:id/spinner1")).click();
			Thread.sleep(3000);
			driver.findElementByAndroidUIAutomator("text(\"green\")").click();
			Thread.sleep(3000);
			driver.findElement(MobileBy.id("io.appium.android.apis:id/spinner2")).click();
			Thread.sleep(3000);
			driver.findElementByAndroidUIAutomator("text(\"Neptune\")").click();
			
			driver.navigate().back();
			Thread.sleep(3000);
			driver.findElement(MobileBy.AccessibilityId("Visibility")).click();
			Thread.sleep(3000);
			driver.findElement(MobileBy.AccessibilityId("Invis")).click();
			
			driver.findElement(MobileBy.AccessibilityId("Vis")).click();
			Thread.sleep(3000);
			driver.findElement(MobileBy.AccessibilityId("Gone")).click();
			Thread.sleep(3000);
			driver.findElement(MobileBy.AccessibilityId("Vis")).click();
			
			driver.navigate().back();
			Thread.sleep(3000);
			driver.findElement(MobileBy.AccessibilityId("TextSwitcher")).click();
			Thread.sleep(3000);
			driver.findElement(MobileBy.AccessibilityId("Next")).click();
			driver.findElement(MobileBy.AccessibilityId("Next")).click();
	}
}
