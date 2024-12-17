
Feature: Login.Funtionality
 
  Scenario: 1 Login.Funtionality with positive cridentials
    Given Open the Chrome browser
    And Load the URL
    Given Enter the username as "prakash123"
    And Enter the password as "ab123"
    When click on SignIn button 
    Then Home page should be display
    
    Scenario: 2 Login.Funtionality with negative cridentials
    Given Open the Chrome browser1
    And Load the URL1
    And Click the Login button option1
    And Enter the invalid user name as "shivaprakash"
    And Enter the invalid password as "1234556788"
    When click on Login button 
    But Login error message should be displayed
