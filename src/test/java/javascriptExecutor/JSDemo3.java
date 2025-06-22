package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import helper.Utility;

public class JSDemo3 {

	public static void main(String[] args) {
		
		WebDriver driver = Utility.startBrowser("Chrome","https://login.yahoo.com", false);
		Utility.waitForSeconds(4);
		driver.findElement(By.id("login-username")).sendKeys("avi@dlx.com");
		Utility.clickElement(driver, By.id("persistent"));
		
		Utility.waitForSeconds(6);
		//Utility.closeBrowser(driver);

	}

}
