package pageObjectModel;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import stepDefinition.DriverManager;
import utilities.Loggerload;
import utilities.PaginationUtility;


public class Login_POM {
	
	Logger logger =  LogManager.getLogger();
	public static WebDriver driver = DriverManager.getChromedriver();

	PaginationUtility pu = new PaginationUtility();

	
	@FindBy (id="LoginButton") WebElement loginButton;
	@FindBy (id="uname") WebElement uname;
	@FindBy (id="pwsd") WebElement pswd;
	@FindBy (id="code") WebElement code;
	@FindBy (id="headertext") WebElement headertext;
	@FindBy (id="forgotPassword") WebElement forgotPasswordLink;
	@FindBy (id="email") WebElement emailBox;
	@FindBy (id="forgotPasswordWindow") WebElement forgotPasswordWindow;
	@FindBy (id="forgotPasswordcode") WebElement forgotpasswordcode;
	@FindBy (id="verificationcode") WebElement veriFicationCodePage;
	@FindBy (id="continue") WebElement Continue;
	@FindBy (id="resetPasswordPage") WebElement resetPasswordPage;
	@FindBy (id="newpwsd") WebElement newpassword;
	@FindBy (id="retypepwsd") WebElement retypepassword;
	@FindBy (id="SubmitButton") WebElement SubmitButton;
	@FindBy (id="cancelButton") WebElement cancelButton;


	public void openWebsite() {
		
		driver.get("https://LMS.com");
		driver.manage().window().maximize();
		logger.info("User opens the LMS website");
	}
	
	public void loginPage() {
		
		Assert.assertTrue(loginButton.isDisplayed());
		logger.info("User is on Login Page");
	}

	public void setUsername(String uname2) {
		
		logger.info("User Enters "+ uname2+"  for username");
		uname.sendKeys(uname2);
		if(uname2.equalsIgnoreCase("User")) 
			logger.info("Valid username");
		else 
		   	logger.info("Invalid username");
	}

	public void setPassword(String pswd2) {
		
		logger.info("User Enters password");
		pswd.sendKeys(pswd2);
		if(pswd2.equals("User")) 
			logger.info("Valid Password");
		
		else 
		  	logger.info("Invalid password");
		
	}

	public void clickLoginButton() throws Exception {
		
		pu.clickElement(loginButton);
		logger.info("User Press Login Button");
	}

	public void headerText(String htext) {

		String s = pu.getElementText(headertext);
	    assertEquals(s, htext, "InvalidPagee"); 
		Loggerload.info("Get the title of the page : " + s);
	}

	public void loginAsAdmin(String aname) {
		logger.info("Admin Enters User Name for Login");
		uname.sendKeys(aname);
		if(aname.equalsIgnoreCase("Admin")) 
			logger.info("Valid username");
		else 
		   	logger.info("Invalid username");
	}

	public void passwordAsAdmin(String apswd) {
		logger.info("Admin Enters Password for Login");
		pswd.sendKeys(apswd);
		if(apswd.equals("Admin")) 
			logger.info("Valid Password");
		else 
		  	logger.info("Invalid password");
	}

	public void codeAsAdmin(String acode) {
		logger.info("Admin Enters code for Login");
		code.sendKeys(acode);
		if(acode.equals("12345")) 
			logger.info("Valid Code");
		else 
		  	logger.info("Invalid Code");
	}

	public void loginAsStaff(String sname) {
		logger.info("Staff Enters User Name for Login");
		uname.sendKeys(sname);
		if(sname.equalsIgnoreCase("Staff")) 
			logger.info("Valid username");
		else 
		   	logger.info("Invalid username");
		
	}

	public void passwordAsStaff(String spswd) {
		logger.info("Staff Enters Password for Login");
		pswd.sendKeys(spswd);
		if(spswd.equals("Staff")) 
			logger.info("Valid Password");
		
		else 
		  	logger.info("Invalid password");
	}

	public void codeAsStaff(String scode) {

		logger.info("Staff Enters code for Login");
		code.sendKeys(scode);
	   if(scode.equals("54321")) 
			logger.info("Valid Code");
		
		else 
		  	logger.info("Invalid Code");
	}

	public void isPageContainsText(String text) {
		
		Assert.assertTrue (driver.getPageSource().contains(text));
		logger.info("Error Message : " + text);
	}

	public void clickForgotPasswordLink(String email) throws Exception {

		emailBox.sendKeys(email);
		pu.clickElement(forgotPasswordLink);
		logger.info("Admin/Staff/User click on Forgot Password Link afetr entering Email");
	}
	
	public void veryFicationCodePage() {

		String s = pu.getElementText(veriFicationCodePage);
		assertEquals(s,"Enter verification code below:", "InvalidPage"); 
		Loggerload.info("Get the title of the page : " + s);
	}

	public void continuFromVerification() throws Exception {
		forgotpasswordcode.sendKeys("12345");
		pu.clickElement(Continue);
		Loggerload.info("After entering verification code Continue button clicked");
	}
	
    public void forgotPasswordpage() {
		
		Loggerload.info("User Receive an E-mail");

	}

	public void forgotPasswordEmail() {
		
		Loggerload.info("User see the verification code as 12345 ");
		
	}


	public void resetPasswordPage() {

		String s = pu.getElementText(resetPasswordPage);
		assertEquals(s,"Type in new Password", "InvalidPage"); 
		Loggerload.info("Get the title of the page : " + s);

	}

	public void setNewPassword(String newpswd,String retypepswd) {
		
		newpassword.clear();
		retypepassword.clear();
		newpassword.sendKeys(newpswd);
		retypepassword.sendKeys(retypepswd);

		Loggerload.info("NewPassword and Retype Password entered");
		String newpwd=retypepswd;
		int count=0;
		for (int i = 0; i < newpwd.length(); i++) {
			 
		    if (!Character.isDigit(newpwd.charAt(i))
		      && !Character.isLetter(newpwd.charAt(i))
		      && !Character.isWhitespace(newpwd.charAt(i))) {
		      count++;}
		    if (count!=0)
		    Loggerload.info(newpwd+"contains Number/special character");
		    else
		    Loggerload.info("The password must contain one Special character");
		}
	}

	public void clickSubmitButton() throws Exception {
		
		pu.clickElement(SubmitButton);
		Loggerload.info("NewPassword and Retype Password entered and Submit button clicked");
	}
	
	public void clickCancelButton() throws Exception {
		
		pu.clickElement(cancelButton);
		Loggerload.info("NewPassword and Retype Password entered and Cancel button clicked");
	}

}