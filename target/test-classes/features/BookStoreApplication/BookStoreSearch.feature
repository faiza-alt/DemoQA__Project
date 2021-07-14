Feature: Book Store Search

  Scenario: Search Book test
    Given User is on the home page of Book store Application
    When User navigate to the search page
    Then User search book on store searchBox
    And User should be able to search the book