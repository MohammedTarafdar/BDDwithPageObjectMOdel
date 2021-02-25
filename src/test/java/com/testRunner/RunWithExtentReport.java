package com.testRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.vimalselvam.cucumber.listener.ExtentProperties;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
		features =".//features/signIn.feature",
		glue = "com.stepDefinitions",
		dryRun = false,
		monochrome = true,
		publish = true,
		//plugin = {"pretty", "html:test-output"}
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
		)

public class RunWithExtentReport  {
	
	// extends AbstractTestNGCucumberTests
	
	@BeforeClass
	public static void setUp() {
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		extentProperties.setReportPath("output/myreport.html");
	}
	
	@AfterClass
	public static void teardown() {
		
	}

}
