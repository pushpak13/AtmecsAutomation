package com.atmecs.automation_demo;

import org.testng.annotations.Test;
import com.atmecs.automation_demo.base.BaseClass;
import com.atmecs.automation_demo.pages.TwitterPage;

public class TwitterTest extends BaseClass {
	

	@Test 
	public void twitterTest() {
		TwitterPage twitter = new TwitterPage(driver);
		twitter.twitter();
	}
		
	
}



