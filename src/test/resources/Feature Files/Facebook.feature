
Feature: To Validate Login Fuctionality Of Facebook Application
  
  
  Scenario: To validate Login valid username and Invalid Password
    Given To launch the browser and max window
    When To launch the url of the application
    And To pass the valid username in email field
    And To pass the invalid password in password field
    And To click the login button
   Then To close the browser
  
  
  Scenario Outline:To Validate positive and negative testcases in login field
    Given To launch the browser and max window
    When To launch the url of application
    And Pass the positive and negative "<email datas>" in email field
    And  Pass the positive and negative "<password datas>" in password field
    And  Click the login button
    Then Close the browser
    
    Examples:
     
       |email datas|password datas|
       |bala123    |123456        |
       |arivu123   |654321        |
       |abi123     |098765        |
       
       
            