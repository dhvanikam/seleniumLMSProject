package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.User_POM;

public class User_SD {
	public static WebDriver driver = DriverManager.getChromedriver();
	User_POM user = new User_POM();

	@Given("ManageUser_Admin\\/User\\/Staff is on LMS website")
	public void manageuser_admin_user_staff_is_on_lms_website() {
		user.homepage();
	}

	@When("ManageUser_Admin\\/User\\/Staff is on the Manage user page after clicking User Tab")
	public void manageuser_admin_user_staff_is_on_the_manage_user_page_after_clicking_user_tab() {
		user.verifyManageUserPage();
	}

	@Then("ManageUser_Admin\\/User\\/Staff see Paginator text as {string}")
	public void manageuser_admin_user_staff_see_paginator_text_as(String pagetext) {
		user.verifyHeaderText(pagetext);
	}

	@Then("ManageUser_Admin\\/User\\/Staff should see the page heading as {string}")
	public void manageuser_admin_user_staff_should_see_the_page_heading_as(String header) {
		user.verifyHeaderText(header);
	}

	// Pagination
	@Given("ManageUser_Admin\\/User\\/Staff is on the Manage user page")
	public void manageuser_admin_user_staff_is_on_the_manage_user_page() {
		user.verifyManageUserPage();
	}

	@Then("ManageUser_Admin\\/User\\/Staff see pagination button are disabled")
	public void manageuser_admin_user_staff_see_exceptin_text_as(String expText) {
		user.verifyPageText(expText);
	}

	// Footer

	@Given("ManageUser_Admin\\/User\\/Staff is on Manage Program page")
	public void manageuser_admin_user_staff_is_on_manage_program_page() {
		user.verifyManageUserPage();
	}

	@Then("ManageUser_Admin\\/User\\/Staffshould see the table footer as {string}.")
	public void manageuser_admin_user_staffshould_see_the_table_footer_as(String footer) {
		user.verifyFooterText(footer);
	}

	/// Search

	@Then("ManageUser_Admin\\/User\\/Staff see the Search Text box has text as {string}.")
	public void manageuser_admin_user_staff_see_the_search_text_box_has_text_as(String searchTxt) {
		user.verifySearchText(searchTxt);
	}

	@Given("ManageUser_Admin\\/User\\/Staff is on Manage user page")
	public void manageuser_admin_user_staff_is_on_manage_user_page() {
		user.verifyManageUserPage();
	}

	@When("ManageUser_Admin\\/User\\/Staff enters ID  as {string} to be searched")
	public void manageuser_admin_user_staff_enters_id_as_to_be_searched(String searchstring) {
		user.enterSearchText(searchstring);
	}

	@Then("ManageUser_Entries for the searched ID as {string} are shown.")
	public void manageuser_entries_for_the_searched_id_as_are_shown(String searchstring) throws Exception {
		user.verifySearchResultID(searchstring);
	}

	@When("ManageUser_Admin\\/User\\/Staff enters Name as {string} to be searched")
	public void manageuser_admin_user_staff_enters_name_as_to_be_searched(String searchstring) {
		user.enterSearchText(searchstring);
	}

	@Then("ManageUser_Entries for the searched Name as {string} are shown.")
	public void manageuser_entries_for_the_searched_name_as_are_shown(String searchstring) throws Exception {
		user.verifySearchResultName(searchstring);
	}

	@When("ManageUser_Admin\\/User\\/Staff enters EmailID as {string} to be searched")
	public void manageuser_admin_user_staff_enters_email_id_as_to_be_searched(String searchstring) {
		user.enterSearchText(searchstring);
	}

	@Then("ManageUser_Entries for the searched EmailID as {string} are shown.")
	public void manageuser_entries_for_the_searched_email_id_as_are_shown(String searchstring) throws Exception {
		user.verifySearchResultEmailID(searchstring);
	}

	@When("ManageUser_Admin\\/User\\/Staff enters Contact  as {string} to be searched")
	public void manageuser_admin_user_staff_enters_contact_as_to_be_searched(String searchstring) {
		user.enterSearchText(searchstring);
	}

	@Then("ManageUser_Entries for the searched Contact as {string} are shown.")
	public void manageuser_entries_for_the_searched_contact_as_are_shown(String searchstring) throws Exception {
		user.verifySearchResultContact(searchstring);
	}

