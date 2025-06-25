package testngWithSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest2 {
	
	
	@Test
	public void test1() {
		
		System.out.println("1st testcase");
		String var = "rick";
		Assert.assertEquals("rick", var, "Incorrect string");
	}
	
	@Test
	public void test2() {
		
		System.out.println("2nd testcase");
		int var = 12;
		Assert.assertEquals(12, var, "Incorrect string");
	}

}
