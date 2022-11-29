package stepDefinition;


//import utilities.Loggerload;
import utilities.SwitchWindowUtility;

import org.openqa.selenium.WebDriver;
//import pageObjectModel.Login_POM;
import io.cucumber.java.en.*;
import pageObjectModel.Assignment_POM;

public class Assignment_SD {

	public static WebDriver driver = DriverManager.getChromedriver();
	Assignment_POM as = new Assignment_POM();
	SwitchWindowUtility SW = new SwitchWindowUtility();
	
	@Given("Assignment_Admin\\/User\\/Staff is on Assignment Page")
	public void assignment_admin_user_staff_is_on_assignment_page() {
		
		as.manageAssignmentPage();
	    
	}

	@When("Assignment_Admin\\/User\\/Staff clicks on Assignment Page")
	public void assignment_admin_user_staff_clicks_on_assignment_page()  {
		as.manageAssignmentPage();
	   
	}

	@Then("Assignment_Admin\\/User\\/Staff Should see a Header {string}")
	public void assignment_admin_user_staff_should_see_a_header(String htext) {
	    
		as.headerText(htext);
	}

	@Then("Assignment_Admin\\/User\\/Staff Should see a Footer text {string}")
	public void assignment_admin_user_staff_should_see_a_footer_text(String ftext) {
		
		as.footerText(ftext);
	    
	}

	@Then("Assignment_Admin\\/User\\/Staff Should see a Paginator text {string}")
	public void assignment_admin_user_staff_should_see_a_paginator_text(String ptext) {
		
		as.paginatorText(ptext);
	    
	}

	@When("Assignment_Admin\\/User\\/Staff Clicks on Enabled paginator-next button")
	public void assignment_admin_user_staff_clicks_on_enabled_paginator_next_button() throws Exception {
	    
		as.storeCurrentPageNumber();
		as.nextButton();
	}

	@Then("Assignment_Admin\\/User\\/Staff Should be navigated to next page")
	public void assignment_admin_user_staff_should_be_navigated_to_next_page() {
	    
		
		as.verifyNextPage();
		
	}

	@When("Assignment_Admin\\/User\\/Staff Clicks on Enabled paginator-privious button")
	public void assignment_admin_user_staff_clicks_on_enabled_paginator_privious_button() throws Exception {
	    
		as.storeCurrentPageNumber();
		as.priviousButton();
	}

	@Then("Assignment_Admin\\/User\\/Staff Should be navigated to previous page")
	public void assignment_admin_user_staff_should_be_navigated_to_previous_page() {
	    
		as.verifyPreviuosPage();
		
	}

	@When("Assignment_Admin\\/User\\/Staff Clicks on Enabled paginator-last button")
	public void assignment_admin_user_staff_clicks_on_enabled_paginator_last_button() throws Exception {
	    
		
		as.lastButton();
	}

	@Then("Assignment_Admin\\/User\\/Staff Should be navigated to Last page")
	public void assignment_admin_user_staff_should_be_navigated_to_last_page() {
	   
		as.verifyLastPage();
	}

	@When("Assignment_Admin\\/User\\/Staff Clicks on Enabled paginator-first button")
	public void assignment_admin_user_staff_clicks_on_enabled_paginator_first_button() throws Exception {
	   
		as.firstButton();
	}

	@Then("Assignment_Admin\\/User\\/Staff Should be navigated to First  page")
	public void assignment_admin_user_staff_should_be_navigated_to_first_page() {
	    
		as.verifyFirstPage();
	}

	@When("Assignment_Admin\\/User\\/Staff clicks Search bar after entering {string}")
	public void assignment_admin_user_staff_clicks_search_bar_after_entering(String AssignmentName) {
	    
		as.checkSearchBox(AssignmentName);
	}
	
	@Then("Assignment_The assignment details should be displayed for {string}")
	public void assignment_the_assignment_details_should_be_displayed_for(String AssignmentName) throws Exception {
	  
		as.VerifySearchAssignmentDetail(AssignmentName);
	}
	@Then("Assignment_The requested assignment as {string} details should be displayed")
	public void assignment_the_requested_assignment_as_details_should_be_displayed(String assignment) throws Exception {
	   as.VerifySearchAssignmentDetail(assignment);
	}

	@When("Assignment_Admin\\/User\\/Staff Clicks on Assignment Name Ascending Arrow")
	public void assignment_admin_user_staff_clicks_on_assignment_name_ascending_arrow() throws Exception {
	    
		as.clickOnAssignmentNameAscArrow();
	}

