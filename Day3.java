package testNgFramework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {
 @BeforeSuite
  public void updateUser() {
	  System.out.println(" Day3: method  1 before suite");
  }
  @BeforeMethod
  public void addUser() {
	  System.out.println(" Day3: method   add user will run before every method ");
  }
  
  @Test
  public void CreatePassword () {
	  System.out.println(" Day3: crete the paassword ");
  }
  
  @Test
  public void UpdateProfile() {
	  System.out.println(" Day3: update the password ");
  }
  
  @AfterMethod
  public void DeleteProfile() {
	  System.out.println(" Day3: method  will be after every method ");
  }
}
