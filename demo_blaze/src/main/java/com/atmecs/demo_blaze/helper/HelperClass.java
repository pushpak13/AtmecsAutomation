package com.atmecs.demo_blaze.helper;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HelperClass {
	public  WebDriver driver;
	
	public HelperClass(WebDriver driver) {
		
		this.driver = driver;
	}
	public  void clickElement(String value)
	{
		driver.findElement(By.linkText(value)).click();
		System.out.println(value);
	}
	public  void enterValueInTextBox (String cssSelector,String value)
	{
		driver.findElement(By.cssSelector(cssSelector)).sendKeys(value);
	}
	public  void clickOnButton (String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
		
	}
	
}
