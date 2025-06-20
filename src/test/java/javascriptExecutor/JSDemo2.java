package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Utility;

public class JSDemo2 {

	public static void main(String[] args) {
		
		WebDriver driver = Utility.startBrowser("Chrome", "https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html", false);
		Utility.waitForSeconds(4);
		WebElement firstName = driver.findElement(By.id("fname"));
		WebElement password = driver.findElement(By.id("pass"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1]", firstName,"Obhi");
		js.executeScript("arguments[0].value=arguments[1]", password,"ObhiS123");
		
		Utility.waitForSeconds(3);
		Utility.closeBrowser(driver);

	}

}
