package stepDefinition;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.Program_POM;

public class Program_SD {
	public static WebDriver driver = DriverManager.getChromedriver();
	Program_POM program = new Program_POM();
	
    @When("Program_Admin\\/User\\/Staff is on Manage Program page")
    public void program_admin_user_staff_is_on_manage_program_page() {
      program.clickprogramlink();
    }

	@Then("Program_Admin\\/User\\/Staff see header text as {string}")
	public void program_admin_user_staff_see_header_text_as(String headertext) {
		program.verifyHeaderText(headertext);
	}	

	@Then("Program_Admin\\/User\\/Staff see Footer text as {string}")
	public void program_admin_user_staff_see_footer_text_as(String footertext) {
	   program.verifyFooterText(footertext);
	}

	@Then("Program_Admin\\/User\\/Staff see Paginator text as {string}")
	public void program_admin_user_staff_see_paginator_text_as(String paginatortext) {
	   program.verifyPaginatorText(paginatortext);
	}
	@When("Program_Admin\\/User\\/Staff Clicks on Enabled paginator -prev button")
	public void program_admin_user_staff_clicks_on_enabled_paginator_prev_button() throws Exception {
	   program.clickPrevPage();
	}

	@When("Program_Admin\\/User\\/Staff Clicks on Enabled paginator -next button")
	public void program_admin_user_staff_clicks_on_enabled_paginator_next_button() throws Exception {
	    program.clickNextPage();
	}

	@When("Program_Admin\\/User\\/Staff Clicks on Enabled paginator -last button")
	public void program_admin_user_staff_clicks_on_enabled_paginator_last_button() throws Exception {
	    program.clickLastPage();
	}

	@Then("Program_Admin\\/User\\/Staff see Page number navigated to {string}")
	public void program_admin_user_staff_see_page_number_navigated_to(String string) {
	   program.verifyPaginatorText(string);
	}

	@When("Program_Admin\\/User\\/Staff Clicks on Enabled paginator -first button")
	public void program_admin_user_staff_clicks_on_enabled_paginator_first_button() throws Exception {
	    program.clickFirstPage();
	}


	@Then("Program_Admin\\/User\\/Staff see the Search Text box has text as {string}.")
	public void program_admin_user_staff_see_the_search_text_box_has_text_as(String search) {
	    program.verifySearchText(search);
	}

	@Given("Program_Admin\\/User\\/Staff is on A Manage Program page")
	public void program_admin_user_staff_is_on_a_manage_program_page() {
		program.clickprogramlink();
	    
	}

	@When("Program_Admin\\/User\\/Staff enters Program Name  as {string} to be searched")
	public void program_admin_user_staff_enters_program_name_as_to_be_searched(String programName) {
	    program.enterSearchText(programName);
	}

	@Then("Program_Entries for the searched Program Name as {string} are shown.")
	public void program_entries_for_the_searched_program_name_as_are_shown(String programname) throws Exception {
	    program.verifySearchResultProgramName(programname);
	}

	@When("Program_Admin\\/User\\/Staff enters Program Description as {string} to be searched")
	public void program_admin_user_staff_enters_program_description_as_to_be_searched(String description) {
	    program.enterSearchText(description);
	}

	@Then("Program_Entries for the searched Program Description as {string} are shown.")
	public void program_entries_for_the_searched_program_description_as_are_shown(String description) throws Exception {
	    program.verifySearchResultProgramDesc(description);
	}
	@When("Program_Admin\\/User\\/Staff enters Program Status as {string} to be searched")
	public void program_admin_user_staff_enters_program_status_as_to_be_searched(String status) {
	    program.enterSearchText(status);
	}

	@Then("Program_Entries for the searched Program Status as {string} are shown.")
	public void program_entries_for_the_searched_program_status_as_are_shown(String status) throws Exception {
	   program.verifySearchResultProgramStatus(status);
	}

	@When("Program_Admin\\/User\\/Staff Clicks on Program Name Ascending Arrow")
	public void program_admin_user_staff_clicks_on_program_name_ascending_arrow() {
	    program.clickOnSortBtn_Name();
	}

