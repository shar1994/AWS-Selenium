package stepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.amazonProductSearchPage;
import Utilities.driver;
import Utilities.elementMethods;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonProductSearchSteps {
	
	

	amazonProductSearchPage searchPage = new amazonProductSearchPage();

		

	@Given("^user is on Amazon Search Page$")
	public void user_is_on_Amazon_Search_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		searchPage.NavigateToAmazon();
	}

	@When("^user search for \"([^\"]*)\"$")
	public void user_search_for(String product) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		searchPage.SearchProduct(product);
	    
	}

	@Then("^list of phone displays$")
	public void list_of_phone_displays() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    searchPage.GetTitle();
	}

	

}
