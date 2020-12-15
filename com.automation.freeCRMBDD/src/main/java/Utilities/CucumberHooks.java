package Utilities;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberHooks extends driver{

	
	
	@Before()
	public void printBrowserStatus(Scenario scenarioName) {
	    // Write code here that turns the phrase above into concrete actions		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Starting --- "+scenarioName.getName());
		
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
}
}
