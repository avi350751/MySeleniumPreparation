package helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

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
}
