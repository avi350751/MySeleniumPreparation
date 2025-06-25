package testngWithSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest5 {
	
	
	@Test
	public void test5() {
		
		System.out.println("5th testcase");
		String var = "rick";
		Assert.assertEquals("rick", var, "Incorrect string");
	}

}
