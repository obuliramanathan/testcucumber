@LoginTest
Feature: Login Test on AMP Application
As a user open AMP application and login with user credentials

Background: Launch the AMP application login page
Given User need to be on the AMP application login page

@Sanity
Scenario: Login to the AMP application 1
When User enter the username
And User enter the password
Then Click on login button
#And Close the browser

@Regression
Scenario: Login to the AMP application 2
When User enter "prajt" as the username
And User enter "Anjeev@123" as the password
Then Click on login button 
#And Close the browser

@Sanity @Regression
Scenario: Login to the AMP application 3
When User enter login credentials
	|username	|password		|
	|prajt		|Anjeev@123	|	
Then Click on login button 
#And Close the browser
