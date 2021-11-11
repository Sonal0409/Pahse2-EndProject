package com.pep.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\sonal\\eclipse-workspace\\Phase2-EndProject\\src\\test\\java\\com\\pep\\features"},
		glue = {"com.pep.steps"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				"html:cucumberhtml",
				"json:jsonReports/cucumber.json",
				"junit:CucumberReports/cucmber.xml"
				
		}
	
        )

public class TestRunner {

}