	@Then("Program_Admin\\/User\\/Staff see the Program Name displayed in Ascending order")
	public void program_admin_user_staff_see_the_program_name_displayed_in_ascending_order() {
	    program.verifyASCOrder_Name();
	}

	@When("Program_Admin\\/User\\/Staff Clicks on Program Description Ascending Arrow")
	public void program_admin_user_staff_clicks_on_program_description_ascending_arrow() {
	    program.clickOnSortBtn_Desc();
	}

	@Then("Program_Admin\\/User\\/Staff see the Program Description displayed in Ascending order")
	public void program_admin_user_staff_see_the_program_description_displayed_in_ascending_order() {
	    program.verifyASCOrder_Desc();
	}

	@When("Program_Admin\\/User\\/Staff Clicks on Program Status Ascending Arrow")
	public void program_admin_user_staff_clicks_on_program_status_ascending_arrow() {
	    program.clickOnSortBtn_Status();
	}

	@Then("Program_Admin\\/User\\/Staff see the Program Status displayed in Ascending order")
	public void program_admin_user_staff_see_the_program_status_displayed_in_ascending_order() {
	    program.verifyASCOrder_Status();
	}

	@When("Program_Admin\\/User\\/Staff Clicks on Program Name Descending Arrow")
	public void program_admin_user_staff_clicks_on_program_name_descending_arrow() {
	    program.clickOnSortBtn_Name();
	}

	@Then("Program_Admin\\/User\\/Staff see the Program Name displayed in Descending order")
	public void program_admin_user_staff_see_the_program_name_displayed_in_descending_order() {
	    program.verifyDESCOrder_Name();
	}

	@When("Program_Admin\\/User\\/Staff Clicks on Program Description Descending Arrow")
	public void program_admin_user_staff_clicks_on_program_description_descending_arrow() {
	   program.clickOnSortBtn_Desc();
	}

	@Then("Program_Admin\\/User\\/Staff see the Program Description displayed in Descending order")
	public void program_admin_user_staff_see_the_program_description_displayed_in_descending_order() {
	    program.verifyDESCOrder_Desc();
	}

	@When("Program_Admin\\/User\\/Staff Clicks on Program Status Descending Arrow")
	public void program_admin_user_staff_clicks_on_program_status_descending_arrow() {
	    program.clickOnSortBtn_Status();
	}

	@Then("Program_Admin\\/User\\/Staff see the Program Status displayed in Descending order")
	public void program_admin_user_staff_see_the_program_status_displayed_in_descending_order() {
	    program.verifyDESCOrder_Status();
	}

	@Then("Program_Admin\\/User\\/Staff counts number of rows as {int} in a table")
	public void program_admin_user_staff_counts_number_of_rows_as_in_a_table(Integer int1) {
	    program.noOfRows(int1);
	}

	@When("Program_Admin clicks on A New Program button")
	public void program_admin_clicks_on_a_new_program_button() {
	    program.clickprogrambtn();
	}

	@Then("Program_Admin see header text as {string}")
	public void program_admin_see_header_text_as(String poptext) {
		program.verifyNewProgramWindow();
	    program.verifyPopUPWindow(poptext);
	}

	@When("Program_Admin Enter {string},{string} and {string}")
	public void program_admin_enter_and(String name, String description, String message) {
		
	 
	  program.setProgramName(name);
	  program.setProgramDescription(description);
	  program.verifyMsg(message);
	}

	@Then("Program_Admin clicks on Save button")
	public void program_admin_clicks_on_save_button() {
	    program.clicksaveButton();
	}

	@When("Program_Admin clicks on Save button after selecting Status alone")
	public void program_admin_clicks_on_save_button_after_selecting_status_alone() {
	    program.setstatusbutton();
	    program.clicksaveButton();
	}

	@Then("Program_Admin see Error message {string}")
	public void program_admin_see_error_message(String errmsg) {
	    program.verifyMsg(errmsg);
	}

	@When("Program_Admin clicks on Cancel button")
	public void program_admin_clicks_on_cancel_button() {
	    program.clickCancelButton();
	}

