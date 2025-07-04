package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DashboardPage {
	
	WebDriver driver;
	
	
	
	public DashboardPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	By welcomeMessage = By.xpath("//h4[normalize-space()='Welcome Admin Manager to Learn Automation Courses']");
	

	
	public Boolean isWelcomeMessageDisplayed() {
		
		Boolean status = driver.findElement(welcomeMessage).isDisplayed();
		Assert.assertTrue(status,"Welcome msg not displayed");
		return status;
	}
}
