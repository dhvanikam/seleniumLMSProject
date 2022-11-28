Feature: Check the User Page Functionality

  Background: Admin/User/Staff logged on to LMS website
    Given Admin is on LMS website

  #header validation
  Scenario: Validate the Manage page heading
    When Admin/User/Staff is on the Manage user page after clicking User Tab
    Then Admin/User/Staff should see the page heading as "Manage User"

  #pagination
  Scenario: Validate the presence of pagination
    When Admin/User/Staff is on the Manage user page after clicking User Tab
    Then Admin/User/Staff see Paginator text as "Showing 1 to 4 of 4 entries"

  Scenario: Verify Paginator -next button on the Program page
    Given Admin/User/Staff is on the Manage user page after clicking User Tab
    When Admin/User/Staff Clicks on disabled paginator -next button
    Then Admin/User/Staff see Exceptin text as "Button is disabled"

  Scenario: Verify Paginator -prev button on the Program page
    Given Admin/User/Staff is on Manage Program page
    When Admin/User/Staff Clicks on disabled paginator -prev button
    Then Admin/User/Staff see Exceptin text as "Button is disabled"

  Scenario: Verify Paginator -last button on the Program page
    Given Admin/User/Staff is on Manage Program page
    When Admin/User/Staff Clicks on disabled paginator -last button
    Then Admin/User/Staff see Exceptin text as "Button is disabled"

  Scenario: Verify Paginator -first button on the Program page
    Given Admin/User/Staff is on Manage Program page
    When Admin/User/Staff Clicks on disabled paginator -first button
    Then Admin/User/Staff see Exceptin text as "Button is disabled"

  #footer validation
  Scenario: Validating table footer
    When Admin/User/Staff is on the Manage user page after clicking User Tab
    Then Admin/User/Staffshould see the table footer as "In total there are 4 users".

  #Feature: Search TextBox Functionality
  Scenario: Validate Search Feature
    When Admin/User/Staff is on Manage user page
    Then Admin/User/Staff see the Search Text box has text as "Search".

  Scenario: Search by  ID
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff enters ID  as "U001" to be searched
    Then Entries for the searched ID as "U001" are shown.

  Scenario: Search by  Name
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff enters Name as "John Dove" to be searched
    Then Entries for the searched Name as "John Dove" are shown.

  Scenario: Search by EmailID
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff enters EmailID as "david@abc.com" to be searched
    Then Entries for the searched EmailID as "david@abc.com" are shown.

  Scenario: Search by  Contact Number
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff enters Contact  as "124360401" to be searched
    Then Entries for the searched Contact as "124360401" are shown.

  Scenario: Search by  Batch
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff enters Batch  as "SDET30" to be searched
    Then Entries for the searched Batch as "SDET30" are shown.

  Scenario: Search by  Skills
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff enters Skills as "JAVA" to be searched
    Then Entries for the searched Skills as "JAVA" are shown.

  #Feature:Ascending order Functionality
  Scenario: Verify ID are displayed in Ascending order
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Clicks on ID Ascending Arrow
    Then Admin/User/Staff see the ID displayed in Ascending order

  Scenario: Verify Name are displayed in Ascending order
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Clicks on  Name Ascending Arrow
    Then Admin/User/Staff see the Name displayed in Ascending order

  Scenario: Verify  EmailID are displayed in Ascending order
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Clicks on EmailID Ascending Arrow
    Then Admin/User/Staff see the EmailID displayed in Ascending order

  Scenario: Verify  Contact Number are displayed in Ascending order
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Clicks on Contact Ascending Arrow
    Then Admin/User/Staff see the Contact displayed in Ascending order

  Scenario: Verify  Batch are displayed in Ascending order
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Clicks on Batch Ascending Arrow
    Then Admin/User/Staff see the Batch displayed in Ascending order

  Scenario: Verify  Skill are displayed in Ascending order
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Clicks on Skill Ascending Arrow
    Then Admin/User/Staff see the Skill displayed in Ascending order

  #Feature:Descending order Functionality
  Scenario: Verify ID are displayed in Descending order
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Clicks on ID Descending Arrow
    Then Admin/User/Staff see the ID displayed in Descending order

  Scenario: Verify Name are displayed in Descending order
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Clicks on  Name Descending Arrow
    Then Admin/User/Staff see the Name displayed in Descending order

  Scenario: Verify  EmailID are displayed in Descending order
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Clicks on EmailID Descending Arrow
    Then Admin/User/Staff see the EmailID displayed in Descending order

  Scenario: Verify  Contact Number are displayed in Descending order
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Clicks on Contact Descending Arrow
    Then Admin/User/Staff see the Contact displayed in Descending order

  Scenario: Verify  Batch are displayed in Descending order
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Clicks on Batch Descending Arrow
    Then Admin/User/Staff see the Batch displayed in Descending order

  Scenario: Verify  Skill are displayed in Descending order
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Clicks on Skill Descending Arrow
    Then Admin/User/Staff see the Skill displayed in Descending order

  #add new user functionality
  Scenario: Verify the functionality of Add new user button
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks Add New User
    Then Admin/User/Staff should see the "User details" dialog box

  Scenario: Add a New User  successfully with Valid credentials
    Given Admin/User/Staff is on the "User details" pop up window
    When Admin/User/Staff enters following  information
      | First name    | "numpy"                |
      | Middle name   | "ninja"                |
      | Last name     | "star"                 |
      | Email address | "numpyninja@gmail.com" |
      | Phone no      | "123456789"            |
      | Address       | "123 lane"             |
      | City          | "delhi"                |
      | Postal code   | "12345"                |
      | Program       | "abcd"                 |
      | UG Program    | "edff"                 |
      | PG Program    | "hihgg"                |
      | Skill         | "JAVA"                 |
      | Experience    | "2 years"              |
      | Visa Status   | "EAD"                  |
      | Batch         | "SDET85"               |
      | Comments      | "wonderful"            |
    When Admin/User/Staff selects the respective State Name from the DropBox
    Then The State Name will be displayed
    When Admin/User/Staff selects the respective User role from the DropBox
    Then The User role will be displayed
    When Admin/User/Staff Clicks on Submit button after entering all valid details
    Then Admin/User/Staff successfully added a new User

  Scenario: Invalid User Details
    Given Admin/User/Staff is on the "User details" pop up window
    When Admin/User/Staff enters Submit button with all fields empty
    Then Admin/User/Staff should get a message "Enters all fields"
    When Admin/User/Staff clicks Submit button with invalid First Name
    Then Admin/User/Staff should get a message "Enter valid First Name !"
    When Admin/User/Staff clicks Submit button with invalid Middle Name
    Then Admin/User/Staff should get a message "Enter valid Middle Name"
    When Admin/User/Staff clicks Submit button with invalid Last Name
    Then Admin/User/Staff should get a message "Enter valid Last Name"
    When Admin/User/Staff clicks Submit button with invalid EmailID
    Then Admin/User/Staff should get a message "Enter valid EmailID"
    When Admin/User/Staff clicks Submit button with invalid Phone no
    Then Admin/User/Staff should get a message "Enter valid Phone no"
    When Admin/User/Staff clicks Submit button with invalid Address
    Then Admin/User/Staff should get a message "Enter valid Address"
    When Admin/User/Staff clicks Submit button with invalid City
    Then Admin/User/Staff should get a message "Enter valid City"
    When Admin/User/Staff clicks Submit button with invalid Postal code
    Then Admin/User/Staff should get a message "Enter valid Postal code"
    When Admin/User/Staff clicks Submit button with invalid Program
    Then Admin/User/Staff should get a message "Enter valid Program"
    When Admin/User/Staff clicks Submit button with invalid UG Program
    Then Admin/User/Staff should get a message "Enter valid UG Program"
    When Admin/User/Staff clicks Submit button with invalid PG Program
    Then Admin/User/Staff should get a message "Enter valid PG Program"
    When Admin/User/Staff clicks Submit button with invalid Skill
    Then Admin/User/Staff should get a message "Enter valid Skill"
    When Admin/User/Staff clicks Submit button with invalid Experience
    Then Admin/User/Staff should get a message "Enter valid Experience"
    When Admin/User/Staff clicks Submit button with invalid Visa Status
    Then Admin/User/Staff should get a message "Visa Status"
    When Admin/User/Staff clicks Submit button with invalid Batch
    Then Admin/User/Staff should get a message "Enter valid Batch"
    When Admin/User/Staff clicks Submit button with invalid Comments
    Then Admin/User/Staff should get a message "Enter valid Comments"

  #Cancel button
  Scenario: Verify the presence of Cancel button in User Details window
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks Add new user button
    Then Admin/User/Staff should see a button with text as Cancel  in User Details window

  Scenario: Validate Fucntionality of Cancel button
    Given Admin/User/Staff is on User Details window
    When Admin/User/Staff clicks cancel button
    Then Admin/User/Staff  see User Details window getting  closed

  #Close(x) icon
  Scenario: Verify the presence of Cancel(x) icon in user detais window
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks Add new user button
    Then Admin/User/Staff should see a cancel(x) icon

  Scenario: Functionality of Close(x) icon
    Given Admin/User/Staff is on User Details details window
    When Admin/User/Staff clicks close(X) icon
    Then User Details window should be closed

  #Submit button
  Scenario: Verify the presence of Submit button in User Details window
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks Add new user button
    Then Admin/User/Staff should see a button with text as Submit in user details window

  #Feature Edit Functionality
  Scenario: Validate Edit button in User Details window
    Given Admin is on Manage user page
    When Admin Clicks on Edit button
    Then Admin see header text as "User Details"

  Scenario: Edit Name in User Details window
    Given Admin Clicks on Edit button
    When Admin Clicks on Save button after updating First name as "numpy" and Last name as "warriors"
    Then Admin see Success message "Updated Name "

  Scenario: Edit EmailID in User Details window
    Given Admin Clicks on Edit button
    When Admin Clicks on Save button after updating EmailID as "ninjastar@gmail.com"
    Then Admin see Success message "Updated EmailID "

  Scenario: Edit Contact no in User Details window
    Given Admin Clicks on Edit button
    When Admin Clicks on Save button after updating Contact no as "1345678890"
    Then Admin see Success message "Updated Contact no "

  Scenario: Edit Batch in User Details window
    Given Admin Clicks on Edit button
    When Admin Clicks on Save button after updating Batch as "SDET84"
    Then Admin see Success message "Updated Batch"

  Scenario: Edit Skill in User Details window
    Given Admin Clicks on Edit button
    When Admin Clicks on Save button after updating Skill as "SQL"
    Then Admin see Success message "Updated Skill "

  Scenario: Verifys Edited  Name/EmailID
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Enters edited Name as "numpy warriors" in Search
    Then Entry for edited  Name as "numpy warriors" is shown

  #Delete Functionality
  Scenario: Verify Delete Functionality
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Clicks on any Delete button located on the right side
    Then Admin/User/Staff see header text as "Delete Confirm"

  Scenario: Click on Yes button in Delete Confirm window
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Clicks on any Delete button located on the right side
    When Admin/User/Staff Clicks on Yes button
    Then Admin/User/Staff see Success message "User Deleted Successfully"

  Scenario: Click on No button in Delete Confirm window
    Given Admin/User/Staff Clicks on any Delete button located on the right side
    When Admin/User/Staff Clicks on No button
    Then Admin/User/Staff can see  Name as "John Dove" not deleted

  Scenario: Validate Deleted Program Name
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Enters deleted  Name as "John Dove" in Search
    Then Admin/User/Staff finds no results

  #Feature: Delete Multiple Records Functionality
  Scenario: Verify the state of Delete button on left hand side
    When Admin/User/Staff is on Manage user page
    Then Admin/User/Staff see the Delete button on the top left hand side as Disabled

  Scenario: Validates Multiple User selection
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff selects more than one Name using checkbox
    Then Admin/User/Staff see the Delete button on the top left hand side as Enabled

  Scenario: Verifies Deletion of multiple records
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff selects more than one Name using checkbox
    When Admin/User/Staff Clicks on Enabled Delete button on the top left hand side
    Then Admin see header text as "Delete Confirm"

  Scenario: Click on Yes button in Delete Confirm window
    Given Admin Clicks on Enabled Delete button after selecting more than one Name
    When Admin Clicks on Yes button
    Then Admin see Success message "User Deleted Successfully"

  Scenario: Click on No button in Delete Confirm window
    Given Admin Clicks on Enabled Delete button after selecting more than one Name
    When Admin Clicks on No button
    Then Admin can see  Names not deleted

  Scenario: Verify Deleted Names
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Enters deleted  Names in Search
    Then Admin/User/Staff finds no result

  #Feature: CheckBox Functionality
  Scenario: Verify CheckBox Functionality
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Selects First checkbox left to ID
    Then Admin/User/Staff see all the checkboxes in the Program page get selected
