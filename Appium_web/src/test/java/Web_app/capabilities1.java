package Web_app;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.Immutable;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class capabilities1 {
	
	AndroidDriver<AndroidElement> driver;
	
	
@BeforeTest
public void te() throws MalformedURLException {
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	//dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	//dc.setCapability("appium:chromeoptions", ImmutableMap.of("w3c",false));
	dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "H://Downloads//chromedriver.exe");
	driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	
}
@Test
public void test1() {
	driver.get("https://www.google.com");
	driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("Moolyaed");
	Actions as=new Actions(driver);
	as.sendKeys(Keys.ENTER).build().perform();
//	JavascriptExecutor js=((JavascriptExecutor)driver);
//	js.executeScript("document.getElementsByClassName(\"oewGkc LeUQr MUxGbd v0nnCb\")[1].scrollIntoView()");
//	driver.findElement(By.xpath("//div[contains(text(),'MoolyaEd | LinkedIn']")).click();
//	System.out.println(driver.getTitle());
//	Actions ac = new Actions(driver);
//	ac.sendKeys(Keys.ENTER).build().perform();
//	List<AndroidElement> links1=driver.findElements(By.tagName("a"));
//	System.out.print("total links   "+links1.size());
//	
//	for(int i=0;i<links1.size();i++)
//	{	
//	System.out.println(links1.get(i).getText());
// //System.out.println(links1.get(i).getAttribute("href"));	 
//	String url1=links1.get(i).getAttribute("href");
//	if(url1!=null)
//	{
//	System.out.println(links1.get(i).getAttribute("href"));
//	}	
//	}
//	JavascriptExecutor ji = (JavascriptExecutor)driver;
//	ji.executeScript("document.getElementsByClassName('oewGkc LeUQr MUxGbd v0nnCb')[1].scrollIntoView();");
//	ji.executeScript("document.getElementsByClassName('oewGkc LeUQr MUxGbd v0nnCb')[1].click();");	
//	String se=driver.getTitle();
//	System.out.println(se);
	
	List<AndroidElement> list=driver.findElements(By.tagName("a"));
	System.out.println(list.size());
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).getText());
		System.out.println(list.get(i).getAttribute("href"));

	}
	WebElement we=driver.findElement(By.xpath("//div[contains(text(),'MoolyaEd | Linkedin')]"));
	JavascriptExecutor jy = (JavascriptExecutor)driver;
	jy.executeScript("arguments[0].scrollIntoView(true)",we);
	we.click();
	System.out.println(driver.getTitle());
	
	
	
	
	
	
	
	
	
}

}