	@Then("Assignment_Admin\\/User\\/Staff should see the Assignment Name displayed in Ascending order")
	public void assignment_admin_user_staff_should_see_the_assignment_name_displayed_in_ascending_order() {
	    
		as.verifyASCOrderAssignmentName();
	}

	@When("Assignment_Admin\\/User\\/Staff Clicks on Assignment Description Ascending Arrow")
	public void assignment_admin_user_staff_clicks_on_assignment_description_ascending_arrow() throws Exception {
	    
		as.clickOnAssignmentDescAscArrow();
	}

	@Then("Assignment_Admin\\/User\\/Staff should see the Assignment Description displayed in Ascending order")
	public void assignment_admin_user_staff_should_see_the_assignment_description_displayed_in_ascending_order() {
	    
		as.verifyASCOrderAssignmentDesc();
	}

	@When("Assignment_Admin\\/User\\/Staff Clicks on Assignment Due Date Ascending Arrow")
	public void assignment_admin_user_staff_clicks_on_assignment_due_date_ascending_arrow() throws Exception {
	    
		as.clickOnAssDueDateAscArrow();
		
	}

	@Then("Assignment_Admin\\/User\\/Staff should see the Assignment Due Date displayed in Ascending order")
	public void assignment_admin_user_staff_should_see_the_assignment_due_date_displayed_in_ascending_order() {
	    
		
		as.verifyASCOrderAssignmentDueDate();
	}

	@When("Assignment_Admin\\/User\\/Staff Clicks on Assignment Grade Ascending Arrow")
	public void assignment_admin_user_staff_clicks_on_assignment_grade_ascending_arrow() {
	    
		//**********************
	}

	@Then("Assignment_Admin\\/User\\/Staff should see the Assignment Grade displayed in Ascending order")
	public void assignment_admin_user_staff_should_see_the_assignment_grade_displayed_in_ascending_order() {
	    
		//****************
	}

	@When("Assignment_Admin\\/User\\/Staff Clicks on Assignment Name Descending Arrow")
	public void assignment_admin_user_staff_clicks_on_assignment_name_descending_arrow() throws Exception {
	    
		as.clickOnAssignmentNameDescArrow();
	}

	@Then("Assignment_Admin\\/User\\/Staff should see the Assignment Name displayed in Descending order")
	public void assignment_admin_user_staff_should_see_the_assignment_name_displayed_in_descending_order() {
	    
		as.verifyDESCOrder_AssignmentName();
	}

	@When("Assignment_Admin\\/User\\/Staff Clicks on Assignment Description Descending Arrow")
	public void assignment_admin_user_staff_clicks_on_assignment_description_descending_arrow() throws Exception {
	    
		as.clickOnAssignmentDescDescArrow();
	}

	@Then("Assignment_Admin\\/User\\/Staff should see the Assignment Description displayed in Descending order")
	public void assignment_admin_user_staff_should_see_the_assignment_description_displayed_in_descending_order() {
	   
		as.verifyDESCOrder_AssignmentDescription();
	}

	@When("Assignment_Admin\\/User\\/Staff Clicks on Assignment Due Date Descending Arrow")
	public void assignment_admin_user_staff_clicks_on_assignment_due_date_descending_arrow() throws Exception {
	    
		as.clickOnAssDueDateDescArrow();
	}

	@Then("Assignment_Admin\\/User\\/Staff should see the Assignment Due Date displayed in Descending order")
	public void assignment_admin_user_staff_should_see_the_assignment_due_date_displayed_in_descending_order() {
	    
		as.verifyDESCOrder_AssignmentDueDate();
	}

	@When("Assignment_Admin\\/User\\/Staff Clicks on Assignment Grade Descending Arrow")
	public void assignment_admin_user_staff_clicks_on_assignment_grade_descending_arrow() {
	    
		//*************
	}

	@Then("Assignment_Admin\\/User\\/Staff should see the Assignment Grade displayed in Descending order")
	public void assignment_admin_user_staff_should_see_the_assignment_grade_displayed_in_descending_order() {
	   //****************** 
	}

	@Given("Assignment_Staff is on Manage Assignment page")
	public void assignment_staff_is_on_manage_assignment_page() {
	    
		as.manageAssignmentPage();
	}

