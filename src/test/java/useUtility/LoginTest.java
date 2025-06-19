package useUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class LoginTest {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = Utility.startBrowser();
		driver.findElement(By.id("email1")).sendKeys("avi@dlx.com");
		driver.findElement(By.id("password1")).sendKeys("avi1234");
		driver.close();
		System.out.println("Done!!!");
	}

}
