package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features ="/home/sharad/git/AWS-Selenium/com.automation.freeCRMBDD/src/main/java/feature/login.feature",
		glue = "stepDefination",
		plugin = {"html:target/cucumber-html-report"}
		)
public class TestRunner {

}
