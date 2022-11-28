package pageObjectModel;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import stepDefinition.DriverManager;
import utilities.AscDscOrderUtility;
import utilities.Loggerload;
import utilities.PaginationUtility;
import utilities.SearchUtility;

public class Program_POM {
public static WebDriver driver=DriverManager.getChromedriver();
PaginationUtility Pgu = new PaginationUtility();
SearchUtility SU = new SearchUtility();
AscDscOrderUtility AsDs = new AscDscOrderUtility();
String cellXPathProgramName = "//*[@id='table']/tbody/tr/td[1]";
String cellXPathProgramDesc = "//*[@id='table']/tbody/tr/td[2]";
String cellXPathProgramStatus = "//*[@id='table']/tbody/tr/td[3]";
static int Flag;
		
    public  Program_POM() {
			PageFactory.initElements(driver,this);
			}
	
	 @FindBy(linkText="Program") WebElement programlink;
	 @FindBy(id = "Header")WebElement header;
	 @FindBy(id = "Footer")WebElement footer;
	 @FindBy(linkText="Paginator") WebElement pagntr;
	 @FindBy(linkText="A New Program") WebElement programbtn;
	 
	 //Program Detail Window
	 @FindBy(id="programpopup") WebElement programpop;
	 @FindBy(id="programdetail name") WebElement programName;
	 @FindBy(id="program description") WebElement programDescription;
	 @FindBy(id = "prgmStatusActive")WebElement radioActive;
	 @FindBy(id = "prgmStatusInActive")WebElement radioInActive;
	 @FindBy (linkText="Save button") WebElement savebtn;
	 @FindBy(linkText="cancel button") WebElement cancelbtn;
	 @FindBy(xpath="div//div//a ") By errormsg;
	 @FindBy(id = "successMessage") By successmsg;
	 
	 //Edit and Delete 
	 @FindBy(id="yes button") WebElement yesbtn;
	 @FindBy(linkText="no button") WebElement nobtn;
	 @FindBy(id="edit button") WebElement editbtn;
	 @FindBy(id = "updatedMsg")WebElement updatedMsg;
	 @FindBy(id="right delete button") WebElement rightdeletebtn;
	 
	 //multiple delete 
	 
	 @FindBy(id = "Main delete button")WebElement maindeleteBtn;
	 @FindBy(id = "checkbox1")WebElement checkBox1;
	 @FindBy(id = "checkbox2")WebElement checkBox2; 
	 @FindBy(id = "prgName1")WebElement prgName1;
	 @FindBy(id = "prgName2")WebElement prgName2;
	 
	 //check box
	 @FindBy(id = "firstCheckbox")WebElement firstCheckbox;
	 @FindBy(xpath = "//*[@class='checkbox']//*[@type='Checkbox']")List<WebElement> allCheckbox;
		
	 
	 //Pagination
	 @FindBy(className = "paginate_button current")WebElement currentPageNumber;
	 @FindBy(id = "nextPgBtn")WebElement nextPgBtn;
	 @FindBy(id = "prevPgBtn")WebElement prevPgBtn;
	 @FindBy(id = "firstPgBtn")WebElement firstPgBtn;
	 @FindBy(id = "lastPgBtn")WebElement lastPgBtn;
	 @FindBy(id = "PgText")WebElement pgText;
	 
	 //Search
	 @FindBy(id = "searchText")WebElement searchText;
	 @FindBy(id = "searchBtn")WebElement searchBtn;
	 @FindBy(id = "searchTextbox")WebElement searchTxtBox;
	 
	 
	 @FindBy(xpath = "//*[@id='table']/tbody/tr/td")List<WebElement> tableData;
	 @FindBy(xpath = "//section[//*[@id='table']]")WebElement tableContainer;
	 
	 //Ascending and descending
	 @FindBy(xpath = "//*[@id='table']/thead/tr/th[1]")WebElement sortBtn_ProName;
	 @FindBy(xpath = "//*[@id='table']/thead/tr/th[2]")WebElement sortBtn_ProDesc;
	 @FindBy(xpath = "//*[@id='table']/thead/tr/th[4]")WebElement sortBtn_ProStatus;
	 @FindBy(xpath = "//*[@id='table']/tbody/tr/td")List<WebElement> ascTableData;
	 @FindBy(xpath = "//*[@id='table']/tbody/tr/td")List<WebElement> descTableData;
	 
