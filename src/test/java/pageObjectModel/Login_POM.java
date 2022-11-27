package pageObjectModel;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	@FindBy (id="verificationcode") WebElement veriFicationCodePage;
	@FindBy (id="continue") WebElement Continue;
	@FindBy (id="resetPasswordPage") WebElement resetPasswordPage;
	@FindBy (id="newpwsd") WebElement newpassword;
	@FindBy (id="retypepwsd") WebElement retypepassword;
	@FindBy (id="SubmitButton") WebElement SubmitButton;
	@FindBy (id="cancelButton") WebElement cancelButton;


	public void openCromeBrowser() {
	
	
	}

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
		
		uname.sendKeys(uname2);
		logger.info("User Enters User  for Login");
	}

	public void setPassword(String pswd2) {
		
		pswd.sendKeys(pswd2);
		logger.info("User Enters Password for Login");
	}

	public void clickLoginButton() throws Exception {
		
		pu.clickElement(loginButton);
		logger.info("User Press Login Button");
	}

	public void headerText(String htext) {
		
		String s = pu.getElementText(headertext);
	    assertEquals(s,"Manage Program", "InvalidPage"); 
		Loggerload.info("Get the title of the page : " + s);
	}

	public void loginAsAdmin(String aname) {
		
		uname.sendKeys(aname);
		logger.info("Admin Enters User Name for Login");
	}

	public void passwordAsAdmin(String apswd) {

		pswd.sendKeys(apswd);
		logger.info("Admin Enters Password for Login");
	}

	public void codeAsAdmin(String acode) {
		
		code.sendKeys(acode);
		logger.info("Admin Enters code for Login");
	}

	public void loginAsStaff(String sname) {
	
		uname.sendKeys(sname);
		logger.info("Staff Enters User Name for Login");
	}

	public void passwordAsStaff(String spswd) {

		pswd.sendKeys(spswd);
		logger.info("Staff Enters Password for Login");
	}

	public void codeAsStaff(String scode) {
		
		code.sendKeys(scode);
		logger.info("Staff Enters code for Login");
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
		
		pu.clickElement(Continue);
		Loggerload.info("After entering verification code Continue button clicked");
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
