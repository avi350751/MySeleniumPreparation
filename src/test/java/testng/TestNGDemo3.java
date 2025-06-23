package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo3 {
	
  @Test
  public void newtest1() {
	  
  System.out.println("Login to Application");
  Assert.assertEquals("Obhi".toLowerCase(), "obhi", "Message Verification failed: ");
  
  }
  
  @Test
  public void newtest2() {
	  
  System.out.println("Login to Application1");
  Assert.assertFalse(false);
  
  }
  
  @Test
  public void newtest3() {
	  
  System.out.println("Login to Application2");
  Assert.assertTrue(false);
  
  }
  
}
