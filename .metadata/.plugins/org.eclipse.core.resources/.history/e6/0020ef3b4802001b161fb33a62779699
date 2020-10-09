package com.atmecs.php_travels.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.php_travels.constants.Constants;
import com.atmecs.php_travels.helpers.HelperClass;
import com.atmecs.php_travels.utils.PropertyReader;


public class ChatWidgetPage {
	public  WebDriver driver;
	Properties locator;
	Properties data;

	public ChatWidgetPage(WebDriver driver) {
		this.driver = driver;
	}

	
	public void chatDetails() throws InterruptedException {
		locator = PropertyReader.readProperty(Constants.Locator_File);
		data = PropertyReader.readProperty(Constants.Testdata_File);
		HelperClass elementHelper = new HelperClass(driver);
		driver.switchTo().frame("chat-widget");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator.getProperty("ChatIcon"))));
		Thread.sleep(3000);
		elementHelper.chatIcon(locator.getProperty("ChatIcon"));
		Thread.sleep(3000);
		elementHelper.sendKeys(locator.getProperty("NameID"),data.getProperty("Name"));
		Thread.sleep(2000);
		elementHelper.watsappSendKey(locator.getProperty("Whatsapp"),data.getProperty("WhatsappNo"));
		Thread.sleep(2000);
		elementHelper.sendKeys(locator.getProperty("EmailBox"),data.getProperty("Email"));
		elementHelper.dropDown(locator.getProperty("ClientDropDown"),locator.getProperty("DropdownValue"));
		Thread.sleep(2000);
		elementHelper.clickStartChatButton(locator.getProperty("StartChat"));
		Thread.sleep(3000);
	}



}
