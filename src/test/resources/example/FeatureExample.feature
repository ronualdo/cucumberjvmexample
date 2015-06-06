Feature: Testing
  Scenario: just a test scenario
    Given I have access to internet
    When I Access the github home page
    Then the page should say github on the title
