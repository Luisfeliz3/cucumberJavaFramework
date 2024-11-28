package com.login.runner;


 

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		features = {"Features"} // Folder name 
		, glue = {"com.login.test"}
//		,tags = "@runme"
		  ,plugin = {"pretty",
				  "html:target/cucumber-reports.html",
				  "json:target/TestReports.json"},
		  dryRun = false
		  ,monochrome = true
		)

public class TestRunner {
	
	

}
