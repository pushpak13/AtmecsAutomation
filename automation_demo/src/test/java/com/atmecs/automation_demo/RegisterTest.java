package com.atmecs.automation_demo;


import org.testng.annotations.Test;
import com.atmecs.automation_demo.base.BaseClass;
import com.atmecs.automation_demo.pages.RegisterPage;

public class RegisterTest extends BaseClass{
	
	@Test   
	public void registerTest() throws InterruptedException {
		RegisterPage register = new RegisterPage(driver);
		register.registerDetails();
	}
		
}


