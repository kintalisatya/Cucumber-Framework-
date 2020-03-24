@Crossword
Feature: Crossword Website

@TC01_Register_and_Login_details
Scenario Outline: Check the user able to register and login with valid & invalid details
Given The User launch the Chrome application
Then Enter the required details to register 
Then The user login using "<username>" and "<password>" with vaild and invaild deatils
And Close the browser

Examples:

|username					|password		|
|satyakinthali92@gmail.com	|Satya@123		|
|bro@gmail.com				|satya00		|
|sat@gmail.com				|bro123			|

@TC02_Update_profile
Scenario: Check the user to update profile
Given User launch the Chrome Application
When Open the crossword Home Page then Login to update
Then User update the profile details 
And Close The Browser after updating the profile

@TC03_Search_for_the_books
Scenario: Check user to search for books to add wishlist and delete wishlist 
Given User launch the chrome application
When Open the Crossword Home page and login to search 
Then User search for the books to add wishlist and delete wishlist
And Close the Browser after search

@TC04_WindowHandle
Scenario: Check the user to handle window 
Given User Launch the Chrome application
When Open the Crossword Home page and Login to handle window
Then User view window handling operarion
And close the Browser after window handle

@TC05_Scrolling
Scenario: Check the user to handle scroll
Given User Launch the Chrome Application
When Open the Crossword Home Page and Login to scroll
Then User scroll the page
And close the browser after scrolling operation