package com.atmecs.phptravels.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HelperClass {
	public WebDriver driver;
	
	
	public HelperClass(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void chatIcon(String xpath)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement button = driver.findElement(By.xpath(xpath));
		js.executeScript("arguments[0].click();",button);
	}
	
	public void sendKeys(String id,String value)
	{
		WebElement ele = driver.findElement(By.id(id));
		ele.click();
		ele.sendKeys(value);
	}
	public void watsappSendKey(String xpath,String value)
	{
		WebElement ele = driver.findElement(By.xpath(xpath));
		ele.click();
		ele.sendKeys(value);
		
	}
	public void dropDown(String xpath,String value)
	{
		Select sel = new Select(driver.findElement(By.xpath(xpath)));
		sel.selectByValue(value);
	}
	public void clickStartChatButton (String xpath) 
	
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement button = driver.findElement(By.xpath(xpath));
		js.executeScript("arguments[0].click();",button);
	}

}
