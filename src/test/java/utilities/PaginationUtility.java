package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginationUtility {
	public static WebDriver driver;

	public static void clickElement(WebElement element) throws Exception {
		WebElement pageNav = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOf(element));
		if (pageNav.isDisplayed() && pageNav.isEnabled()) {

			pageNav.click();

		}

		throw new Exception("Element is not clickable");
	}

	public String getElementText(WebElement element) {
		WebElement textElement = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOf(element));
		return textElement.getText();
	}

	public boolean verifyElementText(String expectedMsg, WebElement element) {
		if (getElementText(element).equals(expectedMsg)) {
			return true;
		}

		return false;
	}
}
