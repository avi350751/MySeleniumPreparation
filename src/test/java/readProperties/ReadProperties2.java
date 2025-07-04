package readProperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import helper.ConfigUtility;

public class ReadProperties2 {
	
	
	@Test
	public void readPro() {
		
		String browserName = ConfigUtility.readProperty("browser");
		System.out.println(browserName);
		
	}

}