	@When("Assignment_Staff clicks a Add new assignment button")
	public void assignment_staff_clicks_a_add_new_assignment_button() throws Exception {
	    
		as.clickAddNewAssignmentButton();
	}

	@Then("Assignment_Staff should see Assignment details window")
	public void assignment_staff_should_see_assignment_details_window() {
	    
		as.assignmentDetailPage();
	}

	@Given("Assignment_Admin\\/User is on Manage Assignment page")
	public void assignment_admin_user_is_on_manage_assignment_page() {
	    
		as.manageAssignmentPage();
	}

	@When("Assignment_Admin\\/User Click on add New Assignment")
	public void assignment_admin_user_click_on_add_new_assignment() throws Exception {
		
		
		as.clickAddNewAssignmentButton();
	    
	}

	@Then("Assignment_Admin\\/User should see a message {string}")
	public void assignment_admin_user_should_see_a_message(String string) {
	    
		as.isPageContainsText(string);
	}

	@Given("Assignment_Staff is on Assignment Details page")
	public void assignment_staff_is_on_assignment_details_page() {
	   
		as.assignmentDetailPage();
	}

	@When("Assignment_Staff  clicks on Save after leaving all the fields empty")
	public void assignment_staff_clicks_on_save_after_leaving_all_the_fields_empty() throws Exception {
	    
		as.allFieldsEmpty();
		as.clickSaveButton();
	}

	@Then("Assignment_Staff should see an error message {string}")
	public void assignment_staff_should_see_an_error_message(String string) {
	    
		as.isPageContainsText(string);
	}

	@When("Assignment_Staff clicks Save button after entering assignment name,description,Grade and Duedate")
	public void assignment_staff_clicks_save_button_after_entering_assignment_name_description_grade_and_duedate() throws Exception {
	    
		as.addAllFieldsFull();
		as.clickSaveButton();
	}

	@Then("Assignment_Staff should see a message {string}")
	public void assignment_staff_should_see_a_message(String string) {
	    
		as.isPageContainsText(string);
	}

	@When("Assignment_Staff clicks cancel button with entering all fields")
	public void assignment_staff_clicks_cancel_button_with_entering_all_fields() throws Exception {
	    
		as.addAllFieldsFull();
		as.clickCancelButton();
	}

	@Then("Assignment_Staff should see a Assignment details window is closed")
	public void assignment_staff_should_see_a_assignment_details_window_is_closed() {
	    as.manageAssignmentPage();
	}

	@Given("Assignment_Admin\\/User\\/Staff is on Assignments page")
	public void assignment_admin_user_staff_is_on_assignments_page() {
	    
		as.manageAssignmentPage();
	}

	@When("Assignment_Admin\\/User\\/Staff clicks on Assignment")
	public void assignment_admin_user_staff_clicks_on_assignment() throws Exception {
	   
		as.clickOnAssignmentName();
	}

	@Then("Assignment_Admin\\/User\\/Staff should see a newly added Assignment")
	public void assignment_admin_user_staff_should_see_a_newly_added_assignment() {
	    
		as.verifyNewlyAddedAssignment();
	}

	@Given("Assignment_Staff is on Assignment page")
	public void assignment_staff_is_on_assignment_page() {
	    
		as.manageAssignmentPage();
	}

	@When("Assignment_Staff clicks manage button under Assignment Grade")
	public void assignment_staff_clicks_manage_button_under_assignment_grade() throws Exception {
	   as.clickManageButton();
		
	}

	@Then("Assignment_Staff should be navigated to Grade Window")
	public void assignment_staff_should_be_navigated_to_grade_window() {
	   as.verifyGradeWindow();
		
	}

	@When("Assignment_Staff clicks an edit Assignment button")
	public void assignment_staff_clicks_an_edit_assignment_button() throws Exception {
	    
		as.clickEditbtn();
	}

	@Then("Assignment_Staff should see a Assignment details window")
	public void assignment_staff_should_see_a_assignment_details_window() {
		
		as.assignmentDetailPage();
	    
	}

	@When("Assignment_Staff clicks Save button after edits Assignment Name")
	public void assignment_staff_clicks_save_button_after_edits_assignment_name() throws Exception {
		as.clickOnAssignmentName();
		as.clickSaveButton();
	    
	}

	@When("Assignment_Staff clicks Save button after edits Assignment Description")
	public void assignment_staff_clicks_save_button_after_edits_assignment_description() throws Exception {
	    as.setAssignmentDesc();
	    as.clickSaveButton();
	}

