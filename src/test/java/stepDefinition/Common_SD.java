package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.Common_POM;
import utilities.Loggerload;

public class Common_SD {

	Common_POM common = new Common_POM();
	
	@Given("user Logged on to LMS Website")
	public void user_logged_on_to_lms_website() {
		
	    common.homepage();
	}

	@When("user enter valid {string} and {string}")
	public void user_enter_valid_and(String uname, String pwd) {
		// logout if already logged in
		// Because we're using same session for multiple users
		Loggerload.info("USER:logout if already logged in");
	   common.clicklogout();
	   Loggerload.info("User is logged as USER in to LMS website with valid username and password");
	   common.validloginUser(uname, pwd);
	}

	@When("staff enter valid {string} and {string} and code {string}")
	public void staff_enter_valid_and_and_code(String uname, String pwd, String code) {
		// logout if already logged in
		// Because we're using same session for multiple users
		Loggerload.info("STAFF: logout if already logged in");
	   common.clicklogout();
	   Loggerload.info("User is logged as STAFF in to LMS website with valid username, password and code");
	   common.ValidloginStaff(uname, pwd, code);
	}
	
	@When("admin enter valid {string} and {string} and code {string}")
	public void admin_enter_valid_and_and_code(String uname, String pwd, String code) {
		// logout if already logged in
		// Because we're using same session for multiple users
		Loggerload.info("ADMIN: logout if already logged in");
		common.clicklogout();
		Loggerload.info("User is logged as ADMIN in to LMS website with valid username, password and code");
		common.ValidloginAdmin(uname, pwd, code);
	}


	@Then("click on login button")
	public void click_on_login_button() {
		
	    common.clicklogin();
	}
}
