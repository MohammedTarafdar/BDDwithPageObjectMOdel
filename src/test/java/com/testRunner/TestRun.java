package com.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features =".//features/signIn.feature",
		glue = "com.stepDefinitions",
		dryRun = false,
		monochrome = true,
		publish = true,
		plugin = {"pretty", "html:test-output"}
		
		)

public class TestRun {

}
