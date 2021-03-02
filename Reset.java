package tests;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class Reset extends BaseClass{
	
	@Test
	public void resettestcase() {
	MobileElement resetbutton = (MobileElement) driver.findElementById("in.actcorp.actottlauncher:id/reset_data");
	resetbutton.click();
	MobileElement lastresttext = (MobileElement) driver.findElementById("in.actcorp.actottlauncher:id/last_reset_text");
	String v_lastresettext= lastresttext.getText();
	if (v_lastresettext.equalsIgnoreCase("Last Reset :"))
	{
		System.out.println("String validated is " +v_lastresettext);
	//Validating the date field	
	MobileElement lastrebootdate = (MobileElement) driver.findElementById("in.actcorp.actottlauncher:id/last_reboot_date");
	String v_lastrebootdate =lastrebootdate.getText();
	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
	   LocalDateTime now = LocalDateTime.now();  
	   //System.out.println(dtf.format(now));
	   if (dtf.format(now).equals(v_lastrebootdate)) {
		   System.out.println("Date validated is " + v_lastrebootdate);
	   }
	   else {   
		   System.out.println("Reset functionality failed with incorrect date");  
	   }
	   }
	else {
		System.out.println("Reset functionality failed ");
	}
	
	}

}
