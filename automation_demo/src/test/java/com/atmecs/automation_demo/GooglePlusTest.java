package com.atmecs.automation_demo;


import org.testng.annotations.Test;
import com.atmecs.automation_demo.base.BaseClass;
import com.atmecs.automation_demo.pages.GooglePlusPage;

public class GooglePlusTest extends BaseClass {
	
	@Test 
	public void googlePlusTest() {
		GooglePlusPage googlePlus = new GooglePlusPage(driver);
		googlePlus.googlePlus();
	}
	
}





