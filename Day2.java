package testNgFramework;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day2 {
@AfterTest
public void testLLogin()
{
	System.out.println("thi is login before test will run after every test");


}
@Test
public void testSIgnUp()
{
	System.out.println("thi is signup day 2");
	}
@Test
public void TestRegister()
{
	System.out.println("thi is register day 2");
	}

@AfterSuite
public void ForgotPassword()
{
	System.out.println("thi is register day 2 AfterSUite Annotation ");
	}
}

