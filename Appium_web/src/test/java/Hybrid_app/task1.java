package Hybrid_app;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class task1 {
	
	AndroidDriver<AndroidElement> driver;	
	@BeforeTest	
		public void details() throws MalformedURLException{
			
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
			dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.androidsample.generalstore");
			dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.androidsample.generalstore.SplashActivity");
			driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
			
		}	
	
	
	
	@Test(enabled=false)
	public void positiveTesting() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("android:id/text1")).click();
		Thread.sleep(5000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Algeria\"))").click();
		driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("srinath");
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioMale")).click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(5000);
		driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
		Thread.sleep(5000);
		driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(5000);
		String s1=driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
		//first remove the character using substring
		s1=s1.substring(1);
		//convert the string into Double using parseDouble
		Double d=Double.parseDouble(s1);
		System.out.println(d);
		Thread.sleep(5000);
		String s2=driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
		s2=s2.substring(1);
		Double de=Double.parseDouble(s2);
		System.out.println(s2);
		Double Totalprice=d+de;
		System.out.println(Totalprice);
		Thread.sleep(5000);
			
		//String fr=driver.findElementByAndroidUIAutomator("text(\"$ 280.97\")").getText();
		//String s=fr.getText();
		String fr=driver.findElement(MobileBy.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
//		String s=fr.getText();
		fr=fr.substring(1);
		Double w=Double.parseDouble(fr);
		System.out.println(w);
		if(Totalprice.equals(w)) {
			System.out.println("price matching");
		}
		else {
			System.out.println("price not matching");
		}
		driver.findElement(MobileBy.className("android.widget.CheckBox")).click();
		Thread.sleep(5000);
		
		driver.findElement(MobileBy.className("android.widget.Button")).click();
		
	}
	@Test(enabled=true)
	public void positive() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("android:id/text1")).click();
		Thread.sleep(5000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Algeria\"))").click();
		driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("srinath");
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioMale")).click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(5000);
		String gt=driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Converse All Star\"))").getText();
		System.out.println(gt);
		//System.out.println(productname);
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Algeria\"))").click();
		driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(1).click();
		Thread.sleep(5000);
		
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(5000);
		String s5=driver.findElement(MobileBy.id("com.androidsample.generalstore:id/productPrice")).getText();
		s5=s5.substring(1);
		Double u=Double.parseDouble(s5);
		System.out.println(u);
		Thread.sleep(5000);
		driver.findElement(MobileBy.className("android.widget.CheckBox")).click();
		Thread.sleep(5000);
		
		driver.findElement(MobileBy.className("android.widget.Button")).click();
	}
	
}










