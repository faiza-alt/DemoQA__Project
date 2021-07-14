Feature: Date Picker Test

  Background:
    Given user navigate to the date Picker page

  Scenario: Pick Date Successfully
    When User pick the date
    Then user picked the date successfully


 Scenario: Pick Date By different way
   When user select the date
   Then user successfully selected the date