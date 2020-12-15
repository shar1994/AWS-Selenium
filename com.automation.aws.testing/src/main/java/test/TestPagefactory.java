package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class TestPagefactory {
public WebDriver driver;



	
@Test
public  void Test() {
try {

	System.setProperty("webdriver.chrome.driver","./Library/chromedriver.exe");
	driver = new ChromeDriver();
driver.get("https://automationeveryday.blogspot.com/2020/04/selenium-practice-hidden-radio-button.html");

System.out.println("Title of Page :- "+driver.getTitle());
WebElement radio_Male = driver.findElement(By.xpath("//*[@id=\"male\"][2]"));

radio_Male.click();
}
catch (Exception e) {
	driver.close();
}
}
}