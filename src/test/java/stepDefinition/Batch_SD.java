package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.Batch_POM;

public class Batch_SD {
	public static WebDriver driver = DriverManager.initializeDriver();
	Batch_POM batch = new Batch_POM();

	@Given("Admin\\/User\\/Staff is on to LMS website Login Page")
	public void admin_user_staff_is_on_to_lms_website_login_page() {
	    driver.get("");
	}
	
	@Given("Admin Logged on to LMS Website")
	public void admin_user_staff_logged_on_to_lms_website() {
		//TO DO
	}
	
	@Given("Admin\\/User\\/Staff is on Manage Batch page")
	public void admin_user_staff_is_on_manage_batch_page() {
		batch.verifyPage();
	}

	@When("Admin\\/User\\/Staff Clicks on Batch button")
	public void admin_user_staff_clicks_on_batch_button() {
		batch.clickOnBatchButton();
	}

	// Pagination
	@When("Admin\\/User\\/Staff Clicks on Enabled paginator -next button")
	public void admin_user_staff_clicks_on_enabled_paginator_next_button() throws Exception {
		batch.clickNextPage();
	}

	@Then("Admin\\/User\\/Staff see Paginator text as {string}")
	public void admin_user_staff_see_paginator_text_as(String expText) {
		batch.verifyPageText(expText);
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator -prev button")
	public void admin_user_staff_clicks_on_enabled_paginator_prev_button() throws Exception {
		batch.clickPrevPage();
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-last button")
	public void admin_user_staff_clicks_on_enabled_paginator_last_button() throws Exception {
		batch.clickLastPage();
	}

	@Then("Admin\\/User\\/Staff see Page number navigated to {string}")
	public void admin_user_staff_see_page_number_navigated_to(String pageNum) {
		batch.verifyCurrentPageNumber(pageNum);
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator -first button")
	public void admin_user_staff_clicks_on_enabled_paginator_first_button() throws Exception {
		batch.clickFirstPage();
	}

	// Search

	@Then("Admin\\/User\\/Staff see the Search Text box has text as {string}")
	public void admin_user_staff_see_the_search_text_box_has_text_as(String searchTxt) {
		batch.verifySearchText(searchTxt);
	}

	@When("Admin\\/User\\/Staff enters Batch Name to be searched as {string}")
	public void admin_user_staff_enters_batch_name_to_be_searched_as(String searchstring) {
		batch.enterSerachText(searchstring);
	}

	@Then("Entries for the searched Batch Name are shown for {string}")
	public void entries_for_the_searched_batch_name_are_shown_for(String searchstring) throws Exception {
		batch.verifySearchResultBatchName(searchstring);
	}

	@When("Admin\\/User\\/Staff enters Batch Description to be searched as {string}")
	public void admin_user_staff_enters_batch_description_to_be_searched_as(String searchstring) {
		batch.enterSerachText(searchstring);
	}

	@Then("Entries for the searched Batch Description are shown for {string}")
	public void entries_for_the_searched_batch_description_are_shown_for(String searchstring) throws Exception {
		batch.verifySearchResultBatchDesc(searchstring);
	}

	@When("Admin\\/User\\/Staff enters Batch Status to be searched as {string}")
	public void admin_user_staff_enters_batch_status_to_be_searched_as(String searchstring) {
		batch.enterSerachText(searchstring);
	}

	@Then("Entries for the searched Batch Status are shown for {string}")
	public void entries_for_the_searched_batch_status_are_shown_for(String searchstring) throws Exception {
		batch.verifySearchResultBatchStatus(searchstring);
	}

	@When("Admin\\/User\\/Staff enters No Of Classes to be searched as {string}")
	public void admin_user_staff_enters_no_of_classes_to_be_searched_as(String searchstring) {
		batch.enterSerachText(searchstring);
	}

	@Then("Entries for the searched No Of Classes are shown for {string}")
	public void entries_for_the_searched_no_of_classes_are_shown_for(String searchstring) throws Exception {
		batch.verifySearchResultBatchNoofclass(searchstring);
	}

	@When("Admin\\/User\\/Staff enters Program Name to be searched as {string}")
	public void admin_user_staff_enters_program_name_to_be_searched_as(String searchstring) {
		batch.enterSerachText(searchstring);
	}

	@Then("Entries for the searched Program Name are shown {string}")
	public void entries_for_the_searched_program_name_are_shown(String searchstring) throws Exception {
		batch.verifySearchResultProgramName(searchstring);
	}

	// Sorting
	@When("Admin\\/User\\/Staff Clicks on Batch Name Ascending Arrow")
	public void admin_user_staff_clicks_on_batch_name_ascending_arrow() {
		batch.clickOnSortBtn_Name();
	}

	@Then("Admin\\/User\\/Staff see the Batch Name displayed in Ascending order")
	public void admin_user_staff_see_the_batch_name_displayed_in_ascending_order() {
		batch.verifyASCOrder_Name();
	}

	@When("Admin\\/User\\/Staff Clicks on Batch Description Ascending Arrow")
	public void admin_user_staff_clicks_on_batch_description_ascending_arrow() {
		batch.clickOnSortBtn_Desc();
	}

	@Then("Admin\\/User\\/Staff see the Batch Description displayed in Ascending order")
	public void admin_user_staff_see_the_batch_description_displayed_in_ascending_order() {
		batch.verifyASCOrder_Desc();
	}

	@When("Admin\\/User\\/Staff Clicks on Batch Status Ascending Arrow")
	public void admin_user_staff_clicks_on_batch_status_ascending_arrow() {
		batch.clickOnSortBtn_Status();
	}

	@Then("Admin\\/User\\/Staff see the Batch Status displayed in Ascending order")
	public void admin_user_staff_see_the_batch_status_displayed_in_ascending_order() {
		batch.verifyASCOrder_Status();
	}

	@When("Admin\\/User\\/Staff Clicks on No Of Classes Ascending Arrow")
	public void admin_user_staff_clicks_on_no_of_classes_ascending_arrow() {
		batch.clickOnSortBtn_NoOfClass();
	}

	@Then("Admin\\/User\\/Staff see the No Of Classes displayed in Ascending order")
	public void admin_user_staff_see_the_no_of_classes_displayed_in_ascending_order() {
		batch.verifyASCOrder_NoOfClass();
	}

	@When("Admin\\/User\\/Staff Clicks on Program Name Ascending Arrow")
	public void admin_user_staff_clicks_on_program_name_ascending_arrow() {
		batch.clickOnSortBtn_PrgmName();
	}

	@Then("Admin\\/User\\/Staff see the Program Name displayed in Ascending order")
	public void admin_user_staff_see_the_program_name_displayed_in_ascending_order() {
		batch.verifyASCOrder_PrgmName();
	}

	@When("Admin\\/User\\/Staff Clicks on Batch Name Descending Arrow")
	public void admin_user_staff_clicks_on_batch_name_descending_arrow() {
		batch.clickOnSortBtn_Name();
	}

	@Then("Admin\\/User\\/Staff see the Batch Name displayed in Descending order")
	public void admin_user_staff_see_the_batch_name_displayed_in_descending_order() {
		batch.verifyDESCOrder_Name();
	}

	@When("Admin\\/User\\/Staff Clicks on Batch Description Descending Arrow")
	public void admin_user_staff_clicks_on_batch_description_descending_arrow() {
		batch.clickOnSortBtn_Desc();
	}

	@Then("Admin\\/User\\/Staff see the Batch Description displayed in Descending order")
	public void admin_user_staff_see_the_batch_description_displayed_in_descending_order() {
		batch.verifyDESCOrder_Desc();
	}

	@When("Admin\\/User\\/Staff Clicks on Batch Status Descending Arrow")
	public void admin_user_staff_clicks_on_batch_status_descending_arrow() {
		batch.clickOnSortBtn_Status();
	}

	@Then("Admin\\/User\\/Staff see the Batch Status displayed in Descending order")
	public void admin_user_staff_see_the_batch_status_displayed_in_descending_order() {
		batch.verifyDESCOrder_Status();
	}

	@When("Admin\\/User\\/Staff Clicks on No Of Classes Descending Arrow")
	public void admin_user_staff_clicks_on_no_of_classes_descending_arrow() {
		batch.clickOnSortBtn_NoOfClass();
	}

	@Then("Admin\\/User\\/Staff see the No Of Classes displayed in Descending order")
	public void admin_user_staff_see_the_no_of_classes_displayed_in_descending_order() {
		batch.verifyDESCOrder_NoOfClass();
	}

	@When("Admin\\/User\\/Staff Clicks on Program Name Descending Arrow")
	public void admin_user_staff_clicks_on_program_name_descending_arrow() {
		batch.clickOnSortBtn_PrgmName();
	}

	@Then("Admin\\/User\\/Staff see the Program Name displayed in Descending order")
	public void admin_user_staff_see_the_program_name_displayed_in_descending_order() {
		batch.verifyDESCOrder_PrgmName();
	}

	// Number of rows in a Table
	@Then("Admin\\/User\\/Staff counts number of rows as {int} in a table")
	public void admin_user_staff_counts_number_of_rows_as_in_a_table(Integer int1) {
		batch.countNoOfRows(int1);
	}

	// Add A New Batch
	@Given("Admin is on Manage Batch page")
	public void admin_is_on_manage_batch_page() {
		batch.verifyBatchPage();
	}

	@When("Admin clicks on A New Batch button")
	public void admin_clicks_on_button(String string) {
		batch.clickNewBatchBtn();
	}

	@Given("Admin Clicks on A New Batch button")
	public void admin_clicks_on_a_new_batch_button() {
		batch.clickNewBatchBtn();
	}

	@Then("Admin see header text as {string}")
	public void admin_see_header_text_as(String expheaderTxt) {
		batch.verifyHeaderText(expheaderTxt);
	}

	@When("Admin Clicks on Save Button with out entering details")
	public void admin_clicks_on_save_button_with_out_entering_details() {
		batch.clearData();
		batch.clickSaveBtn();
	}

	@Then("Admin see Error message {string}")
	public void admin_see_error_message(String msg) {
		batch.verifyErrorMsg(msg);
	}

	@When("Admin Clicks on Save Button after entering Name alone as {string}")
	public void admin_clicks_on_save_button_after_entering_name_alone_as(String name) {
		batch.clearData();
		batch.enterName(name);
		batch.clickSaveBtn();
	}

	@When("Admin Clicks on Save Button after entering Description alone as {string}")
	public void admin_clicks_on_save_button_after_entering_description_alone_as(String desc) {
		batch.clearData();
		batch.enterDesc(desc);
		batch.clickSaveBtn();
	}

	@When("Admin Clicks on Save Button after entering Number Of Classes alone as {string}")
	public void admin_clicks_on_save_button_after_entering_number_of_classes_alone_as(String noofclass) {
		batch.clearData();
		batch.enterNoofClasses(noofclass);
		batch.clickSaveBtn();
	}

	@When("Admin Clicks on DropDown Menu")
	public void admin_clicks_on_drop_down_menu() {
		batch.clickDropDown();
	}

	@Then("Admin see list of all Program Names")
	public void admin_see_list_of_all_program_names() {
		batch.verifyProgramNames();
	}

	@Given("Clicks on DropDown Menu in Batch Details window")
	public void clicks_on_drop_down_menu_in_batch_details_window() {
		batch.clickDropDown();
	}

	@When("Admin Clicks on Save button after selecting a Program Name only from the dropdown")
	public void admin_clicks_on_save_button_after_selecting_a_program_name_only_from_the_dropdown() {
		batch.clearData();
		batch.selectFromDropdown();
		batch.clickSaveBtn();
	}

	@When("Admin Clicks on Save Button after selecting Status alone")
	public void admin_clicks_on_save_button_after_selecting_alone(String string) {
		batch.selectStatus();
		batch.clickSaveBtn();
	}

	@When("Admin Clicks on Save Button after entering all details")
	public void admin_clicks_on_save_button_after_entering_all_details() {
		batch.enterDetails_Alldata();
		batch.clickSaveBtn();
	}

	@Then("Admin see Success message {string}")
	public void admin_see_success_message(String succesMsg) {
		batch.verifySuccesMsg(succesMsg);
	}

	@When("Admin Clicks on Cancel button")
	public void admin_clicks_on_cancel_button() {
		batch.clickCancelBtn();
	}

	@Then("Admin see a Batch Details window getting closed")
	public void admin_see_a_batch_details_window_getting_closed() {
		batch.verifyWindowClose();
	}

	/// Edit batch

	@When("Admin Clicks on Edit buttton")
	public void admin_clicks_on_edit_button() {
		batch.clickEditBtn();
	}

	@Given("Admin is on Edit Window")
	public void admin_is_on_edit_window() {
		batch.clickEditBtn();
	}

	@When("Admin Clicks on Save Button after updating Name as {string}")
	public void admin_clicks_on_save_button_after_updating_name_as(String name) {
		batch.enterName(name);
		batch.clickSaveBtn();
	}

	@When("Admin Clicks on Save Button after updating Description as {string}")
	public void admin_clicks_on_save_button_after_updating_description_as(String desc) {
		batch.enterDesc(desc);
		batch.clickSaveBtn();
	}

	@When("Admin Clicks on Save button after Selecting another Program Name")
	public void admin_clicks_on_save_button_after_selecting_another_program_name() {
		batch.clickDropDown();
		batch.selectStatus();
		batch.clickSaveBtn();
	}

	@When("Admin Clicks on Save Button after updating Status")
	public void admin_clicks_on_save_button_after_updating_status() {
		batch.selectStatus();
		batch.clickSaveBtn();
	}

	@When("Admin Clicks on Save Button after updating No Of Classes as {string}")
	public void admin_clicks_on_save_button_after_updating_no_of_classes_as(String noofclass) {
		batch.enterDesc(noofclass);
		batch.clickSaveBtn();
	}

	@When("Admin\\/User\\/Staff Enters edited Batch Name\\/Batch Description in Search as {string}")
	public void admin_user_staff_enters_edited_batch_name_batch_description_in_search(String searchString) {
		batch.enterSerachText(searchString);
	}

	@Then("Entry for the edited Batch Name\\/Batch Description is shown for {string}")
	public void entry_for_the_edited_batch_name_batch_description_is_shown_for(String searchString) throws Exception {
		batch.verifySearchResultBatchName(searchString);
		batch.verifySearchResultBatchDesc(searchString);
	}

	@Given("User\\/Staff is on Manage Batch page")
	public void user_staff_is_on_manage_batch_page() {
		batch.verifyBatchPage();
	}

	@When("User\\/Staff Clicks on Edit button")
	public void user_staff_clicks_on_edit_button() {
		batch.clickEditBtn();
	}

	@Then("User\\/Staff see a Error message {string}")
	public void user_staff_see_a_error_message(String errorMsg) {
		batch.verifyErrorMsg(errorMsg);
	}

	// Delete

	@When("Admin Clicks on any Delete button located on the right side")
	public void admin_clicks_on_any_delete_button_located_on_the_right_side() {
		batch.clickDeleteBtn();
	}

	@Given("Admin is on Delete window")
	public void admin_is_on_delete_window() {
		batch.verifyDeleteWindowPresent();
	}

	@When("Admin Clicks on Yes  button")
	public void admin_clicks_on_yes_button() {
		batch.clickYesDeleteBtn();
	}

	@When("Admin Clicks on No button")
	public void admin_clicks_on_no_button() {
		batch.clickNoDeleteBtn();
	}

	@Then("Admin can see Program Name not deleted for {string}")
	public void admin_can_see_program_name_not_deleted_for(String searchstring) throws Exception {
		batch.isPrgmNameDeleted(searchstring);
	}

	@When("Admin\\/User\\/Staff Enters deleted  Program Name in Search as {string}")
	public void admin_user_staff_enters_deleted_program_name_in_search_as(String searchString) {
		batch.enterSerachText(searchString);
	}

	@Then("Admin\\/User\\/Staff finds no results for {string}")
	public void admin_user_staff_finds_no_results_for(String searchstring) throws Exception {
		batch.verifySearchPrgNameResultFound(searchstring);
	}

	@When("User\\/Staff Clicks on Delete button")
	public void user_staff_clicks_on_delete_button() {
		batch.clickDeleteBtn();
	}

	// Multiple delete

	@Then("Admin see the Delete button on the top left hand side as Disabled")
	public void admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_disabled() {
		batch.verifyDeleteBtnDisabled();
	}

	@Given("Admin selects more than one Batch Name using checkbox")
	public void admin_selects_more_than_one_batch_name_using_checkbox() {
		batch.selectMultipleCheckboxes();
	}

	@Then("Admin see the Delete button on the top left hand side as Enabled")
	public void admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_enabled() {
		batch.verifyDeleteBtnEnabled();
	}

	@Given("Admin Clicks on Enabled Delete button after selecting  more than one Batch Name")
	public void admin_clicks_on_enabled_delete_button_after_selecting_more_than_one_batch_name() {
		batch.clickEnabledDeleteBtn();
	}

	@When("Admin Clicks on Enabled Delete button on the top left hand side")
	public void admin_clicks_on_enabled_delete_button_on_the_top_left_hand_side() {
		batch.clickEnabledDeleteBtn();
	}

	@Then("Admin can see Program Names not deleted")
	public void admin_can_see_program_names_not_deleted() throws Exception {
		batch.verifyPrgmNameExist();
	}

	@When("Admin\\/User\\/Staff Enters deleted {string} in Search")
	public void admin_user_staff_enters_deleted_in_search(String searchstring) {
		batch.enterSerachText(searchstring);
		;
	}

	@Given("User\\/Staff selects more than one {string} using checkbox")
	public void user_staff_selects_more_than_one_using_checkbox(String string) {
		batch.selectMultipleCheckboxes();
	}

	@When("User\\/Staff Cicks on Enabled Delete button on the top left hand side")
	public void user_staff_cicks_on_enabled_delete_button_on_the_top_left_hand_side() {
		batch.clickEnabledDeleteBtn();
	}

	@When("Admin\\/User\\/Staff Selects First checkbox left to Batch Name")
	public void admin_user_staff_selects_first_checkbox_left_to_batch_name() {
		batch.selectFirstCheckbox();
	}

	@Then("Admin\\/User\\/Staff see all the checkboxes in the Batch page get selected")
	public void admin_user_staff_see_all_the_checkboxes_in_the_batch_page_get_selected() {
		batch.verifyAllCheckbox();
	}

	@When("Admin Clicks on any Delete button located on the right side for {string}")
	public void admin_clicks_on_any_delete_button_located_on_the_right_side_for(String string) {
		batch.clickDeleteBtn();
	}

}