	 //no of rows
	 @FindBy(xpath="//*[@id='table']/tbody/tr")List<WebElement> programtablerow;
	
	
	public void clickprogramlink() {
		Loggerload.info("Program page");
		programlink.click();
	}
	public void verifyHeaderText(String expheaderTxt) {
		Loggerload.info("Admin/User/Staff see the header Text");

		assertEquals(header.getText(), expheaderTxt);
	}
	public void verifyFooterText(String expfooterTxt) {
		Loggerload.info("Admin/User/Staff see the footer Text");
		assertEquals(footer.getText(),expfooterTxt );
	}
	
	//Paginator
	public void verifyPaginatorText(String paginator) {
		Loggerload.info("Admin/User/Staff see the paginator Text");
		 pagntr.getText();
		assertEquals( pagntr.getText(),paginator) ;
	}
	public void verifyPaginatorTextafter(String message) {
		//Pgu.getElementText(lastPgBtn);
		Pgu.verifyElementText(message,lastPgBtn );
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
	public void verifyCurrentPageNumber(String pageNum) {
		Loggerload.info("Admin/User/Staff see Page number navigated to page");
		assertEquals(currentPageNumber.getText(), pageNum);
	}

	public void verifyPage() {
		Loggerload.info("Admin/User/Staff is on Manage Program page");
		assertEquals(driver.getCurrentUrl(), "URL");
	}
	//search
	public void verifySearchText(String searchTxt) {
		Loggerload.info("Admin/User/Staff see the Search Text box has text as \"Search\"");
		assertEquals(searchText.getText(), searchTxt);
		
	}
	public void enterSearchText(String searchString) {
		Loggerload.info("Admin/User/Staff enters string to be searched" + searchString );
		new Actions(driver).sendKeys(searchTxtBox, searchString).sendKeys(searchTxtBox, Keys.ENTER).perform();
	}
	
	public void verifySearchResultProgramName(String searchString) throws Exception {
		Loggerload.info("Entries for the searched are shown" + searchString);
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathProgramName);
		Assert.assertTrue("Searched Result are not Found", SU.verifySearch(data, searchString));
	}
	public void verifySearchResultProgramDesc(String searchString) throws Exception {
		Loggerload.info("Entries for the searched are shown" + searchString);
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathProgramDesc);
		Assert.assertTrue("Searched Result are not Found", SU.verifySearch(data, searchString));
	}
	public void verifySearchResultProgramStatus(String searchString) throws Exception {
		Loggerload.info("Entries for the searched are shown" + searchString);
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathProgramStatus);
		Assert.assertTrue("Searched Result are not Found", SU.verifySearch(data, searchString));
	}
	//sorting
	public void clickOnSortBtn_Name() {
		Loggerload.info("Admin/User/Staff Clicks on Program Name Sorting Arrow");
		sortBtn_ProName.click();
	}
	
	public void clickOnSortBtn_Desc() {
		Loggerload.info("Admin/User/Staff Clicks on Program Description Sorting Arrow");
		sortBtn_ProDesc.click();
	}
	public void clickOnSortBtn_Status() {
		Loggerload.info("Admin/User/Staff Clicks Program Status Sorting Arrow");
		sortBtn_ProStatus.click();
	}
	//Ascending order
	public void verifyASCOrder_Name() {
		Loggerload.info("Admin/User/Staff see the result displayed in Ascending order");
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathProgramName);
		Assert.assertTrue("Results are in not in Asceding Order", AsDs.verifyAscendingOrder(data));
	}
	public void verifyASCOrder_Desc() {
		Loggerload.info("Admin/User/Staff see the result displayed in Ascending order");
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathProgramDesc);
		Assert.assertTrue("Results are in not in Asceding Order", AsDs.verifyAscendingOrder(data));
		
	}
	public void verifyASCOrder_Status() {
		Loggerload.info("Admin/User/Staff see the result displayed in Ascending order");
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathProgramStatus);
		Assert.assertTrue("Results are in not in Asceding Order", AsDs.verifyAscendingOrder(data));
		
	}
	//descending order
	public void verifyDESCOrder_Name() {
		Loggerload.info("Admin/User/Staff see the result displayed in Descending order");
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathProgramName);
		Assert.assertTrue("Results are not in Desceding Order", AsDs.verifyDescendingOrder(data));
	}
	
	public void verifyDESCOrder_Desc() {
		Loggerload.info("Admin/User/Staff see the result displayed in Descending order");
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathProgramDesc);
		Assert.assertTrue("Results are not in Desceding Order", AsDs.verifyDescendingOrder(data));
	}
	
	public void verifyDESCOrder_Status() {
		Loggerload.info("Admin/User/Staff see the result displayed in Descending order");
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathProgramStatus);
		Assert.assertTrue("Results are not in Desceding Order", AsDs.verifyDescendingOrder(data));
	}
	

