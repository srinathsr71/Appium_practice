package Web_app;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
public class orangeHRM {
	
	
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void befortest() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "H://Downloads//chromedriver.exe");
		
		driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		
		
		
	}
	@Test
	public void test1() throws InterruptedException
	{
		
		
	
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("orangeHRM",Keys.ENTER);
		WebElement text=driver.findElement(By.xpath("//*[@href='https://opensource-demo.orangehrmlive.com/']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",text);
		text.click();
		System.out.println(driver.getTitle());
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--focus']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--active']")).sendKeys("admin123");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@class='oxd-topbar-header']/div/i")).click();	
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		driver.quit();
	}
	
	
}