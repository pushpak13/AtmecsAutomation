package com.atmecs.travel_booking;

import org.testng.annotations.DataProvider;
import com.atmecs.travel_booking.constants.Constants;
import com.atmecs.travel_booking.utils.ExcelUtils;



public class BookingDataReader {
	@DataProvider (name = "Data")
	public static Object[][] excelDataReader() throws Exception {
		ExcelUtils read = new ExcelUtils(Constants.Booking_Excel_File);
		Object[][] data = read.excelUtils("BookingSheet");
		return data;
		
	}

}
