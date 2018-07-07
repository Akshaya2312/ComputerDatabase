Feature: User is able to edit the details of Computer in computer database

  Scenario: User is able to edit details of Computer
    Given Computer is present in computer database
    When User edit the details of computer
    Then New details should be added