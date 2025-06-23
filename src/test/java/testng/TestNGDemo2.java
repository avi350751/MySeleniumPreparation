package testng;

import org.testng.annotations.Test;

public class TestNGDemo2 {
	
  @Test(priority = 1, description ="This test to verify user can login to application")
  public void loginToApp() {
	  
  System.out.println("Login to Application");
  
  }
  
  @Test(priority = 3, description = "This test to verify user can logout from application")
  public void logoutFromApp() {
	  
	  System.out.println("Logout from Application");
  }
  
  @Test(priority = 2, description="This test to verify user can make payment and continue")
  public void makingPayment() {
	  
	  System.out.println("Pay and proceed");
  }
  
}
