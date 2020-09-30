package com.atmecs.travel_booking;


import org.testng.annotations.Test;
import com.atmecs.travel_booking.base.BaseClass;
import com.atmecs.travel_booking.pages.SignUpPage;

public class SignUpTest extends BaseClass{
	
	@Test 
	public void signUpTest() throws InterruptedException {
		SignUpPage signUp = new SignUpPage(driver);
		signUp.signUpDetails();
	}
}


