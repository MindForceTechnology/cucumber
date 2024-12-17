Feature: Login functionality
Scenario: Login functionality with positive credentials

Given Open the chrome browser
And Load the URL
Given Enter the user name
And Enter the password
When Click on sign in button
Then Home page should be displayed