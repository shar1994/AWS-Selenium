package com.automation.aws.driver;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.automation.aws.utility.Screenshot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

//**************
public class Driver {
	 public static WebDriver driver;
	  public static String baseUrl;
	  public static Properties p;
	  private static Map<Long,WebDriver> driverThread = new HashMap<Long,WebDriver>();
	  public ExtentReports report;
	  public ExtentTest log;
	
/*Reporting

	  @BeforeSuite
	  public void setupReport() {
		  ExtentHtmlReporter extent = new ExtentHtmlReporter(new File("./Extent-Report/extent.html"));
		  report = new ExtentReports();
		  report.attachReporter(extent);
	
	  }	  
 */
	@BeforeTest
	  public void setUp() throws Exception {
//		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver","./Library/chromedriver.exe");
		driver = new ChromeDriver();
//		driver = new FirefoxDriver(); 
	    baseUrl = "https://automationeveryday.blogspot.com/";
//	    baseUrl = "https://www.zomato.com/";
	    System.out.println("Navigated to :- "+baseUrl);
	    // Maximize the browser
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//    driver.get(baseUrl + "");

	   
	  

	}
//**************

//*************
/*public static WebDriver getDriverThread(long threadID) {
	// TODO Auto-generated method stub
	return driverThread.get(threadID);
}
*/

@AfterMethod
public void tearDown(ITestResult result) throws IOException
{
	
//	if(result.getStatus()==ITestResult.FAILURE)
//	{
//		String temp=Screenshot.getScreenshot(driver);
//		
//		log.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
//	}
	
//	report.flush();
	driver.quit();
	
}

//*******************END************
}