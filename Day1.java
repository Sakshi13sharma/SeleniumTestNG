package testNgFramework;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class Day1 {
  @Test(priority= 2)
  public void fDemo1() {
	  String str = "TestNG method1 in Day 1";
	  System.out.println(str);
  }
@Test(enabled=false)
 public void checkbox() {
	  String str = "TestNG demo4 in Day 1";
	  System.out.println(str);
  }
  @AfterClass
  public void fDemo2() {
	  String strq = "TestNG method 2 in Day 1 after class";
	  System.out.println(strq);
  }


  @Test(priority= 1)
  public void fDemo3() {
	  
	  System.out.println("test ng method 3 in Day 1");
  }

// method with lowest priority will run first 
}
