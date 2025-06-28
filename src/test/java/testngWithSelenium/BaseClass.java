package testngWithSelenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import helper.Utility;

public class BaseClass {
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(@Optional("Chrome") String browserName) {
		System.out.println("********** Running Before Class **********");
		driver = Utility.startBrowser(browserName, "https://freelance-learn-automation.vercel.app/login", false);
		
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("********** Running After Class **********");
		driver.quit();
		
	}

}
