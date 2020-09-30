package com.atmecs.demo_blaze;


import org.testng.annotations.Test;
import com.atmecs.demo_blaze.base.BaseClass;
import com.atmecs.demo_blaze.pages.LogInPage;


public class LogInTest extends BaseClass {
	

	@Test 
	public void logInTest() throws  InterruptedException {
		LogInPage logIn = new LogInPage(driver);
		logIn.logInDetails();
	}
		
	
	

}
