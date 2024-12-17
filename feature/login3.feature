Feature: Login.The Same testcase with different login credentials
 
  Scenario Outline: Login Functionality
Given Open the chrome browser
And Load the URL
Given User should login as "<UserID>" and "<Password>" 
When Click on signIn button
Then Home page should be displayed

    


    Examples: 
      | UserID | Password |
      | Shiva  | abcd123  |
      | Guru   | efgh456  |
