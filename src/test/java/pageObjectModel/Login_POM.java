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


public class Login_POM {
	
	Logger logger =  LogManager.getLogger();
	public static WebDriver driver = DriverManager.getChromedriver();
	
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

	public void clickLoginButton() {
		
		loginButton.click();
		logger.info("User Press Login Button");
	}

	public void headerText(String htext) {
		
	    headertext.getText();
		assertEquals(headertext,"Manage Program", "InvalidPage"); 
		Loggerload.info("Get the title of the page : " + headertext);
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


	public void clickForgotPasswordLink(String email) {

		emailBox.sendKeys(email);
		forgotPasswordLink.click();
		logger.info("Admin/Staff/User click on Forgot Password Link afetr entering Email");
	}
	
	public void veryFicationCodePage() {

		veriFicationCodePage.getText();
		assertEquals(veriFicationCodePage,"Enter verification code below:", "InvalidPage"); 
		Loggerload.info("Get the title of the page : " + veriFicationCodePage);
	}

	public void continuFromVerification() {
		
		Continue.click();
	}

	public void resetPasswordPage() {
		
		resetPasswordPage.getText();
		assertEquals(resetPasswordPage,"Type in new Password", "InvalidPage"); 
		Loggerload.info("Get the title of the page : " + resetPasswordPage);
	}

	public void setNewPassword(String newpswd,String retypepswd) {
		
		newpassword.sendKeys(newpswd);
		retypepassword.sendKeys(retypepswd);
	}

	public void clickSubmitButton() {
		
		SubmitButton.click();
	}

	
	

	
	
	
	
}
