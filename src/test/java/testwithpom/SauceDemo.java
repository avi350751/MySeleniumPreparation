package testwithpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class SauceDemo {

	public static void main(String[] args) {
		
		WebDriver driver = Utility.startBrowser("Chrome","https://www.saucedemo.com/",false);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Utility.waitForSeconds(2);
		driver.findElement(By.id("login-button")).click();
		Utility.closeBrowser(driver);
		System.out.println("Executed!!-------- PASS");

	}

}
