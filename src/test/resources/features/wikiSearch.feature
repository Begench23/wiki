@mine
Feature: Wikipedia search and verification




  Scenario: Title verification

    Given User in Wikipedia home page
    When user type "steve jobs" in the wiki search box
    And user click wiki search button
    Then user sees "Steve Jobs" is in wiki title

  Scenario: Wikipedia Search Functionality Header Verification
    Given User in Wikipedia home page
    When user type "steve jobs" in the wiki search box
    And user click wiki search button
    Then user sees "Steve Jobs" is in wiki header