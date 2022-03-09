package testNgFramework;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day4 {
  @Test
  public void MobileSign() {
	  System.out.println("I am in day4  SignIn");
  }
  
  @Test
  public void MobileLogin() {
	  System.out.println("I am ij day4 mobile login ");
  }
  
  @BeforeClass
  public void MobileSignUp() {
	  System.out.println("I am ij day4 mobile sign up before this class ");
  }
}
