package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.Login_POM;
import pageObjectModel.Program_POM;
import utilities.SwitchWindowUtility;

public class Program_SD {
	public static WebDriver driver = DriverManager.initializeDriver();
	Program_POM program = new Program_POM();
	Login_POM login = new Login_POM();
	SwitchWindowUtility SW =new SwitchWindowUtility();
	
	@Given("user logged on to LMS website")
	public void user_logged_on_to_lms_website() {
	    driver.get("login url");
	}

	@When("user enter user as {string} and Password as {string}")
	public void user_enter_user_as_and_password_as(String uname, String upswd) {
//		 login.enterUsername(uname);
//		    login.enterPassword(upswd);
//		    
	}

	@Then("click on login button")
	public void click_on_login_button() {
	 //   login.loginbtn();
	}

	@Given("admin logged on to LMS website")
	public void admin_logged_on_to_lms_website() {
		driver.get("login url");
	}

	@When("admin enter user as {string} and Password as {string} and code as {string}")
	public void admin_enter_user_as_and_password_as_and_code_as(String aname, String apswd, String acode) {
	//	login.enterUsername(aname);
//	    login.enterPassword(apswd);
//	    login.enterCode(acode);
	}

	@Given("staff logged on to LMS website")
	public void staff_logged_on_to_lms_website() {
		driver.get("login url");
	}

	@When("staff enter user as {string} and Password as {string} and code as {string}")
	public void staff_enter_user_as_and_password_as_and_code_as(String sname, String spswd, String scode) {
//		  login.enterUsername(sname);
//		    login.enterPassword(spswd);
//		    login.enterCode(scode);
	}


    @When("Admin\\/User\\/Staff is on Manage Program page")
    public void admin_user_staff_is_on_manage_program_page() {
      program.clickprogramlink();
    }

	@Then("Admin\\/User\\/Staff see header text as {string}")
	public void admin_user_staff_see_header_text_as(String headertext) {
		program.verifyHeaderText(headertext);
	}
	   
	

	@Then("Admin\\/User\\/Staff see Footer text as {string}")
	public void admin_user_staff_see_footer_text_as(String footertext) {
	   program.verifyFooterText(footertext);
	}

