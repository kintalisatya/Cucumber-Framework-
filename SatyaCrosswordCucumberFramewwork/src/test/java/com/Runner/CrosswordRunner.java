package com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/Testcase.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TC01_Register_and_Login_details, @TC02_Update_profile, @TC03_Search_for_the_books, @TC04_WindowHandle, @TC05_Scrolling"},
		glue = {"com.Crossword.StepDefinition"},
		monochrome = true
		)

public class CrosswordRunner 
{

}
