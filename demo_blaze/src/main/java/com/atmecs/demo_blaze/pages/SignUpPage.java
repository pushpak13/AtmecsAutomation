package com.atmecs.demo_blaze.pages;


import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.demo_blaze.constants.Constants;
import com.atmecs.demo_blaze.helper.*;
import com.atmecs.demo_blaze.utils.PropertyReader;


public class SignUpPage   {
	public  WebDriver driver;
	Properties locator;
	Properties data;

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}


	public void signUpDetails() throws IOException {
		locator = PropertyReader.readProperty(Constants.Locator_File);
		data = PropertyReader.readProperty(Constants.Testdata_File);
		HelperClass elementHelper = new HelperClass(driver);
		elementHelper.clickElement(locator.getProperty("SignUp"));
		elementHelper.enterValueInTextBox(locator.getProperty("SignupUsername"),data.getProperty("username"));
		elementHelper.enterValueInTextBox(locator.getProperty("SignupPassword"),data.getProperty("password"));
		elementHelper.clickOnButton(locator.getProperty("SignUpButton"));
		WebDriverWait wait = new WebDriverWait(driver,1000);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();

	}




}




