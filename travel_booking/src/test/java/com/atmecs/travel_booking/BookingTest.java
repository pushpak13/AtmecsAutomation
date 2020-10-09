package com.atmecs.travel_booking;


import java.util.Properties;
import org.testng.annotations.Test;
import com.atmecs.travel_booking.base.BaseClass;
import com.atmecs.travel_booking.constants.Constants;
import com.atmecs.travel_booking.helper.HelperClass;
import com.atmecs.travel_booking.utils.PropertyReader;

public class BookingTest extends BaseClass {
	Properties locator;
	
	@Test(dataProvider = "Data", dataProviderClass = BookingDataReader.class )
	public void bookingTest(String TravelFrom, String TravelDestination, String DepartureDate, String ReturnDate) throws InterruptedException {
		locator = PropertyReader.readProperty(Constants.Locator_File);
		HelperClass elementHelper = new HelperClass(driver);
		elementHelper.travelFrom(locator.getProperty("FromID"),TravelFrom);
		elementHelper.travelDestination(locator.getProperty("DestID"),TravelDestination);
		elementHelper.locateByID(locator.getProperty("DepartureID"));
		elementHelper.locateByID(DepartureDate);
		elementHelper.locateByID(locator.getProperty("ReturnID"));
		elementHelper.locateByID(ReturnDate);
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
		
	}
	


}
