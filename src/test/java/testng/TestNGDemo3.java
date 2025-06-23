package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo3 {
	
  @Test(priority=-1)
  public void newtest1() {
	  
  System.out.println("test1");
  Assert.assertEquals("Obhi".toLowerCase(), "Obhi", "Message Verification failed: ");
  
  }
  
  @Test
  public void newtest2() {
	  
  System.out.println("test2");
  Assert.assertFalse(false);
  
  }
  
  @Test(dependsOnMethods="newtest1")
  public void newtest3() {
	  
  System.out.println("test3");
  Assert.assertTrue(false);
  
  }
  
  @Test(priority=-2)
  public void test4() {
	  System.out.println("test4");
  }
  
  @Test(priority=1)
  public void test5() {
	  System.out.println("test5");
  }
  
}
