package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class JSDemo {

	public static void main(String[] args) {
		
		WebDriver driver = Utility.startBrowser("Chrome", "https://login.yahoo.com/", false);
		Utility.waitForSeconds(4);
		driver.findElement(By.id("login-username")).sendKeys("avi@dlx.com");
		driver.findElement(By.id("persistent")).click();
		Utility.closeBrowser(driver);

	}

}
