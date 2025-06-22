package waitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Utility;

public class WeWait {

	public static void main(String[] args) {
	
		WebDriver driver = Utility.startBrowser("Chrome", "https://seleniumpractise.blogspot.com/2017/01/how-to-handle-alert-confirmation.html", false);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alt = wait.until(ExpectedConditions.alertIsPresent());
		alt.sendKeys("ObhiB");
		alt.accept();
		
		Utility.closeBrowser(driver);

	}

}