	@When("ManageUser_Admin\\/User\\/Staff enters Batch  as {string} to be searched")
	public void manageuser_admin_user_staff_enters_batch_as_to_be_searched(String searchstring) {
		user.enterSearchText(searchstring);
	}

	@Then("ManageUser_Entries for the searched Batch as {string} are shown.")
	public void manageuser_entries_for_the_searched_batch_as_are_shown(String searchstring) throws Exception {
		user.verifySearchResultBatch(searchstring);
	}

	@When("ManageUser_Admin\\/User\\/Staff enters Skills as {string} to be searched")
	public void manageuser_admin_user_staff_enters_skills_as_to_be_searched(String searchstring) {
		user.enterSearchText(searchstring);
	}

	@Then("ManageUser_Entries for the searched Skills as {string} are shown.")
	public void manageuser_entries_for_the_searched_skills_as_are_shown(String searchstring) throws Exception {
		user.verifySearchResultSkills(searchstring);
	}

	/// Sorting
	@When("ManageUser_Admin\\/User\\/Staff Clicks on ID Ascending Arrow")
	public void manageuser_admin_user_staff_clicks_on_id_ascending_arrow() {
		user.clickOnSortBtn_ID();
	}

	@Then("ManageUser_Admin\\/User\\/Staff see the ID displayed in Ascending order")
	public void manageuser_admin_user_staff_see_the_id_displayed_in_ascending_order() {
		user.verifyASCOrder_ID();
	}

	@When("ManageUser_Admin\\/User\\/Staff Clicks on  Name Ascending Arrow")
	public void manageuser_admin_user_staff_clicks_on_name_ascending_arrow() {
		user.clickOnSortBtn_Name();
	}

	@Then("ManageUser_Admin\\/User\\/Staff see the Name displayed in Ascending order")
	public void manageuser_admin_user_staff_see_the_name_displayed_in_ascending_order() {
		user.verifyASCOrder_Name();
	}

	@When("ManageUser_Admin\\/User\\/Staff Clicks on EmailID Ascending Arrow")
	public void manageuser_admin_user_staff_clicks_on_email_id_ascending_arrow() {
		user.clickOnSortBtn_EmailID();
	}

	@Then("ManageUser_Admin\\/User\\/Staff see the EmailID displayed in Ascending order")
	public void manageuser_admin_user_staff_see_the_email_id_displayed_in_ascending_order() {
		user.verifyASCOrder_EmailID();
	}

	@When("ManageUser_Admin\\/User\\/Staff Clicks on Contact Ascending Arrow")
	public void manageuser_admin_user_staff_clicks_on_contact_ascending_arrow() {
		user.clickOnSortBtn_Contact();
	}

	@Then("ManageUser_Admin\\/User\\/Staff see the Contact displayed in Ascending order")
	public void manageuser_admin_user_staff_see_the_contact_displayed_in_ascending_order() {
		user.verifyASCOrder_Contact();
	}

	@When("ManageUser_Admin\\/User\\/Staff Clicks on Batch Ascending Arrow")
	public void manageuser_admin_user_staff_clicks_on_batch_ascending_arrow() {
		user.clickOnSortBtn_Batch();
	}

	@Then("ManageUser_Admin\\/User\\/Staff see the Batch displayed in Ascending order")
	public void manageuser_admin_user_staff_see_the_batch_displayed_in_ascending_order() {
		user.verifyASCOrder_Batch();
	}

	@When("ManageUser_Admin\\/User\\/Staff Clicks on Skill Ascending Arrow")
	public void manageuser_admin_user_staff_clicks_on_skill_ascending_arrow() {
		user.clickOnSortBtn_Skill();
	}

	@Then("ManageUser_Admin\\/User\\/Staff see the Skill displayed in Ascending order")
	public void manageuser_admin_user_staff_see_the_skill_displayed_in_ascending_order() {
		user.verifyASCOrder_Skill();
	}

	@When("ManageUser_Admin\\/User\\/Staff Clicks on ID Descending Arrow")
	public void manageuser_admin_user_staff_clicks_on_id_descending_arrow() {
		user.clickOnSortBtn_ID();
	}

	@Then("ManageUser_Admin\\/User\\/Staff see the ID displayed in Descending order")
	public void manageuser_admin_user_staff_see_the_id_displayed_in_descending_order() {
		user.verifyDESCOrder_ID();
	}

	@When("ManageUser_Admin\\/User\\/Staff Clicks on  Name Descending Arrow")
	public void manageuser_admin_user_staff_clicks_on_name_descending_arrow() {
		user.clickOnSortBtn_Name();
	}

