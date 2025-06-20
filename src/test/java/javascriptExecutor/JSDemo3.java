package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Utility;

public class JSDemo3 {

	public static void main(String[] args) {
		
		WebDriver driver = Utility.startBrowser("Chrome", "hhttps://freelance-learn-automation.vercel.app/login", false);
		Utility.waitForSeconds(4);
		
		WebElement header = driver.findElement(By.className("header"));
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		Utility.waitForSeconds(3);
		Utility.closeBrowser(driver);

	}

}
