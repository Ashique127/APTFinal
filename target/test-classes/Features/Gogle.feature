Feature: Check google search functionality



Scenario: Validate google search is working
Given browser is open
Then user is on google search page
Then user enters a text in google search box
Then hits Enter
Then user is navigated to the Search Reuslts Page