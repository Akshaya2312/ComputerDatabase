Feature: User is able to view data by click on computer in computer database.

   Scenario: User able to view details of computer
     Given Computer is in database
      When User click on computer in computer database list
      Then User is able to see the details of computer