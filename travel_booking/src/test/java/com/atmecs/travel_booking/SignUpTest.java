package com.atmecs.travel_booking;


import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import org.testng.annotations.Test;
import com.atmecs.travel_booking.base.BaseClass;
import com.atmecs.travel_booking.constants.Constants;
import com.atmecs.travel_booking.helper.HelperClass;
import com.atmecs.travel_booking.utils.PropertyReader;

public class SignUpTest extends BaseClass{
	Properties locator;

	
	@Test(dataProvider = "Data", dataProviderClass = SignUpDataReader.class)
	public void signUpTest(String FBEmailID, String FBPassword) throws InterruptedException {
		locator = PropertyReader.readProperty(Constants.Locator_File);
		HelperClass elementHelper = new HelperClass(driver);
		elementHelper.locateByID(locator.getProperty("Signup"));
		Thread.sleep(3000);
		driver.switchTo().frame("authiframe");
		elementHelper.locateBySelector(locator.getProperty("FBSignInButton"));
		Thread.sleep(2000);
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

			String child_window=I1.next();


			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				elementHelper.sendKeys(locator.getProperty("FBEmailBox"),FBEmailID);
				elementHelper.sendKeys(locator.getProperty("FBPassword"),FBPassword);
				elementHelper.locateByXpath(locator.getProperty("LoginButton"));
				Thread.sleep(3000);
			}
		}

	}
	}
		



