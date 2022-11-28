package pageObjectModel;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import stepDefinition.DriverManager;
import utilities.Loggerload;

import utilities.PaginationUtility;
import utilities.SearchUtility;

public class Assignment_POM {
	
	public static WebDriver driver = DriverManager.getChromedriver();
	
	Actions action = new Actions(driver);
	PaginationUtility pu = new PaginationUtility();
	SearchUtility su = new SearchUtility();
	
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



	public void openWebsite() {
		
		driver.get("https://LMS.com");
		driver.manage().window().maximize();
		Loggerload.info("User opens the LMS website");
	}

	public void manageAssignmentPage() {
		
		Assert.assertTrue(manageAssignment.isDisplayed());
		Loggerload.info("User is on Manage Assignment Page");
	}
	
	public void headerText(String htext) {
		
		manageAssignment.getText();
		assertEquals(manageAssignment,"Manage Assignment", "InvalidPage"); 
		Loggerload.info("Get the title of the page : " + manageAssignment);
	}

	public void footerText(String ftext) {
		
		footerText.getText();
		assertEquals(footerText,"In Total there are 3 assignments", "InvalidPage"); 
		Loggerload.info("Get the title of the page : " + footerText);
	}
	
	public void paginatorText(String ptext) {
		
	paginatorText.getText();
		assertEquals(paginatorText,"Showing 1 to 3 of 3 entries", "InvalidPage"); 
		Loggerload.info("Get the title of the page : " + paginatorText);
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
	
	public void searchAssignmentDetail() throws Exception {
		
		String searchtext = pu.getElementText(searchBox);
		su.verifySearch(assignmentNames,searchtext);
		Loggerload.info("Searched Assignment will be Display in list");
	}
	
	public void assignmentDetailPage() {
	
		String s =	pu.getElementText(assignmentDetail);
			assertEquals(s,"Assignment Details", "InvalidPage"); 
			Loggerload.info("Get the title of the page : " + s);
	}

	public void addNewAssignmentButton() throws Exception {
		
		pu.clickElement(addNewAssignmentButton);
	}

	public void isPageContainsText(String text) {
		
		Assert.assertTrue (driver.getPageSource().contains(text));
		Loggerload.info("Error Message : " + text);
	}
	
	public void allFieldsEmpty()  {
		
		String name = assignmentNamefromDetailPage.getText();
		String desc = assignmentDescriptionfromDetailPage.getText();
		String grade = assignmentGradefromDetailPage.getText();
		String date = assignmentDueDatefromDetailPage.getText();
		
		if(name.isEmpty()&& desc.isEmpty() && grade.isEmpty() && date.isEmpty())
			Loggerload.info("Error Message display : Name is required ");
	
	}

	public void addAllFields() {
		
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
	 
}
