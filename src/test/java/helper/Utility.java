package helper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	
	public static WebDriver startBrowser() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	
	public static WebDriver startBrowser(String browser, String applicationUrl, boolean headless) {
		
		System.out.println("*********** Running test on "+browser+" ***********");
		
		WebDriver driver ;
		
		ChromeOptions opt = new ChromeOptions();
		
		if (browser.equalsIgnoreCase("Chrome")){
			
			if(headless) {
				
				System.out.println("**********Tests running in headless mode*********");
				opt.addArguments("--headless=new");
			}
			
				driver = new ChromeDriver(opt);
		}
		else if(browser.equalsIgnoreCase("Firefox")){
			
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Safari")) {
			
			driver = new SafariDriver();
		}
		else {
			System.out.println("Browser is not found, Defaulting to Chrome");
			driver = new ChromeDriver();
		}
		
		System.out.println("********** Session is ready, tests will be executed now **************");
		
		driver.get(applicationUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	
	public static void waitForSeconds(int seconds) {
		
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void closeBrowser(WebDriver driver) {
		
		System.out.println("*************Closing the browser*************");
		if(driver!=null) {
			
			driver.quit();
		}
		System.out.println("*************Application Closed**************");
	}
	
	public static void selectValueFromDropdown(WebElement element, String valuetoselect) {
		
		Select dropdown = new Select(element);
		dropdown.selectByValue(valuetoselect);
	}
	
	public static void clickElement(WebDriver driver, By locator) {
		
		try{
			//driver.findElement(locator).click();
			Utility.clickElement(driver, locator);
			System.out.println("Clicked - conventional method");
		}
		catch(Exception e) {
			System.out.println("Clicking using javascript executor");
			clickElementJS(driver,locator);
		}
	}
	
	public static WebElement checkElement(WebDriver driver, By locator) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(locator));
		return ele;
	}
	
	public static void clickElementJS(WebDriver driver, By locator) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", driver.findElement(locator));
		System.out.println("Clicked using JavascriptExecutor");
	}
	
	public static void typeOnElement(WebDriver driver, By locator, String textToType) {
		
		Utility.checkElement(driver, locator).sendKeys(textToType);
	}
	
	public static WebElement waitForElementToAppear(WebDriver driver, By locator) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return ele;
	}
}
