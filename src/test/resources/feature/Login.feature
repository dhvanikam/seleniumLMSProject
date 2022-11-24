
@login
Feature: Login

	Background: Admin/User/Staff opens the LMS website  

  Scenario: Validates the login url
    Given Admin/User/Staff is on Browser
    When Admin/User/Staff opens the LMS website  
    Then Admin/user/Staff should be navigated to login page
    
  
  Scenario: Login-Valid Credentials
    Given Admin/User/Staff is on Login Page
    When User clicks login button after entering Username as "User" and Password as "User"  
    Then User see header text as "Manage Program"
    When Admin clicks login button after entering Username as "Admin" and Password as "Admin" and code as "12345"  
    Then Admin see header text as "Manage Program"  
    When Staff clicks login button after entering Username as "Staff" and Password as "Staff" and code as "54321"  
    Then Staff see header text as "Manage Program" 
    
    
  Scenario Outline: Login -Invalid Credentials for user
    Given User is on Login Page
    When User clicks login button after entering "<Username>" and "<Password>"
    Then User should see a error message "<Errormessage>"
    
    Examples:
    |Username||Password||Errormessage|
    |User||Userr||Invalid password|
    |Userr||User||Invalid username|
    |Userr||Userr||Invalid Username and Password|
    |Username|| ||enter valid password|
    
    
  Scenario Outline: Login -Invalid Credentials for Admin
	  Given Admin is on Login Page
	  When Admin clicks login button after entering  "valid username" "invalid Password" and "code" 
    Then Admin should see a error message "<Errormessage>"
     
    Examples:
    |Username||Password||code||Errormessage|
    |Admin||Adminn||12345||Invalid password|
    |Adminn||Admin||12345||Invalid username|
    |Admin||Admin||12555||Invalid code|
    
  Scenario Outline: Login -Invalid Credentials for Admin
	  Given Staff is on Login Page
	  When Staff clicks login button after entering  "valid username" "invalid Password" and "code" 
    Then Staff should see a error message "<Errormessage>"
     
    Examples:
    |Username||Password||code||Errormessage|
    |Staff||Staffs||54321||Invalid password|
    |Staffa||Staff||54321||Invalid username|
    |Staff||Staff||54222||Invalid code|
    
    
    
           

    
    
    
    
    

