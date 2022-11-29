package pageObjectModel;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import stepDefinition.DriverManager;
import utilities.AscDscOrderUtility;
import utilities.Loggerload;

import utilities.PaginationUtility;
import utilities.SearchUtility;

public class Assignment_POM {
	
public static WebDriver driver = DriverManager.getChromedriver();
	
	Actions action = new Actions(driver);
	PaginationUtility pu = new PaginationUtility();
	SearchUtility su = new SearchUtility();
	public static int Flag;
	AscDscOrderUtility AsDs = new AscDscOrderUtility();
	public static int previousPageNumber;
	public static String NewAssignmentName;
	
	//String assignmentNameLink1="//*[@id='table']/a";
	String assignmentNameLink2="//*[@id='table']/a";
	String cellXPathAssignmentName = "//*[@id='table']/tbody/tr/td[1]";
	String cellXPathAssignmentDesc = "//*[@id='table']/tbody/tr/td[2]";
	String cellXPathAssignmentDueDate = "//*[@id='table']/tbody/tr/td[3]";
	String cellXPathAssignmentGrade = "//*[@id='table']/tbody/tr/td[4]";
	
	@FindBy (id="mngassg") WebElement manageAssignment;
	@FindBy (id="footermsg") WebElement footerText;
	@FindBy (id="pgmsg") WebElement paginatorText;
	@FindBy (id="next") WebElement nextArrow;
	@FindBy (id="privious") WebElement priviousArrow;
	@FindBy (id="first") WebElement firstArrow;
	@FindBy (id="last") WebElement lastArrow;
	@FindBy (id="search") WebElement searchBox;
	@FindBy (id="asdetail") WebElement assignmentDetail;
	@FindBy (id="addnew") WebElement addNewAssignmentButton;
	@FindBy (id="asssignmentName") List<WebElement> assignmentNames;
	@FindBy (id="") WebElement assignmentNamefromDetailPage;
	@FindBy (id="") WebElement assignmentDescriptionfromDetailPage;
	@FindBy (id="") WebElement assignmentGradefromDetailPage;
	@FindBy (id="") WebElement assignmentDueDatefromDetailPage;
	@FindBy (id="") WebElement saveButtonfromDetailPage;
	@FindBy (id="") WebElement cancelButtonfromDetailPage;
	@FindBy (id="AsgName") WebElement AssignmentName;
	@FindBy (id="manage button") WebElement managebtn;
	@FindBy (id="grade") WebElement gradeWindow;

	
	@FindBy(className = "paginate_button current")WebElement currentPageNumber;
	
