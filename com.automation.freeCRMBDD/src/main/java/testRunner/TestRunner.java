package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features ="Feature",
		glue = "stepDefination",
		plugin = {"html:target/cucumber-html-report"}
		)
public class TestRunner {

}