	@Then("ManageUser_Admin\\/User\\/Staff see the Name displayed in Descending order")
	public void manageuser_admin_user_staff_see_the_name_displayed_in_descending_order() {
		user.verifyDESCOrder_Name();
	}

	@When("ManageUser_Admin\\/User\\/Staff Clicks on EmailID Descending Arrow")
	public void manageuser_admin_user_staff_clicks_on_email_id_descending_arrow() {
		user.clickOnSortBtn_EmailID();
	}

	@Then("ManageUser_Admin\\/User\\/Staff see the EmailID displayed in Descending order")
	public void manageuser_admin_user_staff_see_the_email_id_displayed_in_descending_order() {
		user.verifyDESCOrder_EmailID();
	}

	@When("ManageUser_Admin\\/User\\/Staff Clicks on Contact Descending Arrow")
	public void manageuser_admin_user_staff_clicks_on_contact_descending_arrow() {
		user.clickOnSortBtn_Contact();
	}

	@Then("ManageUser_Admin\\/User\\/Staff see the Contact displayed in Descending order")
	public void manageuser_admin_user_staff_see_the_contact_displayed_in_descending_order() {
		user.verifyDESCOrder_Contact();
	}

	@When("ManageUser_Admin\\/User\\/Staff Clicks on Batch Descending Arrow")
	public void manageuser_admin_user_staff_clicks_on_batch_descending_arrow() {
		user.clickOnSortBtn_Batch();
	}

	@Then("ManageUser_Admin\\/User\\/Staff see the Batch displayed in Descending order")
	public void manageuser_admin_user_staff_see_the_batch_displayed_in_descending_order() {
		user.verifyDESCOrder_Batch();
	}

	@When("ManageUser_Admin\\/User\\/Staff Clicks on Skill Descending Arrow")
	public void manageuser_admin_user_staff_clicks_on_skill_descending_arrow() {
		user.clickOnSortBtn_Skill();
	}

	@Then("ManageUser_Admin\\/User\\/Staff see the Skill displayed in Descending order")
	public void manageuser_admin_user_staff_see_the_skill_displayed_in_descending_order() {
		user.verifyDESCOrder_Skill();
	}

	// Add New USer

	@When("ManageUser_Admin\\/User\\/Staff clicks Add New User")
	public void manageuser_admin_user_staff_clicks_add_new_user() {
		user.addNewuser();
	}

	@Given("ManageUser_Admin\\/User\\/Staff is on User Details window")
	public void manageuser_admin_user_staff_is_on_user_details_window() {
		user.userdetailsWindow();
	}

	@Then("ManageUser_Admin\\/User\\/Staff should see the {string} dialog box")
	public void manageuser_admin_user_staff_should_see_the_dialog_box(String userDialog) {
		user.addNewuser_dialog(userDialog);
	}

	@Given("ManageUser_Admin\\/User\\/Staff is on the {string} pop up window")
	public void manageuser_admin_user_staff_is_on_the_pop_up_window(String string) {
		user.newUser_popup();
	}

	@When("ManageUser_Admin\\/User\\/Staff enters following  information")
	public void manageuser_admin_user_staff_enters_following_information(io.cucumber.datatable.DataTable dataTable) {
		user.addNewuser_details(dataTable);
	}

	@When("ManageUser_Admin\\/User\\/Staff selects the respective State Name from the DropBox")
	public void manageuser_admin_user_staff_selects_the_respective_state_name_from_the_drop_box() {
		user.stateDropbox();
	}

	@Then("ManageUser_The State Name will be displayed")
	public void manageuser_the_state_name_will_be_displayed() {
		user.stateDisplay();
	}

	@When("ManageUser_Admin\\/User\\/Staff selects the respective User role from the DropBox")
	public void manageuser_admin_user_staff_selects_the_respective_user_role_from_the_drop_box() {
		user.roleDropbox();
	}

	@Then("ManageUser_The User role will be displayed")
	public void manageuser_the_user_role_will_be_displayed() {
		user.roleDisplay();
	}

	@When("ManageUser_Admin\\/User\\/Staff Clicks on Submit button after entering all valid details")
	public void manageuser_admin_user_staff_clicks_on_submit_button_after_entering_all_valid_details() {
		user.submitUser();
	}

