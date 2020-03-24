package com.StepDefinition;

import com.Pages.ScrollingCrossword_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScrollingCrossword_Step 
{

	ScrollingCrossword_Page scroll = new ScrollingCrossword_Page();
	
	@Given("^User Launch the Chrome Application$")
	public void user_Launch_the_Chrome_Application() throws Throwable {
		scroll.Launch();
	}

	@When("^Open the Crossword Home Page and Login to scroll$")
	public void open_the_Crossword_Home_Page_and_Login_to_scroll() throws Throwable {
		scroll.WebPage();
	}

	@Then("^User scroll the page$")
	public void user_scroll_the_page() throws Throwable {
		scroll.scroll();
	}

	@Then("^close the browser after scrolling operation$")
	public void close_the_browser_after_scrolling_operation() throws Throwable {
		scroll.closeTab();
	}
}
