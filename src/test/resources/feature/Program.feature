@Program
Feature: Check the  Program page Functionality

  @user
  Scenario: User Login
    Given user logged on to LMS website
    When user enter user as "User" and Password as "User"
    Then click on login button

  @admin
  Scenario: Admin Login
    Given admin logged on to LMS website
    When admin enter user as "Admin" and Password as "Admin" and code as "12345"
    Then click on login button

  @staff
  Scenario: Staff Login
    Given staff logged on to LMS website
    When staff enter user as "Staff" and Password as "Staff" and code as "54321"
    Then click on login button

  #Background: Admin/User/Staff logged on to LMS website
  # Given Admin is on LMS website
  #Feature: Header Validation
  @user @admin @staff
  Scenario: Validating the Manage Program Header
    When Admin/User/Staff is on Manage Program page
    Then Admin/User/Staff see header text as "Manage Program"

  #Feature: Footer Validation
  @user @admin @staff
  Scenario: Validating the Manage Program Footer
    When Admin/User/Staff is on Manage Program page
    Then Admin/User/Staff see Footer text as "In total there are 9 programs"

  #Feature: Paginator Validation
  @user @admin @staff
  Scenario: Validating the Manage Program Paginator
    When Admin/User/Staff is on Manage Program page
    Then Admin/User/Staff see Paginator text as "Showing 1 to 5 of 9 entries"

  @user @admin @staff
  Scenario: Verify Paginator -next button on the Program page
    Given Admin/User/Staff is on A Manage Program page
    When Admin/User/Staff Clicks on Enabled paginator -next button
    Then Admin/User/Staff see Paginator text as "Showing 6 to 9 of 9 entries"

  @user @admin @staff
  Scenario: Verify Paginator -prev button on the Program page
    Given Admin/User/Staff is on A Manage Program page
    When Admin/User/Staff Clicks on Enabled paginator -prev button
    Then Admin/User/Staff see Paginator text as "Showing 1 to 5 of 9 entries"

  @user @admin @staff
  Scenario: Verify Paginator -last button on the Program page
    Given Admin/User/Staff is on A Manage Program page
    When Admin/User/Staff Clicks on Enabled paginator -last button
    Then Admin/User/Staff see Page number navigated to '2'

  @user @admin @staff
  Scenario: Verify Paginator -first button on the Program page
    Given Admin/User/Staff is on A Manage Program page
    When Admin/User/Staff Clicks on Enabled paginator -first button
    Then Admin/User/Staff see Page number navigated to '1'

  #Feature: Search TextBox Functionality
  @user @admin @staff
  Scenario: Validate Search Feature
    When Admin/User/Staff is on Manage Program page
    Then Admin/User/Staff see the Search Text box has text as "Search".

  @user @admin @staff
  Scenario: Search by  Program Name
    Given Admin/User/Staff is on A Manage Program page
    When Admin/User/Staff enters Program Name  as "SDETtest" to be searched
    Then Entries for the searched Program Name as "SDETtest" are shown.

  @user @admin @staff
  Scenario: Search by Program Description
    Given Admin/User/Staff is on A Manage Program page
    When Admin/User/Staff enters Program Description as "machine learning" to be searched
    Then Entries for the searched Program Description as "machine learning" are shown.

  @user @admin @staff
  Scenario: Search by  Program Status
    Given Admin/User/Staff is on A Manage Program page
    When Admin/User/Staff enters Program Status as "active" to be searched
    Then Entries for the searched Program Status as "active" are shown.

  #Feature:Ascending order Functionality
  @user @admin @staff
  Scenario: Verify Program Name are displayed in Ascending order
    Given Admin/User/Staff is on A Manage Program page
    When Admin/User/Staff Clicks on Program Name Ascending Arrow
    Then Admin/User/Staff see the Program Name displayed in Ascending order

  @user @admin @staff
  Scenario: Verify Program Description are displayed in Ascending order
    Given Admin/User/Staff is on A Manage Program page
    When Admin/User/Staff Clicks on Program Description Ascending Arrow
    Then Admin/User/Staff see the Program Description displayed in Ascending order

  @user @admin @staff
  Scenario: Verify Program Status are displayed in Ascending order
    Given Admin/User/Staff is on A Manage Program page
    When Admin/User/Staff Clicks on Program Status Ascending Arrow
    Then Admin/User/Staff see the Program Status displayed in Ascending order

  #Feature: Descending order Functionality
  @user @admin @staff
  Scenario: Verify Program Name are displayed in Descending order
    Given Admin/User/Staff is on A Manage Program page
    When Admin/User/Staff Clicks on Program Name Descending Arrow
    Then Admin/User/Staff see the Program Name displayed in Descending order

  @user @admin @staff
  Scenario: Verify Program Description are displayed in Descending order
    Given Admin/User/Staff is on A Manage Program page
    When Admin/User/Staff Clicks on Program Description Descending Arrow
    Then Admin/User/Staff see the Program Description displayed in Descending order

  @user @admin @staff
  Scenario: Verify Program Status are displayed in Descending order
    Given Admin/User/Staff is on A Manage Program page
    When Admin/User/Staff Clicks on Program Status Descending Arrow
    Then Admin/User/Staff see the Program Status displayed in Descending order

  #Feature: Number of rows in a Table
  @user @admin @staff
  Scenario: Validate Number of rows in a Table
    When Admin/User/Staff is on Manage Program page
    Then Admin/User/Staff counts number of rows as 5 in a table

  #Feature:Add a New Program Functionality
  #for admin only
  @admin
  Scenario: Validate Add a new Program button
    Given Admin is on Manage Program page
    When Admin clicks on A New Program button
    Then Admin see header text as "Program Detail"

  @admin
  Scenario Outline: Admin created a new program with all validate criterias
    Given Admin clicks on A New Program button
    When Admin Enter "<Name>","<Description>" and "<Message>"
    Then Admin clicks on Save button

    Examples: 
      | Name            | Description    | Message                 |
      | SDET Automation | LMS Automation | New Program Created     |
      | SDET Automation |                | Description is required |
      |                 | LMS Automation | Name is required        |
      |                 |                | Name is required        |

  @admin
  Scenario: Select only Status in Program Details window
    Given Admin clicks on A New Program button
    When Admin clicks on Save button after selecting Status alone
    Then Admin see Error message "Name is required"

  @admin
  Scenario: Click on Cancel button in Program Details window
    Given Admin clicks on A New Program button
    When Admin clicks on Cancel button
    Then Admin see a Program Details window getting closed

  #for admin/user/staff
  @user @admin @staff
  Scenario: Verify Added a New Program Name
    Given Admin/User/Staff is on A Manage Program page
    When Admin/User/Staff Enters newly added Program Name as "SDET Automation" in Search
    Then Entry for the newly added Program Name as "SDET Automation" is shown

  @user @staff
  Scenario: User/Staff Validate Add A New Program button
    #Background Given User/Staff Logged on to LMS Website
    Given User/Staff is on Manage Program page
    When User/Staff clicks on  A New Program button
    Then User/Staff see a Error message "Only Admin have Access"

  #Feature Edit Functionality
  #only for Admin Except the last  two Scenario
  @admin
  Scenario: Validate Edit button in Program Details window
    Given Admin is on Manage Program page
    When Admin Clicks on the Edit button
    Then Admin see header text as "Program Details"

  @admin
  Scenario: Edit Program Name in Program Details window
    Given Admin Clicks on Edit button
    When Admin Clicks on Save button after updating Name as "Test Edit"
    Then Admin see Success message "Updated Program Name"

  @admin
  Scenario: Edit Program Description in Program Details window
    Given Admin Clicks on Edit button
    When Admin Clicks on Save button after updating Description as "Description Edit"
    Then Admin see Success message "Updated Program Description"

  @admin
  Scenario: Edit Program Status in Program Details window
    Given Admin Clicks on Edit button
    When Admin Clicks on Save button after updating Status
    Then Admin see Success message "Updated Status"

  @admin
  Scenario: Clicks on Cancel button in Program Details window
    Given Admin Clicks on Edit button
    When Admin clicks on Cancel button
    Then Admin see a Program Details window getting closed

  #for Admin/staff/user
  @user @admin @staff
  Scenario: Verifys Edited Program Name/Program Description
    Given Admin/User/Staff is on A Manage Program page
    When Admin/User/Staff Enters edited Program Name as "Test Edit" in Search
    Then Entry for edited Program Name as "Test Edit" is shown

  #for User/Staff only
  @user @staff
  Scenario: User/Staff Validate Edit button
    Given User/Staff is on Manage Program page
    When User/Staff Clicks on Edit buttton
    Then User/Staff see a Error message "Only Admin have Access"

  #Feature: Delete Functionality
  #For Admin only
  @admin
  Scenario: Verify Delete Functionality
    Given Admin is on Manage Program page
    When Admin Clicks on any Delete button located on right side
    Then Admin see header text as "Delete Confirm"

  @admin
  Scenario: Click on Yes button in Delete Confirm window
    Given Admin Clicks on any Delete button located on the right side
    When Admin Clicks on Yes button
    Then Admin see Success message "Program Deleted Successfully"

  @admin
  Scenario: Click on No button in Delete Confirm window
    Given Admin Clicks on any Delete button located on the right side
    When Admin Clicks on No button
    Then Admin can see Program Name as "SDET Automation" not deleted

  #for Admin/User/Staff
  @user @admin @staff
  Scenario: Validate Deleted Program Name
    Given Admin/User/Staff is on A Manage Program page
    When Admin/User/Staff Enters deleted Program Name as "Test Edit" in Search
    Then Admin/User/Staff finds no results

  #for User/Staff
  @user @staff
  Scenario: User/Staff validates Delete button
    Given User/Staff is on Manage Program page
    When User/Staff Clicks on Delete button
    Then User/Staff see a Error message "Only Admin have Access"

  #Feature: Delete Multiple Records Functionality
  @user @admin @staff
  Scenario: Verify the state of Delete button on left hand side
    When Admin/User/Staff is on Manage Program page
    Then Admin/User/Staff see the Delete button on the top left hand side as Disabled

  @user @admin @staff
  Scenario: Validates Multiple Program selection
    Given Admin/User/Staff is on A Manage Program page
    When Admin/User/Staff selects more than one Program Name using checkbox
    Then Admin/User/Staff see the Delete button on the top left hand side as Enabled

  @user @admin @staff
  Scenario: Verifies Deletion of multiple records
    Given Admin/User/Staff is on A Manage Program page
    When Admin/User/Staff Clicks on Enabled Delete button on the top left hand side
    Then Admin see header text as "Delete Confirm"

  @admin
  Scenario: Click on Yes button in Delete Confirm window
    Given Admin Clicks on Enabled Delete button after selecting more than one Program Name
    When Admin Clicks on Yes button
    Then Admin see Success message "Program Deleted Successfully"

  @admin
  Scenario: Click on No button in Delete Confirm window
    Given Admin Clicks on Enabled Delete button after selecting more than one Program Name
    When Admin Clicks on No button
    Then Admin can see Program Names not deleted

  @user @admin @staff
  Scenario: Verify Deleted Program Names
    Given Admin/User/Staff is on A Manage Program page
    When Admin/User/Staff Enters deleted Program Names as "Test Edit" and as "Test Delete" in Search
    Then Admin/User/Staff finds no result

  #User/Staff on LMS Website only
  @user @staff
  Scenario: Deletion of Multiple Records
    Given User/Staff selects more than one Program Name using checkbox
    When User/Staff Clicks on Enabled Delete button on the top left hand side
    Then User/Staff see a Error message "Only Admin have Access"

  #Feature: CheckBox Functionality
  @user @admin @staff
  Scenario: Verify CheckBox Functionality
    Given Admin/User/Staff is on A Manage Program page
    When Admin/User/Staff Selects First checkbox left to Program Name
    Then Admin/User/Staff see all the checkboxes in the Program page get selected
