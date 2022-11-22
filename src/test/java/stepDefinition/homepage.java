package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.AssertionFailedError;
import pageObjectModel.Homepage;
import utilities.DriverFactory;
import utilities.Loggerload;


public class homepage {
	
	
	WebDriver driver=DriverFactory.Initializedriver();
	Homepage homepage=new Homepage();;
    
	@Given("user launch the webapplication")
	public void user_launch_the_webapplication() {
	
		homepage.gethome();
	
	}

	
	@When("user enter username as {string}")
	public void user_enter_username_as(String name) {
	
	    Loggerload.info("Enter Username:"+name);
		homepage.username(name);
	 	}

	@When("Password as {string}")
	public void password_as(String pwd) {
		Loggerload.info("Enter password:"+pwd);
		homepage.password(pwd);
	}

	@Then("homepage displays")
	public void homepage_displays() {
		Loggerload.info("HomePage Loaded Successfully");
		homepage.click_login_Button();
		
		 
	}
	@Then("Error message displays")
	public void error_message_displays() {
	    Loggerload.info("ErrorMessage should Display!");
		homepage.click_login_Button();
	}
}