	@Then("ManageUser_Admin\\/User\\/Staff successfully added a new User")
	public void manageuser_admin_user_staff_successfully_added_a_new_user() {
		user.successMsg();
	}

	// Negative Scenarios for NEw User

	@When("ManageUser_Admin\\/User\\/Staff enters Submit button with all fields empty")
	public void manageuser_admin_user_staff_enters_submit_button_with_all_fields_empty() {
		user.emptyForm();
	}

	@Then("ManageUser_Admin\\/User\\/Staff should get a message {string}")
	public void manageuser_admin_user_staff_should_get_a_message(String warning) {
		user.warningEmpty(warning);
	}

	@When("ManageUser_Admin\\/User\\/Staff clicks Submit button with invalid First Name")
	public void manageuser_admin_user_staff_clicks_submit_button_with_invalid_first_name() {
		user.invalidFirstname();

	}

	@When("ManageUser_Admin\\/User\\/Staff clicks Submit button with invalid Middle Name")
	public void manageuser_admin_user_staff_clicks_submit_button_with_invalid_middle_name() {
		user.invalidMiddlename();
	}

	@When("ManageUser_Admin\\/User\\/Staff clicks Submit button with invalid Last Name")
	public void manageuser_admin_user_staff_clicks_submit_button_with_invalid_last_name() {
		user.invalidLastname();
	}

	@When("ManageUser_Admin\\/User\\/Staff clicks Submit button with invalid EmailID")
	public void manageuser_admin_user_staff_clicks_submit_button_with_invalid_email_id() {
		user.invalidEmail();
	}

	@When("ManageUser_Admin\\/User\\/Staff clicks Submit button with invalid Phone no")
	public void manageuser_admin_user_staff_clicks_submit_button_with_invalid_phone_no() {
		user.invalidPhone();
	}

	@When("ManageUser_Admin\\/User\\/Staff clicks Submit button with invalid Address")
	public void manageuser_admin_user_staff_clicks_submit_button_with_invalid_address() {
		user.invalidAddress();
	}

	@When("ManageUser_Admin\\/User\\/Staff clicks Submit button with invalid City")
	public void manageuser_admin_user_staff_clicks_submit_button_with_invalid_city() {
		user.invalidCity();
	}

	@When("ManageUser_Admin\\/User\\/Staff clicks Submit button with invalid Postal code")
	public void manageuser_admin_user_staff_clicks_submit_button_with_invalid_postal_code() {
		user.invalidPostal();
	}

	@When("ManageUser_Admin\\/User\\/Staff clicks Add new user button")
	public void manageuser_admin_user_staff_clicks_add_new_user_button() {
		user.addNewUser_Button();
	}

	@Then("ManageUser_Admin\\/User\\/Staff should see a button with text as Cancel  in User Details window")
	public void manageuser_admin_user_staff_should_see_a_button_with_text_as_cancel_in_user_details_window() {
		user.cancel_Button();
	}

	@When("ManageUser_Admin\\/User\\/Staff clicks cancel button")
	public void manageuser_admin_user_staff_clicks_cancel_button() {
		user.clickCancel();
	}

	@Then("ManageUser_Admin\\/User\\/Staff  see User Details window getting  closed")
	public void manageuser_admin_user_staff_see_user_details_window_getting_closed() {
		user.closePopup();
	}

	@Then("ManageUser_Admin\\/User\\/Staff should see a cancel\\(x) icon")
	public void manageuser_admin_user_staff_should_see_a_cancel_x_icon() {
		user.cancel_Button();
	}

	@When("ManageUser_Admin\\/User\\/Staff clicks close\\(X) icon")
	public void manageuser_admin_user_staff_clicks_close_x_icon() {
		user.closeButton();
	}

	@Then("ManageUser_User Details window should be closed")
	public void manageuser_user_details_window_should_be_closed() {
		user.closePopup();
	}

	@Then("ManageUser_Admin\\/User\\/Staff should see a button with text as Submit in user details window")
	public void manageuser_admin_user_staff_should_see_a_button_with_text_as_submit_in_user_details_window() {
		user.submitButton();
	}

	// Edit

	@When("ManageUser_Admin\\/User\\/Staff Clicks on Edit button in User Details window")
	public void manageuser_admin_clicks_on_edit_button_in_user_details_window() {
		user.clickEditBtn();
	}

	@Then("ManageUser_Admin\\/User\\/Staff see header text as {string}")
	public void manage_user_admin_see_header_text_as(String header) {
		user.verifyHeaderText(header);
	}

