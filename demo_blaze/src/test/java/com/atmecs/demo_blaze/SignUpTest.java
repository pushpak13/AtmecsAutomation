package com.atmecs.demo_blaze;

import java.io.IOException;
import org.testng.annotations.Test;
import com.atmecs.demo_blaze.base.BaseClass;
import com.atmecs.demo_blaze.pages.SignUpPage;

public class SignUpTest extends BaseClass{
	
	
	@Test 
	public void signUpTest() throws IOException {
		SignUpPage signUp = new SignUpPage(driver);
		signUp.signUpDetails();
	}
}
	



		
		
		
		

