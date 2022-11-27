package pageObjectModel;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import stepDefinition.DriverManager;
import utilities.Loggerload;

import utilities.PaginationUtility;

public class Assignment_POM {
	
	Logger logger =  LogManager.getLogger();
	public static WebDriver driver = DriverManager.getChromedriver();
	
	Actions action = new Actions(driver);
	PaginationUtility pu = new PaginationUtility();
	
	@FindBy (id="mngassg") WebElement manageAssignment;
	@FindBy (id="footermsg") WebElement footerText;
	@FindBy (id="pgmsg") WebElement paginatorText;
	@FindBy (id="next") WebElement nextArrow;
	@FindBy (id="privious") WebElement priviousArrow;
	@FindBy (id="first") WebElement firstArrow;
	@FindBy (id="last") WebElement lastArrow;
	@FindBy (id="search") WebElement searchBox;
	@FindBy (id="asdetail") WebElement assignmentDetail;




	
	
	public void openWebsite() {
		
		driver.get("https://LMS.com");
		driver.manage().window().maximize();
		logger.info("User opens the LMS website");
	}

	public void assignmentPage() {
		
		Assert.assertTrue(manageAssignment.isDisplayed());
		logger.info("User is on Manage Assignment Page");
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
	
	public void assignmentDetailPage() {
	
		String s =	pu.getElementText(assignmentDetail);
			assertEquals(s,"Assignment Details", "InvalidPage"); 
			Loggerload.info("Get the title of the page : " + s);
	}
	
	 
}
