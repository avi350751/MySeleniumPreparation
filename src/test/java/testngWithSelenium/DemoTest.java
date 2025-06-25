package testngWithSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest extends BaseClass{

	
	
	@Test
	public void verifyURL() {

		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("login"),"URL not verified");
		
		
	}
	
	@Test
	public void verifyTitle() {

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.equalsIgnoreCase("Learn Automation Courses"), "Title not verified");
		
		 
	}
	
	@Test
	public void verifyFooterLinks() {

	
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-inside-div']//a"));
		int noOfLinks = links.size();
		System.out.println("Number of footer links:"+noOfLinks);	
		Assert.assertTrue(noOfLinks>=4, "All the social media buttons are not displayed");
		
		 
	}
}

