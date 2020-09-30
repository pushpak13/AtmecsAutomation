package com.atmecs.automation_demo;


import org.testng.annotations.Test;
import com.atmecs.automation_demo.base.BaseClass;
import com.atmecs.automation_demo.pages.YouTubePage;

public class YouTubeTest extends BaseClass {
	
	@Test 
	public void youTube() {
		YouTubePage youTube = new YouTubePage(driver);
		youTube.youTube();
	}
}



