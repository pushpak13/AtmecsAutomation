package com.atmecs.phptravels.utils;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUtils {
	String filePath;
	public static Object[][] data;
	public  XSSFWorkbook workbook;
	public  XSSFSheet sheet;
	public  XSSFRow row;
	
	public ExcelUtils(String filePath) {
		this.filePath = filePath;
	}


	public Object[][] excelUtils(String sheetName) throws Exception {
		FileInputStream file = new FileInputStream(this.filePath);
		workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		System.out.println("rowCount=" + rowCount);
		int colCount = sheet.getRow(0).getLastCellNum();
		System.out.println("colCount=" + colCount);

		data = new Object[rowCount][colCount];

		for (int rowIndex = 1; rowIndex <= rowCount; rowIndex++) {
			int cellCount = sheet.getRow(rowIndex).getLastCellNum();
			for (int colIndex = 0; colIndex < cellCount; colIndex++) {
				String value = sheet.getRow(rowIndex).getCell(colIndex).getStringCellValue();
				data[rowIndex-1][colIndex] = value;
			}
		}
		workbook.close();
		return data;


	}

}
