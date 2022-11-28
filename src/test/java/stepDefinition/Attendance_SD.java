package stepDefinition;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.*;
import pageObjectModel.Login_POM;
import stepDefinition.Hooks;
import utilities.Loggerload;

public class Attendance_SD {
	
	private static WebDriver driver=DriverManager.initializeDriver();;
	Attendance_POM attendance=new Attendance_POM();
	Login_POM login=new Login_POM();
	static String username;
	static int Flag;
	
	
	@Given("user Logged on to LMS Website")
	public void user_logged_on_to_lms_website() {
	    attendance.homepage();
	}

	@When("user enter valid {string} and {string}")
	public void user_enter_valid_and(String string, String string2) {
	    attendance.validlogin(string,string2);
	}


	@Then("click on login button")
	public void click_on_login_button() {
	    attendance.clicklogin();
	}
	

	@When("Admin\\/User\\/Staff Clicks on Attendance button")
	public void admin_user_staff_clicks_on_attendance_button() {
	    attendance.attendanceButton();
	    
	}

	@Then("Admin\\/User\\/Staff see header text as {string}")
	public void admin_user_staff_see_header_text_as(String string) {
		attendance.attendanceHeader(string);
	}

	@When("Admin\\/User\\/Staff is on Manage Attandance page")
	public void admin_user_staff_is_on_manage_attandance_page() {
		attendance.attendancePage();
	}

	@Then("Admin\\/User\\/Staff see Footer text as {string}")
	public void admin_user_staff_see_footer_text_as(String string) {
		attendance.attendanceFooter(string);
	}
	
	@When("Admin\\/User\\/Staff is on Manage Attendance page")
	public void admin_user_staff_is_on_manage_attendance_page() {
		attendance.attendancePage();
	}

	@Then("Admin\\/User\\/Staff see the text as {string}")
	public void admin_user_staff_see_the_text_as(String string) {
	  attendance.pagination(string);
	}

	@Then("Admin\\/User\\/Staff see all paginator buttons are Disabled")
	public void admin_user_staff_see_all_paginator_buttons_are_disabled() throws Exception {
	  attendance.paginationValidation();
	}

	@When("Admin\\/User\\/Staff Clicks on Checkbox")
	public void admin_user_staff_clicks_on_checkbox() {
	    attendance.clickCheckbox();
	}

	@Then("Admin\\/User\\/Staff  see list of Users in that Program")
	public void admin_user_staff_see_list_of_users_in_that_program() {
	    attendance.checkboxdisplay();
	}
	@When("Verifying the Functionality of a Present button")
	public void verifying_the_functionality_of_a_present_button() {
	    attendance.verifyPresent();
	}


	@When("Admin\\/User\\/Staff  Clicks on Present")
	public void admin_user_staff_clicks_on_present() {
	   attendance.clickPresent();
	}

	
	@Then("Admin\\/User\\/Staff  see the list of  User Name who are Present")
	public void admin_user_staff_see_the_list_of_user_name_who_are_present() {
		attendance.clickAbsent();
	}
	
	@When("Verifying the Functionality of a absent button")
	public void verifying_the_functionality_of_a_absent_button() {
	    attendance.displayabsense();
	}


	@Then("Admin\\/User\\/Staff  see the list of  User Name who are Absent")
	public void admin_user_staff_see_the_list_of_user_name_who_are_absent() {
	    attendance.displayabsense();
	}
	
	//Given user as staff/user credential

   @Given("User\\/Staff Logged on to LMS as {string} or {string}")
   public void user_staff_logged_on_to_lms_as_or(String User, String Staff) {
    
	   attendance.validuser(User,Staff);
	   
	   }
   
      
   	@When("User\\/Staff Clicks on Edit Button")
	public void user_staff_clicks_on_edit_button() {
	    
		attendance.clickEditButton();
		
	}
   	
   	@Then("User\\/Staff see header text as {string}")
	public void user_satff_see_header_text_as(String AttendanceDetails) {
	 
		attendance.attendanceHeader(AttendanceDetails);
		
	}

	
	@When("User\\/Staff clicks on Save button after changing Program Name")
	public void user_staff_clicks_on_save_button_after_changing_program_name() {
	    attendance.saveButton();
	}

	@Then("User\\/Staff see the success message {string}")
	public void user_staff_see_the_success_message(String string) {
	   attendance.successmsg(string);
	}

	@When("User\\/Staff clicks on Save button after changing User name")
	public void user_staff_clicks_on_save_button_after_changing_user_name() {
	    attendance.saveButton();
	}

	@When("User\\/Staff clicks on Save button after disabling Present details")
	public void user_staff_clicks_on_save_button_after_disabling_present_details() {
	    attendance.saveButton();
	}

	@When("User\\/Staff clicks on Save button after enabling Absent details")
	public void user_staff_clicks_on_save_button_after_enabling_absent_details() {
		 attendance.saveButton();
	}

	
	@When("User\\/Staff clicks on Cancel button after entering details")
	public void user_staff_clicks_on_cancel_button_after_entering_details() {
	    attendance.cancelButton();
	}

	@Then("User\\/Staff see a Attendance Details window getting closed")
	public void user_staff_see_a_attendance_details_window_getting_closed() {
		attendance.closeButton();
	}

	@When("User\\/Staff Clicks on Delete Button")
	public void user_staff_clicks_on_delete_button() {
	    attendance.deleteButton();
	}
	
	@Then("see delete confirm window")
	public void see_delete_confirm_window() {
	    attendance.deletepopup();
	}


	@When("User\\/Staff  Clicks on {string} button")
	public void user_staff_clicks_on_button(String string) {
		if (string=="yes")
		{
			attendance.clickYes();
		}
		
			attendance.clickNO();
	}


	@Then("User\\/Staff  see Success message {string}")
	public void user_staff_see_success_message(String string) {
		
		attendance.successmsg(string);
	    
	}

	
	@Then("User\\/Staff can see Program Name not deleted")
	public void user_staff_can_see_program_name_not_deleted() {
		
		attendance.cancelButton();
	}
	
	//Given user as admin Credential

	@Given("Admin Logged onto LMS as {string}")
	public void admin_logged_onto_lms_as(String Admin) {
		attendance.validadmin(Admin);
		   
	}

	@When("Admin clicks on the Edit Button")
	public void admin_clicks_on_the_edit_button() {
	    
		attendance.clickEditButton();
	}
	@Then("Admin see Error Message {string}")
	public void admin_see_error_message(String string) {
	    
		attendance.errorMsg(string);
	}

	@When("Admin Clicks on Delete Button")
	public void admin_clicks_on_delete_button() {
	    
		attendance.deleteButton();
	}
}