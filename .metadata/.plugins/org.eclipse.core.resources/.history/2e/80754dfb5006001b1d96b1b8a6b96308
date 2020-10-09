package com.atmecs.excel.dataprovider;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.atmecs.phptravels.base.BaseClass;
import com.atmecs.phptravels.constants.Constants;
import com.atmecs.phptravels.helper.HelperClass;
import com.atmecs.phptravels.utils.PropertyReader;


public class ChatExcelTest extends BaseClass {
	Properties locator;

	@Test(dataProvider = "ChatData", dataProviderClass = ExcelDataReader.class)
	public void chatData(String Name,String WatsappNo,String Email) throws InterruptedException {
		locator = PropertyReader.readProperty(Constants.Locator_File);
		HelperClass elementHelper = new HelperClass(driver);
		Thread.sleep(2000);
		driver.switchTo().frame("chat-widget");
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator.getProperty("ChatIcon"))));
		Thread.sleep(5000);
		elementHelper.chatIcon(locator.getProperty("ChatIcon"));
		Thread.sleep(3000);
		elementHelper.sendKeys(locator.getProperty("NameID"),Name);
		Thread.sleep(2000);
		elementHelper.watsappSendKey(locator.getProperty("Watsapp"),WatsappNo);
		Thread.sleep(2000);
		elementHelper.sendKeys(locator.getProperty("EmailBox"),Email);
		elementHelper.dropDown(locator.getProperty("ClientDropDown"),locator.getProperty("DropdownValue"));
		Thread.sleep(2000);
		elementHelper.clickStartChatButton(locator.getProperty("StartChat"));
		Thread.sleep(3000);
	}

}






