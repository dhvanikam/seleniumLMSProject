package pageObjectModel;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import stepDefinition.DriverManager;
	import utilities.Loggerload;

	public class Common_POM {

		private static WebDriver driver=DriverManager.getChromedriver();
		public static int Flag;
		
		@FindBy (id="username")WebElement Username;
		@FindBy (id="password")WebElement Password;
		@FindBy (id="code")WebElement passcode;
		@FindBy (id="login")WebElement login;
		@FindBy (id="logout")WebElement logout;
		
		//Homepage Launch
		
		public void homepage() {
			Loggerload.info("User lands on Login PAge");
			driver.get("https://test-lmsapplication.com");
			PageFactory.initElements(driver, this);	
		}
		
		//validlogin for User
		
		public void validloginUser(String uname, String pwd) {
				
			Loggerload.info("User Enter Valid USER login details");
					Username.sendKeys(uname); 
					Password.sendKeys(pwd);
					
			
		}
		
		//Valid Login for staff
		
		public void ValidloginStaff(String uname, String pwd, String code) {
			Loggerload.info("User Enter Valid ADMIN login details");
			Username.sendKeys(uname); 
			Password.sendKeys(pwd);
			passcode.sendKeys(code);
			
		}
		
		//valid Login for admin
		
		public void ValidloginAdmin(String uname, String pwd, String code) {
			Loggerload.info("User Enter Valid STAFF login details");
			Username.sendKeys(uname); 
			Password.sendKeys(pwd);
			passcode.sendKeys(code);
			
		}
		
		//login page
			public void clicklogin() {
				
				Loggerload.info("User clicks on login Button");
				login.click();
			}
			public void clicklogout() {
				
				Loggerload.info("User clicks on logout Button");
				if (logout.isDisplayed()) {
					logout.click();
				}
			}
	}


