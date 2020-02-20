package com.automation.aws.driver;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.automation.aws.utility.Screenshot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
//**************
public class Driver {
	  public WebDriver driver;
	  public String baseUrl;
	  public static Properties p;
	  private static Map<Long,WebDriver> driverThread = new HashMap<Long,WebDriver>();
	  public ExtentReports report;
	  public ExtentTest log;
	  
	  @BeforeSuite
	  public void setupReport() {
		  ExtentHtmlReporter extent = new ExtentHtmlReporter(new File("./Extent-Report/extent.html"));
		  report = new ExtentReports();
		  report.attachReporter(extent);
	
	  }
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

//*************
public static WebDriver getDriverThread(long threadID) {
	// TODO Auto-generated method stub
	return driverThread.get(threadID);
}
//************


//*******************END************
}