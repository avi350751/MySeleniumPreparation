package testngWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import helper.Utility;

public class LoginLogoutScenario extends BaseClass{
	
	
	@Test
	public void loginWithValidScenario() {
		
		driver.findElement(By.id("email1")).sendKeys("admin@email.com");
		driver.findElement(By.id("password1")).sendKeys("admin@123");
		driver.findElement(By.className("submit-btn")).click();
		WebElement msg = Utility.waitForElementToAppear(driver, By.xpath("//h4[@class='welcomeMessage']"));
		System.out.println(msg.getText());
		Assert.assertTrue(msg.getText().contains("Welcome"),"Welcome message is not present after login.");
		
	}
	
	
	@Test(dependsOnMethods="loginWithValidScenario")
	public void logoutFromApplication() {
		
		driver.findElement(By.xpath("//img[@alt='menu']")).click();
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();
		Utility.waitForSeconds(2);
		String url = driver.getCurrentUrl();
		System.out.println("Current URL is: "+url);
		Assert.assertTrue(url.contains("/login"),"User is not successfully logged out");
		
	}

}
