@batch
Feature: Batch 

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

	@admin @user @staff
  Scenario Outline: Validating the Manage Batch Header
    Given Batch_Admin/User/Staff Logged on to LMS Website
    When Batch_Admin/User/Staff Clicks on Batch button
    Then Batch_Admin/User/Staff see header text as "Manage Batch"

	@admin @user @staff
 	Scenario Outline: Validating the Manage Batch Footer
    Given Batch_Admin/User/Staff Logged on to LMS Website
    When Batch_Admin/User/Staff Clicks on Batch button
    Then Batch_Admin/User/Staff see Footer text as "In total there are 21 batches."

  @admin @user @staff
 	Scenario: Validating the Manage Batch Paginator
    Given Batch_Admin/User/Staff is on Manage Batch page
    When Batch_Admin/User/Staff Clicks on Enabled paginator -next button
    Then Batch_Admin/User/Staff see Paginator text as "Showing 6 to 10 of 21 batches."
  
  @admin @user @staff
 	Scenario: Validating the Manage Batch Paginator
    Given Batch_Admin/User/Staff is on Manage Batch page
    When Batch_Admin/User/Staff Clicks on Enabled paginator -prev button
    Then Batch_Admin/User/Staff see the text as "Showing 1 to 5 of 21 batches."    

	@admin @user @staff
 	Scenario: Validating the Manage Batch Paginator
    Given Batch_Admin/User/Staff is on Manage Batch page
    When Batch_Admin/User/Staff Clicks on Enabled paginator-last button
    Then Batch_Admin/User/Staff see Page number navigated to '5'  
	
	@admin @user @staff
 	Scenario: Validating the Manage Batch Paginator
    Given Batch_Admin/User/Staff is on Manage Batch page
    When Batch_Admin/User/Staff Clicks on Enabled paginator -first button
    Then Batch_Admin/User/Staff see Page number navigated to '1' 
  
  #Search
  @admin @user @staff
  Scenario: Validate Search Feature
    Given Batch_Admin/User/Staff Logged on to LMS Website
    When Batch_Admin/User/Staff is on Manage Batch page 
    Then Batch_Admin/User/Staff see the Search Text box has text as "Search"
  
  @admin @user @staff
  Scenario: Search by "Batch Name"
    Given Batch_Admin/User/Staff is on Manage Batch page
    When Batch_Admin/User/Staff enters Batch Name to be searched as "SDET"
    Then Batch_Entries for the searched Batch Name are shown for "SDET"
  
  @admin @user @staff
  Scenario: Search by "Batch Description" 
    Given Batch_Admin/User/Staff is on Manage Batch page
    When Batch_Admin/User/Staff enters Batch Description to be searched as "SDETTestDescription"
    Then Batch_Entries for the searched Batch Description are shown for "SDETTestDescription"
  
  @admin @user @staff
  Scenario: Search by "Batch Status"
    Given Batch_Admin/User/Staff is on Manage Batch page
    When Batch_Admin/User/Staff enters Batch Status to be searched as "ACTIVE" 
    Then Batch_Entries for the searched Batch Status are shown for "ACTIVE"
  
  @admin @user @staff
  Scenario: Search by "No Of Classes"
    Given Batch_Admin/User/Staff is on Manage Batch page
    When Batch_Admin/User/Staff enters No Of Classes to be searched as "15"  
    Then Batch_Entries for the searched No Of Classes are shown for "15"
    
  @admin @user @staff
  Scenario: Search by "Program Name"
    Given Batch_Admin/User/Staff is on Manage Batch page
    When Batch_Admin/User/Staff enters Program Name to be searched as "SDETTest" 
    Then Batch_Entries for the searched Program Name are shown "SDETTest" 
 
  #Asceding order
  @admin @user @staff
  Scenario: Verify "Batch Name" are displayed in Ascending order
    Given Batch_Admin/User/Staff is on Manage Batch page
    When Batch_Admin/User/Staff Clicks on Batch Name Ascending Arrow
    Then Batch_Admin/User/Staff see the Batch Name displayed in Ascending order
  
  @admin @user @staff
  Scenario: Verify "Batch Description" are displayed in Ascending order
    Given Batch_Admin/User/Staff is on Manage Batch page
    When Batch_Admin/User/Staff Clicks on Batch Description Ascending Arrow
    Then Batch_Admin/User/Staff see the Batch Description displayed in Ascending order
  
  @admin @user @staff
  Scenario: Verify "Batch Status" are displayed in Ascending order
    Given Batch_Admin/User/Staff is on Manage Batch page
    When Batch_Admin/User/Staff Clicks on Batch Status Ascending Arrow  
    Then Batch_Admin/User/Staff see the Batch Status displayed in Ascending order
    
  @admin @user @staff
  Scenario: Verify "No Of Classes" are displayed in Ascending order
    Given Batch_Admin/User/Staff is on Manage Batch page
    When Batch_Admin/User/Staff Clicks on No Of Classes Ascending Arrow  
    Then Batch_Admin/User/Staff see the No Of Classes displayed in Ascending order
    
  @admin @user @staff
  Scenario: Verify "Program Name" are displayed in Ascending order
    Given Batch_Admin/User/Staff is on Manage Batch page
    When Batch_Admin/User/Staff Clicks on Program Name Ascending Arrow  
    Then Batch_Admin/User/Staff see the Program Name displayed in Ascending order
  
 #Desceding order
 @admin @user @staff
 Scenario: Verify "Batch Name" are displayed in Descending order
   Given Batch_Admin/User/Staff is on Manage Batch page
   When Batch_Admin/User/Staff Clicks on Batch Name Descending Arrow
   Then Batch_Admin/User/Staff see the Batch Name displayed in Descending order
  
 @admin @user @staff
 Scenario: Verify "Batch Description" are displayed in Descending order
   Given Batch_Admin/User/Staff is on Manage Batch page
   When Batch_Admin/User/Staff Clicks on Batch Description Descending Arrow
   Then Batch_Admin/User/Staff see the Batch Description displayed in Descending order
  
  @admin @user @staff
  Scenario: Verify "Batch Status" are displayed in Descending order
    Given Batch_Admin/User/Staff is on Manage Batch page
    When Batch_Admin/User/Staff Clicks on Batch Status Descending Arrow  
    Then Batch_Admin/User/Staff see the Batch Status displayed in Descending order
    
  @admin @user @staff
  Scenario: Verify "No Of Classes" are displayed in Descending order
    Given Batch_Admin/User/Staff is on Manage Batch page
    When Batch_Admin/User/Staff Clicks on No Of Classes Descending Arrow  
    Then Batch_Admin/User/Staff see the No Of Classes displayed in Descending order
  
  @admin @user @staff
  Scenario: Verify "Program Name" are displayed in Descending order
    Given Batch_Admin/User/Staff is on Manage Batch page
    When Batch_Admin/User/Staff Clicks on Program Name Descending Arrow  
    Then Batch_Admin/User/Staff see the Program Name displayed in Descending order
    
