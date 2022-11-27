@Attendance
Feature: Attendance

  @user
  Scenario:
       Given user Logged on to LMS Website
       When user enter valid "User" and "User"
       Then click on login button
   
   @staff
  Scenario:
       Given user Logged on to LMS Website
       When user enter valid "Staff" and "Staff"
       Then click on login button
       
   @admin
   Scenario:
       Given user Logged on to LMS Website
       When user enter valid "Admin" and "Admin"
       Then click on login button
       
          
  @admin @staff  @user
   Scenario: Header Validation
    When Admin/User/Staff Clicks on Attendance button
    Then Admin/User/Staff see header text as "Manage Attendance"
  
  @admin @staff  @user
  Scenario: Footer Validation
    When Admin/User/Staff is on Manage Attandance page
    Then Admin/User/Staff see Footer text as "In total there are 5 entries."
 
  @admin @staff @user
  Scenario: Paginator Validation
    When Admin/User/Staff is on Manage Attendance page
    Then Admin/User/Staff see the text as "Showing 1 to 5 of 5 entries."
    When Admin/User/Staff is on Manage Attendance page
    Then Admin/User/Staff see all paginator buttons are Disabled

 @admin @staff  @user
  Scenario: Verifying the Checkbox functionality of a Program Name
    When Admin/User/Staff Clicks on Checkbox
    Then Admin/User/Staff  see list of Users in that Program

  @admin @staff  @user
  Scenario: Verifying the Functionality of a Present button
    When Admin/User/Staff  Clicks on Present
    Then Admin/User/Staff  see the list of  User Name who are Present

   @admin @staff @user
  Scenario: Verifying the Functionality of a Absent button
    When Verifying the Functionality of a absent button
    Then Admin/User/Staff  see the list of  User Name who are Absent

   @staff @user
  Scenario: Edit Functionality
    Given User/Staff Logged on to LMS as "user" or "staff"
    When User/Staff Clicks on Edit Button
    Then User/Staff see header text as "Attendance Details"

  @staff  @user
  Scenario: Edit ProgramName in Attendance Details window
    When User/Staff clicks on Save button after changing Program Name
    Then User/Staff see the success message "Updated Successfully"

 @staff  @user 
  Scenario: Edit User Name Attendance Details window
    When User/Staff clicks on Save button after changing User name
    Then User/Staff see the success message "Updated Successfully"

  @staff  @user
  Scenario: Edit Present in Attendance Details window
    When User/Staff clicks on Save button after disabling Present details
    Then User/Staff see the success message "Updated Successfully"

 @staff  @user 
  Scenario: Edit Absent in Attendance Details window
    When User/Staff clicks on Save button after enabling Absent details
    Then User/Staff see the success message "Updated Successfully"

  @staff  @user
  Scenario: Click on Cancel button in Attendance Details window
    When User/Staff clicks on Cancel button after entering details
    Then User/Staff see a Attendance Details window getting closed

 @staff  @user
  Scenario: Verify the Delete Functionality
    When User/Staff Clicks on Delete Button
    Then see delete confirm window

 @staff  @user
  Scenario: Click on "Yes" button in Delete Confirm window
    When User/Staff  Clicks on " Yes" button
    Then User/Staff  see Success message "Program Deleted Succesfully"

   @staff @user
  Scenario: Click on "No" button in Delete Confirm window
    When User/Staff  Clicks on "No" button
    Then User/Staff can see Program Name not deleted

  @admin
  Scenario: Admin permissions on attendance page
    Given Admin Logged onto LMS as "admin"
    When Admin clicks on the Edit Button
    Then Admin see Error Message "Admin Has View Only Permission"
  
   @admin
  Scenario: Admin permissions on attendance page
    When Admin Clicks on Delete Button
    Then Admin see Error Message "Admin Has View Only Permission"

  