package utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;

public class AscDscOrderUtility {

	public boolean verifyDescendingOrder(List<WebElement> elementList) {
		// reading data
		ArrayList<String> obtainedList = new ArrayList<>();
		for (WebElement we : elementList) {
			obtainedList.add(we.getText());
		}
		
		// Making copy
		ArrayList<String> sortedList = new ArrayList<>();
		for (String s : obtainedList) {
			sortedList.add(s);
		}
		
		Collections.sort(sortedList, Collections.reverseOrder());
		return sortedList.equals(obtainedList);
	}
	
	public boolean verifyAscendingOrder(List<WebElement> elementList) {
		// reading data
		ArrayList<String> obtainedList = new ArrayList<>();
		for (WebElement we : elementList) {
			obtainedList.add(we.getText());
		}
		
		// Making copy
		ArrayList<String> sortedList = new ArrayList<>();
		for (String s : obtainedList) {
			sortedList.add(s);
		}
		
		Collections.sort(sortedList);
		return sortedList.equals(obtainedList);
	}
}
