package helper;

import org.testng.annotations.DataProvider;

public class DataProviderUtility {
	
	
	@DataProvider(name="readexceldata")
	public Object[][] getData(){
		
		Object [][] arr = new Object[2][2];
		arr[0][0] = "Ravi";
		arr[0][1] = "admin@123";
		arr[1][0] = "Shivangi";
		arr[1][1] = "admin@234";
		
		return arr;
	}

}
