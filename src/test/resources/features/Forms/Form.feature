Feature: Form Application Filling Test

  Scenario: Fill The Form
    Given User navigate to the form page
    When User fill the form with valid info
    | Faiza|Ramzan|Faiza@gmail.com|2027564557|Male| December 24 2007| Math Biology| music| C:\Users\ramza\OneDrive\Pictures\AzalPic.jpg|     6546 TOWER DRIVE APT 78 Alexandria California 22897 |
    Then user should successfully submit the form