	@Then("Program_Admin see a Program Details window getting closed")
	public void program_admin_see_a_program_details_window_getting_closed() {
	    //close the popup and driver switch to main window
		program.verifyWindowClose();
		program.verifyPage();
	}

	@When("Program_Admin\\/User\\/Staff Enters newly added Program Name as {string} in Search")
	public void program_admin_user_staff_enters_newly_added_program_name_as_in_search(String programname) {
	    program.enterSearchText(programname);
	}

	@Then("Program_Entry for the newly added Program Name as {string} is shown")
	public void program_entry_for_the_newly_added_program_name_as_is_shown(String programname) throws Exception {
	   program.verifySearchResultProgramName(programname);
	}


   @Given("Program_User\\/Staff is on Manage Program page as {string} or {string}")
   public void program_user_staff_is_on_manage_program_page_as_or(String user, String staff) {
	   program.validUserStaff(user, staff);
	   program.clickprogramlink();
    
    }

	@When("Program_User\\/Staff clicks on  A New Program button")
	public void program_user_staff_clicks_on_a_new_program_button() {
	    program.clickprogrambtn();
	}

	@Then("Program_User\\/Staff see a Error message {string}")
	public void program_user_staff_see_a_error_message(String message) {
	    program.verifyMsg(message);
	}
	@Given("Program_Admin is on Manage Program page as {string}")
	public void program_admin_is_on_manage_program_page_as(String admin) {
	    program.validadmin(admin);
	    program.clickprogramlink();
	}
	@When("Program_Admin Clicks on the Edit button")
	public void program_admin_clicks_on_the_edit_button() {
	    program.clickEditButton();
	}

	@Given("Program_Admin Clicks on Edit button")
	public void program_admin_clicks_on_edit_button() {
	    program.clickEditButton();
	}
	@When("Program_Admin Clicks on Save button after updating Name as {string}")
	public void program_admin_clicks_on_save_button_after_updating_name_as(String newname) {
	    program.setProgramName(newname);
	    program.clicksaveButton();
	}


	@Then("Program_Admin see Success message {string}")
	public void program_admin_see_success_message(String successmsg) {
	    program.verifyMsg(successmsg);
	}

	@When("Program_Admin Clicks on Save button after updating Description as {string}")
	public void program_admin_clicks_on_save_button_after_updating_description_as(String newdes) {
	    program.setProgramDescription(newdes);
	    program.clicksaveButton();
	}


	@When("Program_Admin Clicks on Save button after updating Status")
	public void program_admin_clicks_on_save_button_after_updating_status() {
		program.setstatusbutton();
		program.clicksaveButton();
	}
	

//	@When("Program_Admin Clicks on Cancel button")
//	public void program_admin_clicks_on_cancel_button() {
//	    program.clickCancelButton();
//	}

	@When("Program_Admin\\/User\\/Staff Enters edited Program Name as {string} in Search")
	public void program_admin_user_staff_enters_edited_program_name_as_in_search(String newname) {
	    program.enterSearchText(newname);
	}
	
	@Then("Program_Entry for edited Program Name as {string} is shown")
	public void program_entry_for_edited_program_name_as_is_shown(String newname) throws Exception {
	    program.verifySearchResultProgramName(newname);
	}

	@When("Program_User\\/Staff Clicks on Edit buttton as {string} or {string}")
	public void program_user_staff_clicks_on_edit_buttton_as_or(String user, String staff) {
	    program.validUserStaff(user, staff);
	    program.clickEditButton();
	}


	@When("Program_Admin Clicks on any Delete button located on right side")
	public void program_admin_clicks_on_any_delete_button_located_on_right_side() {
	    program.clickRightDeleteButton();
	}

	@Given("Program_Admin Clicks on any Delete button located on the right side")
	public void program_admin_clicks_on_any_delete_button_located_on_the_right_side() {
	    program.clickRightDeleteButton();
	}

	@When("Program_Admin Clicks on Yes button")
	public void program_admin_clicks_on_yes_button() {
	    program.clickYesButton();
	}

