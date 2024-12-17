Feature: Login functionality
Scenario: 1Login functionality with positive credentials
Given Open the chrome browser
And Load the URL
Given Enter the Username
And Enter the Password 
When Click on sign in button
Then Home page should be displayed
Scenario: 2Login functionality with negative credentials
Given Open the chrome browser1
And Load the URL1
Given Enter the invalid Username "mngr570538"
And Enter the invalid Password "uzerypU"
When Click on sign in button
But Home page should not be displayed