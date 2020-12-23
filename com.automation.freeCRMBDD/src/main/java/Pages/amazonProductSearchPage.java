package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import Utilities.driver;
import Utilities.elementMethods;

public class amazonProductSearchPage extends driver{
	
	
	elementMethods element = new elementMethods();
	
	public void NavigateToAmazon() {
		driver.get("https://www.amazon.in/");
		System.out.println("Browser is opened");
	    System.out.println("Title is "+driver.getTitle());
	}
	public void SearchProduct(String product) {
		By txtSearch = By.id("twotabsearchtextbox");
		element.getElement(txtSearch).clear();
	    element.getElement(txtSearch).sendKeys(product);
	    element.getElement(txtSearch).sendKeys(Keys.RETURN);
	}
	public void GetTitle() {
		System.out.println("Title is"+driver.getTitle());
	}
}
