package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class CartPage {
	
	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	By shopNowBtn = By.xpath("//button[contains(text(),'Shop Now')]");
	By enrollNowBtn = By.xpath("//button[contains(text(),'Enroll Now')]");
	
	
	public void clickShopNow() {
		
		//driver.findElement(shopNowBtn);	
		Utility.clickElement(driver, shopNowBtn);
	}
	
	public void clickEnrollNow() {
		
		//driver.findElement(enrollNowBtn);
		Utility.clickElement(driver, enrollNowBtn);
		
	}

}
