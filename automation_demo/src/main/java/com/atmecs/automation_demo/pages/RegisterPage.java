package com.atmecs.automation_demo.pages;


import java.util.Properties;
import org.openqa.selenium.WebDriver;
import com.atmecs.automation_demo.constants.Constants;
import com.atmecs.automation_demo.helper.HelperClass;
import com.atmecs.automation_demo.utils.PropertyReader;

public class RegisterPage {
	public  WebDriver driver;
	Properties locator;
	Properties data;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
   
	public void registerDetails() throws InterruptedException {
		locator = PropertyReader.readProperty(Constants.Locator_File);
		data = PropertyReader.readProperty(Constants.Testdata_File);
		HelperClass elementHelper = new HelperClass(driver);
		elementHelper.enterTextBox(locator.getProperty("FirstName"),data.getProperty("firstname"));
		elementHelper.enterTextBox(locator.getProperty("LastName"),data.getProperty("lastname"));
		elementHelper.enterTextBox(locator.getProperty("AddressBox"),data.getProperty("Address"));
		elementHelper.enterTextBox(locator.getProperty("EmailAddress"),data.getProperty("Email"));
		elementHelper.enterTextBox(locator.getProperty("Phone"),data.getProperty("PhoneNo"));
		elementHelper.clickRadioButton(locator.getProperty("Gender"));
		elementHelper.checkBox(locator.getProperty("Hobby1"));
		elementHelper.checkBox(locator.getProperty("Hobby2"));
		Thread.sleep(2000);
		elementHelper.selectLanguageFromDropDown(locator.getProperty("LangID"));
		elementHelper.selectLanguageFromDropDown(locator.getProperty("Language"));
		Thread.sleep(2000);
		elementHelper.selectFromDropDown(locator.getProperty("Skill"),data.getProperty("SkillName"));
		Thread.sleep(2000);
		elementHelper.selectFromDropDown(locator.getProperty("Country"),data.getProperty("CountryName"));
		Thread.sleep(2000);
		elementHelper.selectCountry(locator.getProperty("SelectCountry"));
		Thread.sleep(2000);
		elementHelper.selectYear(locator.getProperty("Year"));
		Thread.sleep(2000);
		elementHelper.selectMonth(locator.getProperty("Month"));
		Thread.sleep(2000);
		elementHelper.selectDate(locator.getProperty("Day"));
		Thread.sleep(2000);
		elementHelper.enterValue(locator.getProperty("Pass"),data.getProperty("Passwd"));
		elementHelper.enterValue(locator.getProperty("ConPass"),data.getProperty("ConPasswd"));
		Thread.sleep(2000);
		elementHelper.clickButton(locator.getProperty("SubmitBtn"));
		Thread.sleep(9000);

	}

}


