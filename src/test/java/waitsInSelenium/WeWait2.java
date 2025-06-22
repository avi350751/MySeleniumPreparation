package waitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Utility;

public class WeWait2 {

	public static void main(String[] args) {
	
		WebDriver driver = Utility.startBrowser("Chrome", "https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html", false);
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(14));
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='demo'][text()='WebDriver']")));
		System.out.println(ele.isDisplayed());
		Utility.closeBrowser(driver);

	}

}
