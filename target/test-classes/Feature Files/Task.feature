Feature: To validate the login functionality in application

Background:
  Given  Launch the browser and max window

 Scenario:  validate Login valid username and Invalid Password   
    When  Launch the url of the application
    And  pass the valid username in email field
           # one dimensional map(with header)
            # key       value
           |username|edf123@gmail.com|    
    And  pass the invalid password in password field
          # two dimensional map (with header)
          #   key          value
          |username     |password|
          |abc@gmail.com|123345|
          |efg@gmail.com|098654|
    And  click the login button
   Then  close the browser



     
     

