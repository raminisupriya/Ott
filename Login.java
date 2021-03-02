package tests;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

//Uncomment for login logout pass case execUtion
public class Login extends BaseClass {
	@Test
		public void logintestcase() throws Exception {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	MobileElement el1 = (MobileElement) driver.findElementById("in.actcorp.actottlauncher:id/btnLogin");
	el1.click();
	MobileElement el2 = (MobileElement) driver.findElementById("in.actcorp.ftiottpostcore:id/yes");
	el2.click();
	MobileElement el3 = (MobileElement) driver.findElementById("in.actcorp.ftiottpostcore:id/login_account_id_button");
	el3.click();
	MobileElement el4 = (MobileElement) driver.findElementById("in.actcorp.ftiottpostcore:id/account_id");
	el4.sendKeys("102018149454");
	MobileElement el5 = (MobileElement) driver.findElementById("in.actcorp.ftiottpostcore:id/account_password");
	el5.sendKeys("act@12345");
	MobileElement el6 = (MobileElement) driver.findElementById("in.actcorp.ftiottpostcore:id/togglecheckbox");
	el6.click();
	MobileElement el7 = (MobileElement) driver.findElementById("in.actcorp.ftiottpostcore:id/accountid_login_next_button");
	el7.click();
	//Fti Screen button when swipe is not required
	MobileElement e24 = (MobileElement) driver.findElementById("in.actcorp.ftiottpostcore:id/cancel");
  	e24.click();
	
//Uncomment for login logout pass case execcution 
	
	/*Nikhil code to swipe down FTI screen -- Don no uncomment untill swipw action required in FTI screen 
	
	MobileElement e23 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button[2]");
	e23.click();

	MobileElement e24 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button");
	e24.click();
	WebDriverWait wait2 = new WebDriverWait(driver,200);
wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView")));

//Nikhil code to swipe down FTI screen -- Don no uncomment untill swipw action required in FTI screen */

	//proceed button in  sound check screen

//Uncomment for login logout pass case execcution

	MobileElement e23 = (MobileElement) driver.findElementById("in.actcorp.ftiottpostcore:id/sign");
	e23.click();
	//Notification Count Test Case
	Thread.sleep(2000);	
	MobileElement customerNotificationicon = (MobileElement) driver.findElementByAccessibilityId("CustomerNotification");
	customerNotificationicon.click();
	String v_notificationstring=customerNotificationicon.getText();
	int v_notificationintcount= Integer.parseInt(v_notificationstring);
	customerNotificationicon.click();
	System.out.println("Notifications count on the box is '"+ v_notificationintcount+"'");
	if(v_notificationintcount==0) {
		MobileElement dialogeboxtext = (MobileElement) driver.findElementById("in.actcorp.actottlauncher:id/dialogDetailView");
		String v_dialogeboxtext_string=dialogeboxtext.getText();
		System.out.println("Dialogue box text is '" + v_dialogeboxtext_string +"'");
		
		if(v_dialogeboxtext_string.contains("No notification to show"))
		{
			System.out.println(" Notification dialogue text is matching and Number of Notifications on box are " +v_notificationintcount);
			MobileElement notiscreenOKbutton = (MobileElement) driver.findElementById("in.actcorp.actottlauncher:id/btnOk");
			notiscreenOKbutton.click();
		
		}else {
			System.out.println(" Notification dialogue text is Not matching and Number of Notifications on box are " +v_notificationintcount);

		}
		
	}
	else {
		System.out.println("Notification count is greater than zero");
		List<MobileElement> listnewbuttonnotify = (List<MobileElement>) driver.findElementsById("in.actcorp.actottlauncher:id/cms_new");
		int newbuttoncountnoti=listnewbuttonnotify.size();
		System.out.println("Number of Notifications on page are" +newbuttoncountnoti);
		/*------uncomment below line and enhance the code for scroll fumctionality in notifications    
		atvADBCommand("KEYCODE_BACK");
	System.out.println("pressed back successfully ");  
	-----------------uncomment below line and enhance the code for scroll fumctionality in notifications*/
		
		//-----------------------Read notification code start
		while(newbuttoncountnoti==0) 
		{
			atvADBCommand("KEYCODE_DPAD_DOWN");
			atvADBCommand("KEYCODE_DPAD_DOWN");
			atvADBCommand("KEYCODE_DPAD_DOWN");
			atvADBCommand("KEYCODE_DPAD_DOWN");
			atvADBCommand("KEYCODE_DPAD_DOWN");
			atvADBCommand("KEYCODE_DPAD_DOWN");
			atvADBCommand("KEYCODE_DPAD_DOWN");
			atvADBCommand("KEYCODE_DPAD_DOWN");
			System.out.println("keypad pressed down 8 times");
			List<MobileElement> listnewbuttonnotify1 = (List<MobileElement>) driver.findElementsById("in.actcorp.actottlauncher:id/cms_new");
			newbuttoncountnoti=listnewbuttonnotify1.size();
		
		 }
		
	MobileElement readnoti=(MobileElement)	driver.findElementById("in.actcorp.actottlauncher:id/cms_new");
	readnoti.click();
	System.out.println("Clicked on NEW Button successfully");
			atvADBCommand("KEYCODE_BACK");
			Thread.sleep(2000);	
			String v_notifi_string_after_click=customerNotificationicon.getText();
			int v_notifi_string_after_click_count= Integer.parseInt(v_notifi_string_after_click);
			if (v_notifi_string_after_click_count==v_notificationintcount-1)
			{
				System.out.println("Read Notification test case PASSED");
			}
			else {
				System.out.println("Read Notification test case FAILED");
			}
		
	
		
		
		//----------------Read Notification code end 
		
	}
		
	
	//Logout 
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("ACT Account");
	el8.click();
    el8.click();
	
	MobileElement el9 = (MobileElement) driver.findElementById("in.actcorp.actottlauncher:id/user_support_icon");
	el9.click();
	MobileElement e20 = (MobileElement) driver.findElementByXPath("//androidx.recyclerview.widget.RecyclerView[@content-desc=\"MY ACCOUNT\"]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView");
	e20.click();
	MobileElement e21 = (MobileElement) driver.findElementById("in.actcorp.actottlauncher:id/logout");
	e21.click();

	
	//--Logout negative test case Clicking on cancel button 
	MobileElement e22 = (MobileElement) driver.findElementById("in.actcorp.actottlauncher:id/btn_cancel");
	e22.click();

	 MobileElement accdetailstext = (MobileElement) driver.findElementById("in.actcorp.actottlauncher:id/pageTitleTextView");
	
	 String comparetext =accdetailstext.getText();
	 if(comparetext.equalsIgnoreCase("Account Details"))
	 {
		 System.out.println("Negative scenario (CANCEL Button) of Logout is PASSED");
	 }
	
	 else
	 {
		 System.out.println("Negative scenario (CANCEL Button) of Logout is FAILED");
	 }
	 
	 
	 //Reset Functionality
	 
	 MobileElement resetbutton = (MobileElement) driver.findElementById("in.actcorp.actottlauncher:id/reset_data");
		resetbutton.click();
		MobileElement lastresttext = (MobileElement) driver.findElementById("in.actcorp.actottlauncher:id/last_reset_text");
		String v_lastresettext= lastresttext.getText();
		if (v_lastresettext.equalsIgnoreCase("Last Reset :"))
		{
			System.out.println("String validated is '" +v_lastresettext+"'");
		//Validating the date field	
		MobileElement lastrebootdate = (MobileElement) driver.findElementById("in.actcorp.actottlauncher:id/last_reboot_date");
		String v_lastrebootdate =lastrebootdate.getText();
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
		   LocalDateTime now = LocalDateTime.now();  
		   //System.out.println(dtf.format(now));--- to read the system date in specified format
		   if (dtf.format(now).equals(v_lastrebootdate)) {
			   System.out.println("Date validated is " + v_lastrebootdate);
			   System.out.println("Reset functionality is passed");
			   
		   }
		   else {   
			   System.out.println("Reset functionality failed with incorrect date");  
		   }
		   }
		else {
			System.out.println("Reset functionality failed ");
		}
		

	 
	 //--Logout Positive test case Clicking on Confirm  button 
	
	 e21.click();    //---To Click on Logout Button 
	MobileElement e25 = (MobileElement) driver.findElementById("in.actcorp.actottlauncher:id/btn_confirm");
	e25.click();
	
	MobileElement welcometext = (MobileElement) driver.findElementById("in.actcorp.ftiottpostcore:id/welcome_title");
	
	String welcomecheck  =welcometext.getText();
	 if(welcomecheck.contains("Welcome"))
	 {
		 System.out.println("Postive scenario (CONFIRM Button) of Logout is PASSED");
	 }
	
	 else
	 {
		 System.out.println("Postive scenario  (CONFIRM Button) of Logout is FAILED");
	 }

	

}
}

//Uncomment for login logout pass case execcution 