#Number of rows in a Table
	@admin @user @staff
  Scenario: Validate Number of rows in a table
   Given Batch_Admin/User/Staff Logged on to LMS Website
   When Batch_Admin/User/Staff is on Manage Batch page  
   Then Batch_Admin/User/Staff counts number of rows as 5 in a table

#Add  A New Batch
	@admin @user @staff
	Scenario: Validate Add A New Batch button
   Given Batch_Admin is on Manage Batch page
   When Batch_Admin clicks on A New Batch button  
   Then Batch_Admin see header text as "Batch Details"
	
	@admin @user @staff
	Scenario: No details Entered in Batch Details window
   Given Batch_Admin Clicks on A New Batch button
   When Batch_Admin Clicks on Save Button with out entering details   
   Then Batch_Admin see Error message "Name is required"
   
  @admin @user @staff
	Scenario: Enters Only Name in Batch Details window
   Given Batch_Admin Clicks on A New Batch button
   When Batch_Admin Clicks on Save Button after entering Name alone as "SDET"   
   Then Batch_Admin see Error message "Description is required"
  
	@admin @user @staff 
 	Scenario: Enters Only Description in Batch Details window
   Given Batch_Admin Clicks on A New Batch button
   When Batch_Admin Clicks on Save Button after entering Description alone as "SDET"   
   Then Batch_Admin see Error message "Name is required"
   
 	@admin @user @staff
 	Scenario: Verify Program Name Dropdown in Batch Details window
 	 Given Batch_Admin Clicks on A New Batch button
   When Batch_Admin Clicks on DropDown Menu    
   Then Batch_Admin see list of all Program Names
   
	@admin @user @staff
	Scenario: Selects only a Program name from Dropdown in Batch Details window 
   Given Batch_Admin Clicks on A New Batch button 
   And Batch_Clicks on DropDown Menu in Batch Details window
   When Batch_Admin Clicks on Save button after selecting a Program Name only from the dropdown    
   Then Batch_Admin see Error message "Name is required"
 
 	@admin @user @staff
 	Scenario: Selects Status only in Batch Details window
   Given Batch_Admin Clicks on A New Batch button 
   When Batch_Admin Clicks on Save Button after selecting Status alone     
   Then Batch_Admin see Error message "Name is required"
 
 	@admin @user @staff  
	Scenario: Enters Only Number Of Classes in Batch Details window
   Given Batch_Admin Clicks on A New Batch button 
   When Batch_Admin Clicks on Save Button after entering Number Of Classes alone as "2"   
   Then Batch_Admin see Error message "Name is required"
 
	@admin @user @staff
 	Scenario: Enter All details in Batch Details window
   Given Batch_Admin Clicks on A New Batch button 
   When Batch_Admin Clicks on Save Button after entering all details     
   Then Batch_Admin see Success message "New Batch Created"
 
 	@admin @user @staff
 	Scenario: Click on Cancel button in Batch Details window
   Given Batch_Admin Clicks on A New Batch button 
   When Batch_Admin Clicks on Cancel button     
   Then Batch_Admin see a Batch Details window getting closed
   
