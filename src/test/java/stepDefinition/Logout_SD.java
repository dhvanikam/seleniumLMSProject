package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageObjectModel.Logout_POM;

public class Logout_SD {
	private static WebDriver driver=DriverManager.getChromedriver();
	public Logout_POM pl=new Logout_POM();;
	
	@Given("Admin\\/User\\/Staff Logged on to LMS website")
	public void admin_user_staff_logged_on_to_lms_website() {
		
		
	    
	}

	@When("Admin\\/User\\/Staff  Clicks on LogOut button")
	public void admin_user_staff_clicks_on_log_out_button() {
		
		pl.logout();
	}

	@Then("Admin\\/User\\/Staff should be navigated to Login Screen")
	public void admin_user_staff_should_be_navigated_to_login_screen() {
	    
		pl.displayHomepage();
	}

}