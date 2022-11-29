@Manage_User 
Feature: Check the User Page Functionality

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

  #header validation
  @admin @user @staff 
  Scenario: Validate the Manage page heading
    When ManageUser_Admin/User/Staff is on the Manage user page after clicking User Tab
    Then ManageUser_Admin/User/Staff should see the page heading as "Manage User"
    
  #pagination
  @admin @user @staff 
  Scenario: Validate the presence of pagination
    When ManageUser_Admin/User/Staff is on the Manage user page after clicking User Tab
    Then ManageUser_Admin/User/Staff see Paginator text as "Showing 1 to 4 of 4 entries"
   
  @admin @user @staff 
  Scenario: Verify Paginator -last button on the Program page
    Given ManageUser_Admin/User/Staff is on Manage Program page
    Then ManageUser_Admin/User/Staff see pagination button are disabled


  #footer validation
  @admin @user @staff 
  Scenario: Validating table footer
    When ManageUser_Admin/User/Staff is on the Manage user page after clicking User Tab
    Then ManageUser_Admin/User/Staffshould see the table footer as "In total there are 4 users".

	#Search TextBox Functionality
	@admin @user @staff 
  Scenario: Validate Search Feature
    Given ManageUser_Admin/User/Staff is on Manage user page
    Then ManageUser_Admin/User/Staff see the Search Text box has text as "Search".

  @admin @user @staff 
  Scenario: Search by  ID
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff enters ID  as "U001" to be searched
    Then ManageUser_Entries for the searched ID as "U001" are shown.
    
 @admin @user @staff 
  Scenario: Search by  Name
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff enters Name as "John Dove" to be searched
    Then ManageUser_Entries for the searched Name as "John Dove" are shown.

@admin @user @staff 
  Scenario: Search by EmailID
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff enters EmailID as "david@abc.com" to be searched
    Then ManageUser_Entries for the searched EmailID as "david@abc.com" are shown.

@admin @user @staff 
  Scenario: Search by  Contact Number
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff enters Contact  as "124360401" to be searched
    Then ManageUser_Entries for the searched Contact as "124360401" are shown.

 @admin @user @staff 
  Scenario: Search by  Batch
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff enters Batch  as "SDET30" to be searched
    Then ManageUser_Entries for the searched Batch as "SDET30" are shown.

@admin @user @staff 
  Scenario: Search by  Skills
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff enters Skills as "JAVA" to be searched
    Then ManageUser_Entries for the searched Skills as "JAVA" are shown.

  #Ascending order Functionality
@admin @user @staff 
  Scenario: Verify ID are displayed in Ascending order
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff Clicks on ID Ascending Arrow
    Then ManageUser_Admin/User/Staff see the ID displayed in Ascending order

@admin @user @staff 
  Scenario: Verify Name are displayed in Ascending order
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff Clicks on  Name Ascending Arrow
    Then ManageUser_Admin/User/Staff see the Name displayed in Ascending order

@admin @user @staff 
  Scenario: Verify  EmailID are displayed in Ascending order
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff Clicks on EmailID Ascending Arrow
    Then ManageUser_Admin/User/Staff see the EmailID displayed in Ascending order

  @admin @user @staff 
  Scenario: Verify  Contact Number are displayed in Ascending order
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff Clicks on Contact Ascending Arrow
    Then ManageUser_Admin/User/Staff see the Contact displayed in Ascending order

  @admin @user @staff 
  Scenario: Verify  Batch are displayed in Ascending order
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff Clicks on Batch Ascending Arrow
    Then ManageUser_Admin/User/Staff see the Batch displayed in Ascending order

  @admin @user @staff 
  Scenario: Verify  Skill are displayed in Ascending order
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff Clicks on Skill Ascending Arrow
    Then ManageUser_Admin/User/Staff see the Skill displayed in Ascending order

#  Feature: Descending order Functionality
@admin @user @staff 
  Scenario: Verify ID are displayed in Descending order
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff Clicks on ID Descending Arrow
    Then ManageUser_Admin/User/Staff see the ID displayed in Descending order

@admin @user @staff 
  Scenario: Verify Name are displayed in Descending order
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff Clicks on  Name Descending Arrow
    Then ManageUser_Admin/User/Staff see the Name displayed in Descending order

@admin @user @staff 
  Scenario: Verify  EmailID are displayed in Descending order
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff Clicks on EmailID Descending Arrow
    Then ManageUser_Admin/User/Staff see the EmailID displayed in Descending order

@admin @user @staff 
  Scenario: Verify  Contact Number are displayed in Descending order
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff Clicks on Contact Descending Arrow
    Then ManageUser_Admin/User/Staff see the Contact displayed in Descending order

@admin @user @staff 
  Scenario: Verify  Batch are displayed in Descending order
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff Clicks on Batch Descending Arrow
    Then ManageUser_Admin/User/Staff see the Batch displayed in Descending order

