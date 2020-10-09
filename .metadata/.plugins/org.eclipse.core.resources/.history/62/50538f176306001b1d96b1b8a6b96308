package com.atmecs.travel_booking.pages;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.atmecs.travel_booking.constants.Constants;
import com.atmecs.travel_booking.helper.HelperClass;
import com.atmecs.travel_booking.utils.PropertyReader;

public class SignUpPage {
	public  WebDriver driver;
	Properties locator;
	Properties data;

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@Test 
	public void signUpDetails() throws InterruptedException {
		locator = PropertyReader.readProperty(Constants.Locator_File);
		data = PropertyReader.readProperty(Constants.Testdata_File);
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
				elementHelper.sendKeys(locator.getProperty("FBEmailBox"),data.getProperty("FBEmail"));
				elementHelper.sendKeys(locator.getProperty("FBPassword"),data.getProperty("Password"));
				elementHelper.locateByXpath(locator.getProperty("LoginButton"));
				Thread.sleep(3000);
			}
		}

	}
	
}


