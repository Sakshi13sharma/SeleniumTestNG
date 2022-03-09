package demoTestNG;

import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lecture4 {
  @Test
  public void openProducts() {
	  
  }
  public WebDriver driver ; 
  public String baseUrl = "http://demo.guru99.com/test/newtours/";
	 String geckodriver1="C:\\Users\\71684\\STS NOTES\\geckodriver.exe";
 
   @AfterTest                            //Jumbled
    public void terminateBrowser(){
        driver.close();
    }
   @BeforeTest                            //Jumbled
    public void launchBrowser() {
        System.out.println("launching firefox browser"); 
        System.setProperty("webdriver.gecko.driver", geckodriver1);
        driver = new FirefoxDriver();
        driver.get(baseUrl);
    }
    @Test                                //Jumbled
    public void verifyHomepageTitle() {
        String expectedTitle = "Welcome1: SSMercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
   }
    
    @AfterClass
    public void afterClass()
    {
    driver.quit();
    }
}
