@ManageAssignment
Feature: Manage Assignment

  
  @user 
  Scenario:
       Given user Logged on to LMS Website
       When user enter valid "User" and "User"
       Then  click on login button
   
  @staff
  Scenario:
       Given user Logged on to LMS Website
       When staff enter valid "Staff" and "Staff" and code "54321"
       Then  click on login button
       
   @admin
   Scenario:
       Given user Logged on to LMS Website
       When admin enter valid "Admin" and "Admin" and code "12345"
       Then  click on login button
       

  #Header Validation
  @user @admin @staff
  Scenario:  Assignment_Validating Assignment Heading
    Given  Assignment_Admin/User/Staff is on Assignment Page
    When  Assignment_Admin/User/Staff clicks on Assignment Page
    Then  Assignment_Admin/User/Staff Should see a Header "Manage Assignment"

  #footer validation
  @user @admin @staff
  Scenario: Assignment_Validating Assignment Footer
    Given Assignment_Admin/User/Staff is on Assignment Page
    When  Assignment_Admin/User/Staff clicks on Assignment Page
    Then  Assignment_Admin/User/Staff Should see a Footer text "In Total there are 3 assignments"

  #Pagination functionality
  @user @admin @staff
  Scenario:  Assignment_Paginator Vaildation
    Given  Assignment_Admin/User/Staff is on Assignment Page
    When  Assignment_Admin/User/Staff clicks on Assignment Page
    Then  Assignment_Admin/User/Staff Should see a Paginator text "Showing 1 to 3 of 3 entries"

  @user @admin @staff
  Scenario:  Assignment_Verify  paginator -next button  on the Assignment page
    Given  Assignment_Admin/User/Staff is on Assignment Page
    When  Assignment_Admin/User/Staff Clicks on Enabled paginator-next button
    Then  Assignment_Admin/User/Staff Should be navigated to next page

  @user @admin @staff
  Scenario:  Assignment_Verify paginator -previous button on the Assignment page
    Given  Assignment_Admin/User/Staff is on Assignment Page
    When  Assignment_Admin/User/Staff Clicks on Enabled paginator-privious button
    Then  Assignment_Admin/User/Staff Should be navigated to previous page

  @user @admin @staff
  Scenario:  Assignment_Verify paginator -last button on the Assignment page
    Given  Assignment_Admin/User/Staff is on Assignment Page
    When  Assignment_Admin/User/Staff Clicks on Enabled paginator-last button
    Then  Assignment_Admin/User/Staff Should be navigated to Last page

  @user @admin @staff
  Scenario:  Assignment_Verify paginator -first button on the Program page
    Given  Assignment_Admin/User/Staff is on Assignment Page
    When  Assignment_Admin/User/Staff Clicks on Enabled paginator-first button
    Then  Assignment_Admin/User/Staff Should be navigated to First  page

  #searchtextbox functionality
  @user @admin @staff
  Scenario:  Assignment_Validate Search Feature
    Given  Assignment_Admin/User/Staff is on Assignment Page
    When  Assignment_Admin/User/Staff clicks Search bar after entering "Assignment name"
    Then  Assignment_The requested assignment as "Assignment name" details should be displayed

  #Ascending
  @user @admin @staff
  Scenario:  Assignment_Verify Assignment Name are displayed in Ascending order
    Given  Assignment_Admin/User/Staff is on Assignment Page
    When  Assignment_Admin/User/Staff Clicks on Assignment Name Ascending Arrow
    Then  Assignment_Admin/User/Staff should see the Assignment Name displayed in Ascending order

  @user @admin @staff
  Scenario:  Assignment_Verify Assignment Description are displayed in Ascending order
    Given  Assignment_Admin/User/Staff is on Assignment Page
    When  Assignment_Admin/User/Staff Clicks on Assignment Description Ascending Arrow
    Then  Assignment_Admin/User/Staff should see the Assignment Description displayed in Ascending order

  @user @admin @staff
  Scenario:  Assignment_Verify Assignment Duedate are displayed in Ascending order
    Given  Assignment_Admin/User/Staff is on Assignment Page
    When  Assignment_Admin/User/Staff Clicks on Assignment Due Date Ascending Arrow
    Then  Assignment_Admin/User/Staff should see the Assignment Due Date displayed in Ascending order

  @user @admin @staff
  Scenario:  Assignment_Verify Assignment Grade  are displayed in Ascending order
    Given  Assignment_Admin/User/Staff is on Assignment Page
    When  Assignment_Admin/User/Staff Clicks on Assignment Grade Ascending Arrow
    Then  Assignment_Admin/User/Staff should see the Assignment Grade displayed in Ascending order

  #Descending
  @user @admin @staff
  Scenario:  Assignment_Verify Assignment Name are displayed in Descending order
    Given  Assignment_Admin/User/Staff is on Assignment Page
    When  Assignment_Admin/User/Staff Clicks on Assignment Name Descending Arrow
    Then  Assignment_Admin/User/Staff should see the Assignment Name displayed in Descending order

  @user @admin @staff
  Scenario:  Assignment_Verify Assignment Description are displayed in Descending order
    Given  Assignment_Admin/User/Staff is on Assignment Page
    When  Assignment_Admin/User/Staff Clicks on Assignment Description Descending Arrow
    Then  Assignment_Admin/User/Staff should see the Assignment Description displayed in Descending order

  @user @admin @staff
  Scenario:  Assignment_Verify Assignment Duedate are displayed in Descending order
    Given  Assignment_Admin/User/Staff is on Assignment Page
    When  Assignment_Admin/User/Staff Clicks on Assignment Due Date Descending Arrow
    Then  Assignment_Admin/User/Staff should see the Assignment Due Date displayed in Descending order

  @user @admin @staff
  Scenario:  Assignment_Verify Assignment Grade are displayed in Descending order
    Given  Assignment_Admin/User/Staff is on Assignment Page
    When  Assignment_Admin/User/Staff Clicks on Assignment Grade Descending Arrow
    Then  Assignment_Admin/User/Staff should see the Assignment Grade displayed in Descending order

  #addNewAssignment
  @staff
  Scenario:  Assignment_Validate Add New Assignment button
    Given  Assignment_Staff is on Manage Assignment page
    When  Assignment_Staff clicks a Add new assignment button
    Then  Assignment_Staff should see Assignment details window

  @user @admin
  Scenario:  Assignment_Checking who has access to Manage Assignment Page
    Given  Assignment_Admin/User is on Manage Assignment page
    When  Assignment_Admin/User Click on add New Assignment
    Then  Assignment_Admin/User should see a message "Staff only have access to add New Assignment"

  @staff
  Scenario:  Assignment_No details Entered in  Assignment Details window
    Given  Assignment_Staff is on Assignment Details page
    When  Assignment_Staff  clicks on Save after leaving all the fields empty
    Then  Assignment_Staff should see an error message "Name is required"

  @staff
  Scenario:  Assignment_Staff Validate Assignment Details window with entering all fields
    Given  Assignment_Staff is on Assignment Details page
    When  Assignment_Staff clicks Save button after entering assignment name,description,Grade and Duedate
    Then  Assignment_Staff should see a message "New Assignment successfully added"

  @staff
  Scenario:  Assignment_Staff Click Cancel in Assignment Details window
    Given  Assignment_Staff is on Assignment Details page
    When  Assignment_Staff clicks cancel button with entering all fields
    Then  Assignment_Staff should see a Assignment details window is closed

  @user @admin @staff
  Scenario:  Assignment_validate New assignment
    Given  Assignment_Admin/User/Staff is on Assignments page
    When  Assignment_Admin/User/Staff clicks on Assignment
    Then  Assignment_Admin/User/Staff should see a newly added Assignment

  @staff
  Scenario:  Assignment_Validate  Manage button in Assignment Grade
    Given  Assignment_Staff is on Assignment page
    When  Assignment_Staff clicks manage button under Assignment Grade
    Then  Assignment_Staff should be navigated to Grade Window

  #editAssignment
  @staff
  Scenario:  Assignment_Edit Functionality
    Given  Assignment_Staff is on Manage Assignment page
    When  Assignment_Staff clicks an edit Assignment button
    Then  Assignment_Staff should see a Assignment details window

  @staff
  Scenario:  Assignment_Staff Edit Assignment Name in Assignment Details window
    Given  Assignment_Staff is on Manage Assignment page
    When  Assignment_Staff clicks Save button after edits Assignment Name
    Then  Assignment_Staff should see a message "Assignment Name Updated"

  @staff
  Scenario:  Assignment_Staff Edit Assignment Description in Assignment Details window
    Given  Assignment_Staff is on Manage Assignment page
    When  Assignment_Staff clicks Save button after edits Assignment Description
    Then  Assignment_Staff should see a message "Assignment Description Updated"

  @staff
  Scenario:  Assignment_Staff Edit Assignment Grade in Assignment Details window
    Given  Assignment_Staff is on Assignment Details window
    When  Assignment_Staff clicks Save button after edits Assignment Grade
    Then  Assignment_Staff should see a message "Assignment Grade Updated"

  @staff
  Scenario:  Assignment_Staff Edit Assignment DueDate in Assignment Details window
    Given  Assignment_Staff is on Assignment Details window
    When  Assignment_Staff clicks Save button after edits Assignment DueDate
    Then  Assignment_Staff should see a message "Assignment Due Date Updated"

  @staff
  Scenario:  Assignment_Staff Click Cancel in  Assignment Details window
    Given  Assignment_Staff is on Assignment Details window
    When  Assignment_Staff clicks cancel button
    Then  Assignment_Staff Should see a Assignment Details Page is closed

  @user @admin
  Scenario:  Assignment_Admin/User Validate Edit button
    Given  Assignment_Admin/User is on Manage Assignment page
    When  Assignment_Admin/User clicks Edit button
    Then  Assignment_Admin/User should see a messages "Staff only have access to Edit Assignment"

  #googleForm
  @admin
  Scenario:  Assignment_Admin clicks Assignment Name
    Given  Assignment_Admin is on Assignment page
    When  Assignment_Admin clicks on Assignment Name
    Then  Assignment_Admin should see a warning message "you dont have access"

  @user
  Scenario:  Assignment_User clicks Assignment Name
    Given  Assignment_User is on Assignment page
    When  Assignment_User clicks on Assignment Name
    Then  Assignment_User should be navigated to Assignment Google form page

  @user
  Scenario:  Assignment_User validate assignment Google form with entering all fields
    Given  Assignment_User is on Assignment  Google form page
    When  Assignment_User clicks on submit button after entering all questions and mail id
    Then  Assignment_User entered google forms successfully

  @user
  Scenario:  Assignment_User validate assignment Google form leaving empty
    Given  Assignment_User is on Assignment  Google form page
    When  Assignment_User clicks on submit button after leaving all questions and mail id
    Then  Assignment_User should get a warning message "Must enter the mandatory fields"

  @user
  Scenario:  Assignment_User Validate Assignment google form after cliclking clear button
    Given  Assignment_User is on Assignment  Google form page
    When  Assignment_User clicks clear form button after entering all questions and mail id
    Then  Assignment_The Assignment Google form cleared successfully

  @user
  Scenario:  Assignment_User clicks Switch account
    Given  Assignment_User is on Assignment  Google form page
    When  Assignment_User clicks Switch account link
    Then  Assignment_User should be switched over the account Successfully

  #deletAssignment
  @user @admin
  Scenario:  Assignment_Admin/User clicks delete button
    Given  Assignment_Admin/User/Staff is on Manage Assignment page
    When  Assignment_Admin/User clicks on delete button
    Then  Assignment_Admin/User should see a message as "Staff only have access"

  @staff
  Scenario:  Assignment_Staff clicks delete button
    Given  Assignment_Staff is on Manage Assignment page
    When  Assignment_Staff clicks on delete button
    Then  Assignment_Staff should see a Delete Confirmation window

  @staff
  Scenario:  Assignment_Staff click Yes in Delete confirmation window
    Given  Assignment_Staff is on Delete Confirmation window
    When  Assignment_Staff clicks Yes
    Then  Assignment_Staff Should see message as "Assignment Deleted Successfully"

  @staff
  Scenario:  Assignment_Staff click No in Delete confirmation window
    Given  Assignment_Staff is on Delete Confirmation window
    When  Assignment_Staff clicks No
    Then  Assignment_Confirmation delete window should be closed successfully

  #deleteMultipleAssignments
  @user @admin @staff
  Scenario:  Assignment_Admin/User/Staff Validate Disabled delete button
    Given  Assignment_Admin/User/Staff is on Assignments page
    When  Assignment_Admin/User/Staff clicks on delete button on the top left
    Then  Assignment_Admin/User/Staff/ should see a disabled delete button

  @user @admin
  Scenario:  Assignment_Delete Multiple Assignment Functionalty
    Given  Assignment_Admin/User is on Assignments page
    When  Assignment_Admin/User clicks delete button on the top after selecting multiple checkbox
    Then  Assignment_Admin/User should see a message as "Staff only have access"

  @staff
  Scenario:  Assignment_Staff  validate delete button on the top left
    Given  Assignment_Staff is on Assignments page
    When  Assignment_Staff clicks delete button on the top aftr selecting multiple checkbox
    Then  Assignment_Staff should see a  Delete confirm window

  @staff
  Scenario:  Assignment_Staff click Yes in Delete confirmation window
    Given  Assignment_Staff is on Assignments page
    When  Assignment_Staff clicks Yes
    Then  Assignment_Staff Should see message as "All Assignments are deleted Successfully"

  @staff
  Scenario:  Assignment_Staff click No in Delete confirmation window
    Given  Assignment_Staff is on Assignments page
    When  Assignment_Staff clicks No
    Then  Assignment_Confirmation delete window should be closed successfully

  #checkbox
  @admin
  Scenario:  Assignment_Admin validate check box on the left side to the Assignment Name
    Given  Assignment_Admin is on Manage Assignment page
    When  Assignment_Admin clicks check box on the left side to the Assignment Name
    Then  Assignment_Admin should see a warning message "Admin dont have access  "

  @user @staff
  Scenario:  Assignment_User/Staff validate check box on the left side to the Assignment Name
    Given  Assignment_User/Staff is on Manage Assignment page
    When  Assignment_User/Staff clicks individual checkbox button
    Then  Assignment_User/Staff should see a enabled delete button on the top left
