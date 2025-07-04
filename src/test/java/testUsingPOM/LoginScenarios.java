package testUsingPOM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import helper.Utility;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginScenarios {
	
	@Test
	public void testValidLogin() {
		
		WebDriver driver = Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login", false);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.loginToApplication("admin@email.com", "admin@123");
		DashboardPage dp = new DashboardPage(driver);
		dp.isWelcomeMessageDisplayed();
		driver.quit();
		
		
	}

}
