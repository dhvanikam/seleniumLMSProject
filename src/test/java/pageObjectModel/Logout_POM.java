package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import stepDefinition.DriverManager;
import utilities.Loggerload;

public class Logout_POM {
	
	public static WebDriver driver = DriverManager.getChromedriver();
	
	@FindBy(xpath = "//button[@id='logoutButton']") WebElement logoutButton;
	@FindBy(xpath = "//button[@id='loginButton']") WebElement loginButton;

	
	public void logout(){
		
		logoutButton.click();
		Loggerload.info("Admin/User/Staff clicks on Logout button");

	
	}
	
	public void displayHomepage() {
		
		Assert.assertEquals(true, loginButton.isDisplayed());
		Loggerload.info("Admin/User/Staff is on Login Page ");

			
	}
	
}
