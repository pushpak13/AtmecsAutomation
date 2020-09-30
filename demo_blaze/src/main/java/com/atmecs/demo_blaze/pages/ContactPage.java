package com.atmecs.demo_blaze.pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.atmecs.demo_blaze.base.BaseClass;
import com.atmecs.demo_blaze.constants.Constants;
import com.atmecs.demo_blaze.helper.HelperClass;
import com.atmecs.demo_blaze.utils.PropertyReader;


public class ContactPage extends BaseClass {
	
	public  WebDriver driver;
	Properties locator;
	Properties data;

	public ContactPage(WebDriver driver) {
		this.driver = driver;
	}


	@Test 
	public void contactDetails() {
		locator = PropertyReader.readProperty(Constants.Locator_File);
		data = PropertyReader.readProperty(Constants.Testdata_File);
		HelperClass elementHelper = new HelperClass(driver);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		elementHelper.clickElement(locator.getProperty("Contact"));
		elementHelper.enterValueInTextBox(locator.getProperty("RecipentMail"),data.getProperty("Mail"));
		elementHelper.enterValueInTextBox(locator.getProperty("RecipentName"),data.getProperty("Name"));
		elementHelper.enterValueInTextBox(locator.getProperty("MessageTextBox"),data.getProperty("Message"));
		elementHelper.clickOnButton(locator.getProperty("SendMessageButton"));
		WebDriverWait wait = new WebDriverWait(driver,2000);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}



}
