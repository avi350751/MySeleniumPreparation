package parameter;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
	
	
	@Parameters("username")
	@Test
	public void test1(@Optional("Selenium")String name) {
		
		Reporter.log("Running test 1 for: "+name, true);
		
	}
	
	
	@Parameters({"username","password"})
	@Test
	public void test2(@Optional("Selenium")String name, @Optional("password")String password) {
		
		Reporter.log("Running test 1 for: "+name+ password, true);
		
	}

}
