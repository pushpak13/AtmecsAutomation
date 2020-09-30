package com.atmecs.demo_blaze;


import org.testng.annotations.Test;
import com.atmecs.demo_blaze.base.BaseClass;
import com.atmecs.demo_blaze.pages.AddToCartPage;


public class AddToCartTest extends BaseClass{
	
	@Test 
	public void addToCartTest() throws InterruptedException {
		AddToCartPage add = new AddToCartPage(driver);
		add.addToCart();
	}
	

}
