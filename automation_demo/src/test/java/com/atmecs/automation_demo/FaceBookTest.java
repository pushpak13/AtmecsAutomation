package com.atmecs.automation_demo;


import org.testng.annotations.Test;
import com.atmecs.automation_demo.base.BaseClass;
import com.atmecs.automation_demo.pages.FaceBookPage;


public class FaceBookTest extends BaseClass {
	
	@Test 
	public void faceBookTest() {
		FaceBookPage faceBook = new FaceBookPage(driver);
		faceBook.faceBook();
		
	}
		
}



