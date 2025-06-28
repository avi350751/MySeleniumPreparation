package dataProviderInTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest1 {
	
	
	@Test(dataProvider = "users")
	public void newuser(String fname, String lname, String id) {
		
		System.out.println("Hi! "+fname+" "+lname+"Your id is: "+id);
	}
	
	
	
	@DataProvider(name="users")
	public Object getData() {
		
		Object [][]arr = new Object[3][3];
		arr[0][0] = "rick";
		arr[0][1] = "bhattacharjee";
		arr[0][2] = "001";
		
		arr[1][0] = "ishani";
		arr[1][1] = "banerjee";
		arr[1][2] = "002";
		
		arr[2][0] = "ron";
		arr[2][1] = "ganguly";
		arr[2][2] = "003";
		
		System.out.println ("Everything is bright and sunny!");
		
		return arr;
		
		
		
	}

}
