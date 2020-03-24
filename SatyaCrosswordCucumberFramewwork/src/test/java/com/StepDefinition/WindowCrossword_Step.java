package com.StepDefinition;

import com.Pages.WindowCrossword_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WindowCrossword_Step 
{

	WindowCrossword_Page window = new WindowCrossword_Page();
	
	@Given("^User Launch the Chrome application$")
	public void user_Launch_the_Chrome_application() throws Throwable {
		window.Launch();
	}

	@When("^Open the Crossword Home page and Login to handle window$")
	public void open_the_Crossword_Home_page_and_Login_to_handle_window() throws Throwable {
		window.WebPage();
	}

	@Then("^User view window handling operarion$")
	public void user_view_window_handling_operarion() throws Throwable {
		window.windowHandle();
	}

	@Then("^close the Browser after window handle$")
	public void close_the_Browser_after_window_handle() throws Throwable {
		window.closeTab();
	}
}
