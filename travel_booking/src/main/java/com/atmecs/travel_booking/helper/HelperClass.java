package com.atmecs.travel_booking.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HelperClass {
	public WebDriver driver;
	
	
	public HelperClass(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void locateByID(String id)
	{
		driver.findElement(By.id(id)).click();
	}
	public void locateBySelector(String cssSelector)
	{
		driver.findElement(By.cssSelector(cssSelector)).click();
	}
	public void sendKeys(String id,String value)
	{
		WebElement ele = driver.findElement(By.id(id));
		ele.click();
		ele.sendKeys(value);
	}
	public void locateByXpath(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	public void travelFrom(String id,String value) throws InterruptedException
	{
		WebElement ele = driver.findElement(By.id(id));
		ele.click();
		ele.sendKeys(value);
		Thread.sleep(2000);
		ele.sendKeys(Keys.ARROW_DOWN);
		ele.sendKeys(Keys.ENTER);
		
	}
	public void travelDestination(String id,String value) throws InterruptedException
	{
		WebElement ele = driver.findElement(By.id(id));
		ele.click();
		ele.sendKeys(value);
		Thread.sleep(2000);
		ele.sendKeys(Keys.ARROW_DOWN);
		ele.sendKeys(Keys.ENTER);
	}

	
		
	}

	
		
	


