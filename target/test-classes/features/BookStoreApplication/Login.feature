Feature: Book Store Application Login Feature

  Scenario: Login Successfully
    Given User is on the home page of Book store Application
    When User enter "Faiza123$" user name and "Faiza123$" Password to login
    Then User should be able to login successfully
