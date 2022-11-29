package pageObjectModel;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.cucumber.datatable.DataTable;
import stepDefinition.DriverManager;
import utilities.AscDscOrderUtility;
import utilities.Loggerload;
import utilities.PaginationUtility;
import utilities.SearchUtility;

public class User_POM {
	public static WebDriver driver = DriverManager.getChromedriver();
	private static Logger Loggerload = LogManager.getLogger();
	PaginationUtility Pgu = new PaginationUtility();
	SearchUtility SU = new SearchUtility();
	AscDscOrderUtility AsDs = new AscDscOrderUtility();
	String cellXPathUserId = "//*[@id='table']/tbody/tr/td[1]";
	String cellXPathUserName = "//*[@id='table']/tbody/tr/td[2]";
	String cellXPathUserEmail = "//*[@id='table']/tbody/tr/td[3]";
	String cellXPathUserContactNumber = "//*[@id='table']/tbody/tr/td[4]";
	String cellXPathUserBatch = "//*[@id='table']/tbody/tr/td[5]";
	String cellXPathUserSkill = "//*[@id='table']/tbody/tr/td[6]";
	public static final String invalidExp = null;
	
	@FindBy(id = "Header")WebElement headerTxt;
	@FindBy(id = "footer")WebElement footerTxt;
	@FindBy(id = "login")WebElement login;
	@FindBy(id = "login")WebElement logout;
	@FindBy(id = "batchbtn")WebElement batchBtn;
	//Login
	@FindBy (id="username")WebElement Username;
	@FindBy (id="password")WebElement Password;
	@FindBy (id="code")WebElement passcode;
	