	@Given("ManageUser_Admin\\/User\\/Staff Clicks on Edit button")
	public void manageuser_admin_clicks_on_edit_button() {
		user.clickEditBtn();
	}

	@When("ManageUser_Admin\\/User\\/Staff Clicks on Submit button after updating First name as {string} and Last name as {string}")
	public void manageuser_admin_clicks_on_submit_button_after_updating_first_name_as_and_last_name_as(String fname,
			String lname) {
		user.enterFirstName(fname);
		user.enterLastName(lname);
		user.clickSaveBtn();
	}

	@Then("ManageUser_Admin\\/User\\/Staff see Success message {string}")
	public void manage_user_admin_see_success_message(String msg) {
		user.verifySuccesMsg(msg);
	}

	@When("ManageUser_Admin\\/User\\/Staff Clicks on Submit button after updating EmailID as {string}")
	public void manageuser_admin_clicks_on_submit_button_after_updating_email_id_as(String email) {
		user.enterEmail(email);
		user.clickSaveBtn();
	}

	@When("ManageUser_Admin\\/User\\/Staff Clicks on Submit button after updating Contact no as {string}")
	public void manageuser_admin_clicks_on_submit_button_after_updating_contact_no_as(String contact) {
		user.enterContact(contact);
		user.clickSaveBtn();
	}

	@When("ManageUser_Admin\\/User\\/Staff Clicks on Submit button after updating Batch as {string}")
	public void manageuser_admin_clicks_on_submit_button_after_updating_batch_as(String batch) {
		user.enterBatch(batch);
		user.clickSaveBtn();
	}

	@When("ManageUser_Admin\\/User\\/Staff Clicks on Submit button after updating Skill as {string}")
	public void manageuser_admin_clicks_on_submit_button_after_updating_skill_as(String skill) {
		user.enterSkill(skill);
		user.clickSaveBtn();
	}

	@When("ManageUser_Admin\\/User\\/Staff Enters edited Name as {string} in Search")
	public void manageuser_admin_user_staff_enters_edited_name_as_in_search(String searchstring) {
		user.enterSearchText(searchstring);
	}

	@Then("ManageUser_Entry for edited  Name as {string} is shown")
	public void manageuser_entry_for_edited_name_as_is_shown(String searchstring) throws Exception {
		user.verifySearchResultName(searchstring);
	}

	// Delete

	@When("ManageUser_Admin\\/User\\/Staff Clicks on any Delete button located on the right side")
	public void manageuser_admin_user_staff_clicks_on_any_delete_button_located_on_the_right_side() {
		user.clickDeleteBtn();
	}

	@Then("ManageUser_Admin\\/User\\/Staff see Delete Confirm window")
	public void manageuser_admin_see_delete_confirm_window() {
		user.verifyDeleteWindowPresent();
	}

	@When("ManageUser_Admin\\/User\\/Staff Clicks on Yes button")
	public void manageuser_admin_user_staff_clicks_on_yes_button() {
		user.clickYesDeleteBtn();
	}

	@When("ManageUser_Admin\\/User\\/Staff Clicks on No button")
	public void manageuser_admin_user_staff_clicks_on_no_button() {
		user.clickNoDeleteBtn();
	}

	@Then("ManageUser_Admin\\/User\\/Staff can see  Name as {string} not deleted")
	public void manageuser_admin_user_staff_can_see_name_as_not_deleted(String searchstring) throws Exception {
		user.isUserNameDeleted(searchstring);
	}

	@When("ManageUser_Admin\\/User\\/Staff Enters deleted  Name as {string} in Search")
	public void manageuser_admin_user_staff_enters_deleted_name_as_in_search(String searchstring) {
		user.enterSearchText(searchstring);
	}

	@When("ManageUser_Admin\\/User\\/Staff Clicks on any Delete button located in Edit\\/Delete Column")
	public void manageuser_admin_clicks_on_any_delete_button_located_in_edit_delete_column() {
		user.clickDeleteBtn();
	}

	@When("ManageUser_Admin\\/User\\/Staff Clicks on any Delete button located on the right side in Edit\\/Delete Column")
	public void manageuser_admin_clicks_on_any_delete_button_located_on_the_right_side_in_edit_delete_column() {
		user.clickDeleteBtn();
	}

	@Given("ManageUser_Admin\\/User\\/Staff clicks on Delete button located on the right side in Edit\\/Delete Column")
	public void manageuser_admin_clicks_on_delete_button_located_on_the_right_side_in_edit_delete_column() {
		user.clickDeleteBtn();
	}

