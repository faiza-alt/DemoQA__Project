Feature: Frame Application

  Background:
    Given User is on the home page of demoqa

  Scenario: Frame Test
    When User navigate to the frame page
    Then user try to handle the frame
    And User should be able to successfully handle the frames


  Scenario: Nested Frame Test
    When User navigate to the nested frame page
    Then user try to handle the nested frame
    And User should be able to successfully handle the nested frames