	@Then("Admin\\/User\\/Staff see Paginator text as {string}")
	public void admin_user_staff_see_paginator_text_as(String paginatortext) {
	   program.verifyPaginatorText(paginatortext);
	}
	@When("Admin\\/User\\/Staff Clicks on Enabled paginator -prev button")
	public void admin_user_staff_clicks_on_enabled_paginator_prev_button() throws Exception {
	   program.clickPrevPage();
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator -next button")
	public void admin_user_staff_clicks_on_enabled_paginator_next_button() throws Exception {
	    program.clickNextPage();
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator -last button")
	public void admin_user_staff_clicks_on_enabled_paginator_last_button() throws Exception {
	    program.clickLastPage();
	}

	@Then("Admin\\/User\\/Staff see Page number navigated to {string}")
	public void admin_user_staff_see_page_number_navigated_to(String string) {
	   program.verifyPaginatorText(string);
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator -first button")
	public void admin_user_staff_clicks_on_enabled_paginator_first_button() throws Exception {
	    program.clickFirstPage();
	}


	@Then("Admin\\/User\\/Staff see the Search Text box has text as {string}.")
	public void admin_user_staff_see_the_search_text_box_has_text_as(String search) {
	    program.verifySearchText(search);
	}

	@Given("Admin\\/User\\/Staff is on A Manage Program page")
	public void admin_user_staff_is_on_a_manage_program_page() {
		program.clickprogramlink();
	    
	}

	@When("Admin\\/User\\/Staff enters Program Name  as {string} to be searched")
	public void admin_user_staff_enters_program_name_as_to_be_searched(String programName) {
	    program.enterSearchText(programName);
	}

	@Then("Entries for the searched Program Name as {string} are shown.")
	public void entries_for_the_searched_program_name_as_are_shown(String programname) throws Exception {
	    program.verifySearchResultProgramName(programname);
	}

	@When("Admin\\/User\\/Staff enters Program Description as {string} to be searched")
	public void admin_user_staff_enters_program_description_as_to_be_searched(String description) {
	    program.enterSearchText(description);
	}

	@Then("Entries for the searched Program Description as {string} are shown.")
	public void entries_for_the_searched_program_description_as_are_shown(String description) throws Exception {
	    program.verifySearchResultProgramDesc(description);
	}
	@When("Admin\\/User\\/Staff enters Program Status as {string} to be searched")
	public void admin_user_staff_enters_program_status_as_to_be_searched(String status) {
	    program.enterSearchText(status);
	}

	@Then("Entries for the searched Program Status as {string} are shown.")
	public void entries_for_the_searched_program_status_as_are_shown(String status) throws Exception {
	   program.verifySearchResultProgramStatus(status);
	}

	@When("Admin\\/User\\/Staff Clicks on Program Name Ascending Arrow")
	public void admin_user_staff_clicks_on_program_name_ascending_arrow() {
	    program.clickOnSortBtn_Name();
	}

	@Then("Admin\\/User\\/Staff see the Program Name displayed in Ascending order")
	public void admin_user_staff_see_the_program_name_displayed_in_ascending_order() {
	    program.verifyASCOrder_Name();
	}

	@When("Admin\\/User\\/Staff Clicks on Program Description Ascending Arrow")
	public void admin_user_staff_clicks_on_program_description_ascending_arrow() {
	    program.clickOnSortBtn_Desc();
	}

	@Then("Admin\\/User\\/Staff see the Program Description displayed in Ascending order")
	public void admin_user_staff_see_the_program_description_displayed_in_ascending_order() {
	    program.verifyASCOrder_Desc();
	}

	@When("Admin\\/User\\/Staff Clicks on Program Status Ascending Arrow")
	public void admin_user_staff_clicks_on_program_status_ascending_arrow() {
	    program.clickOnSortBtn_Status();
	}

	@Then("Admin\\/User\\/Staff see the Program Status displayed in Ascending order")
	public void admin_user_staff_see_the_program_status_displayed_in_ascending_order() {
	    program.verifyASCOrder_Status();
	}

	@When("Admin\\/User\\/Staff Clicks on Program Name Descending Arrow")
	public void admin_user_staff_clicks_on_program_name_descending_arrow() {
	    program.clickOnSortBtn_Name();
	}

	@Then("Admin\\/User\\/Staff see the Program Name displayed in Descending order")
	public void admin_user_staff_see_the_program_name_displayed_in_descending_order() {
	    program.verifyDESCOrder_Name();
	}

	@When("Admin\\/User\\/Staff Clicks on Program Description Descending Arrow")
	public void admin_user_staff_clicks_on_program_description_descending_arrow() {
	   program.clickOnSortBtn_Desc();
	}

	@Then("Admin\\/User\\/Staff see the Program Description displayed in Descending order")
	public void admin_user_staff_see_the_program_description_displayed_in_descending_order() {
	    program.verifyDESCOrder_Desc();
	}

	@When("Admin\\/User\\/Staff Clicks on Program Status Descending Arrow")
	public void admin_user_staff_clicks_on_program_status_descending_arrow() {
	    program.clickOnSortBtn_Status();
	}

	@Then("Admin\\/User\\/Staff see the Program Status displayed in Descending order")
	public void admin_user_staff_see_the_program_status_displayed_in_descending_order() {
	    program.verifyDESCOrder_Status();
	}

	@Then("Admin\\/User\\/Staff counts number of rows as {int} in a table")
	public void admin_user_staff_counts_number_of_rows_as_in_a_table(Integer int1) {
	    program.noOfRows(int1);
	}

	@When("Admin clicks on A New Program button")
	public void admin_clicks_on_a_new_program_button() {
	    program.clickprogrambtn();
	}

	@Then("Admin see header text as {string}")
	public void admin_see_header_text_as(String poptext) {
		program.verifyNewProgramWindow();
	    program.verifyPopUPWindow(poptext);
	}

	@When("Admin Enter {string},{string} and {string}")
	public void admin_enter_and(String name, String description, String message) {
		
	  SW.switchControl();
	  program.setProgramName(name);
	  program.setProgramDescription(description);
	  program.verifyMsg(message);
	}

	@Then("Admin clicks on Save button")
	public void admin_clicks_on_save_button() {
	    program.clicksaveButton();
	}

	@When("Admin clicks on Save button after selecting Status alone")
	public void admin_clicks_on_save_button_after_selecting_status_alone() {
	    program.setstatusbutton();
	    program.clicksaveButton();
	}

	@Then("Admin see Error message {string}")
	public void admin_see_error_message(String errmsg) {
	    program.verifyMsg(errmsg);
	}

	@When("Admin clicks on Cancel button")
	public void admin_clicks_on_cancel_button() {
	    program.clickCancelButton();
	}

	@Then("Admin see a Program Details window getting closed")
	public void admin_see_a_program_details_window_getting_closed() {
	    //close the popup and driver switch to main window
		program.verifyWindowClose();
		program.verifyPage();
	}

	@When("Admin\\/User\\/Staff Enters newly added Program Name as {string} in Search")
	public void admin_user_staff_enters_newly_added_program_name_as_in_search(String programname) {
	    program.enterSearchText(programname);
	}

	@Then("Entry for the newly added Program Name as {string} is shown")
	public void entry_for_the_newly_added_program_name_as_is_shown(String programname) throws Exception {
	   program.verifySearchResultProgramName(programname);
	}

	@Given("User\\/Staff is on Manage Program page")
	public void user_staff_is_on_manage_program_page() {
	    program.clickprogramlink();
	}

	@When("User\\/Staff clicks on  A New Program button")
	public void user_staff_clicks_on_a_new_program_button() {
	    program.clickprogrambtn();
	}

	@Then("User\\/Staff see a Error message {string}")
	public void user_staff_see_a_error_message(String message) {
	    program.verifyMsg(message);
	}

	@Given("Admin is on Manage Program page")
	public void admin_is_on_manage_program_page() {
	    program.clickprogramlink();
	}

	@When("Admin Clicks on the Edit button")
	public void admin_clicks_on_the_edit_button() {
	    program.clickEditButton();
	}

	@Given("Admin Clicks on Edit button")
	public void admin_clicks_on_edit_button() {
	    program.clickEditButton();
	}
	@When("Admin Clicks on Save button after updating Name as {string}")
	public void admin_clicks_on_save_button_after_updating_name_as(String newname) {
	    program.setProgramName(newname);
	    program.clicksaveButton();
	}


	@Then("Admin see Success message {string}")
	public void admin_see_success_message(String successmsg) {
	    program.verifyMsg(successmsg);
	}

	@When("Admin Clicks on Save button after updating Description as {string}")
	public void admin_clicks_on_save_button_after_updating_description_as(String newdes) {
	    program.setProgramDescription(newdes);
	    program.clicksaveButton();
	}


	@When("Admin Clicks on Save button after updating Status")
	public void admin_clicks_on_save_button_after_updating_status() {
		program.setstatusbutton();
		program.clicksaveButton();
	}
	

//	@When("Admin Clicks on Cancel button")
//	public void admin_clicks_on_cancel_button() {
//	    program.clickCancelButton();
//	}

	@When("Admin\\/User\\/Staff Enters edited Program Name as {string} in Search")
	public void admin_user_staff_enters_edited_program_name_as_in_search(String newname) {
	    program.enterSearchText(newname);
	}
	
	@Then("Entry for edited Program Name as {string} is shown")
	public void entry_for_edited_program_name_as_is_shown(String newname) throws Exception {
	    program.verifySearchResultProgramName(newname);
	}

	@When("User\\/Staff Clicks on Edit buttton")
	public void user_staff_clicks_on_edit_buttton() {
	    program.clickEditButton();
	    }

	@When("Admin Clicks on any Delete button located on right side")
	public void admin_clicks_on_any_delete_button_located_on_right_side() {
	    program.clickRightDeleteButton();
	}

	@Given("Admin Clicks on any Delete button located on the right side")
	public void admin_clicks_on_any_delete_button_located_on_the_right_side() {
	    program.clickRightDeleteButton();
	}

	@When("Admin Clicks on Yes button")
	public void admin_clicks_on_yes_button() {
	    program.clickYesButton();
	}

	@When("Admin Clicks on No button")
	public void admin_clicks_on_no_button() {
	    program.clickNoButton();
	}

	@Then("Admin can see Program Name as {string} not deleted")
	public void admin_can_see_program_name_as_not_deleted(String programname) throws Exception {
	    program.verifySearchResultProgramName(programname);
	}

	@When("Admin\\/User\\/Staff Enters deleted Program Name as {string} in Search")
	public void admin_user_staff_enters_deleted_program_name_as_in_search(String deletename) {
	    program.enterSearchText(deletename);
	}


	@Then("Admin\\/User\\/Staff finds no results")
	public void admin_user_staff_finds_no_results() throws Exception {
	    program.verifyPrgmNameExist();
	}

	@When("User\\/Staff Clicks on Delete button")
	public void user_staff_clicks_on_delete_button() {
	   program.clickRightDeleteButton();
	}

	@Then("Admin\\/User\\/Staff see the Delete button on the top left hand side as Disabled")
	public void admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_disabled() {
	    program.verifyMainDeleteBtnDisabled();
	}

	@When("Admin\\/User\\/Staff selects more than one Program Name using checkbox")
	public void admin_user_staff_selects_more_than_one_program_name_using_checkbox() {
	    program.selectMultipleCheckboxes();
	}

	@Then("Admin\\/User\\/Staff see the Delete button on the top left hand side as Enabled")
	public void admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_enabled() {
	    program.verifyMainDeleteBtnEnabled();
	}

//	@Given("Admin\\/User\\/Staff selects more than one Program Name using checkbox")
//	public void admin_user_staff_selects_more_than_one_program_name_using_checkbox() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@When("Admin\\/User\\/Staff Clicks on Enabled Delete button on the top left hand side")
	public void admin_user_staff_clicks_on_enabled_delete_button_on_the_top_left_hand_side() {
	    program.clickEnabledDeleteBtn();
	}

	@Given("Admin Clicks on Enabled Delete button after selecting more than one Program Name")
	public void admin_clicks_on_enabled_delete_button_after_selecting_more_than_one_program_name() {
	    program.selectMultipleCheckboxes();
		program.clickEnabledDeleteBtn();
	}

	@Then("Admin can see Program Names not deleted")
	public void admin_can_see_program_names_not_deleted() throws Exception {
	    program.verifyPrgmNameExist();
	}

	@When("Admin\\/User\\/Staff Enters deleted Program Names as {string} and as {string} in Search")
	public void admin_user_staff_enters_deleted_program_names_as_and_as_in_search(String program1, String program2) {
	    program.enterSearchText(program1);
	    program.enterSearchText(program2);
	}

	@Then("Admin\\/User\\/Staff finds no result")
	public void admin_user_staff_finds_no_result() throws Exception {
	   program.verifyPrgmNameExist();
	}

	@Given("User\\/Staff selects more than one Program Name using checkbox")
	public void user_staff_selects_more_than_one_program_name_using_checkbox() {
	    program.selectMultipleCheckboxes();
	}

	@When("User\\/Staff Clicks on Enabled Delete button on the top left hand side")
	public void user_staff_clicks_on_enabled_delete_button_on_the_top_left_hand_side() {
	    program.clickEnabledDeleteBtn();
	}

	@When("Admin\\/User\\/Staff Selects First checkbox left to Program Name")
	public void admin_user_staff_selects_first_checkbox_left_to_program_name() {
	    program.selectFirstCheckbox();
	}

	@Then("Admin\\/User\\/Staff see all the checkboxes in the Program page get selected")
	public void admin_user_staff_see_all_the_checkboxes_in_the_program_page_get_selected() {
	   program.verifyAllCheckbox();
	}
	
}