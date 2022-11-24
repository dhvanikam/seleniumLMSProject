
Feature: Assignment
  Background: 
  Given Admin/User/Staff Logged on to LMS Website
  
  Scenario: Header Validation
  When Admin/User/Staff Clicks on Attendance button
  Then Admin/User/Staff see header text as "Manage Attendance"
  
  Scenario: Footer Validation
  When Admin/User/Staff is on Manage Attandance page
  Then Admin/User/Staff see Footer text as "In total there are 5 entries."
  
  Scenario: Paginator Validation
  When Admin/User/Staff is on Manage Attendance page
  Then Admin/User/Staff see the text as "Showing 1 to 5 of 5 entries."
  When Admin/User/Staff is on Manage Attendance page
  Then Admin/User/Staff see all paginator buttons are Disabled
  
  Scenario: Verifying the Checkbox functionality of a Program Name
  When Admin/User/Staff Clicks on Checkbox 
  Then Admin/User/Staff  see list of Users in that Program
  
  Scenario: Verifying the Functionality of a Present button
  When Admin/User/Staff  Clicks on Present
  Then Admin/User/Staff  see the list of  "User Name" who are Present
  
  Scenario: Verifying the Functionality of a Absent button
  When Verifying the Functionality of a Present button
  Then Admin/User/Staff  see the list of  "User Name" who are Absent
  
  Scenario: Edit Functionality
  Given   User/Staff Logged on to LMS as"user" or "staff"
  When User/Staff Clicks on Edit Button
  Then Admin see header text as "Attendance Details"
  
  Scenario: Edit ProgramName in Attendance Details window
  When User/Staff clicks on Save button after changing Program Name
  Then User/Staff see the success message "Updated Successfully"
  
  Scenario: Edit User Name Attendance Details window
  When User/Staff clicks on Save button after changing User name
  Then User/Staff see the success message "Updated Successfully"
  
  Scenario:  Edit Present in Attendance Details window
  When User/Staff clicks on Save button after disabling Present details 
  Then User/Staff see the success message "Updated Successfully"
  
  Scenario: 	Edit Absent in Attendance Details window
  When User/Staff clicks on Save button after enabling Absent details
  Then User/Staff see the success message "Updated Successfully"
  
  Scenario: Click on Cancel button in Attendance Details window	
  When User/Staff clicks on Cancel button after entering details 
  Then User/Staff see a Attendance Details window getting closed
  
  Scenario: Verify the Delete Functionality
  When User/Staff Clicks on Delete Button
  Then Admin see header text as "Delete Confirm"
  
  Scenario: Click on "Yes" button in Delete Confirm window
  When User/Staff  Clicks on " Yes"  button
  Then User/Staff  see Success message "Program Deleted Succesfully"
  
  Scenario: Click on "No" button in Delete Confirm window
  When User/Staff  Clicks on "No" button
  Then User/Staff can see Program Name not deleted
  
  Scenario: Admin permissions on attendance page
  Given Admin Logged onto LMS as "admin"
  When Admin clicks on the Edit Button
  Then Admin see Error Message "Admin Has View Only Permission"
  
  When Admin Clicks on Delete Button
  Then Admin see Error Message "Admin Has View Only Permission"
  
  
  
  
  
  
