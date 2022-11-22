package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.DriverFactory;


public class Homepage {
	
	String URL="https://lms-frontend-phase2.herokuapp.com/login";
	private WebDriver driver=DriverFactory.getchromedriver();
	
	@FindBy (id="username")WebElement login;
    @FindBy (id ="password")WebElement password;
    @FindBy (id="login")WebElement loginButton;
   
    public void gethome() {
		driver.get(URL);
	}
    
    public void username(String name) {
    	PageFactory.initElements(driver, this);
    	
    	login.sendKeys(name);
    }
    
    public void password(String pwd) {
    	
    	password.sendKeys(pwd);
    }
    public void main(String args[])
    {
    	PageFactory.initElements(driver, this);
    	
    }
    public void click_login_Button() {
    	
    	loginButton.click();
    	
    }

	
    
    }

