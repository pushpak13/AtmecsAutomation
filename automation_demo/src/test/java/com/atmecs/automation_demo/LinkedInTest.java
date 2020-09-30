package com.atmecs.automation_demo;


import org.testng.annotations.Test;
import com.atmecs.automation_demo.base.BaseClass;
import com.atmecs.automation_demo.pages.LinkedInPage;

public class LinkedInTest extends BaseClass {
	
	@Test
	public void linkedInTest() {
		LinkedInPage linkedIn = new LinkedInPage(driver);
		linkedIn.linkedIn();
	}
}