#Edit New Batch
	@admin
	Scenario: Validates Edit button
   Given Batch_Admin is on Manage Batch page 
   When Batch_Admin Clicks on Edit buttton       
   Then Batch_Admin see header text as "Batch Details"

	@admin
	Scenario: Edit Name in Batch Details window
   Given Batch_Admin is on Edit Window
   When Batch_Admin Clicks on Save Button after updating Name as "SDET12"      
   Then Batch_Admin see Success message "Updated Name"

	@admin  
	Scenario: Edit Description in Batch Details window
   Given Batch_Admin Clicks on Edit buttton 
   When Batch_Admin Clicks on Save Button after updating Description as "SDET12"        
   Then Batch_Admin see Success message "Updated Description"

	@admin  
	Scenario: Edit Program Name from Dropdown in Batch Details window
   Given Batch_Admin Clicks on Edit buttton
   When Batch_Admin Clicks on Save button after Selecting another Program Name          
   Then Batch_Admin see Success message "Updated Program Name"

	@admin
	Scenario: Edit Status in Batch Details window
   Given Batch_Admin Clicks on Edit buttton 
   When Batch_Admin Clicks on Save Button after updating Status          
   Then Batch_Admin see Success message "Updated Status"

	@admin
	Scenario: Edit Number Of Classes in Batch Details window
   Given Batch_Admin Clicks on Edit buttton 
   When Batch_Admin Clicks on Save Button after updating No Of Classes as "5"          
   Then Batch_Admin see Success message "Updated No of Classes"
   
	@admin   
	Scenario: Click on Cancel button in Batch Details window
   Given Batch_Admin Clicks on Edit buttton 
   When Batch_Admin Clicks on Cancel button           
   Then Batch_Admin see a Batch Details window getting closed

	@admin @user @staff   
	Scenario: Verify Edited Batch Name/BatchDescription as "SDET22"
   Given Batch_Admin/User/Staff is on Manage Batch page  
   When Batch_Admin/User/Staff Enters edited Batch Name/Batch Description in Search as "SDET22"          
   Then Batch_Entry for the edited Batch Name/Batch Description is shown for "SDET22" 

	@user @staff   
	Scenario: User/Staff Validate Edit button 
   Given Batch_User/Staff is on Manage Batch page  
   When Batch_User/Staff Clicks on Edit button             
   Then Batch_User/Staff see a Error message "Only Admin have Access"
   
	@user @staff   
	Scenario: User/Staff Validate Edit button 
   Given Batch_User/Staff is on Manage Batch page  
   When Batch_User/Staff Clicks on Edit button             
   Then Batch_User/Staff see a Error message "Only Admin have Access"
   
