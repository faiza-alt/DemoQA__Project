Feature: AutoComplete Test

  Scenario: AutoComplete Successfully
    Given User navigate to autoCompletePage
    When User search some item
    Then User did autoComplete action successfully