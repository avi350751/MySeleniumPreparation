package readProperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadProperties {
	
	
	@Test
	public void readPro() throws IOException {
		
		//File src = new File(System.getProperty("user.dir")+"/Configuration/config.properties");
		FileInputStream fis = new FileInputStream(new File(System.getProperty("user.dir")+"/Configuration/config.properties"));
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop.get("qaenv"));
		System.out.println(prop.get("browser"));
		System.out.println(prop.get("omskey"));
		
	}

}
