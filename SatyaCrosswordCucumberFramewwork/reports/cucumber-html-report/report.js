$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/Testcase.feature");
formatter.feature({
  "line": 2,
  "name": "Crossword Website",
  "description": "",
  "id": "crossword-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Crossword"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#@TC01_Register_and_Login_details"
    },
    {
      "line": 5,
      "value": "#Scenario: Check the user able to register and login with valid \u0026 invalid details"
    },
    {
      "line": 6,
      "value": "#Given User launch the Chrome application"
    },
    {
      "line": 7,
      "value": "#When Open the Crossword Home page"
    },
    {
      "line": 8,
      "value": "#Then Enter the required details to register"
    },
    {
      "line": 9,
      "value": "#Then User login using valid details"
    },
    {
      "line": 10,
      "value": "#Then User login using invalid details"
    },
    {
      "line": 11,
      "value": "#And Close the browser after registeration"
    },
    {
      "line": 12,
      "value": "#"
    },
    {
      "line": 13,
      "value": "#@TC02_Update_profile"
    },
    {
      "line": 14,
      "value": "#Scenario: Check the user to update profile"
    },
    {
      "line": 15,
      "value": "#Given User launch the Chrome Application"
    },
    {
      "line": 16,
      "value": "#When Open the crossword Home Page then Login to update"
    },
    {
      "line": 17,
      "value": "#Then User update the profile details"
    },
    {
      "line": 18,
      "value": "#And Close The Browser after updating the profile"
    },
    {
      "line": 19,
      "value": "#"
    },
    {
      "line": 20,
      "value": "#@TC03_Search_for_the_books"
    },
    {
      "line": 21,
      "value": "#Scenario: Check user to search for books to add wishlist and delete wishlist"
    },
    {
      "line": 22,
      "value": "#Given User launch the chrome application"
    },
    {
      "line": 23,
      "value": "#When Open the Crossword Home page and login to search"
    },
    {
      "line": 24,
      "value": "#Then User search for the books to add wishlist and delete wishlist"
    },
    {
      "line": 25,
      "value": "#And Close the Browser after search"
    },
    {
      "line": 26,
      "value": "#"
    },
    {
      "line": 27,
      "value": "#@TC04_WindowHandle"
    },
    {
      "line": 28,
      "value": "#Scenario: Check the user to handle window"
    },
    {
      "line": 29,
      "value": "#Given User Launch the Chrome application"
    },
    {
      "line": 30,
      "value": "#When Open the Crossword Home page and Login to handle window"
    },
    {
      "line": 31,
      "value": "#Then User view window handling operarion"
    },
    {
      "line": 32,
      "value": "#And close the Browser after window handle"
    }
  ],
  "line": 35,
  "name": "Check the user to handle scroll",
  "description": "",
  "id": "crossword-website;check-the-user-to-handle-scroll",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@TC05_Scrolling"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "User Launch the Chrome Application",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "Open the Crossword Home Page and Login to scroll",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "User scroll the page",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "close the browser after scrolling operation",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});