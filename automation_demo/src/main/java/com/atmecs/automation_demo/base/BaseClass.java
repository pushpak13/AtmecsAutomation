package com.atmecs.automation_demo.base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.atmecs.automation_demo.constants.Constants;



public class BaseClass {
	
public  WebDriver driver;
	

	@BeforeMethod
	public void setUp() throws InterruptedException {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver",Constants.Driver_Path);
		driver = new ChromeDriver();
		driver.get(Constants.Base_Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("Test execution Ends");
	}
}



