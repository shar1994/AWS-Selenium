package com.automation.aws.testing.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.aws.driver.Driver;


public class SVG_Handling_TC extends Driver{

	@Test
	public void svgHandle() {
		driver.navigate().to("https://www.w3schools.com/graphics/svg_inhtml.asp");
		System.out.println(driver.getTitle());
		List<WebElement> circle = driver.findElements(By.xpath("//*[name()='svg']//*[local-name()='circle']"));
		System.out.println(circle.get(0).getAttribute("fill"));
	}
	
}