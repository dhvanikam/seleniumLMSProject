package pageObjectModel;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v106.systeminfo.SystemInfo.GetInfoResponse;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import stepDefinition.DriverManager;
import utilities.Loggerload;

public class Registration_POM {
	
	public static WebDriver driver=DriverManager.getChromedriver();
	
	@FindBy (id="Header")WebElement header;
	@FindBy (id="login")WebElement login;
	@FindBy (id="signup")WebElement signup;
	@FindBy (id="firstname")WebElement firstname;
	@FindBy (id="lastname")WebElement lastname;
	@FindBy (id="address")WebElement address;
	@FindBy (id="streetname")WebElement streetname;
	@FindBy (id="city")WebElement city;
	@FindBy (id="state")WebElement state;
	@FindBy (id="zip")WebElement zip;
	@FindBy (id="DOB")WebElement dob;
	@FindBy (id="phoneNumber")WebElement phonenumber;
	@FindBy (id="username")WebElement username;
	@FindBy (id="password")WebElement password;
	@FindBy (id="email")WebElement email;
	@FindBy (id="Success") WebElement display;
	
	public void registrationPage() {
		Loggerload.info("User click on Resgistration link");
		header.click();
		
	}

	public void verifyHeader(String str) {
		Loggerload.info("Get the title of the page:");
		String text=driver.getTitle();
		Loggerload.info(text); 
		assertEquals(text,"Registration Form", "InvalidPage"); 
		
	}

	public void validatelogin(String string) {
		Loggerload.info("Validate Login button");
		assertEquals(true,login.isDisplayed());
	}

	public void verifylogin() {
		
		Loggerload.info("user clicks login link");
		login.click();
		
	}

	public void loginpage() {
        Loggerload.info("Login page displays");
		Loggerload.info(driver.getCurrentUrl());
		Assert.assertEquals(driver.getTitle(), "log in page", "Login page displays ");
		
	}

	public void selectstate() {
		
		Loggerload.info("Select first state from Drop box");

		Select s=new Select(state);
		s.getFirstSelectedOption();
	}

	public void displaystate() {
		Loggerload.info("Selected state should appear on textbox");
		assertEquals(true,state.isDisplayed());
	}

	public void selectdob() {
		Loggerload.info("Select first DOB from Drop box");
		Select d=new Select(dob);
	    d.getFirstSelectedOption();
		
	}

	public void displaydob() {
		Loggerload.info("Selected DOB should appear on textbox");
		assertEquals(true,dob.isDisplayed());
		
	}

	public void signupButton() {
		Loggerload.info("user click signup button");
		signup.click();
	}

	public void displaySuccess() {
		
		Loggerload.info("Successfully Registered");
		String text=display.getText();
		Assert.assertEquals(text,"Registered Successfully");
	}

	public void error(String errormsg) {
		 
		 Loggerload.error(errormsg);//assert
	}

	public void entervalidData(DataTable dataTable) {
	
		Loggerload.info("user enter valid Form Details");
			 List<Map<String, String>> user = dataTable.asMaps(String.class, String.class);
		     for (Map<String, String> form : user) {

		        String firstName = form.get("Firstname");
		        firstname.sendKeys(firstName);
		        String LastName = form.get("Lastname");
		        lastname.sendKeys(LastName);
		        String Address=form.get("Address");
		        address.sendKeys(Address);
		        String Street=form.get("Street Name");
		        streetname.sendKeys(Street);
		        String City=form.get("City");
		        city.sendKeys(City);
		        String Zip=form.get("Zip");
		        zip.sendKeys(Zip);
		        String Phone=form.get("Phone Number");
		        phonenumber.sendKeys(Phone);
		        String UserName =form.get("UserName");
		        username.sendKeys(UserName);
		        String Email=form.get("Email");
		        email.sendKeys(Email);
		        String Password =form.get("Password");
		        password.sendKeys(Password);
		        
		   		}
	}

	public void invalid_firstname() {
		Loggerload.info("user enter invalid firstname :");
		firstname.sendKeys("123Alpaha");
	}

	public void getErrorMsg_firstname() {
		
		Loggerload.error("Enter valid Firstname");
	}
	
	public void invalid_lastname() {
		Loggerload.info("user enter invalid lastname :");
		lastname.sendKeys("2324");
		
	}
    public void getErrorMsg_lastname() {
		
		Loggerload.error("Enter valid lastname");
	}

	public void invalid_pwd() {
		
		Loggerload.info("user enter invalid password");
		 password.sendKeys("%&#$@");	
	}
     public void getErrorMsg_password() {
		
		Loggerload.error("Enter valid password");
	}

	public void invalid_username() {
		Loggerload.info("user enter invalid username :");
		username.sendKeys("24dgsdg2422@2");
		
	}
    public void getErrorMsg_username() {
		
		Loggerload.error("Enter valid username");
	}
    
	public void invalid_dob() {
		Loggerload.info("user enter invalid dob :");
		dob.clear();
		
	}
	
    public void getErrorMsg_dob() {
		
		Loggerload.error("Birthdate is required");
	}

	public void invalid_houseno() {
		Loggerload.info("user enter invalid houseno :");
		address.sendKeys("");
	}
	
   public void getErrorMsg_houseno() {
		
		Loggerload.error("Enter valid house number");
	}

	public void invalid_zip() {
		Loggerload.info("user enter invalid zip :");
		zip.sendKeys("sfad");
	}

    public void getErrorMsg_zip() {
		
		Loggerload.error("Enter valid Zip");
	}
    
	public void invalid_state() {
		Loggerload.info("user enter invalid state :");
		state.sendKeys("");
	}
   public void getErrorMsg_state() {
		
		Loggerload.error("State name is required");
	}

   public void existing_username() {
		
		Loggerload.warn("username Already Exists:");
		username.sendKeys("numpy");
	}

  
}
	
	
	
	
	


