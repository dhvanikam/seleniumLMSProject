package stepDefinition;


import utilities.Loggerload;

import io.cucumber.java.en.*;
import pageObjectModel.Assignment_POM;

public class Assignment_SD {
	
	//Loggerload logger =  LogManager.getLogger();
	Assignment_POM as = new Assignment_POM();

	@Given("Admin\\/User\\/Staff Logged on to LMS website")
	public void admin_user_staff_logged_on_to_lms_website() {
		
		as.openWebsite();
	    
	}

	@Given("Admin\\/User\\/Staff is on Assignment Page")
	public void admin_user_staff_is_on_assignment_page() {
		
		as.manageAssignmentPage();
	    
	}

	@When("Admin\\/User\\/Staff clicks on Assignment Page")
	public void admin_user_staff_clicks_on_assignment_page() {
		
		
	   
	}

	@Then("Admin\\/User\\/Staff Should see a Header {string}")
	public void admin_user_staff_should_see_a_header(String htext) {
	    
		as.headerText(htext);
	}

	@Then("Admin\\/User\\/Staff Should see a Footer text {string}")
	public void admin_user_staff_should_see_a_footer_text(String ftext) {
		
		as.footerText(ftext);
	    
	}

	@Then("Admin\\/User\\/Staff Should see a Paginator text {string}")
	public void admin_user_staff_should_see_a_paginator_text(String ptext) {
		
		as.paginatorText(ptext);
	    
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-next button")
	public void admin_user_staff_clicks_on_enabled_paginator_next_button() throws Exception {
	    
		as.nextButton();
	}

	@Then("Admin\\/User\\/Staff Should be navigated to next page")
	public void admin_user_staff_should_be_navigated_to_next_page() {
	    
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-privious button")
	public void admin_user_staff_clicks_on_enabled_paginator_privious_button() throws Exception {
	    
		as.priviousButton();
	}

	@Then("Admin\\/User\\/Staff Should be navigated to previous page")
	public void admin_user_staff_should_be_navigated_to_previous_page() {
	    
		
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-last button")
	public void admin_user_staff_clicks_on_enabled_paginator_last_button() throws Exception {
	    
		as.lastButton();
	}

	@Then("Admin\\/User\\/Staff Should be navigated to Last page")
	public void admin_user_staff_should_be_navigated_to_last_page() {
	   
		
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-first button")
	public void admin_user_staff_clicks_on_enabled_paginator_first_button() throws Exception {
	   
		as.firstButton();
	}

	@Then("Admin\\/User\\/Staff Should be navigated to First  page")
	public void admin_user_staff_should_be_navigated_to_first_page() {
	    
		
	}

	@When("Admin\\/User\\/Staff clicks Search bar after entering {string}")
	public void admin_user_staff_clicks_search_bar_after_entering(String AssignmentName) {
	    
		as.checkSearchBox(AssignmentName);
	}

	@Then("The requested assignment details should be displayed")
	public void the_requested_assignment_details_should_be_displayed() throws Exception {
	    
		as.searchAssignmentDetail();
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Name Ascending Arrow")
	public void admin_user_staff_clicks_on_assignment_name_ascending_arrow() {
	    
		
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Name displayed in Ascending order")
	public void admin_user_staff_should_see_the_assignment_name_displayed_in_ascending_order() {
	    
		
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Description Ascending Arrow")
	public void admin_user_staff_clicks_on_assignment_description_ascending_arrow() {
	    
		
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Description displayed in Ascending order")
	public void admin_user_staff_should_see_the_assignment_description_displayed_in_ascending_order() {
	    
		
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Due Date Ascending Arrow")
	public void admin_user_staff_clicks_on_assignment_due_date_ascending_arrow() {
	    
		
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Due Date displayed in Ascending order")
	public void admin_user_staff_should_see_the_assignment_due_date_displayed_in_ascending_order() {
	    
		
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Grade Ascending Arrow")
	public void admin_user_staff_clicks_on_assignment_grade_ascending_arrow() {
	    
		
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Grade displayed in Ascending order")
	public void admin_user_staff_should_see_the_assignment_grade_displayed_in_ascending_order() {
	    
		
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Name Descending Arrow")
	public void admin_user_staff_clicks_on_assignment_name_descending_arrow() {
	    
		
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Name displayed in Descending order")
	public void admin_user_staff_should_see_the_assignment_name_displayed_in_descending_order() {
	    
		
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Description Descending Arrow")
	public void admin_user_staff_clicks_on_assignment_description_descending_arrow() {
	    
		
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Description displayed in Descending order")
	public void admin_user_staff_should_see_the_assignment_description_displayed_in_descending_order() {
	   
		
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Due Date Descending Arrow")
	public void admin_user_staff_clicks_on_assignment_due_date_descending_arrow() {
	    
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Due Date displayed in Descending order")
	public void admin_user_staff_should_see_the_assignment_due_date_displayed_in_descending_order() {
	    
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Grade Descending Arrow")
	public void admin_user_staff_clicks_on_assignment_grade_descending_arrow() {
	    
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Grade displayed in Descending order")
	public void admin_user_staff_should_see_the_assignment_grade_displayed_in_descending_order() {
	    
	}

	@Given("Staff is on Manage Assignment page")
	public void staff_is_on_manage_assignment_page() {
	    
		as.manageAssignmentPage();
	}

	@When("Staff clicks a Add new assignment button")
	public void staff_clicks_a_add_new_assignment_button() throws Exception {
	    
		as.addNewAssignmentButton();
	}

	@Then("Staff should see Assignment details window")
	public void staff_should_see_assignment_details_window() {
	    
		as.assignmentDetailPage();
	}

	@Given("Admin\\/User is on Manage Assignment page")
	public void admin_user_is_on_manage_assignment_page() {
	    
		as.manageAssignmentPage();
	}

	@When("Admin\\/User Click on add New Assignment")
	public void admin_user_click_on_add_new_assignment() throws Exception {
		
		as.addNewAssignmentButton();
	    
	}

	@Then("Admin\\/User should see a message {string}")
	public void admin_user_should_see_a_message(String string) {
	    
		as.isPageContainsText(string);
	}

	@Given("Staff is on Assignment Details page")
	public void staff_is_on_assignment_details_page() {
	   
		as.assignmentDetailPage();
	}

	@When("Staff  clicks on Save after leaving all the fields empty")
	public void staff_clicks_on_save_after_leaving_all_the_fields_empty() {
	    
		as.allFieldsEmpty();
	}

	@Then("Staff should see an error message {string}")
	public void staff_should_see_an_error_message(String string) {
	    
		as.isPageContainsText(string);
	}

	@When("Staff clicks Save button after entering assignment name,description,Grade and Duedate")
	public void staff_clicks_save_button_after_entering_assignment_name_description_grade_and_duedate() throws Exception {
	    
		as.addAllFields();
		as.clickSaveButton();
	}

	@Then("Staff should see a message {string}")
	public void staff_should_see_a_message(String string) {
	    
		as.isPageContainsText(string);
	}

	@When("Staff clicks cancel button with entering all fields")
	public void staff_clicks_cancel_button_with_entering_all_fields() throws Exception {
	    
		as.addAllFields();
		as.clickCancelButton();
	}

	@Then("Staff should see a Assignment details window is closed")
	public void staff_should_see_a_assignment_details_window_is_closed() {
	    as.manageAssignmentPage();
	}

	@Given("Admin\\/User\\/Staff is on Assignments page")
	public void admin_user_staff_is_on_assignments_page() {
	    
		as.manageAssignmentPage();
	}

	@When("Admin\\/User\\/Staff clicks on Assignment")
	public void admin_user_staff_clicks_on_assignment() {
	    
		
	}

	@Then("Admin\\/User\\/Staff should see a newly added Assignment")
	public void admin_user_staff_should_see_a_newly_added_assignment() {
	    
	}

	@Given("Staff is on Assignment page")
	public void staff_is_on_assignment_page() {
	    
	}

	@When("Staff clicks manage button under Assignment Grade")
	public void staff_clicks_manage_button_under_assignment_grade() {
	   
	}

	@Then("Staff should be navigated to Grade Window")
	public void staff_should_be_navigated_to_grade_window() {
	   
	}

	@When("Staff clicks an edit Assignment button")
	public void staff_clicks_an_edit_assignment_button() {
	    
	}

	@Then("Staff should see a Assignment details window")
	public void staff_should_see_a_assignment_details_window() {
	    
	}

	@When("Staff clicks Save button after edits Assignment Name")
	public void staff_clicks_save_button_after_edits_assignment_name() {
	    
	}

	@When("Staff clicks Save button after edits Assignment Description")
	public void staff_clicks_save_button_after_edits_assignment_description() {
	    
	}

	@Given("Staff is on Assignment Details window")
	public void staff_is_on_assignment_details_window() {
	    
	}

	@When("Staff clicks Save button after edits Assignment Grade")
	public void staff_clicks_save_button_after_edits_assignment_grade() {
	    
	}

	@When("Staff clicks Save button after edits Assignment DueDate")
	public void staff_clicks_save_button_after_edits_assignment_due_date() {
	    
	}

	@When("Staff clicks cancel button")
	public void staff_clicks_cancel_button() {
	    
	}

	@Then("Staff Should see a Assignment Details Page is closed")
	public void staff_should_see_a_assignment_details_page_is_closed() {
	    
	}

	@When("Admin\\/User clicks Edit button")
	public void admin_user_clicks_edit_button() {
	    
	}

	@Then("Admin\\/User should see a messages {string}")
	public void admin_user_should_see_a_messages(String string) {
	    
	}

	@Given("Admin is on Assignment page")
	public void admin_is_on_assignment_page() {
	   
	}

	@When("Admin clicks on Assignment Name")
	public void admin_clicks_on_assignment_name() {
	    
	}

	@Then("Admin should see a warning message {string}")
	public void admin_should_see_a_warning_message(String string) {
	   
		
	}
	
@Given("User is on Assignment page")
public void user_is_on_assignment_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User clicks on Assignment Name")
public void user_clicks_on_assignment_name() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should be navigated to Assignment Google form page")
public void user_should_be_navigated_to_assignment_google_form_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("User is on Assignment  Google form page")
public void user_is_on_assignment_google_form_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User clicks on submit button after entering all questions and mail id")
public void user_clicks_on_submit_button_after_entering_all_questions_and_mail_id() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User entered google forms successfully")
public void user_entered_google_forms_successfully() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User clicks on submit button after leaving all questions and mail id")
public void user_clicks_on_submit_button_after_leaving_all_questions_and_mail_id() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should get a warning message {string}")
public void user_should_get_a_warning_message(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


	@When("User clicks clear form button after entering all questions and mail id")
	public void user_clicks_clear_form_button_after_entering_all_questions_and_mail_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The Assignment Google form cleared successfully")
	public void the_assignment_google_form_cleared_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks Switch account link")
	public void user_clicks_switch_account_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should be switched over the account Successfully")
	public void user_should_be_switched_over_the_account_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("Admin\\/User\\/Staff is on Manage Assignment page")
	public void admin_user_staff_is_on_manage_assignment_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User clicks on delete button")
	public void admin_user_clicks_on_delete_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User should see a message\"Staff only have access\"")
	public void admin_user_should_see_a_message_staff_only_have_access() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Staff clicks on delete button")
	public void staff_clicks_on_delete_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Staff should see a Delete Confirmation window")
	public void staff_should_see_a_delete_confirmation_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Staff is on Delete Confirmation window")
	public void staff_is_on_delete_confirmation_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Staff clicks Yes")
	public void staff_clicks_yes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Staff Should see \"Assignment Deleted Successfully")
	public void staff_should_see_assignment_deleted_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Staff clicks No")
	public void staff_clicks_no() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Confirmation delete window should be closed successfully")
	public void confirmation_delete_window_should_be_closed_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff clicks on delete button on the top left")
	public void admin_user_staff_clicks_on_delete_button_on_the_top_left() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff\\/ should see a disabled delete button")
	public void admin_user_staff_should_see_a_disabled_delete_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin\\/User is on Assignments page")
	public void admin_user_is_on_assignments_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User clicks delete button on the top after selecting multiple checkbox")
	public void admin_user_clicks_delete_button_on_the_top_after_selecting_multiple_checkbox() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Staff is on Assignments page")
	public void staff_is_on_assignments_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Staff clicks delete button on the top aftr selecting multiple checkbox")
	public void staff_clicks_delete_button_on_the_top_aftr_selecting_multiple_checkbox() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Staff should see a  Delete confirm window")
	public void staff_should_see_a_delete_confirm_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("All Assignments are deleted Successfully")
	public void all_assignments_are_deleted_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is on Manage Assignment page")
	public void admin_is_on_manage_assignment_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks check box on the left side to the Assignment Name")
	public void admin_clicks_check_box_on_the_left_side_to_the_assignment_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User\\/Staff is on Manage Assignment page")
	public void user_staff_is_on_manage_assignment_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User\\/Staff clicks individual checkbox button")
	public void user_staff_clicks_individual_checkbox_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User\\/Staff should see a enabled delete button on the top left")
	public void user_staff_should_see_a_enabled_delete_button_on_the_top_left() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
