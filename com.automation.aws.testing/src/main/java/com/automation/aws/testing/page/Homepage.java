package com.automation.aws.testing.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

import com.automation.aws.driver.Driver;
import com.automation.aws.utility.ExtentReport;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Homepage extends Driver{
	//***Variable***
	ExtentTest event;
	ExtentReports report;
	//***ENd Variable***
 //**********************Xpath***************
	@FindBy(xpath = "//*[@id='keywords_input']")
	WebElement txtsearch;
	@FindBy(xpath = "//*[@id='search_button']")
	WebElement btnsearch;





//*****************END Xpath********************
public Homepage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(this.driver, this);
}//****************
	public void search(String dishname) {
	try{
		txtsearch.clear();
		txtsearch.sendKeys(dishname);
		System.out.println("Search for :- "+dishname);
		btnsearch.click();
		report = ExtentReport.Instance();
		event.log(Status.INFO, "Executed");
		event.log(Status.PASS, "Executed");
		event.log(Status.FAIL, "Executed");
		report.flush();
	}
	catch(Exception E) {
		
	}
//************


	

}
//*********************END************





























//*******************************END********************************
}
