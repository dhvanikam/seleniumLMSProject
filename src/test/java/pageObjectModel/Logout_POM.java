package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Logout_POM {
	
	
	@FindBy(xpath = "//button[@id='logoutButton']") WebElement logoutButton;
	@FindBy(xpath = "//button[@id='loginButton']") WebElement loginButton;

	
	public void logout(){
		
		logoutButton.click();
	
	}
	
	public void displayHomepage() {
		
		Assert.assertEquals(true, loginButton.isDisplayed());
			
	}
	
}
