package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Utility;

public class JSDemo {

	public static void main(String[] args) {
		
		WebDriver driver = Utility.startBrowser("Chrome", "https://login.yahoo.com/", false);
		Utility.waitForSeconds(4);
		driver.findElement(By.id("login-username")).sendKeys("avi@dlx.com");
		
		WebElement cb = driver.findElement(By.id("persistent"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", cb);
		
		Utility.closeBrowser(driver);

	}

}
