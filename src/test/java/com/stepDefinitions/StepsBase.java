package com.stepDefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;


import com.pageObjects.LoginPage;

public class StepsBase {
	
	public WebDriver driver;
	public LoginPage lp;
	

	
	// Created for generating randome string for unique email
		public static String randomeString() {
			String generatedString = RandomStringUtils.randomAlphabetic(8);
			System.out.println(generatedString);
			return generatedString;
			
		}

}
