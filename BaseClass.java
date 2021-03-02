package tests;


import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseClass {
	static String udid = "192.168.1.206:5555";
	AppiumDriver <MobileElement> driver;
	@BeforeTest
	public void setup() {
	try {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability("deviceName","ACT4K1007");
	        capabilities.setCapability("platformVersion", "9");
	        capabilities.setCapability("udid","192.168.1.206:5555");
	        capabilities.setCapability("platformName", "Android");
	        // Check in google for App capablity synatx and remove hard code,Chek for new command time out also 
	        //capablities.setCapablity("APP",)
	        capabilities.setCapability("appPackage", "in.actcorp.actottlauncher");
	        capabilities.setCapability("appActivity", "in.actcorp.actottlauncher.activities.home.HomeActivity");
	        /*Nikhil FTI Post core apk details
	        capabilities.setCapability("appPackage", "in.actcorp.ftiottpostcore");
	        capabilities.setCapability("appActivity", "in.actcorp.ftiottpostcore/.activities.MainActivity");*/
	        
	        URL url =new URL ("http://127.0.0.1:4723/wd/hub");
	        driver =new AppiumDriver<MobileElement>( url,capabilities);
	        System.out.println("Application launcher");	
	        }catch(Exception exp) {
		System.out.println("cause is"+exp.getCause());
		System.out.println("Message is"+exp.getMessage());
		exp.getStackTrace();
		
		
	}
	}
	@Test
	/*public void test() {
		System.out.println("Launched");
	}*/
	
	@AfterTest
public void teardown() {
	
}

// class to simulate Remote Actions

public static void atvADBCommand(String command) throws Exception
{
  Runtime.getRuntime().exec("adb -s "+ udid + " shell input keyevent "+command);
}
}