package com.atmecs.demo_blaze.pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.atmecs.demo_blaze.base.BaseClass;
import com.atmecs.demo_blaze.constants.Constants;
import com.atmecs.demo_blaze.helper.HelperClass;
import com.atmecs.demo_blaze.utils.PropertyReader;


public class LogInPage extends BaseClass {
	
	public  WebDriver driver;
	Properties locator;
	Properties data;

	public LogInPage(WebDriver driver) {
		this.driver = driver;
	}
	

	@Test 
	public void logInDetails() throws InterruptedException {
		locator = PropertyReader.readProperty(Constants.Locator_File);
		data = PropertyReader.readProperty(Constants.Testdata_File);
		HelperClass elementHelper = new HelperClass(driver);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		elementHelper.clickElement(locator.getProperty("LogIn"));
		elementHelper.enterValueInTextBox(locator.getProperty("LoginUsername"),data.getProperty("username"));
		elementHelper.enterValueInTextBox(locator.getProperty("LoginPassword"),data.getProperty("password"));
		elementHelper.clickOnButton(locator.getProperty("LogInButton"));
		
	}
	
	

}
