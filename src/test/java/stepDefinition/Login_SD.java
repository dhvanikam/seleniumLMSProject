package stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageObjectModel.Login_POM;

public class Login_SD {
	
	Logger logger =  LogManager.getLogger();

	Login_POM lp = new Login_POM();
	

@Given("Admin\\/User\\/Staff is on Browser")
public void admin_user_staff_is_on_browser() {
	
	
    
}
@When("Admin\\/User\\/Staff opens the LMS website")
public void admin_user_staff_opens_the_lms_website() {
	
	lp.openWebsite();
	
}

@Then("Admin\\/user\\/Staff should be navigated to login page")
public void admin_user_staff_should_be_navigated_to_login_page() {
	
	 lp.loginPage();
}

@Given("Admin\\/User\\/Staff is on Login Page")
public void admin_user_staff_is_on_login_page() {
	
	 lp.loginPage();
	
}

@When("User clicks login button after entering Username as {string} and Password as {string}")
public void user_clicks_login_button_after_entering_username_as_and_password_as(String uname, String pswd) {
	
	lp.setUsername(uname);
	lp.setPassword(pswd);
	lp.clickLoginButton();

}

@Then("User see header text as {string}")
public void user_see_header_text_as(String htext) {

	lp.headerText(htext);
}

@When("Admin clicks login button after entering Username as {string} and Password as {string} and code as {string}")
public void admin_clicks_login_button_after_entering_username_as_and_password_as_and_code_as(String aname, String apswd, String acode) {

	lp.loginAsAdmin(aname);
	lp.passwordAsAdmin(apswd);
	lp.codeAsAdmin(acode);
	lp.clickLoginButton();

}

@Then("Admin see header text as {string}")
public void admin_see_header_text_as(String htext) {
	
	lp.headerText(htext);
}

@When("Staff clicks login button after entering Username as {string} and Password as {string} and code as {string}")
public void staff_clicks_login_button_after_entering_username_as_and_password_as_and_code_as(String sname, String spswd, String scode) {
  
	lp.loginAsStaff(sname);
	lp.passwordAsStaff(spswd);
	lp.codeAsStaff(scode);
	lp.clickLoginButton();
}

@Then("Staff see header text as {string}")
public void staff_see_header_text_as(String htext) {
  
	lp.headerText(htext);
}

@Given("User is on Login Page")
public void user_is_on_login_page() {
 
	 lp.loginPage();
}

@When("User clicks login button after entering {string} and {string}")
public void user_clicks_login_button_after_entering_and(String Username, String Password) {
  
	lp.setUsername(Username);
	lp.setPassword(Password);
	lp.clickLoginButton();
}

@Then("User should see a error message {string}")
public void user_should_see_a_error_message(String errorMessage) {
 
	lp.isPageContainsText(errorMessage);
}

@Given("Admin is on Login Page")
public void admin_is_on_login_page() {
	
	lp.loginPage();
}

@When("Admin clicks login button after entering  {string} {string} and {string}")
public void admin_clicks_login_button_after_entering_and(String aname, String apswd, String acode) {
    
	lp.loginAsAdmin(aname);
	lp.passwordAsAdmin(apswd);
	lp.codeAsAdmin(acode);
	lp.clickLoginButton();
}

@Then("Admin should see a error message {string}")
public void admin_should_see_a_error_message(String errorMessage) {
    
	lp.isPageContainsText(errorMessage);
}

@Given("Staff is on Login Page")
public void staff_is_on_login_page() {
	
	lp.loginPage();
}

@When("Staff clicks login button after entering  {string} {string} and {string}")
public void staff_clicks_login_button_after_entering_and(String sname, String spswd, String scode) {
	  
	lp.loginAsStaff(sname);
	lp.passwordAsStaff(spswd);
	lp.codeAsStaff(scode);
	lp.clickLoginButton();
}

@Then("Staff should see a error message {string}")
public void staff_should_see_a_error_message(String errorMessage) {
 
	lp.isPageContainsText(errorMessage);
}

@When("Admin\\/User\\/Staff clicks Forgot password {string}")
public void admin_user_staff_clicks_forgot_password(String email) {
    
	lp.clickForgotPasswordLink(email);
}

@Then("It should redirected to forgot Password page")
public void it_should_redirected_to_forgot_password_page() {


}

@Given("Admin\\/User\\/Staff is on Forgot Password Page")
public void admin_user_staff_is_on_forgot_password_page() {
	

}


@When("Admin\\/User\\/Staff clicks continue after entering {string}")
public void admin_user_staff_clicks_continue_after_entering(String ValidEmail) {
    
	lp.setUsername(ValidEmail);
	lp.continuFromVerification();
}

@Then("It should be redirected to enter verification code page")
public void it_should_be_redirected_to_enter_verification_code_page() {
    
	lp.veryFicationCodePage();
}

@Given("Admin\\/User\\/Staff is on Enter verification code Page")
public void admin_user_staff_is_on_enter_verification_code_page() {
    
	lp.veryFicationCodePage();
}

@When("Admin\\/User\\/Staff clicks continue after entering verification code")
public void admin_user_staff_clicks_continue_after_entering_verification_code() {
   
	lp.continuFromVerification();
}

@Then("It should be redirected reset password page")
public void it_should_be_redirected_reset_password_page() {
    
	lp.resetPasswordPage();
}

@When("Admin\\/User\\/Staff should be redirected reset password page")
public void admin_user_staff_should_be_redirected_reset_password_page() {
    
	lp.resetPasswordPage();
	
}

@Then("The verification code should be resend to email")
public void the_verification_code_should_be_resend_to_email() {
	
	

}

@Given("Admin\\/User\\/Staff is on Reset Password Page")
public void admin_user_staff_is_on_reset_password_page() {
    
	lp.resetPasswordPage();
}

@When("Admin\\/User\\/Staff clicks submit button after entering {string} and {string}")
public void admin_user_staff_clicks_submit_button_after_entering_and(String NewPAssword, String RetypePassword) {
    
	lp.setNewPassword(NewPAssword,RetypePassword);
	lp.clickSubmitButton();
}


}
