package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class Login_StepDefination {

	public static WebDriver driver;
	@Given("^user should be on login page$")
	public void user_should_be_on_login_page()  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://freecrm.com/");
	}

	@When("^title of page displayed$")
	public void title_of_page_displayed() {
	  String title = driver.getTitle();
	  System.out.println("Title of Page is :- "+title);
	  Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
	  driver.findElement(By.xpath("//span[text()='Log In']")).click();
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_and_password(String username , String password) {
	
		driver.findElement(By.xpath("//input[@name='email']"));
		driver.findElement(By.xpath("//input[@name='password']"));		
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() {
	driver.findElement(By.xpath("//div[text()='Login']")).click();  
	}

	@Then("^user is on homepage$")
	public void user_is_on_homepage(){
		System.out.println("Title of the Page is :- "+driver.getTitle());

	}
	@And("^close browser$")
	public void close_browser() {
		driver.close();
	}
}
