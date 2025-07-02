package dataProviderInTestNG;

import org.testng.annotations.Test;

import helper.DataProviderUtility;

public class DataDrivenTest3 {
	
	
	@Test(dataProvider="readexceldata", dataProviderClass= DataProviderUtility.class)
	public void test1(String username, String password) {
		
		System.out.println("Username is: "+username+" and password is: "+password);
		
		System.out.println("*********************************");
	}
	
	
}
