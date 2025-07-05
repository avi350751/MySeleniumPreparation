package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import helper.Utility;

public class DashboardPage {
	
	WebDriver driver;
	
	
	
	public DashboardPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	By welcomeMessage = By.xpath("//h4[normalize-space()='Welcome Admin Manager to Learn Automation Courses']");
	By cartBtn = By.cssSelector(".cartBtn");
	By manage = By.xpath("//button[contains(text(),'Shop Now')]");
	By manageCategory = By.xpath("(//a[normalize-space()='Manage Categories'])[1]");

	
	public Boolean isWelcomeMessageDisplayed() {
		
		Boolean status = Utility.checkElement(driver, welcomeMessage).isDisplayed();
		Assert.assertTrue(status,"Welcome msg not displayed");
		return status;
	}
	
	public CartPage clickCart() {
		
		//driver.findElement(cartBtn);
		Utility.clickElement(driver,cartBtn);
		System.out.print("Cartbutton is clicked");
		
		CartPage cartpage = PageFactory.initElements(driver, CartPage.class);
		return cartpage;
	}
	
	public CategoryPage manageCategory() {
		
		Actions act = new Actions(driver);
		act.moveToElement(Utility.checkElement(driver, manage)).perform();
		Utility.clickElement(driver, manageCategory);
		
		CategoryPage categorypage = PageFactory.initElements(driver, CategoryPage.class);
		return categorypage;
	}
}
