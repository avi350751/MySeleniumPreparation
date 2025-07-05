package testUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.Utility;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginScenariosWithPageFactory {
	
	
	
	@Test
	public void testValidLogin() {
		
		WebDriver driver = Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login", false);
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		//loginpage = new LoginPage(driver);
		DashboardPage dp = loginpage.loginToApplication("admin@email.com", "admin@123");
		//dp = new DashboardPage(driver);
		dp.isWelcomeMessageDisplayed();
		driver.quit();
		
		
	}

}
