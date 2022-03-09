package demoTestNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
// BeforeSuite annotation 
public class Lecture3 {
	@BeforeSuite
  public void forgotPassword() {
	  System.out.println("3rd class-This will run in end ");
  }
	
}