	// Multiple Delete
	@Given("ManageUser_Admin\\/User\\/Staff Logged on to LMS Website")
	public void manage_user_admin_user_staff_logged_on_to_lms_website() {
		user.verifyUserLoggedin();
	}

	@When("ManageUser_Admin\\/User\\/Staff is on Manage Userpage")
	public void manageuser_admin_user_staff_is_on_manage_userpage() {
		user.verifyManageUserPage();
	}

	@Then("ManageUser_Admin\\/User\\/Staff see the Delete button on the top left hand side in Edit\\/Delete Column as Disabled")
	public void manageuser_admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_in_edit_delete_column_as_disabled() {
		user.verifyDeleteBtnDisabled();
	}

	@When("ManageUser_Admin\\/User\\/Staff selects more than one Name using checkbox")
	public void manageuser_admin_selects_more_than_one_name_using_checkbox() {
		user.selectMultipleCheckboxes();
	}

	@Then("ManageUser_Admin\\/User\\/Staff see the Delete button on the top left hand side in Edit\\/Delete Column as Enabled")
	public void manageuser_admin_see_the_delete_button_on_the_top_left_hand_side_in_edit_delete_column_as_enabled() {
		user.verifyDeleteBtnEnabled();
	}

	@Given("ManageUser_Admin\\/User\\/Staff selects more than one Name using check-box")
	public void manageuser_admin_selects_more_than_one_name_using_check_box() {
		user.selectMultipleCheckboxes();
	}

	@When("ManageUser_Admin\\/User\\/Staff Clicks on Enabled Delete button on the Top left hand side")
	public void manageuser_admin_clicks_on_enabled_delete_button_on_the_top_left_hand_side() {
		user.clickEnabledDeleteBtn();
	}

	@Given("ManageUser_Admin\\/User\\/Staff Clicks on Enabled Delete button after selecting more than one Name")
	public void manageuser_admin_clicks_on_enabled_delete_button_after_selecting_more_than_one_name() {
		user.clickEnabledDeleteBtn();
	}

	@When("ManageUser_Admin\\/User\\/Staff clicks on No button")
	public void manageuser_admin_clicks_on_no_button() {
		user.clickNoDeleteBtn();
	}

	@Then("ManageUser_Admin\\/User\\/Staff see success message as {string}")
	public void manageuser_admin_see_success_message_as(String msg) {
		user.verifySuccesMsg(msg);
	}

	@Then("ManageUser_Admin\\/User\\/Staff can see User Names not deleted")
	public void manageuser_admin_can_see_user_names_not_deleted() throws Exception {
		user.verifyUserNameExist();
	}

	@When("ManageUser_Admin\\/User\\/Staff enters deleted {string} in search")
	public void manageuser_admin_user_staff_enters_deleted_in_search(String searchstring) {
		user.enterSearchText(searchstring);
	}

	@Then("ManageUser_Admin\\/User\\/Staff finds No results for {string}")
	public void manage_user_admin_user_staff_finds_no_results_for(String searchstring) throws Exception {
		user.verifySearchUserNameResultFound(searchstring);
	}

	@Given("ManageUser_Admin\\/User\\/Staff selects more than one {string} using check-box")
	public void manageuser_user_staff_selects_more_than_one_using_check_box(String string) {
		user.selectMultipleCheckboxes();
	}

	@When("ManageUser_Admin\\/User\\/Staff Cicks on enabled delete button on the top left hand side")
	public void manageuser_user_staff_cicks_on_enabled_delete_button_on_the_top_left_hand_side() {
		user.clickEnabledDeleteBtn();
	}

	@Then("ManageUser_Admin\\/User\\/Staff see a error message {string}")
	public void manageuser_user_staff_see_a_error_message(String errormsg) {
		user.verifyErrorMsg(errormsg);
	}

	@When("ManageUser_Admin\\/User\\/Staff selects first checkbox left to User Name")
	public void manageuser_admin_user_staff_selects_first_checkbox_left_to_user_name() {
		user.selectFirstCheckbox();
	}

	@Then("ManageUser_Admin\\/User\\/Staff see all the checkboxes in the Manage User page are selected")
	public void manageuser_admin_user_staff_see_all_the_checkboxes_in_the_manage_user_page_are_selected() {
		user.verifyAllCheckbox();
	}

}
