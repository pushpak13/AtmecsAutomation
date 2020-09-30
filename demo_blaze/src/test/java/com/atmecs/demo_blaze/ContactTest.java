package com.atmecs.demo_blaze;


import org.testng.annotations.Test;
import com.atmecs.demo_blaze.base.BaseClass;
import com.atmecs.demo_blaze.pages.ContactPage;


public class ContactTest extends BaseClass {


	@Test 
	public void contactTest() throws InterruptedException {
		ContactPage contact = new ContactPage(driver);
		contact.contactDetails();
	}



}
