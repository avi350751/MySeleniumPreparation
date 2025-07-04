package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtility {
	
	
	public static String readProperty(String keyName) {
		
		Properties prop = new Properties();
		try {
			
			prop.load(new FileInputStream(new File(System.getProperty("user.dir")+"/Configuration/config.properties")));
		} catch (IOException e) {
			
			System.out.println("Coudnot read the config file"+e.getMessage());
		}
		
		String value = prop.getProperty(keyName);
		return value;
	}

}