	@Given("Assignment_Staff is on Assignment Details window")
	public void assignment_staff_is_on_assignment_details_window() {
	    as.assignmentDetailPage();
	}

	@When("Assignment_Staff clicks Save button after edits Assignment Grade")
	public void assignment_staff_clicks_save_button_after_edits_assignment_grade() throws Exception {
	    as.setAssignmentGrade();
	    as.clickSaveButton();
	}

	@When("Assignment_Staff clicks Save button after edits Assignment DueDate")
	public void assignment_staff_clicks_save_button_after_edits_assignment_due_date() throws Exception {
	    as.setAssignmentDuedate();
	    as.clickSaveButton();
	}

	@When("Assignment_Staff clicks cancel button")
	public void assignment_staff_clicks_cancel_button() throws Exception {
	    as.clickCancelButton();
	}

	@Then("Assignment_Staff Should see a Assignment Details Page is closed")
	public void assignment_staff_should_see_a_assignment_details_page_is_closed() {
	    as.verifyWindowClose();
	    as.verifyAssignmentPage();
	}

	@When("Assignment_Admin\\/User clicks Edit button")
	public void assignment_admin_user_clicks_edit_button() {
	    as.clickEditbtn();
	}

	@Then("Assignment_Admin\\/User should see a messages {string}")
	public void assignment_admin_user_should_see_a_messages(String message) {
	    as.isPageContainsText(message);
	}

	@Given("Assignment_Admin is on Assignment page")
	public void assignment_admin_is_on_assignment_page() {
	   as.verifyAssignmentPage();
	}

	@When("Assignment_Admin clicks on Assignment Name")
	public void assignment_admin_clicks_on_assignment_name() {
		as.clickAssignmentlink();
	   // as.setAssignmentName();
	    
	}

	@Then("Assignment_Admin should see a warning message {string}")
	public void assignment_admin_should_see_a_warning_message(String warning) {
	   as.isPageContainsText(warning);
		
	}
	
    @Given("Assignment_User is on Assignment page")
    public void assignment_user_is_on_assignment_page() {
    	 as.verifyAssignmentPage();
    }
    
    @When("Assignment_User clicks on Assignment Name")
    public void assignment_user_clicks_on_assignment_name() {
    	as.clickAssignmentlink();
    }
    
    @Then("Assignment_User should be navigated to Assignment Google form page")
    public void assignment_user_should_be_navigated_to_assignment_google_form_page() {
    	as.verifyGooglePage();
    }
    @Given("Assignment_User is on Assignment  Google form page")
    public void assignment_user_is_on_assignment_google_form_page() {
      as.verifyGooglePage();
    }

    @When("Assignment_User clicks on submit button after entering all questions and mail id")
    public void assignment_user_clicks_on_submit_button_after_entering_all_questions_and_mail_id() {
       SW.switchControl();
       as.enterAllFieldsGoogle();
       as.clickGoogleSubmit();
    }

   @Then("Assignment_User entered google forms successfully")
   public void assignment_user_entered_google_forms_successfully() {
       as.getsuccessmsg();
    }

   @When("Assignment_User clicks on submit button after leaving all questions and mail id")
   public void assignment_user_clicks_on_submit_button_after_leaving_all_questions_and_mail_id() {
	   as.allGooglefiledempty();
       as.clickGoogleSubmit();
    }

    @Then("Assignment_User should get a warning message {string}")
    public void assignment_user_should_get_a_warning_message(String warningmsg) {
       as.isPageContainsText(warningmsg);
     }


	@When("Assignment_User clicks clear form button after entering all questions and mail id")
	public void assignment_user_clicks_clear_form_button_after_entering_all_questions_and_mail_id() {
	    as.enterAllFieldsGoogle();
	    as.clickClearForm();
	}

	@Then("Assignment_The Assignment Google form cleared successfully")
	public void assignment_the_assignment_google_form_cleared_successfully() {
	    as.allGooglefiledempty();
	}

	@When("Assignment_User clicks Switch account link")
	public void assignment_user_clicks_switch_account_link() {
	    as.clickSwitchAccount();
	}

	@Then("Assignment_User should be switched over the account Successfully")
	public void assignment_user_should_be_switched_over_the_account_successfully() {
	    as.verifySwitchAccount();
	}
	
	@Given("Assignment_Admin\\/User\\/Staff is on Manage Assignment page")
	public void assignment_admin_user_staff_is_on_manage_assignment_page() {
	    as.manageAssignmentPage();
	}

