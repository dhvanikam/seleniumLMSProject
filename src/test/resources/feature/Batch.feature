@batch
Feature: Batch 

Background:
	Given Admin/User/Staff is on to LMS website Login Page

	@admin @user @staff
  Scenario Outline: Validating the Manage Batch Header
    Given Admin/User/Staff Logged on to LMS website
    When Admin/User/Staff Clicks on Batch button
    Then Admin/User/Staff see header text as "Manage Batch"

	@admin @user @staff
 	Scenario Outline: Validating the Manage Batch Footer
    Given Admin/User/Staff Logged on to LMS website
    When Admin/User/Staff Clicks on Batch button
    Then Admin/User/Staff see Footer text as "In total there are 21 batches."

  @admin @user @staff
 	Scenario: Validating the Manage Batch Paginator
    Given Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff Clicks on Enabled paginator -next button
    Then Admin/User/Staff see Paginator text as "Showing 6 to 10 of 21 batches."
  
  @admin @user @staff
 	Scenario: Validating the Manage Batch Paginator
    Given Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff Clicks on Enabled paginator -prev button
    Then Admin/User/Staff see the text as "Showing 1 to 5 of 21 batches."    

	@admin @user @staff
 	Scenario: Validating the Manage Batch Paginator
    Given Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff Clicks on Enabled paginator-last button
    Then Admin/User/Staff see Page number navigated to '5'  
	
	@admin @user @staff
 	Scenario: Validating the Manage Batch Paginator
    Given Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff Clicks on Enabled paginator -first button
    Then Admin/User/Staff see Page number navigated to '1' 
  
  #Search
  @admin @user @staff
  Scenario: Validate Search Feature
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Batch page 
    Then Admin/User/Staff see the Search Text box has text as "Search"
  
  @admin @user @staff
  Scenario: Search by "Batch Name"
    Given Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff enters Batch Name to be searched as "SDET"
    Then Entries for the searched Batch Name are shown for "SDET"
  
  @admin @user @staff
  Scenario: Search by "Batch Description" 
    Given Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff enters Batch Description to be searched as "SDETTestDescription"
    Then Entries for the searched Batch Description are shown for "SDETTestDescription"
  
  @admin @user @staff
  Scenario: Search by "Batch Status"
    Given Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff enters Batch Status to be searched as "ACTIVE" 
    Then Entries for the searched Batch Status are shown for "ACTIVE"
  
  @admin @user @staff
  Scenario: Search by "No Of Classes"
    Given Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff enters No Of Classes to be searched as "15"  
    Then Entries for the searched No Of Classes are shown for "15"
    
  @admin @user @staff
  Scenario: Search by "Program Name"
    Given Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff enters Program Name to be searched as "SDETTest" 
    Then Entries for the searched Program Name are shown "SDETTest"
 
 
  #Asceding order
  @admin @user @staff
  Scenario: Verify "Batch Name" are displayed in Ascending order
    Given Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff Clicks on Batch Name Ascending Arrow
    Then Admin/User/Staff see the Batch Name displayed in Ascending order
  
  @admin @user @staff
  Scenario: Verify "Batch Description" are displayed in Ascending order
    Given Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff Clicks on Batch Description Ascending Arrow
    Then Admin/User/Staff see the Batch Description displayed in Ascending order
  
  @admin @user @staff
  Scenario: Verify "Batch Status" are displayed in Ascending order
    Given Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff Clicks on Batch Status Ascending Arrow  
    Then Admin/User/Staff see the Batch Status displayed in Ascending order
    
  @admin @user @staff
  Scenario: Verify "No Of Classes" are displayed in Ascending order
    Given Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff Clicks on No Of Classes Ascending Arrow  
    Then Admin/User/Staff see the No Of Classes displayed in Ascending order
    
  @admin @user @staff
  Scenario: Verify "Program Name" are displayed in Ascending order
    Given Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff Clicks on Program Name Ascending Arrow  
    Then Admin/User/Staff see the Program Name displayed in Ascending order
  
 #Desceding order
 @admin @user @staff
 Scenario: Verify "Batch Name" are displayed in Descending order
   Given Admin/User/Staff is on Manage Batch page
   When Admin/User/Staff Clicks on Batch Name Descending Arrow
   Then Admin/User/Staff see the Batch Name displayed in Descending order
  
 @admin @user @staff
 Scenario: Verify "Batch Description" are displayed in Descending order
   Given Admin/User/Staff is on Manage Batch page
   When Admin/User/Staff Clicks on Batch Description Descending Arrow
   Then Admin/User/Staff see the Batch Description displayed in Descending order
  
 @admin @user @staff
  Scenario: Verify "Batch Status" are displayed in Descending order
    Given Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff Clicks on Batch Status Descending Arrow  
    Then Admin/User/Staff see the Batch Status displayed in Descending order
    
  @sorting
  Scenario: Verify "No Of Classes" are displayed in Descending order
    Given Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff Clicks on No Of Classes Descending Arrow  
    Then Admin/User/Staff see the No Of Classes displayed in Descending order
  
  @admin @user @staff
  Scenario: Verify "Program Name" are displayed in Descending order
    Given Admin/User/Staff is on Manage Batch page
    When Admin/User/Staff Clicks on Program Name Descending Arrow  
    Then Admin/User/Staff see the Program Name displayed in Descending order
    
