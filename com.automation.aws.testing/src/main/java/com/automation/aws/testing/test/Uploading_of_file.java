package com.automation.aws.testing.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;


@Test
public class Uploading_of_file extends Driver{
	public void setup() {
		
		  driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
				WebElement chooseFile_btn = driver.findElement(By.name("userfile"));
		try{
			chooseFile_btn.sendKeys("C:\\Users\\sh360659\\git\\AWS-Selenium\\com.automation.aws.testing\\Extent-Report\\IOFile.txt");
			
		}
		catch(Exception e) {
			System.out.println("Check Logs");
		}
		
	}
	

}
