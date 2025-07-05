package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helper.Utility;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	By username = By.id("email1");
	By password = By.id("password1");
	By signinButton = By.className("submit-btn");
	
	public DashboardPage loginToApplication(String uname, String pass) {
		
		//driver.findElement(username).sendKeys(uname);
		Utility.typeOnElement(driver, username, uname);
		//driver.findElement(password).sendKeys(pass);
		Utility.typeOnElement(driver, password, pass);
		//driver.findElement(signinButton).click();
		Utility.clickElement(driver, signinButton);
		
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		return dashboardpage;
		}
}
