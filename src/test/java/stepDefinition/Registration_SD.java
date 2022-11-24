package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.Registration_POM;

public class Registration_SD 
{
	public static WebDriver driver=DriverManager.initializeDriver();
	Registration_POM register=new Registration_POM();
	
@Given("Admin\\/User\\/Staff Logged on to LMS website")
public void admin_user_staff_logged_on_to_lms_website() {
		
	//driver.get("https://lmsnumpy.com");
	}

@When("Admin\\/User\\/Staff lands on Registration page")
public void admin_user_staff_lands_on_registration_page() {
	
    register.registrationPage();
}

@Then("Admin\\/User\\/Staff sees the heading on the form as {string}")
public void admin_user_staff_sees_the_heading_on_the_form_as(String string) {
   
	register.verifyHeader(string);
}

@Then("Admin\\/User\\/Staff sees a button with text {string} on the form")
public void admin_user_staff_sees_a_button_with_text_on_the_form(String string) {
	
	register.validatelogin(string);
}

@When("Admin\\/User\\/Staff selects the Log in button")
public void admin_user_staff_selects_the_log_in_button() {
	
	register.verifylogin();
}

@Then("Admin\\/User\\/Staff lands on Log in page")
public void admin_user_staff_lands_on_log_in_page() {
  
	register.loginpage();
}

@Given("Admin\\/User\\/Staff is on the Registeration Page")
public void admin_user_staff_is_on_the_registeration_page() {
    register.registrationPage();
}

@When("Admin\\/User\\/Staff Enters valid Data")
public void admin_user_staff_enters_valid_data(io.cucumber.datatable.DataTable dataTable) {
	register.entervalidData( dataTable);
   
}

@When("Admin\\/User\\/Staff selects the respective State Name from the DropBox")
public void admin_user_staff_selects_the_respective_state_name_from_the_drop_box() {
   register.selectstate();
}

@Then("The State Name will be displayed")
public void the_state_name_will_be_displayed() {
    register.displaystate();
}

@When("Admin\\/User\\/Staff Selects the Date of Birth from the Calender")
public void admin_user_staff_selects_the_date_of_birth_from_the_calender() {
   register.selectdob();
}

@Then("Birth Date will be Displayed")
public void birth_date_will_be_displayed() {
    register.displaydob();
}

@When("Admin\\/User\\/Staff Clicks on {string} button after entering all valid details")
public void admin_user_staff_clicks_on_button_after_entering_all_valid_details(String string) {
    register.signupButton();
}

@Then("Admin\\/User\\/Staff registration should be successful")
public void admin_user_staff_registration_should_be_successful() {
   register.displaySuccess();
}

@When("Admin\\/User\\/Staff enters submit button with all fields empty")
public void admin_user_staff_enters_submit_button_with_all_fields_empty() {
    register.signupButton();
}

@Then("Admin\\/User\\/Staff should get a message {string}")
public void admin_user_staff_should_get_a_message(String errormsg) {
   register.error(errormsg);
}

@When("Admin\\/User\\/Staff clicks Sign Up button with invalid First Name")
public void admin_user_staff_clicks_sign_up_button_with_invalid_first_name() {
    register.invalid_firstname();
}

@Then("Admin\\/User\\/Staff should get a message\"Enter valid First Name \"")
public void admin_user_staff_should_get_a_message_enter_valid_first_name() {
	register.getErrorMsg_firstname();
}

@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Last Name")
public void admin_user_staff_clicks_sign_up_button_with_invalid_last_name() {
	 register.invalid_lastname();
}

@Then("Admin\\/User\\/Staff should get a message\"Enter valid Last Name\"")
public void admin_user_staff_should_get_a_message_enter_valid_last_name() {
	register.getErrorMsg_lastname();
}

@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Address by not Providing House Number")
public void admin_user_staff_clicks_sign_up_button_with_invalid_address_by_not_providing_house_number() {
	 register.invalid_houseno();
}

@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Street Name")
public void admin_user_staff_clicks_sign_up_button_with_invalid_street_name() {
	register.getErrorMsg_houseno();
}

@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Zip")
public void admin_user_staff_clicks_sign_up_button_with_invalid_zip() {
	 register.invalid_zip();
}

@When("Admin\\/User\\/Staff clicks Sign Up button with invalid City")
public void admin_user_staff_clicks_sign_up_button_with_invalid_city() {
	register.getErrorMsg_zip();
}

@When("Admin\\/User\\/Staff clicks Sign Up button without selecting State")
public void admin_user_staff_clicks_sign_up_button_without_selecting_state() {
	 register.invalid_state();
}

@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Phone Number")
public void admin_user_staff_clicks_sign_up_button_with_invalid_phone_number() {
	register.getErrorMsg_state();
}

@When("Admin\\/User\\/Staff clicks Sign Up button without selecting BirthDate")
public void admin_user_staff_clicks_sign_up_button_without_selecting_birth_date() {
	 register.invalid_dob();
	 register.getErrorMsg_dob();
}

@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Admin\\/User\\/Staff Name")
public void admin_user_staff_clicks_sign_up_button_with_invalid_admin_user_staff_name() {
	register.invalid_username();
}

@Then("Admin\\/User\\/Staff should get a message\"Please Enter valid Admin\\/User\\/Staff Name \"")
public void admin_user_staff_should_get_a_message_please_enter_valid_admin_user_staff_name() {
	 register.getErrorMsg_username();
}

@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Password")
public void admin_user_staff_clicks_sign_up_button_with_invalid_password() {
	register.invalid_pwd();
}

@When("User clicks Sign Up button with existing Admin\\/User\\/Staff name")
public void user_clicks_sign_up_button_with_existing_admin_user_staff_name() {
	register.existing_username();
}

@Then("Admin\\/User\\/Staff should see the message {string}")
public void admin_user_staff_should_see_the_message(String string) {
	register.error(string);
}
}