package com.atmecs.travel_booking.pages;


import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.atmecs.travel_booking.constants.Constants;
import com.atmecs.travel_booking.helper.HelperClass;
import com.atmecs.travel_booking.utils.PropertyReader;

public class BookingPage {
	
	public  WebDriver driver;
	Properties locator;
	Properties data;

	public BookingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@Test 
	public void bookingDetails() throws InterruptedException {
		locator = PropertyReader.readProperty(Constants.Locator_File);
		data = PropertyReader.readProperty(Constants.Testdata_File);
		HelperClass elementHelper = new HelperClass(driver);
		elementHelper.travelFrom(locator.getProperty("FromID"),data.getProperty("From"));
		elementHelper.travelDestination(locator.getProperty("DestID"),data.getProperty("Destination"));
		elementHelper.locateByID(locator.getProperty("DepartureID"));
		elementHelper.locateByID(data.getProperty("DepartureDate"));
		elementHelper.locateByID(locator.getProperty("ReturnID"));
		elementHelper.locateByID(data.getProperty("ReturnDate"));
		Thread.sleep(2000);
		elementHelper.locateByID(locator.getProperty("TravelDetail"));
		Thread.sleep(2000);
		for(int i=0;i<3;i++)
		{
			elementHelper.locateByID(locator.getProperty("Passengers"));
		}
		Thread.sleep(2000);
		elementHelper.locateByID(locator.getProperty("SearchButton"));
		Thread.sleep(9000);
		driver.close();
	}
	


}