	@FindBy(xpath = "//*[@id='table']/tbody/tr/td")List<WebElement> tableData;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[1]")WebElement sortBtn_AssignmentName;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[2]")WebElement sortBtn_AssignmentDesc;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[3]")WebElement sortBtn_AssignmentDueDate;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[4]")WebElement sortBtn_AssignmentGrade;
	@FindBy(xpath = "//*[@id='table']/tbody/tr/td")List<WebElement> ascTableData;
	@FindBy(xpath = "//*[@id='table']/tbody/tr/td")List<WebElement> descTableData;
	@FindBy(xpath = "//section[//*[@id='table']]")WebElement tableContainer;
	@FindBy(xpath = "//*[@id='table']/thead/tr[1]/th[1]")WebElement headerCell;
	

	@FindBy (id="edit") WebElement editBtn;
	
	//Google Form
	@FindBy(linkText="\"//*[@id='table']/a\"") WebElement assignmentNameLink1;
	@FindBy(linkText="\"//*[@id='switch account']/a\"") WebElement switchAccount;
	@FindBy(id="EmailId") WebElement Emailid;
	@FindBy(id="first and last name") WebElement fullName;
	@FindBy(id="favorite animal") WebElement favAnimal;
	@FindBy(id="favorite color") WebElement favColor;
	@FindBy(id="Google submit") WebElement googleSubmitbtn;
	@FindBy(id = "successMessage") By successmsg;
	@FindBy(id="Clear Form") WebElement clearFormbtn;

	//Delete Xpaths
	 @FindBy(id="yes button") WebElement yesbtn;
	 @FindBy(linkText="no button") WebElement nobtn;
	 @FindBy(id = "updatedMsg")WebElement updatedMsg;
	 @FindBy(id="delete button") WebElement deletebtn;
	 
	//multiple delete 
	 
		 @FindBy(id = "Main delete button")WebElement maindeleteBtn;
		 @FindBy(id = "checkbox1")WebElement checkBox1;
		 @FindBy(id = "checkbox2")WebElement checkBox2; 
		 @FindBy(id = "AssignmentName1")WebElement assign1;
		 @FindBy(id = "AssignmentName2")WebElement assign2;
		 
    //check box
		 @FindBy(id = "firstCheckbox")WebElement firstCheckbox;
		 @FindBy(xpath = "//*[@class='checkbox']//*[@type='Checkbox']")List<WebElement> allCheckbox;
	
		 
		 public void openWebsite() {
		
		driver.get("LMS.com");
		driver.manage().window().maximize();
		Loggerload.info("User opens the LMS website");
	}
	
	public void validadmin(String Admin) {
		
		if(Admin.equalsIgnoreCase("admin"))
			Flag = 2;
	}
    public void validuser(String User) {
		
		if(User.equalsIgnoreCase("user"))
			Flag = 1;
	}
    public void validstaff(String Staff) {
		
		if(Staff.equalsIgnoreCase("staff"))
			Flag = 3;
	}
	
	public void storeCurrentPageNumber() {
		
		previousPageNumber = Integer.parseInt(pu.getElementText(currentPageNumber));
	}
	
	public void validuser(String User,String Staff) {
		
		if(User.equalsIgnoreCase("User") || Staff.equalsIgnoreCase("Staff"))
			Flag = 1;
	}

	public void manageAssignmentPage() {
		
		Assert.assertTrue(manageAssignment.isDisplayed());
		Loggerload.info("User is on Manage Assignment Page");
	}
	
	public void headerText(String htext) {
		
		String s =	pu.getElementText(manageAssignment);
		assertEquals(s,"Manage Assignment", "InvalidPage"); 
		Loggerload.info("Get the title of the page : " + s);
	}

	public void footerText(String ftext) {
		
		String s =	pu.getElementText(footerText);
		assertEquals(s,"In Total there are 3 assignments", "InvalidPage"); 
		Loggerload.info("Get the title of the page : " + s);
	}
	
	public void paginatorText(String ptext) {
		
		String s =	pu.getElementText(paginatorText);
		assertEquals(s,"Showing 1 to 3 of 3 entries", "InvalidPage"); 
		Loggerload.info("Get the title of the page : " + s);
	}
	
	public void nextButton() throws Exception {
		
		pu.clickElement(nextArrow);
		Loggerload.info("Navigate to Next Page");
	}
	
	public void priviousButton() throws Exception {
		
		pu.clickElement(priviousArrow);
		Loggerload.info("Navigate to Previous Page");
	}
	public void lastButton() throws Exception {
		
		pu.clickElement(lastArrow);
		Loggerload.info("Navigate to Last Page");
	}
	
	public void firstButton() throws Exception {
		
		pu.clickElement(firstArrow);
		Loggerload.info("Navigate to First Page");
	}
	
	public void checkSearchBox(String s) {
		
		searchBox.sendKeys("Sql Assignment" +Keys.ENTER);
		Loggerload.info("Searching for Sql Assignment ");
	}
	
	public void VerifySearchAssignmentDetail(String searchString) throws Exception {
		
		Loggerload.info("Entries for the searched are shown" + searchString);
		
		ArrayList<String> data= pu.getAllPageData(tableContainer, cellXPathAssignmentName);
		Assert.assertTrue( su.verifySearch(data, searchString));
	}
		
	public void assignmentDetailPage() {
	
		String s =	pu.getElementText(assignmentDetail);
			assertEquals(s,"Assignment Details", "InvalidPage"); 
			Loggerload.info("Get the title of the page : " + s);
	}

	public void clickAddNewAssignmentButton() throws Exception {
		
		pu.clickElement(addNewAssignmentButton);
		Loggerload.info("Staff click on Add new Assignment Button");

	}

	public void isPageContainsText(String text) {
		
		Assert.assertTrue (driver.getPageSource().contains(text));
		Loggerload.info("Error Message : " + text);
	}
	
	public void allFieldsEmpty() throws Exception  {
		
		String name = assignmentNamefromDetailPage.getText();
		String desc = assignmentDescriptionfromDetailPage.getText();
		String grade = assignmentGradefromDetailPage.getText();
		String date = assignmentDueDatefromDetailPage.getText();
		
		if(name.isEmpty()&& desc.isEmpty() && grade.isEmpty() && date.isEmpty())
			
			Loggerload.info("Error Message display : Name is required ");
	}

	public void addAllFieldsFull() {
		
		assignmentNamefromDetailPage.sendKeys("TestNG Assignment");
		assignmentDescriptionfromDetailPage.sendKeys("Complete All the Assignments");
		assignmentGradefromDetailPage.sendKeys("A");
		assignmentDueDatefromDetailPage.sendKeys("12-31-2022");
	}
	
	public void clickSaveButton() throws Exception {
		
		pu.clickElement(saveButtonfromDetailPage);
		Loggerload.info("Staff filled all the details and press save button for new Assignment ");
	}

	public void clickCancelButton() throws Exception {

		pu.clickElement(cancelButtonfromDetailPage);
		Loggerload.info("Staff filled all the details and press cancel button for new Assignment ");
				
	}

	public void verifyNextPage() {
		
		int currentPageNum = Integer.parseInt(pu.getElementText(currentPageNumber));
		
		Assert.assertTrue((currentPageNum - previousPageNumber) == 1);
		Loggerload.info("User is on Next Page ");
	}
	public void verifyPreviuosPage() {
		
		int currentPageNum = Integer.parseInt(pu.getElementText(currentPageNumber));
		
		Assert.assertTrue((previousPageNumber - currentPageNum ) == 1);
		Loggerload.info("User is on Next Page ");
	}
	public void verifyLastPage() {
		
		if (!lastArrow.isEnabled())
		Loggerload.info("You are on Last Page  ");
	}

	public void verifyFirstPage() {
		
		int pg = Integer.parseInt(pu.getElementText(currentPageNumber));
		Assert.assertTrue(pg == 1);
		Loggerload.info("You are on First Page  ");
	}
	
	////ASC
	
	public void clickOnAssignmentNameAscArrow() throws Exception {
		
		pu.clickElement(sortBtn_AssignmentName);
		Loggerload.info("Admin/User/Staff Clicks on Assignment Name Ascending Arrow ");
		
	}
	public void clickOnAssignmentDescAscArrow() throws Exception {
		
		pu.clickElement(sortBtn_AssignmentDesc);
		Loggerload.info("Admin/User/Staff Clicks on Assignment Description Ascending Arrow ");
		
	}
	public void clickOnAssDueDateAscArrow() throws Exception {
		
		pu.clickElement(sortBtn_AssignmentDueDate);
		Loggerload.info("Admin/User/Staff Clicks on Assignment Description Ascending Arrow ");
		
	}

	public void verifyASCOrderAssignmentName() {
		
		Loggerload.info("Admin/User/Staff see the result displayed in Ascending order for Assignment name");

		ArrayList<String> data= pu.getAllPageData(tableContainer, cellXPathAssignmentName);
		Assert.assertTrue(AsDs.verifyAscendingOrder(data), "Results are in not in Asceding Order");
	}
	
	public void verifyASCOrderAssignmentDesc() {
		
		Loggerload.info("Admin/User/Staff see the result displayed in Ascending order for Description");

		ArrayList<String> data= pu.getAllPageData(tableContainer, cellXPathAssignmentDesc);
		Assert.assertTrue(AsDs.verifyAscendingOrder(data), "Results are in not in Asceding Order");
	}
	public void verifyASCOrderAssignmentDueDate() {
		
		Loggerload.info("Admin/User/Staff see the result displayed in Ascending order for Due Date");

		ArrayList<String> data= pu.getAllPageData(tableContainer, cellXPathAssignmentDueDate);
		Assert.assertTrue(AsDs.verifyAscendingOrder(data), "Results are in not in Asceding Order");
	}
	
	/////Desc 
	
	public void clickOnAssignmentNameDescArrow() throws Exception {
		
		pu.clickElement(sortBtn_AssignmentName);
		Loggerload.info("Admin/User/Staff Clicks on Assignment Name Descending Arrow ");
		
	}
	public void clickOnAssignmentDescDescArrow() throws Exception {
		
		pu.clickElement(sortBtn_AssignmentDesc);
		Loggerload.info("Admin/User/Staff Clicks on Assignment Description Descending Arrow ");
		
	}
	public void clickOnAssDueDateDescArrow() throws Exception {
		
		pu.clickElement(sortBtn_AssignmentDueDate);
		Loggerload.info("Admin/User/Staff Clicks on Assignment Description Descending Arrow ");
		
	}
	
	public void verifyDESCOrder_AssignmentName() {
		Loggerload.info("Admin/User/Staff see the result displayed in Descending order for Assignment name");
		ArrayList<String> data=pu.getAllPageData(tableContainer, cellXPathAssignmentName);
		Assert.assertTrue(AsDs.verifyDescendingOrder(data), "Results are not in Desceding Order");
	}
	public void verifyDESCOrder_AssignmentDescription() {
		Loggerload.info("Admin/User/Staff see the result displayed in Descending order for Assignment name");
		ArrayList<String> data=pu.getAllPageData(tableContainer, cellXPathAssignmentDesc);
		Assert.assertTrue(AsDs.verifyDescendingOrder(data), "Results are not in Desceding Order");
	}
	public void verifyDESCOrder_AssignmentDueDate() {
		Loggerload.info("Admin/User/Staff see the result displayed in Descending order for Assignment name");
		ArrayList<String> data=pu.getAllPageData(tableContainer, cellXPathAssignmentDueDate);
		Assert.assertTrue(AsDs.verifyDescendingOrder(data), "Results are not in Desceding Order");
	}
	public void clickOnAssignmentName() throws Exception {
		
		Loggerload.info("Staff clicks a Add new assignment button");
		pu.clickElement(AssignmentName);
		
	}

	public void verifyNewlyAddedAssignment() {
		
		
	}
	public void clickManageButton() {
		managebtn.click();
	}
	public void verifyGradeWindow() {
		
		String s =	pu.getElementText(gradeWindow);
			assertEquals(s,"Grade Window", "InvalidPage"); 
			Loggerload.info("Get the title of the page : " + s);
	}
	public void clickEditbtn() {
		editBtn.click();
		
	}
	public void setAssignmentName() {
		Loggerload.info("Set /Edit Assignment Name");
		assignmentNamefromDetailPage.click();
		assignmentNamefromDetailPage.clear();
		assignmentNamefromDetailPage.sendKeys("New sql assignment");
	}
	public void setAssignmentDesc() {
		Loggerload.info("Set /Edit Assignment Description");
		assignmentDescriptionfromDetailPage.click();
		assignmentDescriptionfromDetailPage.clear();
		assignmentDescriptionfromDetailPage.sendKeys("Completed the assignment");
		
	}
	public void setAssignmentGrade() {
		Loggerload.info("Set /Edit Assignment Grade");
		assignmentGradefromDetailPage.click();
		assignmentGradefromDetailPage.clear();
		assignmentGradefromDetailPage.sendKeys("A++");
	}
	public void setAssignmentDuedate() {
		Loggerload.info("Set /Edit Assignment DueDate");
		assignmentDueDatefromDetailPage.click();
		assignmentDueDatefromDetailPage.clear();
		assignmentDueDatefromDetailPage.sendKeys("11-30-2022");
	}
	public void verifyWindowClose() {
		Loggerload.info("Admin verify window closed after cancel button");
		assertEquals(driver.getCurrentUrl(), "Manage Assignment Detail page URL");
	}
	public void verifyAssignmentPage() {
		Loggerload.info("Admin verify that admin is on Manage Assignment page");
		assertEquals(driver.getCurrentUrl(), "Manage Assignment page URL");
	}
	
	//google form
	public void clickAssignmentlink() {
		Loggerload.info("Clicks on Assignment Name Link");
		assignmentNameLink1.click();
	}
	public void verifyGooglePage() {
		Loggerload.info("Admin verify that admin is on Manage Google page");
		assertEquals(driver.getCurrentUrl(), "Manage Google page URL");
	}
	public void enterAllFieldsGoogle() {
		switchAccount.click();
		Emailid.click();
		Emailid.sendKeys("numpystars@google.com");
		fullName.click();
		fullName.sendKeys("Numpy Stars");
		favAnimal.click();
		favAnimal.sendKeys("Elephant");
		favColor.click();
		favColor.sendKeys("yellow");
		
	}
	public void clickGoogleSubmit() {
		googleSubmitbtn.click();
	}
	public String getsuccessmsg() {
		WebElement successMessage =new WebDriverWait(driver,Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(successmsg));
		Loggerload.error(successMessage.getText());
		return successMessage.getText();
	}
	public void allGooglefiledempty() {
		String name = fullName.getText();
		String animal = favAnimal.getText();
		String color = favColor.getText();
		String email = Emailid.getText();
		
		if(name.isEmpty()&& animal.isEmpty() && color.isEmpty() && email.isEmpty())
			
			Loggerload.info("Error Message display : Name is required ");
	}
	public void clickClearForm() {
		clearFormbtn.click();
		fullName.clear();
		favAnimal.clear();
		favColor.clear();
		Emailid.clear();
	}
	public void clickSwitchAccount() {
		switchAccount.click();
	}
	public void verifySwitchAccount() {
		Loggerload.info("Verify User Switch to new account");
		assertEquals(Emailid.getText(),"numpystars@google.com");
	}
	//delete functionality
	public void clickDeleteButton() {
		Loggerload.info("Click Delete button on right side");
		deletebtn.click();
	}
	
	public void verifyDeleteWindowPresent() {
		Loggerload.info("Staff Verify that Staff is on Delete Window");
		assertEquals(driver.getTitle(), "Delete");

	}
	public void clickYesButton() {
		Loggerload.info("Click Yes button");
		yesbtn.click();
	}
	public void clickNoButton() {
		Loggerload.info("Click No button");
		nobtn.click();
	}
	public void isAssignmentDeleted(String searchstring) throws Exception {
		Loggerload.info("Admin check if program name is deleted");
		ArrayList<String> data=pu.getAllPageData(tableContainer, cellXPathAssignmentName);
		Assert.assertTrue(su.verifySearch(data, searchstring), "Search result not found");

	}
	
	public void verifyMainDeleteBtnDisabled() {
		Loggerload.info("Admin verify that delete button is disabled");
		Assert.assertFalse(maindeleteBtn.isEnabled(),"Delete Button is Enabled");
	}
	
	public void selectMultipleCheckboxes() {
		Loggerload.info("Admin select check box");
		checkBox1.click();
		Loggerload.info("Admin select check box");
		checkBox2.click();
	}
	
	public void verifyMainDeleteBtnEnabled() {
		Loggerload.info("Admin verify that delete button is enabled");
		Assert.assertTrue(maindeleteBtn.isEnabled(), "Delete Button is disabled");
		
	}
	public void clickmaindelete() {
		maindeleteBtn.click();
	}
	public void clickEnabledDeleteBtn() {
		Loggerload.info("Admin Click on enabled Delete button");
		if (maindeleteBtn.isEnabled()) {
			maindeleteBtn.click();
		}

	}

	public void verifyAssignmentExist() throws Exception {
		
		Loggerload.info("check if Assignment is deleted");
		ArrayList<String> data=pu.getAllPageData(tableContainer, cellXPathAssignmentName);
		Assert.assertTrue(su.verifySearch(data, assign1.getText()),
				"Search result not found for" + assign1.getText());
		Assert.assertTrue(su.verifySearch(data, assign2.getText()),
				"Search result not found for" + assign2.getText());

	}
	//checkbox functionality
		public void selectFirstCheckbox() {
			Loggerload.info("Admin verify that delete button is enabled");
			firstCheckbox.click();

		}

		public void verifyAllCheckbox() {
			Loggerload.info("Admin verify all check boxes are checked");
			for (WebElement e : allCheckbox) {
				Assert.assertTrue(e.isSelected(), "check box is not checked for" + e.getAttribute("value"));

			}
		}
}
