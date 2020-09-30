package com.atmecs.excel.dataprovider;

import org.testng.annotations.DataProvider;
import com.atmecs.phptravels.utils.ExcelUtils;

public class ExcelDataReader {
	@DataProvider (name = "ChatData")
	public static Object[][] excelDataReader() throws Exception {
		ExcelUtils read = new ExcelUtils();
		Object[][] data = read.excelUtils("chatSheet");
		return data;
		
	}

}