#Delete
	@admin
	Scenario: Verify Delete Functionality 
   Given Batch_Admin is on Manage Batch page   
   When Batch_Admin Clicks on any Delete button located on the right side for "SDET22"             
   Then Batch_Admin see header text as "Delete Confirm"

	@admin   
	Scenario: Click on Yes button in Delete Confirm window 
   Given Batch_Admin Clicks on any Delete button located on the right side    
   When Batch_Admin Clicks on Yes  button              
   Then Batch_Admin see Success message "Program Deleted Succesfully"

	@admin   
	Scenario: Clicks on No button in Delete Confirm window 
   Given Batch_Admin Clicks on any Delete button located on the right side     
   When Batch_Admin Clicks on No button              
   Then Batch_Admin can see Program Name not deleted for "SDET02"

	@admin @user @staff  
	Scenario: Validate Deleted Program Name 
   Given Batch_Admin/User/Staff is on Manage Batch page      
   When Batch_Admin/User/Staff Enters deleted  Program Name in Search as "SDET02"            
   Then Batch_Admin/User/Staff finds no results for "SDET02"

	@user @staff   
	Scenario: User/Staff Validates Delete button 
   Given Batch_User/Staff is on Manage Batch page      
   When Batch_User/Staff Clicks on Delete button                
   Then Batch_User/Staff see a Error message "Only Admin have Access"
   
#Delete Multiple Records Functionality
	@admin @user @staff 
	Scenario: Verify the state of Delete button on left hand side
   Given Batch_Admin/User/Staff Logged on to LMS Website
   When Batch_Admin/User/Staff is on Manage Batch page                
   Then Batch_Admin/User/Staff see the Delete button on the top left hand side as Disabled

	@admin   
	Scenario: Validates Multiple Program Selection
   Given Batch_Admin is on Manage Batch page      
   When Batch_Admin selects more than one Batch Name using checkbox              
   Then Batch_Admin see the Delete button on the top left hand side as Enabled

	@admin     
	Scenario: Verify Deletion of Multiple Records
   Given Batch_Admin selects more than one Batch Name using checkbox    
   When Batch_Admin Clicks on Enabled Delete button on the top left hand side                
   Then Batch_Admin see header text as "Delete Confirm"

	@admin
	Scenario: Click on Yes button in Delete Confirm window
   Given Batch_Admin Clicks on Enabled Delete button after selecting  more than one Batch Name      
   When Batch_Admin Clicks on Yes  button                
   Then Batch_Admin see Success message "Program Deleted Succesfully"

	@admin   
	Scenario: Click on No button in Delete Confirm window
   Given Batch_Admin Clicks on Enabled Delete button after selecting  more than one Batch Name      
   When Batch_Admin Clicks on No button                
   Then Batch_Admin can see Program Names not deleted

	@admin @user @staff   
	Scenario Outline: Verify Deleted Batch Names
   Given Batch_Admin/User/Staff is on Manage Batch page       
   When Batch_Admin/User/Staff Enters deleted "<Program Names>" in Search                
   Then Batch_Admin/User/Staff finds no results for "<Program Names>"
	Examples:
  |Program Names|
  |SDET|
  |DAML|

	@user @staff   
	Scenario Outline: User/Staff Verifys Deletion of Multiple Records
   Given Batch_User/Staff selects more than one "<Batch  Name>" using checkbox       
   When Batch_User/Staff Cicks on Enabled Delete button on the top left hand side                
   Then Batch_User/Staff see a Error message "Only Admin have Access"
	Examples:
  |Batch Name|
  |SDET|
  |DAML|

	@admin @user @staff 
	Scenario: Verifies Checkbox Functionality
   Given Batch_Admin/User/Staff is on Manage Batch page       
   When Batch_Admin/User/Staff Selects First checkbox left to Batch Name                
   Then Batch_Admin/User/Staff see all the checkboxes in the Batch page get selected