package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature Files\\Task.feature",glue="org.stepdefinition",monochrome=true)

public class TaskRunner1 {
	
	

}