@admin @user @staff 
  Scenario: Verify  Skill are displayed in Descending order
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff Clicks on Skill Descending Arrow
    Then ManageUser_Admin/User/Staff see the Skill displayed in Descending order

  #add new user functionality
  @admin @user @staff 
  Scenario: Verify the functionality of Add new user button
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff clicks Add New User
    Then ManageUser_Admin/User/Staff should see the "User details" dialog box

@admin @user @staff 
  Scenario: Add a New User successfully with Valid credentials
    Given ManageUser_Admin/User/Staff is on the "User details" pop up window
    When ManageUser_Admin/User/Staff enters following  information
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
    When ManageUser_Admin/User/Staff selects the respective State Name from the DropBox
    Then ManageUser_The State Name will be displayed
    When ManageUser_Admin/User/Staff selects the respective User role from the DropBox
    Then ManageUser_The User role will be displayed
    When ManageUser_Admin/User/Staff Clicks on Submit button after entering all valid details
    Then ManageUser_Admin/User/Staff successfully added a new User

@admin @user @staff 
  Scenario: Invalid User Details
    Given ManageUser_Admin/User/Staff is on the "User details" pop up window
    When ManageUser_Admin/User/Staff enters Submit button with all fields empty
    Then ManageUser_Admin/User/Staff should get a message "Enters all fields"
    When ManageUser_Admin/User/Staff clicks Submit button with invalid First Name
    Then ManageUser_Admin/User/Staff should get a message "Enter valid First Name !"
    When ManageUser_Admin/User/Staff clicks Submit button with invalid Middle Name
    Then ManageUser_Admin/User/Staff should get a message "Enter valid Middle Name"
    When ManageUser_Admin/User/Staff clicks Submit button with invalid Last Name
    Then ManageUser_Admin/User/Staff should get a message "Enter valid Last Name"
    When ManageUser_Admin/User/Staff clicks Submit button with invalid EmailID
    Then ManageUser_Admin/User/Staff should get a message "Enter valid EmailID"
    When ManageUser_Admin/User/Staff clicks Submit button with invalid Phone no
    Then ManageUser_Admin/User/Staff should get a message "Enter valid Phone no"
    When ManageUser_Admin/User/Staff clicks Submit button with invalid Address
    Then ManageUser_Admin/User/Staff should get a message "Enter valid Address"
    When ManageUser_Admin/User/Staff clicks Submit button with invalid City
    Then ManageUser_Admin/User/Staff should get a message "Enter valid City"
    When ManageUser_Admin/User/Staff clicks Submit button with invalid Postal code
    Then ManageUser_Admin/User/Staff should get a message "Enter valid Postal code"

  #Cancel button
  @admin @user @staff 
  Scenario: Verify the presence of Cancel button in User Details window
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff clicks Add new user button
    Then ManageUser_Admin/User/Staff should see a button with text as Cancel  in User Details window

@admin @user @staff 
  Scenario: Validate Fucntionality of Cancel button
    Given ManageUser_Admin/User/Staff is on User Details window
    When ManageUser_Admin/User/Staff clicks cancel button
    Then ManageUser_Admin/User/Staff  see User Details window getting  closed

 # Close(x) icon
 @admin @user @staff 
  Scenario: Verify the presence of Cancel(x) icon in user detais window
    Given ManageUser_Admin/User/Staff is on User Details window
    When ManageUser_Admin/User/Staff clicks Add new user button
    Then ManageUser_Admin/User/Staff should see a cancel(x) icon

@admin @user @staff 
  Scenario: Functionality of Close(x) icon
     When ManageUser_Admin/User/Staff clicks close(X) icon
    Then ManageUser_User Details window should be closed

 
  #Submit button
  @admin @user @staff 
  Scenario: Verify the presence of Submit button in User Details window
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff clicks Add new user button
    Then ManageUser_Admin/User/Staff should see a button with text as Submit in user details window

  #Feature Edit Functionality
  @admin @user @staff 
  Scenario: Validate Edit button in User Details window
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff Clicks on Edit button in User Details window
    Then ManageUser_Admin/User/Staff see header text as "User Details"

@admin @user @staff 
  Scenario: Edit Name in User Details window
    Given ManageUser_Admin/User/Staff Clicks on Edit button
    When ManageUser_Admin/User/Staff Clicks on Submit button after updating First name as "numpy" and Last name as "warriors"
    Then ManageUser_Admin/User/Staff see Success message "Updated Name "

@admin @user @staff 
  Scenario: Edit EmailID in User Details window
    Given ManageUser_Admin/User/Staff Clicks on Edit button
    When ManageUser_Admin/User/Staff Clicks on Submit button after updating EmailID as "ninjastar@gmail.com"
    Then ManageUser_Admin/User/Staff see Success message "Updated EmailID "

@admin @user @staff 
  Scenario: Edit Contact no in User Details window
    Given ManageUser_Admin/User/Staff Clicks on Edit button
    When ManageUser_Admin/User/Staff Clicks on Submit button after updating Contact no as "1345678890"
    Then ManageUser_Admin/User/Staff see Success message "Updated Contact no "

