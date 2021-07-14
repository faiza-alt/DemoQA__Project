Feature: Modal Dialogs Feature

  Background:
    Given User is on the home page of demoqa
    When User navigate to the Modal Dialogue Page


  Scenario: Small Modal Dialogs Test
    When User try to Handle with it
    And User should be able to do it successfully


  Scenario: Large Modal Dialogs Test
    When User try to Handle with large modal
    And User should be able to handle it successfully