#Number of rows in a Table
	@admin @user @staff
  Scenario: Validate Number of rows in a table
   Given Admin/User/Staff Logged on to LMS Website
   When Admin/User/Staff is on Manage Batch page  
   Then Admin/User/Staff counts number of rows as 5 in a table

#Add  A New Batch
	@admin @user @staff
	Scenario: Validate Add A New Batch button
   Given Admin is on Manage Batch page
   When Admin clicks on A New Batch button  
   Then Admin see header text as "Batch Details"
	
	@admin @user @staff
	Scenario: No details Entered in Batch Details window
   Given Admin Clicks on A New Batch button
   When Admin Clicks on Save Button with out entering details   
   Then Admin see Error message "Name is required"
   
  @admin @user @staff
 Scenario: Enters Only Name in Batch Details window
   Given Admin Clicks on A New Batch button
   When Admin Clicks on Save Button after entering Name alone as "SDET"   
   Then Admin see Error message "Description is required"
  
  @admin @user @staff 
 Scenario: Enters Only Description in Batch Details window
   Given Admin Clicks on A New Batch button
   When Admin Clicks on Save Button after entering Description alone as "SDET"   
   Then Admin see Error message "Name is required"
   
@admin @user @staff
 Scenario: Verify Program Name Dropdown in Batch Details window
   Given Admin Clicks on A New Batch button
   When Admin Clicks on DropDown Menu    
   Then Admin see list of all Program Names
@admin @user @staff
 Scenario: Selects only a Program name from Dropdown in Batch Details window 
   Given Admin Clicks on A New Batch button 
   And Clicks on DropDown Menu in Batch Details window
   When Admin Clicks on Save button after selecting a Program Name only from the dropdown    
   Then Admin see Error message "Name is required"
   
 Scenario: Selects Status only in Batch Details window
   Given Admin Clicks on A New Batch button 
   When Admin Clicks on Save Button after selecting Status alone     
   Then Admin see Error message "Name is required"
   
 Scenario: Enters Only Number Of Classes in Batch Details window
   Given Admin Clicks on A New Batch button 
   When Admin Clicks on Save Button after entering Number Of Classes alone as "2"   
   Then Admin see Error message "Name is required"
   
 Scenario: Enter All details in Batch Details window
   Given Admin Clicks on A New Batch button 
   When Admin Clicks on Save Button after entering all details     
   Then Admin see Success message "New Batch Created"
   
 Scenario: Click on Cancel button in Batch Details window
   Given Admin Clicks on A New Batch button 
   When Admin Clicks on Cancel button     
   Then Admin see a Batch Details window getting closed
   
#Edit New Batch
Scenario: Validates Edit button
   Given Admin is on Manage Batch page 
   When Admin Clicks on Edit buttton       
   Then Admin see header text as "Batch Details"
   
Scenario: Edit Name in Batch Details window
   Given Admin is on Edit Window
   When Admin Clicks on Save Button after updating Name as "SDET12"      
   Then Admin see Success message "Updated Name"
   
Scenario: Edit Description in Batch Details window
   Given Admin is on Edit Window 
   When Admin Clicks on Save Button after updating Description as "SDET12"        
   Then Admin see Success message "Updated Description"
   
Scenario: Edit Program Name from Dropdown in Batch Details window
   Given Admin is on Edit Window 
   When Admin Clicks on Save button after Selecting another Program Name          
   Then Admin see Success message "Updated Program Name"

Scenario: Edit Status in Batch Details window
   Given Admin is on Edit Window 
   When Admin Clicks on Save Button after updating Status          
   Then Admin see Success message "Updated Status"
   
