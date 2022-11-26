package stepDefinition;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import utilities.Loggerload;

public class Hooks {

	public static WebDriver driver;
	public static int Flag=1;
	
	@Before("@common")
	public static void beforeuser() {
		
		Loggerload.info("***********Logged in as User/Staff/Admin**************");
			}
	

	@Before("@staff and @user ")
	public static void beforestaff() {
		
	 Loggerload.info("***********Logged in as User/Staff **************");
	 		}
	
	
	@Before("@admin")
	public static void beforeadmin() {
		
	Loggerload.info("***********Logged in as Admin**************");
	
	}
	
	
	
	@AfterStep
	public static void afterstep(Scenario scenario) {
		
		if (scenario.isFailed()) {
			final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot,"image/png","My Screenshot");
			Allure.addAttachment("Myscreenshot",new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		}
		
	}
	
	
}
