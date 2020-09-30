package com.atmecs.phptravels.utils;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.atmecs.phptravels.constants.Constants;


public class ExcelUtils {
	public static Object[][] data;
	public  XSSFWorkbook workbook;
	public  XSSFSheet sheet;
	public  XSSFRow row;


	public Object[][] excelUtils(String sheetName) throws Exception {
		FileInputStream file = new FileInputStream(Constants.Testdata_File);
		workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();

		data = new Object[rowCount][colCount];

		for (int rowIndex = 1; rowIndex <= rowCount; rowIndex++) {
			int cellCount = sheet.getRow(rowIndex).getLastCellNum();
			System.out.println("rowCount is" + rowCount);
			for (int colIndex = 0; colIndex < cellCount; colIndex++) {
				String value = sheet.getRow(rowIndex).getCell(colIndex).getStringCellValue();
				System.out.println("colCount is" + colCount);

				data[rowIndex-1][colIndex] = value;
			}
		}
		workbook.close();
		return data;


	}

}
