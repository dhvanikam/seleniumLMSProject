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

public class Assignment_POM {
	
	Logger logger =  LogManager.getLogger();
	public static WebDriver driver = DriverManager.getChromedriver();
	
	@FindBy (id="mngassg") WebElement manageAssignment;
	@FindBy (id="footermsg") WebElement footerText;

	
	
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

	public void footerText(String htext) {
		
		footerText.getText();
		assertEquals(footerText,"In Total there are 3 assignments", "InvalidPage"); 
		Loggerload.info("Get the title of the page : " + footerText);
	}

}
