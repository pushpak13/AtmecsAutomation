package com.atmecs.demo_blaze;


import org.testng.annotations.Test;
import com.atmecs.demo_blaze.base.BaseClass;
import com.atmecs.demo_blaze.pages.ValidateCartPage;


public class ValidateCartTest extends BaseClass {
	

	@Test 
	public void validateCartTest() throws InterruptedException {
		ValidateCartPage validate = new ValidateCartPage(driver);
		validate.validateCart();
	}
	
	


}
