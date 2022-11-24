package stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.cucumber.java.en.*;

public class Login_SD {
	Logger logger =  LogManager.getLogger();
	
	

@Given("Admin\\/User\\/Staff is on Browser")
public void admin_user_staff_is_on_browser() {
    
}

@When("Admin\\/User\\/Staff opens the LMS website")
public void admin_user_staff_opens_the_lms_website() {
	
	logger.info("User opens the LMS website");

}

@Then("Admin\\/user\\/Staff should be navigated to login page")
public void admin_user_staff_should_be_navigated_to_login_page() {
    
    
}

@Given("Admin\\/User\\/Staff is on Login Page")
public void admin_user_staff_is_on_login_page() {
    
}

@When("User clicks login button after entering Username as {string} and Password as {string}")
public void user_clicks_login_button_after_entering_username_as_and_password_as(String string, String string2) {
    
    
}

@Then("User see header text as {string}")
public void user_see_header_text_as(String string) {
   
}

@When("Admin clicks login button after entering Username as {string} and Password as {string} and code as {string}")
public void admin_clicks_login_button_after_entering_username_as_and_password_as_and_code_as(String string, String string2, String string3) {
    
}

@Then("Admin see header text as {string}")
public void admin_see_header_text_as(String string) {
   
}

@When("Staff clicks login button after entering Username as {string} and Password as {string} and code as {string}")
public void staff_clicks_login_button_after_entering_username_as_and_password_as_and_code_as(String string, String string2, String string3) {
  
}

@Then("Staff see header text as {string}")
public void staff_see_header_text_as(String string) {
   
}

@Given("User is on Login Page")
public void user_is_on_login_page() {
  
}

@When("User clicks login button after entering {string} and {string}")
public void user_clicks_login_button_after_entering_and(String string, String string2) {
  
}

@Then("User should see a error message {string}")
public void user_should_see_a_error_message(String string) {
   
}

@Given("Admin is on Login Page")
public void admin_is_on_login_page() {
   
}

@When("Admin clicks login button after entering  {string} {string} and {string}")
public void admin_clicks_login_button_after_entering_and(String string, String string2, String string3) {
    
}

@Then("Admin should see a error message {string}")
public void admin_should_see_a_error_message(String string) {
  
}

@Given("Staff is on Login Page")
public void staff_is_on_login_page() {
   
}

@When("Staff clicks login button after entering  {string} {string} and {string}")
public void staff_clicks_login_button_after_entering_and(String string, String string2, String string3) {
  
}

@Then("Staff should see a error message {string}")
public void staff_should_see_a_error_message(String string) {
 
}

@When("Admin\\/User\\/Staff clicks Forgot password link")
public void admin_user_staff_clicks_forgot_password_link() {
    
}

@Then("It should redirected to forgot Password page")
public void it_should_redirected_to_forgot_password_page() {
  
}

@Given("Admin\\/User\\/Staff is on Forgot Password Page")
public void admin_user_staff_is_on_forgot_password_page() {

}

@When("Admin\\/User\\/Staff clicks continue after entering valid email address")
public void admin_user_staff_clicks_continue_after_entering_valid_email_address() {
  
}

@Then("It should be redirected to enter verification code page")
public void it_should_be_redirected_to_enter_verification_code_page() {
  
}

@Given("Admin\\/User\\/Staff is on Enter verification code Page")
public void admin_user_staff_is_on_enter_verification_code_page() {
   
}

@When("Admin\\/User\\/Staff clicks continue after entering verification code")
public void admin_user_staff_clicks_continue_after_entering_verification_code() {
    
}

@Then("It should be redirected reset password page")
public void it_should_be_redirected_reset_password_page() {
   
}

@When("Admin\\/User\\/Staff should be redirected reset password page")
public void admin_user_staff_should_be_redirected_reset_password_page() {
   
}

@Then("The verification code should be resend to email")
public void the_verification_code_should_be_resend_to_email() {

}

@Given("Admin\\/User\\/Staff is on Reset Password Page")
public void admin_user_staff_is_on_reset_password_page() {
   
}

@When("Admin\\/User\\/Staff clicks submit button after entering new password and retype password")
public void admin_user_staff_clicks_submit_button_after_entering_new_password_and_retype_password() {

}

@Then("Admin\\/User\\/Staff  should be redirected to login page")
public void admin_user_staff_should_be_redirected_to_login_page() {
  
}

@When("Admin\\/User\\/Staff clicks submit button after entering password  with less than {int} characters")
public void admin_user_staff_clicks_submit_button_after_entering_password_with_less_than_characters(Integer int1) {
    
}

@Then("It should display an error message {string}")
public void it_should_display_an_error_message(String string) {
   
}

@Given("Admin\\/User\\/Staff clicks submit button after entering password without Capital letter")
public void admin_user_staff_clicks_submit_button_after_entering_password_without_capital_letter() {
    
}

@When("Admin\\/User\\/Staff clicks submit button after entering  password without Number")
public void admin_user_staff_clicks_submit_button_after_entering_password_without_number() {

}

@When("Admin\\/User\\/Staff clicks submit button after entering password without Special character")
public void admin_user_staff_clicks_submit_button_after_entering_password_without_special_character() {
   
}

@When("Admin\\/User\\/Staff clicks cancel button after entering new password and retype password")
public void admin_user_staff_clicks_cancel_button_after_entering_new_password_and_retype_password() {
    
}

@Then("Admin\\/User\\/Staff  should see a refreshed reset password page with empty fields")
public void admin_user_staff_should_see_a_refreshed_reset_password_page_with_empty_fields() {
   
}

	
	
}
