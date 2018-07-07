Feature: Application is able to add and cancel  in computer database

  Scenario: User is able to add new computer in computer database
    Given User is able to launch the application
    When  User click on add button and fill computer details and click create button
    Then  Computer is added in database



  Scenario: User is able to click cancel button and computer is not created
     Given User is able to launch the application
     When  User click on add button and fill computer details and click cancel button
     Then  Computer is not added in database





