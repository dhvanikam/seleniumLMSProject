
 @ManageAssignment
 Feature: Manage Assignment

 Background: 
 Given Admin/User/Staff Logged on to LMS website

 @header
 Scenario: Validating Assignment Heading
	Given Admin/User/Staff is on Assignment Page
	When Admin/User/Staff clicks on Assignment Page
	Then Admin/User/Staff Should see a Header "Manage Assignment"
	
 @footer
 Scenario: Validating Assignment Footer
	Given Admin/User/Staff is on Assignment Page
	When Admin/User/Staff clicks on Assignment Page
	Then Admin/User/Staff Should see a Footer text "In Total there are 3 assignments"
	
 @Paginator 
 Scenario: Paginator Vaildation
	Given Admin/User/Staff is on Assignment Page
	When Admin/User/Staff clicks on Assignment Page
	Then Admin/User/Staff Should see a Paginator text "Showing 1 to 3 of 3 entries"
	
	@nextbutton
	Scenario: Verify  paginator -next button  on the Assignment page
	Given Admin/User/Staff is on Assignment Page
	When Admin/User/Staff Clicks on Enabled paginator-next button
	Then Admin/User/Staff Should be navigated to next page
	
	@previouspage
	Scenario: Verify paginator -previous button on the Assignment page
	Given Admin/User/Staff is on Assignment Page
	When Admin/User/Staff Clicks on Enabled paginator-privious button
	Then Admin/User/Staff Should be navigated to previous page

	@lastbutton
	Scenario: Verify paginator -last button on the Assignment page
	Given Admin/User/Staff is on Assignment Page
	When Admin/User/Staff Clicks on Enabled paginator-last button
	Then Admin/User/Staff Should be navigated to Last page
	
	@firstbutton
	Scenario: Verify paginator -first button on the Program page
	Given Admin/User/Staff is on Assignment Page
	When Admin/User/Staff Clicks on Enabled paginator-first button
	Then Admin/User/Staff Should be navigated to First  page
	
 @searchtextbox
 Scenario: Validate Search Feature
 	Given Admin/User/Staff is on Assignment Page
 	When Admin/User/Staff clicks Search bar after entering Assignment name
 	Then The requested assignment details should be displayed
 	
 @nameinAscending	
  Scenario: Verify Assignment Name are displayed in Ascending order
 	Given Admin/User/Staff is on Assignment Page
 	When  Admin/User/Staff Clicks on Assignment Name Ascending Arrow
 	Then  Admin/User/Staff should see the Assignment Name displayed in Ascending order
 	
 	@discriptioninAscending
 	Scenario:  Verify Assignment Description are displayed in Ascending order
 	Given Admin/User/Staff is on Assignment Page
 	When  Admin/User/Staff Clicks on Assignment Description Ascending Arrow
 	Then  Admin/User/Staff should see the Assignment Description displayed in Ascending order
 
 	@DuedateinAscending
  Scenario: Verify Assignment Duedate are displayed in Ascending order
 	Given Admin/User/Staff is on Assignment Page
 	When  Admin/User/Staff Clicks on Assignment Due Date Ascending Arrow
 	Then  Admin/User/Staff should see the Assignment Due Date displayed in Ascending order
  
  @gradeinAscending
  Scenario: Verify Assignment Grade  are displayed in Ascending order
 	Given Admin/User/Staff is on Assignment Page
 	When  Admin/User/Staff Clicks on Assignment Grade Ascending Arrow
 	Then  Admin/User/Staff should see the Assignment Grade displayed in Ascending order
 	
 @NameinDescending	
 Scenario: Verify Assignment Name are displayed in Descending order
 	Given Admin/User/Staff is on Assignment Page
 	When  Admin/User/Staff Clicks on Assignment Name Descending Arrow
 	Then  Admin/User/Staff should see the Assignment Name displayed in Descending order
 
 @DescriptioninDescending	
 Scenario: Verify Assignment Description are displayed in Descending order
 	Given Admin/User/Staff is on Assignment Page
 	When  Admin/User/Staff Clicks on Assignment Description Descending Arrow
 	Then  Admin/User/Staff should see the Assignment Description displayed in Descending order
 
 @DuedateinDescending	
 Scenario: Verify Assignment Duedate are displayed in Descending order
 	Given Admin/User/Staff is on Assignment Page
 	When  Admin/User/Staff Clicks on Assignment Due Date Descending Arrow
 	Then  Admin/User/Staff should see the Assignment Due Date displayed in Descending order
 
 @GradeinDescending	
 Scenario: Verify Assignment Grade are displayed in Descending order
 	Given Admin/User/Staff is on Assignment Page
 	When  Admin/User/Staff Clicks on Assignment Grade Descending Arrow
 	Then  Admin/User/Staff should see the Assignment Grade displayed in Descending order
 	
 @addNewAssignment	
 Scenario:  Validate Add New Assignment button
	 Given Staff is on Manage Assignment page
	 When Staff clicks a Add new assignment button
	 Then Staff should see Assignment details window
	 
	 
	 Scenario: Checking who has access to Manage Assignment Page
	 Given Admin/User is on Manage Assignment page
	 When Admin/User Click on add New Assignment
	 Then Admin/User should see a message "Staff only have access to add New Assignment"
	
	 Scenario: No details Entered in  Assignment Details window 
	 Given Staff is on Assignment Details page
	 When Staff  clicks on Save after leaving all the fields empty
	 Then Staff should see an error message "Name is required"
	 
	 Scenario: Staff Validate Assignment Details window with entering all fields
	 Given Staff is on Assignment Details page
	 When Staff clicks Save button after entering assignment name,description,Grade and Duedate
	 Then Staff should see a message "New Assignment successfully added"
 	
 	 Scenario: Staff Click Cancel in Assignment Details window
	 Given Staff is on Assignment Details page
	 When Staff clicks cancel button with entering all fields
	 Then Staff should see a Assignment details window is closed
	
	 Scenario: validate New assignment
	 Given Admin/User/Staff is on Assignments page
	 When Admin/User/Staff clicks on Assignment
	 Then Admin/User/Staff should see a newly added Assignment
	
	 Scenario: Validate  Manage button in Assignment Grade
	 Given Staff is on Assignment page
	 When Staff clicks manage button under Assignment Grade
	 Then Staff should be navigated to Grade Window
 
 @editAssignment
 Scenario: Edit Functionality
 	 Given Staff is on Manage Assignment page
 	 When Staff clicks an edit Assignment button
 	 Then Staff should see a Assignment details window
 	 
 	 Scenario: Staff Edit Assignment Name in Assignment Details window
 	 Given Staff is on Manage Assignment page
 	 When Staff clicks Save button after edits Assignment Name 
 	 Then Staff should see a message "Assignment Name Updated"
 	 
 	 Scenario: Staff Edit Assignment Description in Assignment Details window
 	 Given Staff is on Manage Assignment page
 	 When Staff clicks Save button after edits Assignment Description
 	 Then Staff should see a message "Assignment Description Updated"
 	
   Scenario: Staff Edit Assignment Grade in Assignment Details window
   Given Staff is on Assignment Details window
 	 When Staff clicks Save button after edits Assignment Grade
 	 Then Staff should see a message "Assignment Grade Updated"
 	 
 	 Scenario: Staff Edit Assignment DueDate in Assignment Details window
 	 Given Staff is on Assignment Details window
 	 When Staff clicks Save button after edits Assignment DueDate
 	 Then Staff should see a message "Assignment Due Date Updated"
 	 
 	 Scenario: Staff Click Cancel in  Assignment Details window
 	 Given Staff is on Assignment Details window
 	 When Staff clicks cancel button 
 	 Then Staff Should see a Assignment Details Page is closed
 
   Scenario: Admin/User Validate Edit button
 	 Given Admin/User is on Manage Assignment page
 	 When Admin/User clicks Edit button
 	 Then Admin/User should see a messages "Staff only have access to Edit Assignment"
 
 @googleForm	 
 Scenario: Admin clicks Assignment Name
   Given Admin is on Assignment page
   When Admin clicks on Assignment Name
   Then Admin should see a warning message "you dont have access"
   
   Scenario: User/Staff clicks Assignment Name
   Given User/Staff is on Assignment page
   When User/Staff clicks on Assignment Name
   Then User/Staff should be navigated to Assignment Google form page
   
   Scenario: User/Staff validate assignment Google form with entering all fields
   Given User/Staff is on Assignment  Google form page
   When User/Staff clicks on submit button after entering all questions and mail id 
   Then User/Staff entered google forms successfully
   
   Scenario: User/Staff validate assignment Google form leaving empty
   Given User/Staff is on Assignment  Google form page
   When User/Staff clicks on submit button after leaving all questions and mail id 
   Then User/Staff should get a warning message "Must enter the mandatory fields"
  
  
   Scenario: User/Staff Validate Assignment google form after cliclking clear button
   Given User/Staff is on Assignment  Google form page
   When User clicks clear form button after entering all questions and mail id 
   Then The Assignment Google form cleared successfully
  
   Scenario: User/Staff clicks Switch account
   Given User/Staff is on Assignment  Google form page
   When User clicks Switch account link 
   Then User should be switched over the account Successfully
      
 @deletAssignment 
 Scenario: Admin/User clicks delete button
   Given Admin/User/Staff is on Manage Assignment page
   When Admin/User clicks on delete button
   Then Admin/User should see a message"Staff only have access"
   
   Scenario: Staff clicks delete button
   Given Staff is on Manage Assignment page
   When Staff clicks on delete button 
   Then Staff should see a Delete Confirmation window
   
   Scenario: Staff click Yes in Delete confirmation window
   Given Staff is on Delete Confirmation window
   When Staff clicks Yes
   Then Staff Should see "Assignment Deleted Successfully
   
   Scenario: Staff click No in Delete confirmation window
   Given Staff is on Delete Confirmation window
   When Staff clicks No
   Then Confirmation delete window should be closed successfully
  
  @deleteMultipleAssignments
  Scenario: Admin/User/Staff Validate Disabled delete button
  Given Admin/User/Staff is on Assignments page
  When Admin/User/Staff clicks on delete button on the top left
  Then Admin/User/Staff/ should see a disabled delete button
  
   Scenario: Delete Multiple Assignment Functionalty
   Given Admin/User is on Assignments page
   When Admin/User clicks delete button on the top after selecting multiple checkbox
   Then Admin/User should see a message"Staff only have access"
   
   Scenario: Staff  validate delete button on the top left
   Given Staff is on Assignments page
   When Staff clicks delete button on the top aftr selecting multiple checkbox
   Then Staff should see a  Delete confirm window
   
   Scenario: Staff click Yes in Delete confirmation window
   Given Staff is on Assignments page
   When Staff clicks Yes
   Then All Assignments are deleted Successfully
  
   Scenario: Staff click No in Delete confirmation window
   Given Staff is on Assignments page
   When Staff clicks No
   Then Confirmation delete window should be closed successfully
 
 @checkbox  
 Scenario: Admin validate check box on the left side to the Assignment Name
   Given Admin is on Manage Assignment page
   When Admin clicks check box on the left side to the Assignment Name
   Then Admin should see a warning message "Admin dont have access  "
  
   Scenario: User/Staff validate check box on the left side to the Assignment Name
   Given User/Staff is on Manage Assignment page
   When User/Staff clicks individual checkbox button 
   Then User/Staff should see a enabled delete button on the top left
  


