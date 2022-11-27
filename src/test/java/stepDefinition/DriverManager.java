package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	public static WebDriver driver;

	public static WebDriver initializeDriver() {

		WebDriverManager.chromedriver().browserVersion("106.0.0").setup();
		driver = new ChromeDriver();
		return driver;

	}

	public static WebDriver getChromedriver() {
		return driver;
	}

	public void closeDriver() {

		driver.close();
	}

}
