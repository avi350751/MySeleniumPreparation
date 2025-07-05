package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage {
	
	WebDriver driver;
	
	public CategoryPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By addNewCategory = By.xpath("(//button[normalize-space()='Add New Category'])[1]");
	
	
	
	public void addNewCategory() {
		
		driver.findElement(addNewCategory);
	}

}
