

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(
		features = "Features" // Folder name 
		, glue = {"stepDefinition", "hooks"}
		,tags = "@Integration or @Wip and not @SmokeTest and not @Ignore"
		  ,plugin = {"pretty", "html:target/cucumber-reports.html"}
		  ,monochrome = true
		)

public class TestRunner {

}
  