	@When("Assignment_Admin\\/User clicks on delete button")
	public void assignment_admin_user_clicks_on_delete_button() {
	    as.clickDeleteButton();
	}

	@Then("Assignment_Admin\\/User should see a message as {string}")
	public void assignment_admin_user_should_see_a_message_as(String errormsg) {
	   as.isPageContainsText(errormsg);
	}


	@When("Assignment_Staff clicks on delete button")
	public void assignment_staff_clicks_on_delete_button() {
	    as.clickDeleteButton();
	}

	@Then("Assignment_Staff should see a Delete Confirmation window")
	public void assignment_staff_should_see_a_delete_confirmation_window() {
	    as.verifyDeleteWindowPresent();
	}

	@Given("Assignment_Staff is on Delete Confirmation window")
	public void assignment_staff_is_on_delete_confirmation_window() {
	    as.verifyDeleteWindowPresent();
	}

	@When("Assignment_Staff clicks Yes")
	public void assignment_staff_clicks_yes() {
	   as.clickYesButton();
	}
	@Then("Assignment_Staff Should see {string}")
	public void assignment_staff_should_see(String assignment) throws Exception {
	    as.isAssignmentDeleted(assignment);
	}


	@When("Assignment_Staff clicks No")
	public void assignment_staff_clicks_no() {
	   as.clickNoButton();
	}

	@Then("Assignment_Confirmation delete window should be closed successfully")
	public void assignment_confirmation_delete_window_should_be_closed_successfully() {
	    as.verifyWindowClose();
	    as.verifyAssignmentPage();
	}

	@When("Assignment_Admin\\/User\\/Staff clicks on delete button on the top left")
	public void assignment_admin_user_staff_clicks_on_delete_button_on_the_top_left() {
	    as.clickmaindelete();
	}

	@Then("Assignment_Admin\\/User\\/Staff\\/ should see a disabled delete button")
	public void assignment_admin_user_staff_should_see_a_disabled_delete_button() {
	  as.verifyMainDeleteBtnDisabled();
	}

	@Given("Assignment_Admin\\/User is on Assignments page")
	public void assignment_admin_user_is_on_assignments_page() {
	    as.verifyAssignmentPage();
	}

	@When("Assignment_Admin\\/User clicks delete button on the top after selecting multiple checkbox")
	public void assignment_admin_user_clicks_delete_button_on_the_top_after_selecting_multiple_checkbox() {
	    as.selectMultipleCheckboxes();
	    as.clickEnabledDeleteBtn();
	}

	@Given("Assignment_Staff is on Assignments page")
	public void assignment_staff_is_on_assignments_page() {
	    as.verifyAssignmentPage();
	}

	@When("Assignment_Staff clicks delete button on the top aftr selecting multiple checkbox")
	public void assignment_staff_clicks_delete_button_on_the_top_aftr_selecting_multiple_checkbox() {
		 as.selectMultipleCheckboxes();
		    as.clickEnabledDeleteBtn();
	}

	@Then("Assignment_Staff should see a  Delete confirm window")
	public void assignment_staff_should_see_a_delete_confirm_window() {
	    as.verifyDeleteWindowPresent();
	}


   @Then("Assignment_Staff Should see message as {string}")
   public void assignment_staff_should_see_message_as(String successmsg) {
       as.getsuccessmsg();
    }

	@Given("Assignment_Admin is on Manage Assignment page")
	public void assignment_admin_is_on_manage_assignment_page() {
	    as.verifyAssignmentPage();
	}

	@When("Assignment_Admin clicks check box on the left side to the Assignment Name")
	public void assignment_admin_clicks_check_box_on_the_left_side_to_the_assignment_name() {
	   as.selectFirstCheckbox();
	}

	@Given("Assignment_User\\/Staff is on Manage Assignment page")
	public void assignment_user_staff_is_on_manage_assignment_page() {
	    as.verifyAssignmentPage();
	}

	@When("Assignment_User\\/Staff clicks individual checkbox button")
	public void assignment_user_staff_clicks_individual_checkbox_button() {
	    as.verifyAllCheckbox();
	}

	@Then("Assignment_User\\/Staff should see a enabled delete button on the top left")
	public void assignment_user_staff_should_see_a_enabled_delete_button_on_the_top_left() {
	    as.verifyMainDeleteBtnEnabled();
	}


}