	//Pagination
	@FindBy(id = "nextPgBtn")WebElement nextPgBtn;
	@FindBy(id = "prevPgBtn")WebElement prevPgBtn;
	@FindBy(id = "firstPgBtn")WebElement firstPgBtn;
	@FindBy(id = "lastPgBtn")WebElement lastPgBtn;
	@FindBy(id = "PgText")WebElement pgText;
	@FindBy(className = "paginate_button current")WebElement currentPageNumber;
	@FindBy(xpath = "//*[@id='table']/tbody/tr/td")List<WebElement> tableData;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[1]")WebElement sortBtn_Id;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[2]")WebElement sortBtn_Name;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[3]")WebElement sortBtn_Email;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[4]")WebElement sortBtn_Contact_Number;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[5]")WebElement sortBtn_Batch;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[6]")WebElement sortBtn_Skill;
	@FindBy(xpath = "//section[//*[@id='table']]")WebElement tableContainer;
	@FindBy(xpath = "//*[@id='table']/thead/tr[1]/th[1]")WebElement headerCell;
	
	
	//NewUserPage link
	@FindBy (id="newUser")WebElement newUser;
	@FindBy (id="newuserpopup")WebElement userPopup;
   
    //NewUser Details
	
	@FindBy (id="firstname")WebElement firstname;
	@FindBy (id="middlename")WebElement middlename;
	@FindBy (id="lastname")WebElement lastname;
	@FindBy (id="email")WebElement email;
	@FindBy (id="phoneNumber")WebElement phonenumber;
	@FindBy (id="address")WebElement address;
	@FindBy (id="streetname")WebElement addHouseno;
	@FindBy (id="city")WebElement city;
	@FindBy (id="state")WebElement stateDropbox;
	@FindBy (id="zip")WebElement postal;
	@FindBy (id="program")WebElement program;
	@FindBy (id="ug")WebElement ugprogram;
	@FindBy (id="pg")WebElement pgprogram;
	@FindBy (id="skill")WebElement skill;
	@FindBy (id="experience")WebElement experience;
	@FindBy (id="role")WebElement userroleDropbox;
	@FindBy (id="visa")WebElement visa;
	@FindBy (id="batch")WebElement batch;
	@FindBy (id="comments")WebElement comments;
	
	//buttons
	@FindBy (id="Success") WebElement displaySuccess;
	@FindBy (id="error") WebElement error;
	@FindBy (id="submit")WebElement submit;
	@FindBy (id="cancel")WebElement cancel;
	@FindBy (id="delete")WebElement delete;
	@FindBy (id="close")WebElement close;
	
	//progrmas list
	@FindBy (xpath="") List<WebElement> programlist;
	@FindBy (xpath="") List<WebElement> ugprogramlist;
	@FindBy (xpath="") List<WebElement> batchlist;
	
	//Search
	@FindBy(id = "searchText")WebElement searchText;
	@FindBy(id = "searchBtn")WebElement searchBtn;
	@FindBy(id = "searchTextbox")WebElement serachTxtBox;

	//Edit
	@FindBy(id = "editbtn")WebElement editbtn;
	@FindBy(id = "firstname")WebElement firstnameTxtBox;
	@FindBy(id = "lastname")WebElement lastnameTxtBox;
	@FindBy(id = "email")WebElement emailTxtBox;
	@FindBy(id = "batch")WebElement batchTxtBox;
	@FindBy(id = "skill")WebElement skillTxtBox;
	@FindBy(id = "contact")WebElement contactTxtBox;
	@FindBy(id = "savebtn")WebElement submitBtn;
	
	//Delete
	@FindBy(id = "deleteBatchbtn")WebElement deleteBatchbtn;
	@FindBy(id = "yesDeletebtn")WebElement yesDeleteBtn;
	@FindBy(id = "noDeletebtn")WebElement noDeleteBtn;
	@FindBy(id = "errorMessage")WebElement errorMsg;
	@FindBy(id = "successMessage")WebElement successMsg;
	
	//Multiple Delete
	@FindBy(id = "multideleteBatchbtn")WebElement multideleteBatchbtn;
	@FindBy(id = "checkbox1")WebElement checkBx1;
	@FindBy(id = "checkbox2")WebElement checkBx2;
	@FindBy(id = "UserName1")WebElement userName1;
	@FindBy(id = "UserName2")WebElement userName2;
	@FindBy(id = "firstCheckbox")WebElement firstCheckbox;
	@FindBy(xpath = "//*[@class='checkbox']//*[@type='Checkbox']")List<WebElement> allCheckbox;
	
	public void homepage() {
		Loggerload.info("User is on LMS website Login Page");
		driver.get("");
		PageFactory.initElements(driver, this);

	}

	public void loginpage() {
		Loggerload.info("User is on LMS website Page");
		driver.get("");

	}

	public void verifyManageUserPage() {
		Loggerload.info("Verify that user is on Manage user page after clicking User Tab");
		assertEquals(driver.getCurrentUrl(), "");
	}

	public void verifyHeaderText(String header) {
		Loggerload.info("User see the header Text");
		assertEquals(headerTxt.getText(), header);
	}

	public void clickNextPage() throws Exception {
		Loggerload.info("User clicks on Enabled paginator -next button");
		Pgu.clickElement(nextPgBtn);
	}

	public void verifyPageText(String expText) {
		Loggerload.info("User see Paginator text");
		assertEquals(pgText.getText(), expText);
	}

	public void clickPrevPage() {
		Loggerload.info("User clicks on Enabled paginator -prev button");
		Pgu.clickElement(prevPgBtn);
	}

	public void clickLastPage()  {
		Loggerload.info("User clicks on Enabled paginator-last button");
		Pgu.clickElement(lastPgBtn);
	}

	public void clickFirstPage() {
		Loggerload.info("User clicks on Enabled paginator-first button");
		Pgu.clickElement(firstPgBtn);
	}

	public void verifyFooterText(String footer) {
		Loggerload.info("User see the footer Text");
		assertEquals(footerTxt.getText(), footer);
	}

	public void verifySearchText(String searchTxt) {
		Loggerload.info("User see the Search Text box has text as \"Search\"");
		assertEquals(searchText.getText(), searchTxt);
	}

	public void enterSearchText(String searchstring) {
		Loggerload.info("User enters string to be searched" + searchstring);
		new Actions(driver).sendKeys(serachTxtBox, searchstring).sendKeys(serachTxtBox, Keys.ENTER).perform();
	}

	public void verifySearchResultID(String searchstring) throws Exception {
		Loggerload.info("Entries for the searched are shown" + searchstring);

		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserId);
		Assert.assertTrue("Searched Result are not Found", SU.verifySearch(data, searchstring));
	}

	public void verifySearchResultName(String searchstring) throws Exception {
		Loggerload.info("Entries for the searched are shown" + searchstring);

		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserName);
		Assert.assertTrue("Searched Result are not Found", SU.verifySearch(data, searchstring));
	}

	public void verifySearchResultEmailID(String searchstring) throws Exception {
		Loggerload.info("Entries for the searched are shown" + searchstring);

		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserEmail);
		Assert.assertTrue("Searched Result are not Found", SU.verifySearch(data, searchstring));
	}

	public void verifySearchResultContact(String searchstring) throws Exception {
		Loggerload.info("Entries for the searched are shown" + searchstring);

		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserContactNumber);
		Assert.assertTrue("Searched Result are not Found", SU.verifySearch(data, searchstring));
	}

	public void verifySearchResultBatch(String searchstring) throws Exception {
		Loggerload.info("Entries for the searched are shown" + searchstring);

		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserBatch);
		Assert.assertTrue("Searched Result are not Found", SU.verifySearch(data, searchstring));
	}

	public void verifySearchResultSkills(String searchstring) throws Exception {
		Loggerload.info("Entries for the searched are shown" + searchstring);

		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserSkill);
		Assert.assertTrue("Searched Result are not Found", SU.verifySearch(data, searchstring));
	}

	public void clickOnSortBtn_ID() {
		Loggerload.info("User Clicks on User Id Ascending Arrow");
		sortBtn_Id.click();
	}

	public void verifyASCOrder_ID() {
		Loggerload.info("User see the result displayed in Ascending order for user id");
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserId);
		Assert.assertTrue("Results are in not in Asceding Order", AsDs.verifyAscendingOrder(data));
	}

	public void clickOnSortBtn_Name() {
		Loggerload.info("User Clicks on User Name Ascending Arrow");
		sortBtn_Name.click();
	}

	public void verifyASCOrder_Name() {
		Loggerload.info("User see the result displayed in Ascending order for user name");
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserName);
		Assert.assertTrue("Results are in not in Asceding Order", AsDs.verifyAscendingOrder(data));
	}

	public void clickOnSortBtn_EmailID() {
		Loggerload.info("User Clicks on User Email Ascending Arrow");
		sortBtn_Email.click();
	}

	public void verifyASCOrder_EmailID() {
		Loggerload.info("User see the result displayed in Ascending order for user email");
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserEmail);
		Assert.assertTrue("Results are in not in Asceding Order", AsDs.verifyAscendingOrder(data));
	}

	public void clickOnSortBtn_Contact() {
		Loggerload.info("User Clicks on User Contact Number Ascending Arrow");
		sortBtn_Contact_Number.click();
	}

	public void verifyASCOrder_Contact() {
		Loggerload.info("User see the result displayed in Ascending order for user contact number");
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserContactNumber);
		Assert.assertTrue("Results are in not in Asceding Order", AsDs.verifyAscendingOrder(data));
	}

	public void clickOnSortBtn_Batch() {
		Loggerload.info("User Clicks on User Batch Ascending Arrow");
		sortBtn_Batch.click();
	}

	public void verifyASCOrder_Batch() {
		Loggerload.info("User see the result displayed in Ascending order for user batch");
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserBatch);
		Assert.assertTrue("Results are in not in Asceding Order", AsDs.verifyAscendingOrder(data));
	}

	public void clickOnSortBtn_Skill() {
		Loggerload.info("User Clicks on User Skill Ascending Arrow");
		sortBtn_Skill.click();
	}

	public void verifyASCOrder_Skill() {
		Loggerload.info("User see the result displayed in Ascending order for user skill");
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserSkill);
		Assert.assertTrue("Results are in not in Asceding Order", AsDs.verifyAscendingOrder(data));
	}

	public void verifyDESCOrder_ID() {
		Loggerload.info("User see the result displayed in Descending order for user id");
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserId);
		Assert.assertTrue("Results are not in Desceding Order", AsDs.verifyDescendingOrder(data));
	}

	public void verifyDESCOrder_Name() {
		Loggerload.info("User see the result displayed in Descending order for user name");
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserName);
		Assert.assertTrue("Results are not in Desceding Order", AsDs.verifyDescendingOrder(data));
	}

	public void verifyDESCOrder_EmailID() {
		Loggerload.info("User see the result displayed in Descending order for user email");
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserEmail);
		Assert.assertTrue("Results are not in Desceding Order", AsDs.verifyDescendingOrder(data));
	}

	public void verifyDESCOrder_Contact() {
		Loggerload.info("User see the result displayed in Descending order for user contact number");
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserContactNumber);
		Assert.assertTrue("Results are not in Desceding Order", AsDs.verifyDescendingOrder(data));
	}

	public void verifyDESCOrder_Batch() {
		Loggerload.info("User see the result displayed in Descending order for user batch");
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserBatch);
		Assert.assertTrue("Results are not in Desceding Order", AsDs.verifyDescendingOrder(data));
	}

	public void verifyDESCOrder_Skill() {
		Loggerload.info("User see the result displayed in Descending order for user skill");
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserSkill);
		Assert.assertTrue("Results are not in Desceding Order", AsDs.verifyDescendingOrder(data));
	}

	// Add New User

	public void addNewuser() {

		Loggerload.info("User clicks on Add new user ");
		newUser.click();
	}

	public void addNewuser_dialog(String userDialog) {

		Loggerload.info("User sees title as User page");
		String text = driver.getTitle();
		assertEquals(text, userDialog, "Invalid page");
	}

	public void newUser_popup() {

		Loggerload.info("New user popup window opens");
		userPopup.getAccessibleName();
	}

	public void addNewuser_details(DataTable dataTable) {

		Loggerload.info("user enter valid Form Details");
		List<Map<String, String>> user = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> form : user) {

			String firstName = form.get("First name");
			firstname.sendKeys(firstName);
			String Middlename = form.get("Middle name");
			middlename.sendKeys(Middlename);
			String lastName = form.get("lastname");
			lastname.sendKeys(lastName);
			String Email = form.get("Email address ");
			email.sendKeys(Email);
			String Phone = form.get(" Phone no");
			phonenumber.sendKeys(Phone);
			String Address = form.get("Address");
			address.sendKeys(Address);
			String City = form.get("City");
			city.sendKeys(City);
			String zip = form.get("Postal code");
			postal.sendKeys(zip);
			String pro = form.get("Program ");
			program.sendKeys(pro);
			String ug = form.get("UG Program ");
			ugprogram.sendKeys(ug);
			String pg = form.get("PG Program ");
			pgprogram.sendKeys(pg);
			String skillLevel = form.get(" Skill ");
			skill.sendKeys(skillLevel);
			String Exp = form.get(" Experience ");
			experience.sendKeys(Exp);
			String status = form.get(" Visa Status ");
			visa.sendKeys(status);
			String batchNo = form.get(" Batch ");
			batch.sendKeys(batchNo);
			String comment = form.get(" Comments ");
			comments.sendKeys(comment);

		}

	}

	public void stateDropbox() {
		Loggerload.info("User able to select first state from Drop box");
		Select s = new Select(stateDropbox);
		s.getFirstSelectedOption();
	}

	public void stateDisplay() {
		Loggerload.info("Selected state should appear on textbox");
		assertEquals(true, stateDropbox.isDisplayed());
	}

	public void roleDropbox() {
		Loggerload.info("User able to select first role from Drop box");
		Select s = new Select(userroleDropbox);
		s.getFirstSelectedOption();

	}

	public void roleDisplay() {
		Loggerload.info("Selected state should appear on textbox");
		assertEquals(true, userroleDropbox.isDisplayed());
	}

	public void submitUser() {
		Loggerload.info("user click submit button");
		submit.click();

	}

	public void successMsg() {

		Loggerload.info("Successfully Registered");
		String text = displaySuccess.getText();
		Assert.assertEquals(text, "Registered Successfully");

	}

