package pageObjectModel;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.swing.text.AttributeSet.CharacterAttribute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import stepDefinition.DriverManager;
import utilities.Loggerload;

public class Registration_POM {
	
	public static WebDriver driver=DriverManager.getChromedriver();
	
	//RegisterHomePage
	@FindBy (id="register")WebElement register;
	@FindBy (id="Header")WebElement header;
    @FindBy (id="login")WebElement login;
    //NewRegisteration
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
	@FindBy (id="error") WebElement error;
	
	
	public void registrationPage() {
		
		Loggerload.info("User click on Resgistration link");
		register.click();
		
	}

	public void verifyHeader(String str) {
		
		Loggerload.info("Get the title of the page:");
		String text=driver.getTitle();
		Loggerload.info(text); 
		assertEquals(text,str, "InvalidPage"); 
		
	}

	public void validatelogin(String string) {
		
		Loggerload.info("Validate Login text display ");
		assertEquals(string,login.isDisplayed(),"Validated");
	}

	public void verifylogin() {
		
		Loggerload.info("user able to click on login link");
		login.click();
		
	}

	public void loginpage() {
		
        Loggerload.info("Login page displays");
		Loggerload.info(driver.getCurrentUrl());
		Assert.assertEquals(driver.getTitle(), "log in page", "Login page displays ");
		
	}

	public void selectstate() {
		
		Loggerload.info("User able to select first state from Drop box");
		Select s=new Select(state);
		s.getFirstSelectedOption();
	}

	public void displaystate() {
		
		Loggerload.info("Selected state should appear on textbox");
		assertEquals(true,state.isDisplayed());
	}

	public void selectdob() {
		Loggerload.info("User select first DOB from Drop box");
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

	//NewUSerPage
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
	
	public void displaySuccess() {
			
			Loggerload.info("Successfully Registered");
			String text=display.getText();
			Assert.assertEquals(text,"Registered Successfully");
		}


	public void invalid_firstname() {
		
		Loggerload.info("user enter invalid firstname :");
		firstname.sendKeys("123Alpah$%a");
        
	}

	public void getErrorMsg_firstname() {
		
		String input=firstname.getText();
		int count=0;
		for(int i=0;i<input.length();i++) {
			if((Character.isDigit(input.charAt(i)))&&(Character.isWhitespace(input.charAt(i)))){
				count++;
				}
		}
		if(count!=0)
			Loggerload.info("Invalid name");
			Loggerload.error("Enter valid Firstname");
	}
	
	public void invalid_lastname() {
		
		Loggerload.info("user enter invalid lastname :");
		lastname.sendKeys("2324dj*&");
		
	}
    public void getErrorMsg_lastname() {
    	
    	String input=lastname.getText();
		int count=0;
		for(int i=0;i<input.length();i++) {
			if((Character.isDigit(input.charAt(i)))&&(Character.isWhitespace(input.charAt(i)))){
				count++;
				}
		}
		if(count!=0)
			Loggerload.info("Invalid name");
		Loggerload.error("Enter valid lastname");
	}

	public void invalid_pwd() {
		
		Loggerload.info("user enter invalid password");
		 password.sendKeys("%&#$@");	
	}
     public void getErrorMsg_password() {
		
    	 String newpwd=password.getText();
    	 
    	boolean hasDigit = false;
 		boolean hasCapital = false;
 		boolean hasSpecialChar = false;
 		boolean hasAtleastEightChars = newpwd.length() > 8;
 		
    	 for (int i = 0; i < newpwd.length(); i++) {
 			
 			if (Character.isDigit(newpwd.charAt(i))) {
 				hasDigit = true;
 			}
 			else if (Character.isUpperCase(newpwd.charAt(i))) {
 				hasCapital = true;
 			}
 			else if (!Character.isWhitespace(newpwd.charAt(i))) {
 				hasSpecialChar = true;
 			}
 	
 		}
 		
 		if (!hasDigit) {
 			Loggerload.info("Password must contains atleast one digit");
 		}
 		if (!hasCapital) {
 			Loggerload.info("Password must contains atleast one Capital letter");
 		}
 		if (!hasSpecialChar) {
 			Loggerload.info("Password must contains atleast one Special character");
 		}
 		if (!hasAtleastEightChars) {
 			Loggerload.info("Password must contains atleast Eight characters");

 		}
 		
 		Loggerload.info("Invalid Password");
 			
	}

	public void invalid_username() {
		Loggerload.info("user enter invalid username :");
		username.sendKeys("USER");
		
	}
    public void getErrorMsg_username() {
    	
		String name=username.getText();
		File file = new File("useraccounts.txt");
		Scanner usernameCheck = null;
		try {
			usernameCheck = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(usernameCheck.hasNext()){
	        String existingUsername = usernameCheck.nextLine();
	        if(name.equalsIgnoreCase(existingUsername)){

	           Loggerload.info("Username already exists");}
	           Loggerload.info("Please enter a username: ");
	      }
	}
    
	public void invalid_dob() {
		
		Loggerload.info("user enter invalid dob :");
		dob.clear();
		
	}
	
    public void getErrorMsg_dob() {
		
		Loggerload.error("Birthdate is required:Please Select ");
	}

	public void invalid_houseno() {
		
		Loggerload.info("user enter invalid houseno :");
		address.sendKeys("");
	}
	
   public void getErrorMsg_houseno() {
		
	    String addr=address.getText();
	    int count=0;
		for(int i=0;i<addr.length();i++) {
			if((Character.isWhitespace(addr.charAt(i)))){
				count++;
				}}
		if(count!=0)
		Loggerload.error("Enter valid house number:");
	}

	public void invalid_zip() {
		Loggerload.info("user enter invalid zip :");
		zip.sendKeys("sfad");
	}

    public void getErrorMsg_zip() {
		String zipcode=zip.getText();
		int count=zipcode.length();
		if(count>=5)
			Loggerload.error("Invalid Zip code");
		for(int i=0;i<count;i++) {
			if(!Character.isDigit(zipcode.charAt(i)))
				count++;
				}
		Loggerload.error("Enter valid Zip code");
	}
    
	public void invalid_state() {
		
		Loggerload.info("user enter invalid state :");
		state.clear();;
	}
   public void getErrorMsg_state() {
		
		Loggerload.error("State name is required:Please choose ");

	}

    
	public void error(String errormsg) {
		 
		 Loggerload.error(errormsg);
		 Assert.assertTrue(true,error.getText());
	}
  
}
	
	
	
	
	


