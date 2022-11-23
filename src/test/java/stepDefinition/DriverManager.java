package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	
	public static WebDriver driver;
	
	public static WebDriver  driverFactory() {
		
		if (driver == null) {
		
			 System.setProperty("webdriver.chrome.driver","D:\\Nextcloud_Data\\Bhavesh\\Neha\\LMS_Hackathon\\seleniumLMSProject\\src\\test\\resources\\driver\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			 
		}
		 return driver;

	}
	
	public static WebDriver  getDriver(String url) {
				
		WebDriver d = driverFactory();
		d.get(url);
		//driver.get("https://lms-frontend-phase2.herokuapp.com/login");
	    d.manage().window().maximize();
		return d;
	}
	public void closeDriver() {
		
		driver.close();
	}

	
}