//Negative Scenarios
	public void emptyForm() {

		Loggerload.info("User submit Empty form");
		newUser.click();
		submit.click();
	}

	public void warningEmpty(String warning) {

		Loggerload.warn("Invalid Submission");
		String text = submit.getText();
		assertEquals(text, warning, "warning");

	}

	public void invalidFirstname() {

		Loggerload.info("user enter invalid firstname :");
		firstname.sendKeys("123Alpah$%a");
		String input = firstname.getText();
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if ((Character.isDigit(input.charAt(i))) && (Character.isWhitespace(input.charAt(i)))) {
				count++;
			}
		}
		if (count != 0)
			Loggerload.info("Invalid name");
		Loggerload.error("Enter valid Firstname");

	}

	public void invalidMiddlename() {

		Loggerload.info("user enter invalid Middlename :");
		middlename.sendKeys("123Alpah$%a");
		String input = middlename.getText();
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if ((Character.isDigit(input.charAt(i))) && (Character.isWhitespace(input.charAt(i)))) {
				count++;
			}
		}
		if (count != 0)
			Loggerload.info("Invalid name");
		Loggerload.error("Enter valid middlename");
	}

	public void invalidLastname() {

		Loggerload.info("user enter invalid lastname :");
		lastname.sendKeys("2324dj*&");
		String input = lastname.getText();
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if ((Character.isDigit(input.charAt(i))) && (Character.isWhitespace(input.charAt(i)))) {
				count++;
			}
		}
		if (count != 0)
			Loggerload.info("Invalid name");
		Loggerload.error("Enter valid lastname");
	}

	public void invalidEmail() {

		Loggerload.info("user enter invalid Eamil:");
		email.sendKeys("numpu@gmail@@com");
		String name = email.getText();
		File file = new File("useraccounts.txt");
		Scanner usernameCheck = null;
		try {
			usernameCheck = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (usernameCheck.hasNext()) {
			String existingUsername = usernameCheck.nextLine();
			if (name.equalsIgnoreCase(existingUsername)) {

				Loggerload.info("Eamil already exists");
			}
			Loggerload.info("Please enter a valid email ");
		}

	}

	public void invalidPhone() {

		Loggerload.info("user enter invalid Phone:");
		phonenumber.sendKeys("134566");
		String phone = phonenumber.getText();
		int digits = phone.length();
		if (digits < 9)
			Loggerload.error("Enter valid phone number:");
		int count = 0;
		for (int i = 0; i <= 9; i++) {
			if ((Character.isWhitespace(phone.charAt(i)))) {
				count++;
			}
		}
		if (count != 0)
			Loggerload.error("Enter valid phone number:");
	}

	public void invalidAddress() {

		Loggerload.info("user enter invalid Address:");
		address.sendKeys("uudd344");
		String addr = address.getText();
		int count = 0;
		for (int i = 0; i < addr.length(); i++) {
			if ((Character.isWhitespace(addr.charAt(i)))) {
				count++;
			}
		}
		if (count != 0)
			Loggerload.error("Enter valid house number:");
	}

	public void invalidCity() {
		Loggerload.info("user enter invalid city:");
		city.sendKeys("chennnni");
		String addr = city.getText();
		int count = 0;
		for (int i = 0; i < addr.length(); i++) {
			if ((Character.isWhitespace(addr.charAt(i)) && (Character.isDigit(addr.charAt(i))))) {
				count++;
			}
		}
		if (count != 0)
			Loggerload.error("Enter valid city");
	}

	public void invalidPostal() {
		Loggerload.info("user enter invalid Postal");
		postal.sendKeys("122");
		String postalcode = postal.getText();
		int length = postalcode.length();
		if (length >= 5)
			Loggerload.error("Invalid Zip code");
		int count = 0;
		for (int i = 0; i < length; i++) {
			if (!Character.isDigit(postalcode.charAt(i)))
				count++;
		}
		Loggerload.error("Enter valid Zip code");
	}

	public void addNewUser_Button() {
		Loggerload.info("userclicks on Add NewUserbutton");
		newUser.click();
		assertTrue(newUser.isSelected());

	}

	public void cancel_Button() {
		Loggerload.info("verify Cancel button");
		assertTrue(cancel.isDisplayed(), invalidExp);
	}

	public void clickCancel() {
		Loggerload.info("userclicks on Add Cancel button");
		cancel.click();
		assertTrue(cancel.isSelected());
	}

	public void userdetailsWindow() {
		Loggerload.info("userclicks on close userDetails Window");

	}

	public void closePopup() {
		Loggerload.info("userclicks on close button");
		close.click();
		assertTrue(close.isSelected());
	}

	public void closeButton() {
		Loggerload.info("verify  close button");
		assertTrue(close.isDisplayed(), invalidExp);
	}

	public void submitButton() {
		Loggerload.info("verify  submit button");
		assertTrue(close.isDisplayed(), invalidExp);
	}

	//// Edit

	public void clickEditBtn() {
		Loggerload.info("User Click on edit button");
		editbtn.click();
	}

	public void enterFirstName(String fname) {
		Loggerload.info("User Enter First Name");
		firstnameTxtBox.sendKeys(fname);
	}

	public void enterLastName(String lname) {
		Loggerload.info("User Enter Last Name");
		lastnameTxtBox.sendKeys(lname);

	}

	public void clickSaveBtn() {
		submitBtn.click();
		Loggerload.info("User Click on submit button");

	}

	public void enterEmail(String email) {
		Loggerload.info("User Enter email");
		emailTxtBox.sendKeys(email);

	}

	public void enterContact(String contact) {
		Loggerload.info("User Enter contact");
		contactTxtBox.sendKeys(contact);

	}

	public void enterBatch(String batch) {
		Loggerload.info("User Enter batch Name");
		batchTxtBox.sendKeys(batch);

	}

	public void enterSkill(String skill) {
		Loggerload.info("User Enter Skill");
		skillTxtBox.sendKeys(skill);
	}

	// Delete
	public void clickDeleteBtn() {
		Loggerload.info("User Click on Delete button");
		deleteBatchbtn.click();
	}

	public void clickYesDeleteBtn() {
		Loggerload.info("User Click Yes on Delete Confirm Window");
		yesDeleteBtn.click();
	}

	public void verifySuccesMsg(String succesMsg) {
		Loggerload.info("User verify successful message for delete");
		assertEquals(successMsg.getText(), succesMsg);
	}

	public void verifyErrorMsg(String errormsg) {
		Loggerload.info("User verify error message for delete");
		assertEquals(errorMsg.getText(), errormsg);

	}

	public void clickNoDeleteBtn() {
		Loggerload.info("User Click No on Delete Confirm Window");
		noDeleteBtn.click();
	}

	public void isUserNameDeleted(String searchstring) throws Exception {
		Loggerload.info("User check if program name is deleted");
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserName);
		Assert.assertTrue("Search result not found", SU.verifySearch(data, searchstring));

	}

	public void verifySearchUserNameResultFound(String searchstring) throws Exception {
		Loggerload.info("Entries for the searched are shown" + searchstring);
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserName);
		Assert.assertFalse("Searched Result are Found", SU.verifySearch(data, searchstring));

	}

	public void verifyUserLoggedin() {
		Loggerload.info("User is logged in to LMS website");
		assertEquals(logout.getText(),"Logout");
	}
	
	public void verifyDeleteBtnDisabled() {
		Loggerload.info("User verify that delete button is disabled");
		Assert.assertFalse("Delete Button is Enabled", multideleteBatchbtn.isEnabled());

	}

	public void selectMultipleCheckboxes() {
		Loggerload.info("User select check box");
		checkBx1.click();
		Loggerload.info("User select check box");
		checkBx2.click();

	}

	public void verifyDeleteBtnEnabled() {
		Loggerload.info("User verify that delete button is enabled");
		Assert.assertTrue("Delete Button is disabled", multideleteBatchbtn.isEnabled());

	}

	public void clickEnabledDeleteBtn() {
		Loggerload.info("User Click on enabled Delete button");
		if (multideleteBatchbtn.isEnabled()) {
			multideleteBatchbtn.click();
		}

	}

	public void verifyUserNameExist() throws Exception {
		Loggerload.info("User can see Program Names not deleted");
		Loggerload.info("check if program name is deleted");
		ArrayList<String> data = Pgu.getAllPageData(tableContainer, cellXPathUserName);
		Assert.assertTrue("Search result not found for" + userName1.getText(),
				SU.verifySearch(data, userName1.getText()));
		Assert.assertTrue("Search result not found for" + userName2.getText(),
				SU.verifySearch(data, userName2.getText()));

	}

	public void selectFirstCheckbox() {
		Loggerload.info("User verify that delete button is enabled");
		firstCheckbox.click();

	}

	public void verifyAllCheckbox() {
		Loggerload.info("User verify all check boxes are checked");
		for (WebElement e : allCheckbox) {
			Assert.assertTrue("check box is not checked for" + e.getAttribute("value"), e.isSelected());

		}

	}

	public void verifyDeleteWindowPresent() {
		Loggerload.info("User Verify that user is on Delete Window");
		assertEquals(driver.getTitle(), "Delete");

	}

}
