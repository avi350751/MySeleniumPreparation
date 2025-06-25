package testngWithSelenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import helper.Utility;

public class BaseClass {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.out.println("********** Running Before Class **********");
		driver = Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login", false);
		
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("********** Running After Class **********");
		driver.quit();
		
	}

}
