package pageObjectModel;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import stepDefinition.DriverManager;
import utilities.AscDscOrderUtility;
import utilities.Loggerload;
import utilities.PaginationUtility;
import utilities.SearchUtility;


public class Batch_POM {
	public static WebDriver driver = DriverManager.getChromedriver();
	PaginationUtility Pgu = new PaginationUtility();
	SearchUtility SU = new SearchUtility();
	AscDscOrderUtility AsDs = new AscDscOrderUtility();
	String cellXPathBatchName = "//*[@id='table']/tbody/tr/td[1]";
	String cellXPathBatchDesc = "//*[@id='table']/tbody/tr/td[2]";
	String cellXPathBatchStatus = "//*[@id='table']/tbody/tr/td[3]";
	String cellXPathBatchNoOfClass = "//*[@id='table']/tbody/tr/td[4]";
	String cellXPathProgramName = "//*[@id='table']/tbody/tr/td[5]";
	public static int Flag;
	
	//Login
	@FindBy (id="username")WebElement Username;
	@FindBy (id="password")WebElement Password;
	@FindBy (id="code")WebElement passcode;
	
	
	@FindBy(id = "Header")WebElement headerTxt;
	@FindBy(id = "footer")WebElement footerTxt;
	@FindBy(id = "login")WebElement login;
	@FindBy(id = "logout")WebElement logout;
	@FindBy(id = "batchbtn")WebElement batchBtn;
	
