package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class Logout extends BaseClass {
	
	@Test
	public void logoutestcase() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("ACT Account");
	el5.click();
	MobileElement el6 = (MobileElement) driver.findElementById("in.actcorp.actottlauncher:id/user_support_icon");
	el6.click();
	MobileElement el7 = (MobileElement) driver.findElementByXPath("//androidx.recyclerview.widget.RecyclerView[@content-desc=\"MY ACCOUNT\"]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView");
	el7.click();
	MobileElement el8 = (MobileElement) driver.findElementById("in.actcorp.actottlauncher:id/logout");
	el8.click();
	//--Logout negative test case Clicking on cancel button 
	
	MobileElement e20 = (MobileElement) driver.findElementById("in.actcorp.actottlauncher:id/btn_cancel");
	e20.click();

	 MobileElement accdetailstext = (MobileElement) driver.findElementById("in.actcorp.actottlauncher:id/pageTitleTextView");
	
	 String comparetext =accdetailstext.getText();
	 if(comparetext.equalsIgnoreCase("Account Details"))
	 {
		 System.out.println("Negative scenario of Logout is PASSED");
	 }
	
	 else
	 {
		 System.out.println("Negative scenario of Logout is FAILED");
	 }
	 
	 
	
	//----logout Positive case---
	//MobileElement el9 = (MobileElement) driver.findElementById("in.actcorp.actottlauncher:id/btn_confirm");
	//el9.click();


}
}