package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	
	public static WebDriver driver;
	
	public static WebDriver  initializeDriver() {
		
			
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathy\\work\\SathyaWorkspace\\seleniumLMSProject\\src\\test\\resources\\driver\\chromedriver.exe");
			 driver = new ChromeDriver();
			 return driver;

	}
	
	public static WebDriver  getChromedriver()
	{
		return driver;
	}
	public void closeDriver() {
		
		driver.close();
	}

	
}
