package com.automation.aws.driver;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automation.aws.utility.ExtentReport;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;
//**************
public class Driver {
	  public WebDriver driver;
	  public String baseUrl;
	  public static Properties p;
	  private static Map<Long,WebDriver> driverThread = new HashMap<Long,WebDriver>();
	@BeforeMethod
	  public void setUp() throws Exception {
		  //System.setProperty("webdriver.chrome.driver","*/chromedriver.exe");
	     WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	   
	    baseUrl = "https://www.zomato.com";
	    System.out.println("Navigated to :- "+baseUrl);
	    // Maximize the browser
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/bangalore"); 
	}
//**************
@AfterMethod
public void close() {
	  driver.close();
}
//*************
public static WebDriver getDriverThread(long threadID) {
	// TODO Auto-generated method stub
	return driverThread.get(threadID);
}
//************


}
//*******************END************
