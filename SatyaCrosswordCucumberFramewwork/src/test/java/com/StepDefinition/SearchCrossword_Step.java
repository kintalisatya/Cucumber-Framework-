package com.StepDefinition;

import com.Pages.SearchCrossword_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchCrossword_Step 
{

	SearchCrossword_Page search = new SearchCrossword_Page();
	
	@Given("^User launch the chrome application$")
	public void user_launch_the_Chrome_application() throws Throwable {
		search.Launch();
	}

	@When("^Open the Crossword Home page and login to search$")
	public void open_the_Crossword_Home_page_and_login_to_search() throws Throwable {
		search.webPage();
	}

	@Then("^User search for the books to add wishlist and delete wishlist$")
	public void user_search_for_the_books_to_add_wishlist_and_delete_wishlist() throws Throwable {
		search.search();
		search.screenshots("src/test/resources//Screenshot//search.png");
	}

	@Then("^Close the Browser after search$")
	public void close_the_Browser_after_search() throws Throwable {
		search.closeTab();
	}
}
