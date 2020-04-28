package com.automation.aws.testing.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;
import com.automation.aws.testing.page.Action_OperationPage;

public class ActionOperations extends Driver {

	Action_OperationPage actPage = new Action_OperationPage(driver);
	
	@Test (enabled = false)
	public void dragAndDrop() throws Exception {
		driver.navigate().to("https://dhtmlx.com/docs/products/dhtmlxTree/");
		actPage.dragAndDrop();

	}
	@Test (priority =1)
	public void clickHoldDrop() {
		driver.navigate().to("https://dhtmlx.com/docs/products/dhtmlxTree/");
		actPage.clickHoldDrop();
	}
//	@Test (priority = 2)
//	public void check () {
//		actpage
//	}
	
}
