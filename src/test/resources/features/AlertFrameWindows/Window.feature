 Feature: Window Test

   Background:
     Given User navigate to the Window page

  Scenario: Window Tab Handling
    When user handle the Window tab
    Then User successfully handled Window


   Scenario: Window browser Handling
     When user handle the Window browser
     Then User successfully handled Window browser


   Scenario: New Window browser Message Handling
     When user handle the new Window message browser
     Then User should successfully handle the  Window browser message