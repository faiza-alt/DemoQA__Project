Feature: TextBox Test

  Scenario: Input text successfully
    Given User navigate to the elements page
    When User enter text in the textBox
    |Faiza Ramzan|faiza@gmail.com|567 street apt 30 virginia|567 street apt 30 virginia|
    And System should let the user to enter text
    Then User entered text successfully