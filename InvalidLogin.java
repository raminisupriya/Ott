package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class InvalidLogin extends BaseClass {
	/*  -------------UNCOMMENT TO EXECUTE
	 
		@Test
			public void logintestcase() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		MobileElement el1 = (MobileElement) driver.findElementById("in.actcorp.actottlauncher:id/btnLogin");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementById("in.actcorp.ftiottpostcore:id/yes");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementById("in.actcorp.ftiottpostcore:id/login_account_id_button");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementById("in.actcorp.ftiottpostcore:id/account_id");
		el4.sendKeys("");
		System.out.print("sending empty chars in account id field");
		MobileElement el5 = (MobileElement) driver.findElementById("in.actcorp.ftiottpostcore:id/account_password");
		el5.sendKeys("");
		System.out.print("sending empty chars in password field");
		MobileElement el6 = (MobileElement) driver.findElementById("in.actcorp.ftiottpostcore:id/togglecheckbox");
		el6.click();
		MobileElement el7 = (MobileElement) driver.findElementById("in.actcorp.ftiottpostcore:id/accountid_login_next_button");
		el7.click(); 
		
		 -----------UNCOMMENT TO EXECUTE */
		/*TounchAction actions =(new TouchAction(driver)).tap(1198, 511).perform();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert =driver.switchTo().alert();
		
		String s=alert.getText();
		String xml1 = driver.getPageSource();
		System.out.print(xml1);

}*/
}
