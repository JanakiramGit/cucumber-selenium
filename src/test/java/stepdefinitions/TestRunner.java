package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
		
		tags = {"@logintest"},
		glue = {"stepdefinitions"},
		monochrome = true,
		strict = true
		
		//plugin = {"pretty", "html:target/reports"},
		//plugin = {"pretty", "json:target/reports/cucumber.json"},
		//plugin = {"pretty", "junit:target/reports/cucumber.xml"}
		)		
public class TestRunner {

}