	//Pagination
	@FindBy(id = "nextPgBtn")WebElement nextPgBtn;
	@FindBy(id = "prevPgBtn")WebElement prevPgBtn;
	@FindBy(id = "firstPgBtn")WebElement firstPgBtn;
	@FindBy(id = "lastPgBtn")WebElement lastPgBtn;
	@FindBy(id = "PgText")WebElement pgText;
	@FindBy(className = "paginate_button current")WebElement currentPageNumber;
	@FindBy(xpath = "//*[@id='table']/tbody/tr/td")List<WebElement> tableData;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[1]")WebElement sortBtn_Name;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[2]")WebElement sortBtn_Desc;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[3]")WebElement sortBtn_Status;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[4]")WebElement sortBtn_NoOfClass;
	@FindBy(xpath = "//*[@id='table']/thead/tr/th[5]")WebElement sortBtn_PrgmName;
	@FindBy(xpath = "//*[@id='table']/tbody/tr/td")List<WebElement> ascTableData;
	@FindBy(xpath = "//*[@id='table']/tbody/tr/td")List<WebElement> descTableData;
	@FindBy(xpath = "//section[//*[@id='table']]")WebElement tableContainer;
	@FindBy(xpath = "//*[@id='table']/thead/tr[1]/th[1]")WebElement headerCell;
	
	//Search
	@FindBy(id = "searchText")WebElement searchText;
	@FindBy(id = "searchBtn")WebElement searchBtn;
	@FindBy(id = "searchTextbox")WebElement serachTxtBox;
	
	//New Batch
	@FindBy(id = "newbatchBtn")WebElement newBatchbtn;
	@FindBy(id = "dropdown")WebElement prgmdropDown;
	@FindBy(id = "prgmName")WebElement nameTxtBox;
	@FindBy(id = "prgmName")WebElement prgmDescTxtBox;
	@FindBy(id = "prgmStatusActive")WebElement radioActive;
	@FindBy(id = "prgmStatusInActive")WebElement radioInActive;
	@FindBy(id = "prgmNoClasses")WebElement prgmNoClassesTxtBox;
	@FindBy(id = "saveBtn")WebElement saveBtn;
	@FindBy(id = "saveBtn")WebElement cancelBtn;
	@FindBy(id = "errorMessage")WebElement errorMsg;
	@FindBy(id = "successMessage")WebElement successMsg;
	
	//Edit batch
	@FindBy(id = "editBatchBtn")WebElement editBatchbtn;
	@FindBy(id = "updatedMsg")WebElement updatedMsg;
	
	//Delete
	@FindBy(id = "deleteBatchbtn")WebElement deleteBatchbtn;
	@FindBy(id = "yesDeletebtn")WebElement yesDeleteBtn;
	@FindBy(id = "noDeletebtn")WebElement noDeleteBtn;

	//Multiple Delete
	@FindBy(id = "multideleteBatchbtn")WebElement multideleteBatchbtn;
	@FindBy(id = "checkbox1")WebElement checkBx1;
	@FindBy(id = "checkbox2")WebElement checkBx2;
	@FindBy(id = "prgName1")WebElement prgName1;
	@FindBy(id = "prgName2")WebElement prgName2;
	@FindBy(id = "firstCheckbox")WebElement firstCheckbox;
	@FindBy(xpath = "//*[@class='checkbox']//*[@type='Checkbox']")List<WebElement> allCheckbox;
	
	public void homepage() {
		Loggerload.info("User is on LMS website Login Page");
		driver.get("https://test-lmsapplication.com");
		PageFactory.initElements(driver, this);
				
	}
	
	//login 
	public void validloginUser(String uname, String pwd) {
			
		Loggerload.info("User Enter Valid USER login details");
				Username.sendKeys(uname); 
				Password.sendKeys(pwd);
				Flag=1;
		
	}
	
	public void validloginAdmin(String uname, String pwd, String code) {
		Loggerload.info("User Enter Valid STAFF login details");
		Username.sendKeys(uname); 
		Password.sendKeys(pwd);
		passcode.sendKeys(code);
		Flag=2;
	}
	public void validloginStaff(String uname, String pwd, String code) {
		Loggerload.info("User Enter Valid ADMIN login details");
		Username.sendKeys(uname); 
		Password.sendKeys(pwd);
		passcode.sendKeys(code);
		Flag=3;
	}
	
	
	public void loginpage() {
		Loggerload.info("User is on LMS website login Page");
		driver.get("https://test-lmsapplication.com/login");
				
	}
	
	public void verifyUserLoggedin() {
		Loggerload.info("User is logged in to LMS website");
		assertEquals(logout.getText(),"Logout");
	}
	public void clickOnBatchButton() {
		Loggerload.info("User click on Batch button");
		batchBtn.click();
	}

	public void verifyHeaderText(String expheaderTxt) {
		Loggerload.info("Admin/User/Staff see the header Text");
		assertEquals(headerTxt.getText(), expheaderTxt);
	}

	public void verifyFooterText(String expfooterTxt) {
		Loggerload.info("Admin/User/Staff see the footer Text");
		assertEquals(footerTxt.getText(), expfooterTxt);
	}

	public void clickNextPage() throws Exception {
		Loggerload.info("Admin/User/Staff clicks on Enabled paginator -next button");
		Pgu.clickElement(nextPgBtn);
	}

	public void clickPrevPage() throws Exception {
		Loggerload.info("Admin/User/Staff clicks on Enabled paginator -prev button");
		Pgu.clickElement(prevPgBtn);
	}

	public void clickFirstPage() throws Exception {
		Loggerload.info("Admin/User/Staff clicks on Enabled paginator-first button");
		Pgu.clickElement(firstPgBtn);
	}

	public void clickLastPage() throws Exception {
		Loggerload.info("Admin/User/Staff clicks on Enabled paginator-last button");
		Pgu.clickElement(lastPgBtn);
	}

	public void verifyManageBatchPage() {
		Loggerload.info("Admin/User/Staff is on Manage Batch page");
		assertEquals(driver.getCurrentUrl(), "URL");
	}

	public void verifyPageText(String ExpText) {
		Loggerload.info("Admin/User/Staff see Paginator text");
		assertEquals(pgText.getText(), ExpText);
	}

	public void verifyCurrentPageNumber(String pageNum) {
		Loggerload.info("Admin/User/Staff see Page number navigated to page");
		assertEquals(currentPageNumber.getText(), pageNum);
	}

	// Search

	public void verifySearchText(String searchTxt) {
		Loggerload.info("Admin/User/Staff see the Search Text box has text as \"Search\"");
		assertEquals(searchText.getText(), searchTxt);
	}
	

	public void enterSearchText(String searchString) {
		Loggerload.info("Admin/User/Staff enters string to be searched" + searchString);
		new Actions(driver).sendKeys(serachTxtBox, searchString).sendKeys(serachTxtBox, Keys.ENTER).perform();
	}

	public void verifySearchResultBatchName(String searchString) throws Exception {
		Loggerload.info("Entries for the searched are shown" + searchString);
		
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathBatchName);
		Assert.assertTrue("Searched Result are not Found", SU.verifySearch(data, searchString));
	}

	public void verifySearchResultBatchDesc(String searchString) throws Exception {
		Loggerload.info("Entries for the searched are shown" + searchString);
		
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathBatchDesc);
		Assert.assertTrue("Searched Result are not Found", SU.verifySearch(data, searchString));
	}
	
	public void verifySearchResultBatchNoofclass(String searchString) throws Exception {
		Loggerload.info("Entries for the searched are shown" + searchString);
		
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathBatchNoOfClass);
		Assert.assertTrue("Searched Result are not Found", SU.verifySearch(data, searchString));
	}
	
	public void verifySearchResultBatchStatus(String searchString) throws Exception {
		Loggerload.info("Entries for the searched are shown" + searchString);
		
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathBatchStatus);
		Assert.assertTrue("Searched Result are not Found", SU.verifySearch(data, searchString));
	}
	
	public void verifySearchResultProgramName(String searchString) throws Exception {
		Loggerload.info("Entries for the searched are shown" + searchString);
		
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathProgramName);
		Assert.assertTrue("Searched Result are not Found", SU.verifySearch(data, searchString));
	}
	public void verifySearchPrgNameResultFound(String searchString) throws Exception {
		Loggerload.info("Entries for the searched are shown" + searchString);
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathProgramName);
		Assert.assertFalse("Searched Result are Found", SU.verifySearch(data, searchString));
	}
	// Sorting

	public void clickOnSortBtn_Name() {
		Loggerload.info("Admin/User/Staff Clicks on Batch Name Ascending Arrow");
		sortBtn_Name.click();
	}

	public void clickOnSortBtn_Desc() {
		Loggerload.info("Admin/User/Staff Clicks on Batch Description Ascending Arrow");
		sortBtn_Desc.click();
	}

	public void clickOnSortBtn_Status() {
		Loggerload.info("Admin/User/Staff Clicks on Batch Status Ascending Arrow");
		sortBtn_Status.click();
	}

	public void clickOnSortBtn_NoOfClass() {
		Loggerload.info("Admin/User/Staff Clicks on No of Classes Ascending Arrow");
		sortBtn_NoOfClass.click();
	}

	public void clickOnSortBtn_PrgmName() {
		Loggerload.info("Admin/User/Staff Clicks on Program name Ascending Arrow");
		sortBtn_PrgmName.click();
	}

	public void verifyASCOrder_Name() {
		Loggerload.info("Admin/User/Staff see the result displayed in Ascending order for batch name");
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathBatchName);
		Assert.assertTrue("Results are in not in Asceding Order", AsDs.verifyAscendingOrder(data));
	}

	public void verifyASCOrder_Desc() {
		Loggerload.info("Admin/User/Staff see the result displayed in Ascending order for batch description");
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathBatchDesc);
		Assert.assertTrue("Results are in not in Asceding Order", AsDs.verifyAscendingOrder(data));
	}
	
	public void verifyASCOrder_Status() {
		Loggerload.info("Admin/User/Staff see the result displayed in Ascending order for batch status");
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathBatchStatus);
		Assert.assertTrue("Results are in not in Asceding Order", AsDs.verifyAscendingOrder(data));
	}
	
	public void verifyASCOrder_NoOfClass() {
		Loggerload.info("Admin/User/Staff see the result displayed in Ascending order for no of classes");
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathBatchNoOfClass);
		Assert.assertTrue("Results are in not in Asceding Order", AsDs.verifyAscendingOrder(data));
	}
	
	public void verifyASCOrder_PrgmName() {
		Loggerload.info("Admin/User/Staff see the result displayed in Ascending order program name");
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathProgramName);
		Assert.assertTrue("Results are in not in Asceding Order", AsDs.verifyAscendingOrder(data));
	}
	
	//Descending order
	public void verifyDESCOrder_Name() {
		Loggerload.info("Admin/User/Staff see the result displayed in Descending order for batch name");
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathBatchName);
		Assert.assertTrue("Results are not in Desceding Order", AsDs.verifyDescendingOrder(data));
	}

	public void verifyDESCOrder_Desc() {
		Loggerload.info("Admin/User/Staff see the result displayed in Descending order for batch description");
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathBatchDesc);
		Assert.assertTrue("Results are not in Desceding Order", AsDs.verifyDescendingOrder(data));
	}
	public void verifyDESCOrder_Status() {
		Loggerload.info("Admin/User/Staff see the result displayed in Descending order for batch status");
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathBatchStatus);
		Assert.assertTrue("Results are not in Desceding Order", AsDs.verifyDescendingOrder(data));
	}
	public void verifyDESCOrder_NoOfClass() {
		Loggerload.info("Admin/User/Staff see the result displayed in Descending order no of classes");
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathBatchNoOfClass);
		Assert.assertTrue("Results are not in Desceding Order", AsDs.verifyDescendingOrder(data));
	}
	public void verifyDESCOrder_PrgmName() {
		Loggerload.info("Admin/User/Staff see the result displayed in Descending order program name");
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathProgramName);
		Assert.assertTrue("Results are not in Desceding Order", AsDs.verifyDescendingOrder(data));
	}
	
	//Count Rows
	
	public void countNoOfRows(Integer int1) {
		Loggerload.info("Admin/User/Staff counts number of rows in a table");
		assertEquals(Pgu.getTotalRows(tableContainer), int1);
	}
	
	// New batch
	public void clickNewBatchBtn() {
		Loggerload.info("Admin Clicks on A New Batch button");
		newBatchbtn.click();
	}

	public void verifyNewBatchWindow() {
		Loggerload.info("Admin is on A New Batch Window");
		driver.switchTo().activeElement();
	}

	public void enterName(String name) {
		Loggerload.info("Admin Enter Program Name");
		nameTxtBox.sendKeys(name);
	}

	public void enterDesc(String desc) {
		Loggerload.info("Admin Enter Program Description");
		prgmDescTxtBox.sendKeys(desc);

	}

	public void enterNoofClasses(String noofclass) {
		Loggerload.info("Admin Enter No Of Classes");
		prgmNoClassesTxtBox.sendKeys(noofclass);

	}

	public void enterDetails_Alldata() {
		Loggerload.info("Admin Enter all the data");
		nameTxtBox.sendKeys("Test");
		prgmDescTxtBox.sendKeys("Test");
		prgmNoClassesTxtBox.sendKeys("22");
		clickDropDown();
		selectFromDropdown();
		selectStatus();
	}

	public void clickSaveBtn() {
		saveBtn.click();
		Loggerload.info("Admin Click on save button");
	}

	public void clickDropDown() {
		Loggerload.info("Admin Click on drop down");
		prgmdropDown.click();
	}

	public void verifyProgramNames() {
		Loggerload.info("verify all the program name");
		String[] expPrgList = { "SDETTest", "Angular123456", "SDETTest1", "SDETTest2" };
		Select program = new Select(prgmdropDown);
		List<WebElement> elements = program.getOptions();
		for (int i = 0; i < elements.size(); i++) {
			assertEquals(elements.get(i).getAttribute("value"), expPrgList[i]);
		}
	}

	public void selectFromDropdown() {
		Loggerload.info("Admin Select program name from drop down");
		Select program = new Select(prgmdropDown);
		program.selectByIndex(1);
	}

	public void selectStatus() {
		Loggerload.info("Admin Select status");
		radioActive.click();
	}

	public void clickCancelBtn() {
		Loggerload.info("Admin click on cancel button");
		cancelBtn.click();
	}

	public void verifyWindowClose() {
		Loggerload.info("Admin verify window closed after cancel button");
		assertEquals(driver.getCurrentUrl(), "Manage Batch page URL");
	}

	public void verifyBatchPage() {
		Loggerload.info("Admin verify that admin is on Manage Batch page");
		assertEquals(driver.getCurrentUrl(), "Manage Batch page URL");
	}

	public void verifyErrorMsg(String errormsg) {
		Loggerload.info("Admin verify the error message");
		assertEquals(errorMsg.getText(), errormsg);
	}

	public void verifySuccesMsg(String succesmsg) {
		Loggerload.info("Admin verify the success message");
		assertEquals(successMsg.getText(), succesmsg);

	}

	public void clearData() {
		Loggerload.info("clear data from name, description and no of classes");
		nameTxtBox.clear();
		prgmDescTxtBox.clear();
		prgmNoClassesTxtBox.clear();
	}

	// Edit
	public void verifyEditWindow() {
		Loggerload.info("Admin is on Edit Window");
		assertEquals(driver.getCurrentUrl(), "Edit Window");
		
	}

	public void clickEditBtn() {
		Loggerload.info("Admin Click on Edit button");
		editBatchbtn.click();
		Loggerload.info("User clicks on Edit Button");
        if((Flag==1)||(Flag==2))
        editBatchbtn.click();
        else if(Flag==3)
        	Loggerload.info("Denied Access");
	}

	public void verifyUpdatedMsg(String msg) {
		Loggerload.info("Admin verify successful message for update");
		assertEquals(updatedMsg.getText(), msg);
	}

	public void clickDeleteBtn() {
		Loggerload.info("User clicks on Delete Button");
		if((Flag==1)||(Flag==2))
			deleteBatchbtn.click();
		else if(Flag==3)
			Loggerload.info("Denied Access");
	}

	public void verifyDeleteWindowPresent() {
		Loggerload.info("Admin Verify that Admin is on Delete Window");
		assertEquals(driver.getTitle(), "Delete");

	}

	public void clickYesDeleteBtn() {
		Loggerload.info("Admin Click Yes on Delete Confirm Window");
		yesDeleteBtn.click();
	}

	public void clickNoDeleteBtn() {
		Loggerload.info("Admin Click No on Delete Confirm Window");
		noDeleteBtn.click();

	}

	public void isPrgmNameDeleted(String searchstring) throws Exception {
		Loggerload.info("Admin check if program name is deleted");
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathProgramName);
		Assert.assertTrue("Search result not found", SU.verifySearch(data, searchstring));

	}

	public void verifyDeleteBtnDisabled() {
		Loggerload.info("Admin verify that delete button is disabled");
		Assert.assertFalse("Delete Button is Enabled", multideleteBatchbtn.isEnabled());
	}

	public void selectMultipleCheckboxes() {
		Loggerload.info("Admin select check box");
		checkBx1.click();
		Loggerload.info("Admin select check box");
		checkBx2.click();
	}

	public void verifyDeleteBtnEnabled() {
		Loggerload.info("Admin verify that delete button is enabled");
		Assert.assertTrue("Delete Button is disabled", multideleteBatchbtn.isEnabled());

	}

	public void clickEnabledDeleteBtn() {
		Loggerload.info("Admin Click on enabled Delete button");
		if (multideleteBatchbtn.isEnabled()) {
			multideleteBatchbtn.click();
		}

	}

	public void verifyPrgmNameExist() throws Exception {
		Loggerload.info("Admin can see Program Names not deleted");
		Loggerload.info("check if program name is deleted");
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathProgramName);
		Assert.assertTrue("Search result not found for" + prgName1.getText(),
				SU.verifySearch(data, prgName1.getText()));
		Assert.assertTrue("Search result not found for" + prgName2.getText(),
				SU.verifySearch(data, prgName2.getText()));

	}

	public void selectFirstCheckbox() {
		Loggerload.info("Admin verify that delete button is enabled");
		firstCheckbox.click();

	}

	public void verifyAllCheckbox() {
		Loggerload.info("Admin verify all check boxes are checked");
		for (WebElement e : allCheckbox) {
			Assert.assertTrue("check box is not checked for" + e.getAttribute("value"), e.isSelected());

		}
	}

}
