package dataProviderInTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import helper.ExcelUtility;

public class DataDrivenTest2 {
	
	
	@Test(dataProvider="readexceldata")
	public void test1(String args1, String args2, String args3) {
		
		System.out.println("Hi! "+args1);
		System.out.println("Hi! "+args2);
		System.out.println("Hi! "+args3);
//		System.out.println("Hi! "+args4);
//		System.out.println("Hi! "+args5);
		
		System.out.println("*********************************");
	}
	
	@DataProvider(name="readexceldata")
	public Object[][] getData(){
		
		Object [][] arr = ExcelUtility.getData("ReadFromExcel","Sample4");
		return arr;
	}
	
}
