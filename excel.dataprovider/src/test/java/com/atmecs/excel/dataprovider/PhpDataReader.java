package com.atmecs.excel.dataprovider;

import org.testng.annotations.DataProvider;

import com.atmecs.phptravels.constants.Constants;
import com.atmecs.phptravels.utils.ExcelUtils;

public class PhpDataReader {
	@DataProvider (name = "ChatData")
	public static Object[][] excelDataReader() throws Exception {
		ExcelUtils read = new ExcelUtils(Constants.Testdata_File);
		Object[][] data = read.excelUtils("chatSheet");
		return data;
		
	}

}