Scenario: Edit Number Of Classes in Batch Details window
   Given Admin is on Edit Window 
   When Admin Clicks on Save Button after updating No Of Classes as "5"          
   Then Admin see Success message "Updated No of Classes"
   
Scenario: Click on Cancel button in Batch Details window
   Given Admin is on Edit Window 
   When Admin Clicks on Cancel button           
   Then Admin see a Batch Details window getting closed
   
Scenario: Verify Edited Batch Name/BatchDescription as "SDET22"
   Given Admin/User/Staff is on Manage Batch page  
   When Admin/User/Staff Enters edited Batch Name/Batch Description in Search as "SDET22"          
   Then Entry for the edited Batch Name/Batch Description is shown for "SDET22" 
   
Scenario: User/Staff Validate Edit button 
   Given User/Staff is on Manage Batch page  
   When User/Staff Clicks on Edit button             
   Then User/Staff see a Error message "Only Admin have Access"
   
   
Scenario: User/Staff Validate Edit button 
   Given User/Staff is on Manage Batch page  
   When User/Staff Clicks on Edit button             
   Then User/Staff see a Error message "Only Admin have Access"
   
#Delete
Scenario: Verify Delete Functionality 
   Given Admin is on Manage Batch page   
   When Admin Clicks on any Delete button located on the right side for "SDET22"             
   Then Admin see header text as "Delete Confirm"
   
Scenario: Click on Yes button in Delete Confirm window 
   Given Admin Clicks on any Delete button located on the right side    
   When Admin Clicks on Yes  button              
   Then Admin see Success message "Program Deleted Succesfully"
   
Scenario: Clicks on No button in Delete Confirm window 
   Given Admin Clicks on any Delete button located on the right side     
   When Admin Clicks on No button              
   Then Admin can see Program Name not deleted for "SDET02"
   
Scenario: Validate Deleted Program Name 
   Given Admin/User/Staff is on Manage Batch page      
   When Admin/User/Staff Enters deleted  Program Name in Search as "SDET02"            
   Then Admin/User/Staff finds no results for "SDET02"
   
Scenario: User/Staff Validates Delete button 
   Given User/Staff is on Manage Batch page      
   When User/Staff Clicks on Delete button                
   Then User/Staff see a Error message "Only Admin have Access"
   
#Delete Multiple Records Functionality
Scenario: Verify the state of Delete button on left hand side
   Given Admin/User/Staff Logged on to LMS Website      
   When Admin is on Manage Batch page                
   Then Admin see the Delete button on the top left hand side as Disabled
   
Scenario: Validates Multiple Program Selection
   Given Admin/User/Staff is on Manage Batch page      
   When Admin selects more than one Batch Name using checkbox              
   Then Admin see the Delete button on the top left hand side as Enabled
      
Scenario: Verify Deletion of Multiple Records
   Given Admin selects more than one Batch Name using checkbox    
   When Admin Clicks on Enabled Delete button on the top left hand side                
   Then Admin see header text as "Delete Confirm"

Scenario: Click on Yes button in Delete Confirm window
   Given Admin Clicks on Enabled Delete button after selecting  more than one Batch Name      
   When Admin Clicks on Yes  button                
   Then Admin see Success message "Program Deleted Succesfully"
   
Scenario: Click on No button in Delete Confirm window
   Given Admin Clicks on Enabled Delete button after selecting  more than one Batch Name      
   When Admin Clicks on No button                
   Then Admin can see Program Names not deleted
   
Scenario Outline: Verify Deleted Batch Names
   Given Admin/User/Staff is on Manage Batch page       
   When Admin/User/Staff Enters deleted "<Program Names>" in Search                
   Then Admin/User/Staff finds no results for "<Program Names>"
Examples:
  |Program Names|
  |SDET|
  |DAML|
    
Scenario Outline: User/Staff Verifys Deletion of Multiple Records
   Given User/Staff selects more than one "<Batch  Name>" using checkbox       
   When User/Staff Cicks on Enabled Delete button on the top left hand side                
   Then User/Staff see a Error message "Only Admin have Access"
Examples:
  |Batch Name|
  |SDET|
  |DAML|
  
Scenario: Verifies Checkbox Functionality
   Given Admin/User/Staff is on Manage Batch page       
   When Admin/User/Staff Selects First checkbox left to Batch Name                
   Then Admin/User/Staff see all the checkboxes in the Batch page get selected