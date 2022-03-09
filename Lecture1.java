package demoTestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
// The parameters enabled and priority
public class Lecture1 {
  @Test(priority =2)
  public void FirstMethod() 
  {
	  System.out.println("This is the first test case");
  }
  @Test(enabled=false)
  public void checkbox()
  {
	  System.out.println("This is second test case");
  }
  @Test
  public void dropdown()
  {
	  System.out.println("This is dropdown test case");
  }
  @Test(priority=1)
  public void radioButton()
  {
	  System.out.println("This is third test case");
	    
  }
  @BeforeTest
	public void splashScreen1() {
		  System.out.println("Splashscreen Lecture1 will run before every test  ");
	  }
  @AfterSuite
  
  public void closeBrowser() {
	  System.out.println("Lecture 1-The browser must be closed ");
  }
  
}
