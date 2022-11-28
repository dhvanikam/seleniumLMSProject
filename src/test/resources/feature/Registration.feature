@Register
Feature: Registration

 Background:
 Given Launch the webapplication
  
  #Header Validation
  Scenario: Header Validation
    Given Admin/User/Staff Logged on to LMS website
    When Admin/User/Staff lands on Registration page
    Then Admin/User/Staff sees the heading on the form as "Registration Form"
  
  #Login Button
   Scenario:  Validating the Login button visibility
   When Admin/User/Staff lands on Registration page
   Then Admin/User/Staff sees a button with text "Log in" on the form
   
   
  Scenario: Validating the Login button functionality
   When Admin/User/Staff selects the Log in button
   Then Admin/User/Staff lands on Log in page
   
   
  Scenario: Validating the Sign Up button visibility
   When Admin/User/Staff lands on Registration page
   Then Admin/User/Staff sees a button with text "Sign Up" on the form
   
#Register page Validation 
  Scenario: Validating the text fields on the Registration page
  Given Admin/User/Staff is on the Registeration Page
  When Admin/User/Staff Enters valid Data

|First Name|"numpy"|
|Last Name|"ninja"|
|Address|"1234 abc"|
|Street Name|"street"|
|City|"delhi"|
|Zip|"12345"|
|Phone Number|"123456789"|
|UserName|"numpyuser"|
|Email|"numpy@gmail.com"|
|Password|"numpy123"|
When Admin/User/Staff selects the respective State Name from the DropBox
Then The State Name will be displayed
When Admin/User/Staff Selects the Date of Birth from the Calender
Then Birth Date will be Displayed
When Admin/User/Staff Clicks on "Sign Up" button after entering all valid details
Then Admin/User/Staff registration should be successful

#Regiter page negative scenarios
Scenario: Invalid User Registration Details

Given Admin/User/Staff is on the Registeration Page
When Admin/User/Staff enters submit button with all fields empty
Then Admin/User/Staff should get a message "Enters all fields"

When Admin/User/Staff clicks Sign Up button with invalid First Name
Then Admin/User/Staff should get a message "Enter valid First Name !"

When Admin/User/Staff clicks Sign Up button with invalid Last Name
Then Admin/User/Staff should get a message "Enter valid Last Name"

When Admin/User/Staff clicks Sign Up button with invalid Address by not Providing House Number 
Then Admin/User/Staff should get a message "Enter valid Address"

When Admin/User/Staff clicks Sign Up button with invalid Street Name
Then Admin/User/Staff should get a message "Enter valid Street Name"

When Admin/User/Staff clicks Sign Up button with invalid Zip
Then Admin/User/Staff should get a message "Enter valid Zip"

When Admin/User/Staff clicks Sign Up button with invalid City
Then Admin/User/Staff should get a message "Enter valid City"

When Admin/User/Staff clicks Sign Up button without selecting State
Then Admin/User/Staff should get a message "State is required"

When Admin/User/Staff clicks Sign Up button with invalid Phone Number
Then Admin/User/Staff should get a message "Enter valid Phone Number"

When Admin/User/Staff clicks Sign Up button without selecting BirthDate
Then Admin/User/Staff should get a message "BirthDate is required"

When Admin/User/Staff clicks Sign Up button with invalid Admin/User/Staff Name
Then Admin/User/Staff should get a message"Please Enter valid Admin/User/Staff Name "

When Admin/User/Staff clicks Sign Up button with invalid Password
Then Admin/User/Staff should get a message "Enter valid Password"

When User clicks Sign Up button with existing Admin/User/Staff name
Then Admin/User/Staff should see the message "Admin/User/Staff name already exist"



































  
























  
   
   