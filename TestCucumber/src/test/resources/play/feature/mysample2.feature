@SearchTest
Feature: Google Search
Search something in google

Background: Launch the Google Application
Given User need to be on the Google page

Scenario Outline: Search in google
When User enter "<keyword>" to search
Then Click on search button 
#And Close the browser
Examples:
	|keyword	|
	|cars			|