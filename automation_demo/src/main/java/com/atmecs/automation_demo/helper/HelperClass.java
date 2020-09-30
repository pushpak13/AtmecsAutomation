package com.atmecs.automation_demo.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HelperClass {
	
	public WebDriver driver;
	
	
	public HelperClass(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterTextBox (String xpath,String value)
	{
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
	public void clickRadioButton (String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	public void checkBox(String id)
	{
		driver.findElement(By.id(id)).click();
		
	}
	
	public void selectLanguageFromDropDown (String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void selectFromDropDown (String id,String value)
	{
		Select sel = new Select(driver.findElement(By.id(id)));
		sel.selectByValue(value);
	}
	 public void selectCountry (String xpath)
	 {
		 WebElement ele = driver.findElement(By.xpath(xpath));
		 ele.click();
		 for(int i=0;i<5;i++)
		 {
		 ele.sendKeys(Keys.ARROW_DOWN);
		 }
		 ele.sendKeys(Keys.ENTER);
	 }
	 
	 public void selectYear (String id)
	 {
		 WebElement ele = driver.findElement(By.id(id));
		 ele.click();
		 for(int i=0;i<30;i++)
		 {
		 ele.sendKeys(Keys.ARROW_DOWN);
		 }
		 ele.sendKeys(Keys.ENTER);
	 }
	 
	 public void selectMonth (String xpath)
	 {
		 WebElement ele = driver.findElement(By.xpath(xpath));
		 ele.click();
		 for(int i=0;i<3;i++)
		 {
		 ele.sendKeys(Keys.ARROW_DOWN);
		 }
		 ele.sendKeys(Keys.ENTER);
	 }
	 
	 public void selectDate (String id)
	 {
		 WebElement ele = driver.findElement(By.id(id));
		 ele.click();
		 for(int i=0;i<20;i++)
		 {
		 ele.sendKeys(Keys.ARROW_DOWN);
		 }
		 ele.sendKeys(Keys.ENTER);
		 
	 }
	 
	 public void enterValue (String id,String value)
	 {
		 driver.findElement(By.id(id)).sendKeys(value);
	 }
	 
	 public void clickButton (String xpath)
	 {
		 driver.findElement(By.xpath(xpath)).click();
	 }
	 
	 public void clickIcon (String xpath)
	 {
		 driver.findElement(By.xpath(xpath)).click();
	 }
	 
	 
}



