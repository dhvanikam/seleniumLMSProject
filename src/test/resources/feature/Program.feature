@Program
Feature: Check the  Program page Functionality

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
       
  #Background: Admin/User/Staff logged on to LMS website
  # Given Admin is on LMS website
  #Feature: Header Validation
  @user @admin @staff
  Scenario: Program_Validating the Manage Program Header
    When Program_Admin/User/Staff is on Manage Program page
    Then Program_Admin/User/Staff see header text as "Manage Program"

  #Feature: Footer Validation
  @user @admin @staff
  Scenario: Program_Validating the Manage Program Footer
    When Program_Admin/User/Staff is on Manage Program page
    Then Program_Admin/User/Staff see Footer text as "In total there are 9 programs"

  #Feature: Paginator Validation
  @user @admin @staff
  Scenario: Program_Validating the Manage Program Paginator
    When Program_Admin/User/Staff is on Manage Program page
    Then Program_Admin/User/Staff see Paginator text as "Showing 1 to 5 of 9 entries"

  @user @admin @staff
  Scenario: Program_Verify Paginator -next button on the Program page
    Given Program_Admin/User/Staff is on A Manage Program page
    When Program_Admin/User/Staff Clicks on Enabled paginator -next button
    Then Program_Admin/User/Staff see Paginator text as "Showing 6 to 9 of 9 entries"

  @user @admin @staff
  Scenario: Program_Verify Paginator -prev button on the Program page
    Given Program_Admin/User/Staff is on A Manage Program page
    When Program_Admin/User/Staff Clicks on Enabled paginator -prev button
    Then Program_Admin/User/Staff see Paginator text as "Showing 1 to 5 of 9 entries"

  @user @admin @staff
  Scenario: Program_Verify Paginator -last button on the Program page
    Given Program_Admin/User/Staff is on A Manage Program page
    When Program_Admin/User/Staff Clicks on Enabled paginator -last button
    Then Program_Admin/User/Staff see Page number navigated to '2'

  @user @admin @staff
  Scenario: Program_Verify Paginator -first button on the Program page
    Given Program_Admin/User/Staff is on A Manage Program page
    When Program_Admin/User/Staff Clicks on Enabled paginator -first button
    Then Program_Admin/User/Staff see Page number navigated to '1'

  #Feature: Search TextBox Functionality
  @user @admin @staff
  Scenario: Program_Validate Search Feature
    When Program_Admin/User/Staff is on Manage Program page
    Then Program_Admin/User/Staff see the Search Text box has text as "Search".

  @user @admin @staff
  Scenario: Program_Search by  Program Name
    Given Program_Admin/User/Staff is on A Manage Program page
    When Program_Admin/User/Staff enters Program Name  as "SDETtest" to be searched
    Then Program_Entries for the searched Program Name as "SDETtest" are shown.

  @user @admin @staff
  Scenario: Program_Search by Program Description
    Given Program_Admin/User/Staff is on A Manage Program page
    When Program_Admin/User/Staff enters Program Description as "machine learning" to be searched
    Then Program_Entries for the searched Program Description as "machine learning" are shown.

  @user @admin @staff
  Scenario: Program_Search by  Program Status
    Given Program_Admin/User/Staff is on A Manage Program page
    When Program_Admin/User/Staff enters Program Status as "active" to be searched
    Then Program_Entries for the searched Program Status as "active" are shown.

  #Feature:Ascending order Functionality
  @user @admin @staff
  Scenario: Program_Verify Program Name are displayed in Ascending order
    Given Program_Admin/User/Staff is on A Manage Program page
    When Program_Admin/User/Staff Clicks on Program Name Ascending Arrow
    Then Program_Admin/User/Staff see the Program Name displayed in Ascending order

  @user @admin @staff
  Scenario: Program_Verify Program Description are displayed in Ascending order
    Given Program_Admin/User/Staff is on A Manage Program page
    When Program_Admin/User/Staff Clicks on Program Description Ascending Arrow
    Then Program_Admin/User/Staff see the Program Description displayed in Ascending order

  @user @admin @staff
  Scenario: Program_Verify Program Status are displayed in Ascending order
    Given Program_Admin/User/Staff is on A Manage Program page
    When Program_Admin/User/Staff Clicks on Program Status Ascending Arrow
    Then Program_Admin/User/Staff see the Program Status displayed in Ascending order

  #Feature: Descending order Functionality
  @user @admin @staff
  Scenario: Program_Verify Program Name are displayed in Descending order
    Given Program_Admin/User/Staff is on A Manage Program page
    When Program_Admin/User/Staff Clicks on Program Name Descending Arrow
    Then Program_Admin/User/Staff see the Program Name displayed in Descending order

  @user @admin @staff
  Scenario: Program_Verify Program Description are displayed in Descending order
    Given Program_Admin/User/Staff is on A Manage Program page
    When Program_Admin/User/Staff Clicks on Program Description Descending Arrow
    Then Program_Admin/User/Staff see the Program Description displayed in Descending order

  @user @admin @staff
  Scenario: Program_Verify Program Status are displayed in Descending order
    Given Program_Admin/User/Staff is on A Manage Program page
    When Program_Admin/User/Staff Clicks on Program Status Descending Arrow
    Then Program_Admin/User/Staff see the Program Status displayed in Descending order

  #Feature: Number of rows in a Table
  @user @admin @staff
  Scenario: Program_Validate Number of rows in a Table
    When Program_Admin/User/Staff is on Manage Program page
    Then Program_Admin/User/Staff counts number of rows as 5 in a table

  #Feature:Add a New Program Functionality
  #for admin only
  @admin
  Scenario: Program_Validate Add a new Program button
    Given Program_Admin is on Manage Program page as "admin"
    When Program_Admin clicks on A New Program button
    Then Program_Admin see header text as "Program Detail"

  @admin
  Scenario Outline: Program_Admin created a new program with all validate criterias
    Given Program_Admin clicks on A New Program button
    When Program_Admin Enter "<Name>","<Description>" and "<Message>"
    Then Program_Admin clicks on Save button

    Examples: 
      | Name            | Description    | Message                 |
      | SDET Automation | LMS Automation | New Program Created     |
      | SDET Automation |                | Description is required |
      |                 | LMS Automation | Name is required        |
      |                 |                | Name is required        |

  @admin
  Scenario: Program_Select only Status in Program Details window
    Given Program_Admin clicks on A New Program button
    When Program_Admin clicks on Save button after selecting Status alone
    Then Program_Admin see Error message "Name is required"

  @admin
  Scenario: Program_Click on Cancel button in Program Details window
    Given Program_Admin clicks on A New Program button
    When Program_Admin clicks on Cancel button
    Then Program_Admin see a Program Details window getting closed

  #for admin/user/staff
  @user @admin @staff
  Scenario: Program_Verify Added a New Program Name
    Given Program_Admin/User/Staff is on A Manage Program page
    When Program_Admin/User/Staff Enters newly added Program Name as "SDET Automation" in Search
    Then Program_Entry for the newly added Program Name as "SDET Automation" is shown

  @user @staff
  Scenario: Program_User/Staff Validate Add A New Program button
    #Background Given User/Staff Logged on to LMS Website
    Given Program_User/Staff is on Manage Program page as "user" or "staff"
    When Program_User/Staff clicks on  A New Program button
    Then Program_User/Staff see a Error message "Only Admin have Access"

  #Feature Edit Functionality
  #only for Admin Except the last  two Scenario
  @admin
  Scenario: Program_Validate Edit button in Program Details window
    Given Program_Admin is on Manage Program page as "admin"
    When Program_Admin Clicks on the Edit button
    Then Program_Admin see header text as "Program Details"

  @admin
  Scenario: Program_Edit Program Name in Program Details window
    Given Program_Admin Clicks on Edit button
    When Program_Admin Clicks on Save button after updating Name as "Test Edit"
    Then Program_Admin see Success message "Updated Program Name"

  @admin
  Scenario: Program_Edit Program Description in Program Details window
    Given Program_Admin Clicks on Edit button
    When Program_Admin Clicks on Save button after updating Description as "Description Edit"
    Then Program_Admin see Success message "Updated Program Description"

  @admin
  Scenario: Program_Edit Program Status in Program Details window
    Given Program_Admin Clicks on Edit button
    When Program_Admin Clicks on Save button after updating Status
    Then Program_Admin see Success message "Updated Status"

  @admin
  Scenario: Program_Clicks on Cancel button in Program Details window
    Given Program_Admin Clicks on Edit button
    When Program_Admin clicks on Cancel button
    Then Program_Admin see a Program Details window getting closed

  #for Admin/staff/user
  @user @admin @staff
  Scenario: Program_Verifys Edited Program Name/Program Description
    Given Program_Admin/User/Staff is on A Manage Program page
    When Program_Admin/User/Staff Enters edited Program Name as "Test Edit" in Search
    Then Program_Entry for edited Program Name as "Test Edit" is shown

  #for User/Staff only
  @user @staff
  Scenario: Program_User/Staff Validate Edit button
    Given Program_User/Staff is on Manage Program page as "user" or "staff"
    When Program_User/Staff Clicks on Edit buttton as "user" or "staff"
    Then Program_User/Staff see a Error message "Only Admin have Access"

  #Feature: Delete Functionality
  #For Admin only
  @admin
  Scenario: Program_Verify Delete Functionality
    Given Program_Admin is on Manage Program page as "admin"
    When Program_Admin Clicks on any Delete button located on right side
    Then Program_Admin see header text as "Delete Confirm"

  @admin
  Scenario: Program_Click on Yes button in Delete Confirm window
    Given Program_Admin Clicks on any Delete button located on the right side
    When Program_Admin Clicks on Yes button
    Then Program_Admin see Success message "Program Deleted Successfully"

  @admin
  Scenario: Program_Click on No button in Delete Confirm window
    Given Program_Admin Clicks on any Delete button located on the right side
    When Program_Admin Clicks on No button
    Then Program_Admin can see Program Name as "SDET Automation" not deleted

  #for Admin/User/Staff
  @user @admin @staff
  Scenario: Program_Validate Deleted Program Name
    Given Program_Admin/User/Staff is on A Manage Program page
    When Program_Admin/User/Staff Enters deleted Program Name as "Test Edit" in Search
    Then Program_Admin/User/Staff finds no results

  #for User/Staff
  @user @staff
  Scenario: Program_User/Staff validates Delete button
    Given Program_User/Staff is on Manage Program page as "user" or "staff"
    When Program_User/Staff Clicks on Delete button as "user" or "staff"
    Then Program_User/Staff see a Error message "Only Admin have Access"

  #Feature: Delete Multiple Records Functionality
  @user @admin @staff
  Scenario: Program_Verify the state of Delete button on left hand side
    When Program_Admin/User/Staff is on Manage Program page
    Then Program_Admin/User/Staff see the Delete button on the top left hand side as Disabled

  @user @admin @staff
  Scenario: Program_Validates Multiple Program selection
    Given Program_Admin/User/Staff is on A Manage Program page
    When Program_Admin/User/Staff selects more than one Program Name using checkbox
    Then Program_Admin/User/Staff see the Delete button on the top left hand side as Enabled

  @user @admin @staff
  Scenario: Program_Verifies Deletion of multiple records
    Given Program_Admin/User/Staff is on A Manage Program page
    When Program_Admin/User/Staff Clicks on Enabled Delete button on the top left hand side
    Then Program_Admin see header text as "Delete Confirm"

  @admin
  Scenario: Program_Click on Yes button in Delete Confirm window
    Given Program_Admin Clicks on Enabled Delete button after selecting more than one Program Name
    When Program_Admin Clicks on Yes button
    Then Program_Admin see Success message "Program Deleted Successfully"

  @admin
  Scenario: Program_Click on No button in Delete Confirm window
    Given Program_Admin Clicks on Enabled Delete button after selecting more than one Program Name
    When Program_Admin Clicks on No button
    Then Program_Admin can see Program Names not deleted

  @user @admin @staff
  Scenario: Program_Verify Deleted Program Names
    Given Program_Admin/User/Staff is on A Manage Program page
    When Program_Admin/User/Staff Enters deleted Program Names as "Test Edit" and as "Test Delete" in Search
    Then Program_Admin/User/Staff finds no result

  #User/Staff on LMS Website only
  @user @staff
  Scenario: Program_Deletion of Multiple Records
    Given Program_User/Staff selects more than one Program Name using checkbox as "user" or "staff"
    When Program_User/Staff Clicks on Enabled Delete button on the top left hand side
    Then Program_User/Staff see a Error message "Only Admin have Access"

  #Feature: CheckBox Functionality
  @user @admin @staff
  Scenario: Program_Verify CheckBox Functionality
    Given Program_Admin/User/Staff is on A Manage Program page
    When Program_Admin/User/Staff Selects First checkbox left to Program Name
    Then Program_Admin/User/Staff see all the checkboxes in the Program page get selected
