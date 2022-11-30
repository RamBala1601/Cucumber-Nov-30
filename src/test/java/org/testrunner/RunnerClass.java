package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature Files\\Facebook.feature",
glue="org.stepdefinition",
monochrome=true,dryRun=false,
strict=true,snippets=SnippetType.CAMELCASE)


public class RunnerClass {

}
