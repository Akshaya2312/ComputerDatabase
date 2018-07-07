Feature: Computers data can be deleted.

  Scenario: Delete the computer from computer database list
    Given Computer is present in computer database list
    When User click on delete button
    Then User get deleted from computer list