Feature: Hompage
  @tag1
  Scenario: HomepageLogin Success
    Given user launch the webapplication
    When user enter username as "LMS"
    And Password as "LMS"
    Then homepage displays
  Scenario: HomepageLogin Unsucessful  
    Given user launch the webapplication
    When user enter username as "SMS"
    And Password as "SMS"
    Then Error message displays