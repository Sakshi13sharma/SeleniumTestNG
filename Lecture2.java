package demoTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
// Annotations BeforeTest and After test 
public class Lecture2 {
	@AfterTest
	public void signOUt()
	{
		System.out.println("Signout will be after the test cases");
	}
	
	@BeforeTest
	public void splashScreen() {
		  System.out.println("Splashscreen  will run before every test  ");
	  }
  @BeforeMethod
  public void testLogin() {
	  System.out.println("2nd class - login test ");
  }
  @Test
  public void testSignIn() {
	  System.out.println("2nd class - SignIn test ");
  }
  @Test
  public void testViewProducts() {
	  System.out.println("2nd class - PRODUCTS test ");
  }
  @Test
  public void testSignUp() {
	  System.out.println("2nd class - Signup test ");
  }
  @AfterMethod
  public void testSignOut() {
	  System.out.println("2nd class - SignOut test ");
  }
}
