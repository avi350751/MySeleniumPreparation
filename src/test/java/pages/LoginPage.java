package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	By username = By.id("email1");
	By password = By.id("password1");
	By signinButton = By.className("submit-btn");
	
	public DashboardPage loginToApplication(String uname, String pass) {
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(signinButton).click();
		
		DashboardPage dashboardpage = new DashboardPage(driver);
		return dashboardpage;
		}
}
