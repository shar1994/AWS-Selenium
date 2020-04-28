package com.automation.aws.testing.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.aws.driver.Driver;

public class Action_OperationPage extends Driver {
	


	@FindBy(xpath = "//span[text()='Learning DHTMLX Suite UI']")
	WebElement src;
	@FindBy(xpath = "//ul[@class='dhx_widget dhx_list ']")
	WebElement dst;

	public  Action_OperationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void dragAndDrop() throws InterruptedException {
		
		Actions act = new Actions(driver);
/*	WebElement src	= driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
	WebElement dst = driver.findElement(By.xpath("//ul[@class='dhx_widget dhx_list ']"));
*/	
	boolean dst_value = dst.isEnabled();
	boolean src_value = src.isEnabled();
	
	System.out.println("Src Enabled :- " + src_value);
	System.out.println("Dst Enabled Value :- " + dst_value);
		
		act.dragAndDrop(src, dst).build().perform();
		
		
		
		Thread.sleep(5000);

	}
	
	 
	public void clickHoldDrop() {
		
		Actions act = new Actions(driver);
		act.clickAndHold(src).moveToElement(dst).release().build().perform();
		
		System.out.println("Bye");
	}
	public void check() {
		
	}
}