@tag
Feature: LogOut button

  @tag1
  Scenario: Validating  LogOut button 
    Given Admin/User/Staff Logged on to LMS website
    When Admin/User/Staff  Clicks on LogOut button
    Then Admin/User/Staff should be navigated to Login Screen
    
