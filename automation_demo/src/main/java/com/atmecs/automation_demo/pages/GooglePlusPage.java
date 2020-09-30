package com.atmecs.automation_demo.pages;


import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import com.atmecs.automation_demo.constants.Constants;
import com.atmecs.automation_demo.helper.HelperClass;
import com.atmecs.automation_demo.utils.PropertyReader;

public class GooglePlusPage  {
	public  WebDriver driver;
	Properties locator;
	Properties data;

	public GooglePlusPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void googlePlus() {
		locator = PropertyReader.readProperty(Constants.Locator_File);
		data = PropertyReader.readProperty(Constants.Testdata_File);
		HelperClass elementHelper = new HelperClass(driver);
		elementHelper.clickIcon(locator.getProperty("GooglePlusIcon"));
		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

			String child_window=I1.next();


			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());

				driver.close();
			}

		}
		//switch to the parent window
		driver.switchTo().window(parent);

	}
	
}





