package testngWithSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import helper.Utility;

public class RegisterNewUser extends BaseClass{
	
	
	@Test
	public void registerNewUserWithValidDetails() {
		
		String state = "Assam"; 
	    String hobby = "Reading"; 
		
		driver.findElement(By.xpath("//a[contains(text(),'Signup')]")).click();
		Utility.waitForSeconds(3);
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("/signup"),"User has not landed on signup page");
		Assert.assertFalse(driver.findElement(By.xpath("//button[@class='submit-btn']")).isEnabled());
		
		driver.findElement(By.id("name")).sendKeys("Avishek Bhattacharjee");
		driver.findElement(By.id("email")).sendKeys("email@gmail.com");
		driver.findElement(By.id("password")).sendKeys("admin@123");
		
		
		Select stateDropdown = new Select(driver.findElement(By.id("state")));
		stateDropdown.selectByVisibleText(state);
		
		Select hobbies = new Select(driver.findElement(By.id("hobbies")));
		hobbies.selectByVisibleText(hobby);
		driver.findElement(By.xpath("(//div[@class='interest-div']//input)[1]")).click();
		Utility.waitForSeconds(2);
		
		Assert.assertTrue(driver.findElement(By.xpath("//button[@class='submit-btn']")).isEnabled());
		driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
		
		Utility.waitForSeconds(2);
		String text = driver.findElement(By.xpath("//div[@class='Toastify__toast-body']/div[2]")).getText();
		System.out.println(text);
		Assert.assertTrue(text.contains("successfully"),"User has not signed up successfully");
		
	}

}
