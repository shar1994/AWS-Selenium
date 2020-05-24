package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:/Users/Admin/eclipse-workspace-AdvSelenium/com.automation.freeCRMBDD/src/main/java/feature/login.feature",
		glue = {"stepDefination"}
		)
public class TestRunner {

}