	@When("Program_Admin Clicks on No button")
	public void program_admin_clicks_on_no_button() {
	    program.clickNoButton();
	}

	@Then("Program_Admin can see Program Name as {string} not deleted")
	public void program_admin_can_see_program_name_as_not_deleted(String programname) throws Exception {
	    program.verifySearchResultProgramName(programname);
	}

	@When("Program_Admin\\/User\\/Staff Enters deleted Program Name as {string} in Search")
	public void program_admin_user_staff_enters_deleted_program_name_as_in_search(String deletename) {
	    program.enterSearchText(deletename);
	}


	@Then("Program_Admin\\/User\\/Staff finds no results")
	public void program_admin_user_staff_finds_no_results() throws Exception {
	    program.verifyPrgmNameExist();
	}

	@When("Program_User\\/Staff Clicks on Delete button as {string} or {string}")
	public void program_user_staff_clicks_on_delete_button_as_or(String user, String staff) {
	    program.validUserStaff(user, staff);
	    program.clickRightDeleteButton();
	}


	@Then("Program_Admin\\/User\\/Staff see the Delete button on the top left hand side as Disabled")
	public void program_admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_disabled() {
	    program.verifyMainDeleteBtnDisabled();
	}

	@When("Program_Admin\\/User\\/Staff selects more than one Program Name using checkbox")
	public void program_admin_user_staff_selects_more_than_one_program_name_using_checkbox() {
	    program.selectMultipleCheckboxes();
	}

	@Then("Program_Admin\\/User\\/Staff see the Delete button on the top left hand side as Enabled")
	public void program_admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_enabled() {
	    program.verifyMainDeleteBtnEnabled();
	}

//	@Given("Program_Admin\\/User\\/Staff selects more than one Program Name using checkbox")
//	public void program_admin_user_staff_selects_more_than_one_program_name_using_checkbox() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@When("Program_Admin\\/User\\/Staff Clicks on Enabled Delete button on the top left hand side")
	public void program_admin_user_staff_clicks_on_enabled_delete_button_on_the_top_left_hand_side() {
	    program.clickEnabledDeleteBtn();
	}

	@Given("Program_Admin Clicks on Enabled Delete button after selecting more than one Program Name")
	public void program_admin_clicks_on_enabled_delete_button_after_selecting_more_than_one_program_name() {
	    program.selectMultipleCheckboxes();
		program.clickEnabledDeleteBtn();
	}

	@Then("Program_Admin can see Program Names not deleted")
	public void program_admin_can_see_program_names_not_deleted() throws Exception {
	    program.verifyPrgmNameExist();
	}

	@When("Program_Admin\\/User\\/Staff Enters deleted Program Names as {string} and as {string} in Search")
	public void program_admin_user_staff_enters_deleted_program_names_as_and_as_in_search(String program1, String program2) {
	    program.enterSearchText(program1);
	    program.enterSearchText(program2);
	}

	@Then("Program_Admin\\/User\\/Staff finds no result")
	public void program_admin_user_staff_finds_no_result() throws Exception {
	   program.verifyPrgmNameExist();
	}

	@Given("Program_User\\/Staff selects more than one Program Name using checkbox as {string} or {string}")
	public void program_user_staff_selects_more_than_one_program_name_using_checkbox_as_or(String user, String staff) {
	   program.validUserStaff(user, staff);
	   program.selectMultipleCheckboxes();
	}

	@When("Program_User\\/Staff Clicks on Enabled Delete button on the top left hand side")
	public void program_user_staff_clicks_on_enabled_delete_button_on_the_top_left_hand_side() {
	    program.clickEnabledDeleteBtn();
	}

	@When("Program_Admin\\/User\\/Staff Selects First checkbox left to Program Name")
	public void program_admin_user_staff_selects_first_checkbox_left_to_program_name() {
	    program.selectFirstCheckbox();
	}

	@Then("Program_Admin\\/User\\/Staff see all the checkboxes in the Program page get selected")
	public void program_admin_user_staff_see_all_the_checkboxes_in_the_program_page_get_selected() {
	   program.verifyAllCheckbox();
	}
	
}