@admin @user @staff 
  Scenario: Edit Batch in User Details window
    Given ManageUser_Admin/User/Staff Clicks on Edit button
    When ManageUser_Admin/User/Staff Clicks on Submit button after updating Batch as "SDET84"
    Then ManageUser_Admin/User/Staff see Success message "Updated Batch"

@admin @user @staff 
  Scenario: Edit Skill in User Details window
    Given ManageUser_Admin/User/Staff Clicks on Edit button
    When ManageUser_Admin/User/Staff Clicks on Submit button after updating Skill as "SQL"
    Then ManageUser_Admin/User/Staff see Success message "Updated Skill "
    
@admin @user @staff 
  Scenario: Verifys Edited  Name/EmailID
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff Enters edited Name as "numpy warriors" in Search
    Then ManageUser_Entry for edited  Name as "numpy warriors" is shown

  #Delete Functionality
  @admin @user @staff 
  Scenario: Verify Delete Functionality
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff Clicks on any Delete button located in Edit/Delete Column
    Then ManageUser_Admin/User/Staff see header text as "Delete Confirm"

 @admin @user @staff 
  Scenario: Click on Yes button in Delete Confirm window
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff Clicks on any Delete button located on the right side in Edit/Delete Column
    And ManageUser_Admin/User/Staff Clicks on Yes button
    Then ManageUser_Admin/User/Staff see Delete Confirm window
    And ManageUser_Admin/User/Staff see Success message "User Deleted Successfully"

@admin @user @staff 
  Scenario: Click on No button in Delete Confirm window
    Given ManageUser_Admin/User/Staff clicks on Delete button located on the right side in Edit/Delete Column
    When ManageUser_Admin/User/Staff Clicks on No button
    Then ManageUser_Admin/User/Staff can see  Name as "John Dove" not deleted

@admin @user @staff 
  Scenario: Validate Deleted Program Name
    Given ManageUser_Admin/User/Staff is on Manage user page
    When ManageUser_Admin/User/Staff Enters deleted  Name as "John Dove" in Search
    Then ManageUser_Admin/User/Staff finds No results for "John Dove"

  #Delete Multiple Records Functionality
  @admin @user @staff 
	Scenario: Verify the state of Delete button on left hand side
   Given ManageUser_Admin/User/Staff Logged on to LMS Website      
   When ManageUser_Admin/User/Staff is on Manage Userpage                
   Then ManageUser_Admin/User/Staff see the Delete button on the top left hand side in Edit/Delete Column as Disabled

	@admin @user @staff    
	Scenario: Validates Multiple User Name Selection
   Given ManageUser_Admin/User/Staff is on Manage user page      
   When ManageUser_Admin/User/Staff selects more than one Name using checkbox              
   Then ManageUser_Admin/User/Staff see the Delete button on the top left hand side in Edit/Delete Column as Enabled

	@admin @user @staff      
	Scenario: Verify Deletion of Multiple Records
   Given ManageUser_Admin/User/Staff selects more than one Name using check-box    
   When ManageUser_Admin/User/Staff Clicks on Enabled Delete button on the Top left hand side                
   Then ManageUser_Admin/User/Staff see header text as "Delete Confirm"

	@admin @user @staff 
	Scenario: Click on Yes button in Delete Confirm window
   Given ManageUser_Admin/User/Staff Clicks on Enabled Delete button after selecting more than one Name      
   When ManageUser_Admin/User/Staff clicks on No button                 
   Then ManageUser_Admin/User/Staff see success message as "User Deleted Succesfully"

	@admin @user @staff    
	Scenario: Click on No button in Delete Confirm window
   Given ManageUser_Admin/User/Staff Clicks on Enabled Delete button after selecting more than one Name      
   When ManageUser_Admin/User/Staff clicks on No button                
   Then ManageUser_Admin/User/Staff can see User Names not deleted

	@admin @user @staff   
	Scenario Outline: Verify Deleted Batch Names
   Given ManageUser_Admin/User/Staff is on Manage user page       
   When ManageUser_Admin/User/Staff enters deleted "<UserNames>" in search                
   Then ManageUser_Admin/User/Staff finds No results for "<UserNames>"
	Examples:
  |Program Names|
  |smith Joe|
  |John Dove|

	@admin @user @staff    
	Scenario Outline: Admin/User/Staff Verifys Deletion of Multiple Records
   Given ManageUser_Admin/User/Staff selects more than one "<UserName>" using check-box       
   When ManageUser_Admin/User/Staff Cicks on enabled delete button on the top left hand side                
   Then ManageUser_Admin/User/Staff see a error message "Only Admin have Access"
	Examples:
  |Batch Name|
  |smith Joe|
  |John Dove|

	@admin @user @staff 
	Scenario: Verifies Checkbox Functionality
   Given ManageUser_Admin/User/Staff is on Manage user page       
   When ManageUser_Admin/User/Staff selects first checkbox left to User Name                
   Then ManageUser_Admin/User/Staff see all the checkboxes in the Manage User page are selected
