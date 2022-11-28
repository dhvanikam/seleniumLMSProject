package utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;


import stepDefinition.DriverManager;

public class SwitchWindowUtility {
	public static WebDriver driver=DriverManager.getChromedriver();
	public void switchControl() {
		
		//current main window handle
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> i = allWindows.iterator();
		while(i.hasNext()){
	         String childwindow = i.next();
	         if(!childwindow.equalsIgnoreCase(mainWindow)){
	            driver.switchTo().window(childwindow);
	            System.out.println("The child window is "+childwindow);
	         } else {
	            System.out.println("There are no children");
	         }
	      }
	}

}
