
@login
Feature: Login

	Background: Admin/User/Staff opens the LMS website  

	@onLMS
  Scenario: Validates the login url
    Given Admin/User/Staff is on Browser
    When Admin/User/Staff opens the LMS website  
    Then Admin/user/Staff should be navigated to login page
    
  @VAlid-login
  Scenario: Login-Valid Credentials
    Given Admin/User/Staff is on Login Page
    When User clicks login button after entering Username as "User" and Password as "User"  
    Then User see header text as "Manage Program"
    When Admin clicks login button after entering Username as "Admin" and Password as "Admin" and code as "12345"  
    Then Admin see header text as "Manage Program"  
    When Staff clicks login button after entering Username as "Staff" and Password as "Staff" and code as "54321"  
    Then Staff see header text as "Manage Program" 
    
  @Invalid-user  
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
    
  @invalid-admin 
  Scenario Outline: Login -Invalid Credentials for Admin
	  Given Admin is on Login Page
	  When Admin clicks login button after entering  "valid username" "invalid Password" and "code" 
    Then Admin should see a error message "<Errormessage>"
     
    Examples:
    |Username||Password||code||Errormessage|
    |Admin||Adminn||12345||Invalid password|
    |Adminn||Admin||12345||Invalid username|
    |Admin||Admin||12555||Invalid code|
   
  @invalid-staff 
  Scenario Outline: Login -Invalid Credentials for Staff
	  Given Staff is on Login Page
	  When Staff clicks login button after entering  "valid username" "invalid Password" and "code" 
    Then Staff should see a error message "<Errormessage>"
     
    Examples:
    |Username||Password||code||Errormessage|
    |Staff||Staffs||54321||Invalid password|
    |Staffa||Staff||54321||Invalid username|
    |Staff||Staff||54222||Invalid code|
     
    @Validate-forgot-passwordlink
    Scenario: Validate forgot password link
    Given Admin/User/Staff is on Login Page
	  When Admin/User/Staff clicks Forgot password "link"
	  Then It should redirected to forgot Password page
	  
	  @Validate-forgotpassword-with-emailid
	  Scenario Outline: Validate forgot password with  email id
	  Given Admin/User/Staff is on Forgot Password Page
	  When Admin/User/Staff clicks continue after entering "<valid email address>"
	  Then It should be redirected to enter verification code page
	  
	  Examples:
	  |valid email address|
	  |Admin|
	  |User|
	  |Staff|
	  
	  @Validate-verifiction-code
	  Scenario: Validate verifiction code
	  Given Admin/User/Staff is on Enter verification code Page 
	  When Admin/User/Staff clicks continue after entering verification code 
	  Then It should be redirected reset password page 
	  
	  @Validate-clickhere-link-in-verificationcode-page
	  Scenario: Validate click here link in verification code page
	  Given Admin/User/Staff is on Enter verification code Page
	  When Admin/User/Staff should be redirected reset password page
	  Then The verification code should be resend to email  
	  
	  @validreset-password
	  Scenario Outline:  Valid Reset Password
	  Given Admin/User/Staff is on Reset Password Page
	  When Admin/User/Staff clicks submit button after entering "<new password>" and "<retype password>" 
	  Then Admin/User/Staff  should be redirected to login page
	  
	  Examples:
	  |new password||retype password|
	  |NewAdmin@12||NewAdmin@12|
	  |NewUser@12||NewUser@12|
	  |NewStaff@12||NewStaff@12|
	   	  
	  @invalidreset-password
	  Scenario: Validate Reset password with lessthan 8 characters
	  Given Admin/User/Staff is on Reset Password Page
	  When Admin/User/Staff clicks submit button after entering password  with less than eight characters
	  Then It should display an error message "The password must contain 8 characters"
	 
	  Scenario: Validate Reset password without capital letter
	  Given Admin/User/Staff is on Reset Password Page
	  When Admin/User/Staff clicks submit button after entering password without Capital letter 
	  Then It should display an error message "The password must contain one Capital letter"
	 
	  Scenario: Validate Reset password without number
	  When Admin/User/Staff clicks submit button after entering  password without Number
	  Then It should display an error message "The password must contain one Number"
	 
	  Scenario: Validate Reset password without special character
	  When Admin/User/Staff clicks submit button after entering password without Special character
	  Then It should display an error message "The password must contain one Special character"
	 
	  Scenario: Validate Reset password with cancel button
	  When Admin/User/Staff clicks cancel button after entering new password and retype password 
	  Then Admin/User/Staff  should see a refreshed reset password page with empty fields
	  
	  




	  
















    


    
    
    
    
           

    
    
    
    
    

