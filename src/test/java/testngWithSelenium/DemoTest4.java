package testngWithSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest4 {
	
	
	@Test
	public void test4() {
		
		System.out.println("4th testcase");
		String var = "rick";
		Assert.assertEquals("rick", var, "Incorrect string");
	}

}