// total no of rows 
	
	public void noOfRows(int rows_count) {
        rows_count = programtablerow.size();
        Loggerload.info("No of rows in Program Table" + rows_count);
    }
	
	//add a new Program 
	public void clickprogrambtn() {
		Loggerload.info("Clicks on a new program button");
		if(Flag==2) 
		programbtn.click();
		else 
			Loggerload.info("Denied Access");
	}
	public void verifyPopUPWindow(String popuptext) {
		String poptxt=programpop.getText();
		assertEquals(poptxt, popuptext);
	}
	
	public void verifyNewProgramWindow() {
		Loggerload.info("Admin is on A New Program Window");
		driver.switchTo().activeElement();
	}
	
	public void setProgramName(String Name) {
		Loggerload.info("Enter Program Name");
		programName.click();
		programName.clear();
		programName.sendKeys(Name);
	}
	public void setProgramDescription(String Description) {
		Loggerload.info("Enter description for program ");
		programDescription.click();
		programDescription.clear();
		programDescription.sendKeys(Description);
	}
	public void setstatusbutton(){
		radioActive.click();
	}
	public void clicksaveButton() {
		Loggerload.info("Click save button");
		savebtn.click();
	}
	public void clickCancelButton() {
		Loggerload.info("Click cancel button");
		cancelbtn.click();
	}
	public void verifyWindowClose() {
		Loggerload.info("Admin verify window closed after cancel button");
		assertEquals(driver.getCurrentUrl(), "Manage Program page URL");
	}
	public void verifyProgramPage() {
		Loggerload.info("Admin verify that admin is on Manage Batch page");
		assertEquals(driver.getCurrentUrl(), "Manage Program page URL");
	}

	public void verifyMsg(String message) {
		WebElement errorMessage = new WebDriverWait(driver,Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(errormsg));
		Loggerload.error(errorMessage.getText());
		assertEquals(errorMessage.getText(),message);
		
		
	}
	
	public String getsuccessmsg() {
		WebElement successMessage =new WebDriverWait(driver,Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(successmsg));
		Loggerload.error(successMessage.getText());
		return successMessage.getText();
	}
	
	//Edit Functionality
	
	public void clickEditButton() {
		Loggerload.info("Click Edit button");
		if(Flag==2) 
			programbtn.click();
			else 
				Loggerload.info("Denied Access");
		editbtn.click();
	}
	
	public void verifyUpdatedMsg(String msg) {
		Loggerload.info("Admin verify successful message for update");
		assertEquals(updatedMsg.getText(), msg);
	}
	
	//delete functionality
	public void clickRightDeleteButton() {
		Loggerload.info("Click Delete button on right side");
		rightdeletebtn.click();
	}
	
	public void verifyDeleteWindowPresent() {
		Loggerload.info("Admin Verify that Admin is on Delete Window");
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
	
	public void isPrgmNameDeleted(String searchstring) throws Exception {
		Loggerload.info("Admin check if program name is deleted");
		ArrayList<String> data=Pgu.getAllPageData(tableContainer, cellXPathProgramName);
		Assert.assertTrue("Search result not found", SU.verifySearch(data, searchstring));

	}
	
	//multiple delete Functionality
	public void verifyMainDeleteBtnDisabled() {
		Loggerload.info("Admin verify that delete button is disabled");
		Assert.assertFalse("Delete Button is Enabled", maindeleteBtn.isEnabled());
	}
	
	public void selectMultipleCheckboxes() {
		Loggerload.info("Admin select check box");
		checkBox1.click();
		Loggerload.info("Admin select check box");
		checkBox2.click();
	}
	
	public void verifyMainDeleteBtnEnabled() {
		Loggerload.info("Admin verify that delete button is enabled");
		Assert.assertTrue("Delete Button is disabled", maindeleteBtn.isEnabled());

	}
	
	public void clickEnabledDeleteBtn() {
		Loggerload.info("Admin Click on enabled Delete button");
		if (maindeleteBtn.isEnabled()) {
			maindeleteBtn.click();
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
	//checkbox functionality
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
	public void validadmin(String Admin) {
		if(Admin.equalsIgnoreCase("admin")) {
			Flag=2;
		}
	}
	public void validUserStaff(String User,String Staff) {
		if(User.equalsIgnoreCase("admin")||(Staff.equalsIgnoreCase("staff"))) {
			Flag=1;
		}
	}
	}


