package testUsingPOM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import helper.Utility;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginScenarios {
	
	LoginPage loginpage;
	DashboardPage dp;
	
	@Test
	public void testValidLogin() {
		
		WebDriver driver = Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login", false);
		loginpage = new LoginPage(driver);
		dp = loginpage.loginToApplication("admin@email.com", "admin@123");
		//dp = new DashboardPage(driver);
		dp.isWelcomeMessageDisplayed();
		driver.quit();
		
		
	}

}
