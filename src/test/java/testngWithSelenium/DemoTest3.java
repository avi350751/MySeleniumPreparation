package testngWithSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest3 {
	
	
	@Test
	public void test3() {
		
		System.out.println("3rd testcase");
		String var = "rick1";
		Assert.assertEquals("rick1", var, "Incorrect string");
	}
	
	@Test
	public void test4() {
		
		System.out.println("4th testcase");
		int var = 22;
		Assert.assertEquals(22, var, "Incorrect string");
	}

}
