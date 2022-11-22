package utilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;


public class DriverFactory{
	public static WebDriver driver;
	
	@Test
	public static WebDriver Initializedriver() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sathy\\work\\SathyaWorkspace\\excelsheet\\allurereporting\\src\\test\\resources\\driver\\chromedriver.exe");
	        return driver = new ChromeDriver();
	 }
		public static WebDriver getchromedriver() {
			return driver ;
	}
	public void closeDriver() {
		
				driver.close();
		}

}