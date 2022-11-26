Feature: Attendance

  @common
   Scenario: Header Validation
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff Clicks on Attendance button
    Then Admin/User/Staff see header text as "Manage Attendance"
  
 @common
  Scenario: Footer Validation
    When Admin/User/Staff is on Manage Attandance page
    Then Admin/User/Staff see Footer text as "In total there are 5 entries."
 
@common
  Scenario: Paginator Validation
    When Admin/User/Staff is on Manage Attendance page
    Then Admin/User/Staff see the text as "Showing 1 to 5 of 5 entries."
    When Admin/User/Staff is on Manage Attendance page
    Then Admin/User/Staff see all paginator buttons are Disabled

  @common
  Scenario: Verifying the Checkbox functionality of a Program Name
    When Admin/User/Staff Clicks on Checkbox
    Then Admin/User/Staff  see list of Users in that Program

 @common
  Scenario: Verifying the Functionality of a Present button
    When Admin/User/Staff  Clicks on Present
    Then Admin/User/Staff  see the list of  User Name who are Present

  @common
  Scenario: Verifying the Functionality of a Absent button
    When Verifying the Functionality of a absent button
    Then Admin/User/Staff  see the list of  User Name who are Absent

  @user @staff 
  Scenario: Edit Functionality
    Given User/Staff Logged on to LMS as "user" or "staff"
    When User/Staff Clicks on Edit Button
    Then User/Staff see header text as "Attendance Details"

  @user @staff
  Scenario: Edit ProgramName in Attendance Details window
    When User/Staff clicks on Save button after changing Program Name
    Then User/Staff see the success message "Updated Successfully"

  @user @staff
  Scenario: Edit User Name Attendance Details window
    When User/Staff clicks on Save button after changing User name
    Then User/Staff see the success message "Updated Successfully"

  @user @staff
  Scenario: Edit Present in Attendance Details window
    When User/Staff clicks on Save button after disabling Present details
    Then User/Staff see the success message "Updated Successfully"

  @user @staff
  Scenario: Edit Absent in Attendance Details window
    When User/Staff clicks on Save button after enabling Absent details
    Then User/Staff see the success message "Updated Successfully"

  @user @staff
  Scenario: Click on Cancel button in Attendance Details window
    When User/Staff clicks on Cancel button after entering details
    Then User/Staff see a Attendance Details window getting closed

  @user @staff
  Scenario: Verify the Delete Functionality
    When User/Staff Clicks on Delete Button
    Then see delete confirm window

  @user @staff
  Scenario: Click on "Yes" button in Delete Confirm window
    When User/Staff  Clicks on " Yes" button
    Then User/Staff  see Success message "Program Deleted Succesfully"

  @user @staff
  Scenario: Click on "No" button in Delete Confirm window
    When User/Staff  Clicks on "No" button
    Then User/Staff can see Program Name not deleted

  @admin
  Scenario: Admin permissions on attendance page
    Given Admin Logged onto LMS as "admin"
    When Admin clicks on the Edit Button
    Then Admin see Error Message "Admin Has View Only Permission"
    When Admin Clicks on Delete Button
    Then Admin see Error Message "Admin Has View Only Permission"

  