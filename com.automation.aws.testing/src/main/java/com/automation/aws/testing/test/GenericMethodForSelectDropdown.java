package com.automation.aws.testing.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;

public class GenericMethodForSelectDropdown extends Driver{

	
	
//	@Test
//	public void dropdown() {
//		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
//		By frame = By.id("iframeResult");
//		driver.switchTo().frame(GetElement(frame));
//		By drpdwn = By.id("cars");
//		SelectByText(drpdwn, "Saab");
//	}
//	
//	
		public static WebElement GetElement(By locator) {
				return driver.findElement(locator);
			}
		
		@Test
		public static void DemoTest() {
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
			By frame = By.id("iframeResult");
			driver.switchTo().frame(GetElement(frame));
			By drpdwn = By.id("cars");
			SelectDropDown(drpdwn, "ByText", "Saab");
		}
//	
//	
//	public void SelectByText(By locator, String text) {
//		Select select = new Select(GetElement(locator));
//		select.selectByVisibleText(text);
//		WebElement option = select.getFirstSelectedOption();
//		System.out.println("Selected Text "+option.getText());
//	}
	public static void SelectDropDown(By locator, String type, String value) {
		Select select = new Select(GetElement(locator));
		WebElement SelectValue;
		switch (type) {
		case "ByIndex":
			select.selectByIndex(Integer.parseInt(value));
			SelectValue = select.getFirstSelectedOption();
			System.out.println("Selected Value "+SelectValue.getText());
			break;
		case "ByText":
			select.selectByVisibleText(value);
			SelectValue = select.getFirstSelectedOption();
			System.out.println("Selected Value "+SelectValue.getText());
			break;
		case "ByValue":
			select.selectByValue(value);
			SelectValue = select.getFirstSelectedOption();
			System.out.println("Selected Value "+SelectValue.getText());
			break;

		default:
			break;
		}
	}
}
