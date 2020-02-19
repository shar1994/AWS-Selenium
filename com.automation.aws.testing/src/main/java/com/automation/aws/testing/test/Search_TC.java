package com.automation.aws.testing.test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.regex.Pattern;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import com.automation.aws.driver.Driver;
import com.automation.aws.utility.ExtentReport;
import com.automation.aws.utility.Web;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.automation.aws.testing.page.*;
import org.openqa.selenium.support.FindBy;

public class Search_TC extends Driver {
	ExtentReports report;
	ExtentTest event ;
	@BeforeClass
	public void beforeClass() {
		
	
	report = ExtentReport.Instance();
	event = report.createTest("TC Name", "TC description");
	}
	@Test
	public void testCase1() throws Exception {
		
		String Dishname1 = "Fried Rice";
		System.out.println("Title of the Page :- " + driver.getTitle());
		// Call Search Method
		Homepage hm = new Homepage(driver);
		Web web = new Web(driver);
		web.halt();
		hm.search(Dishname1);
		web.halt();
		web.halt();
		System.out.println("Message:- " + driver.getTitle());
		RestrauantDetailPage rdp = new RestrauantDetailPage(driver);
		rdp.sorting();
		System.out.println("Searching High Rating Restaurant");
		event.log(Status.FAIL, "exceptionInfo");
	}

	

@AfterTest
	public void endTest() {
	report.flush();
}
}