package tests;

import java.util.List;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class ReadNotification extends BaseClass{
	@Test
	public void readnotificationtestcase() throws Exception {
		int counter =0;
		MobileElement customerNotificationicon = (MobileElement) driver.findElementByAccessibilityId("CustomerNotification");
		customerNotificationicon.click();
		
		//enhanced script today 
		

		List<MobileElement> listnewbuttonnotify = (List<MobileElement>) driver.findElementsById("in.actcorp.actottlauncher:id/cms_new");
		int newbuttoncountnoti=listnewbuttonnotify.size();
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
			atvADBCommand("KEYCODE_BACK");
			
			String v_notifi_string_after_click=customerNotificationicon.getText();
			int v_notifi_string_after_click_count= Integer.parseInt(v_notifi_string_after_click);
			if (v_notifi_string_after_click_count==v_notificationintcount-1)
			{
				System.out.println("Read Notification test case PASSED");
			}
			else {
				System.out.println("Read Notification test case FAILED");
			}
		
			
		
		
		
	//enhanced script today 	
		
		
		do {
			MobileElement readnoti=(MobileElement)	driver.findElementById("in.actcorp.actottlauncher:id/cms_new");
			String text=readnoti.getText();
			System.out.println("text received is"+text);
			if (text.contains("New"))
			{
				readnoti.click();
				counter++;
			}
			else {
				try {
					atvADBCommand("KEYCODE_DPAD_DOWN");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}while(counter==0);
		
		atvADBCommand("KEYCODE_BACK");
		System.out.println("backed successfully");
		
	}

}
