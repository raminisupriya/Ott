package tests;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class ActNotification extends BaseClass{
	String pre_res_id="abc";
	String cur_res_id;
	@Test
	public void notificationCount() throws Exception {
		Thread.sleep(300);
		MobileElement customerNotificationicon = (MobileElement) driver.findElementByAccessibilityId("CustomerNotification");
		customerNotificationicon.click();
		String v_notificationstring=customerNotificationicon.getText();
		int v_notificationintcount= Integer.parseInt(v_notificationstring);
		customerNotificationicon.click();
		System.out.println("Notifications count on the box is "+ v_notificationintcount);
		if(v_notificationintcount==0) {
			MobileElement dialogeboxtext = (MobileElement) driver.findElementById("in.actcorp.actottlauncher:id/dialogDetailView");
			String v_dialogeboxtext_string=dialogeboxtext.getText();
			if(v_dialogeboxtext_string.contains("No notification to show")) {
				System.out.println(" Notification dialogue text is matching and Number of Notifications on box are " +v_notificationintcount);
			
			}else {
				System.out.println(" Notification dialogue text is not matching and Number of Notifications on box are " +v_notificationintcount);
				MobileElement notiscreenOKbutton = (MobileElement) driver.findElementById("in.actcorp.actottlauncher:id/btnOk");
				notiscreenOKbutton.click();
			
	
			}
			
		}
		else {
			
			
			MobileElement e1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
		
		 String e2 =e1.getAttribute("elementId");
		 System.out.println(" elemnt id value is "+e2);
		
		}
		
		
	}

}
