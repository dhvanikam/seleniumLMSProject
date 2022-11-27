package utilities;

import java.util.ArrayList;
import java.util.Collections;

public class AscDscOrderUtility {

	public boolean verifyDescendingOrder(ArrayList<String> obtainedList) {
		
		// Making copy
		ArrayList<String> sortedList = new ArrayList<>();
		for (String s : obtainedList) {
			sortedList.add(s);
		}
		
		Collections.sort(sortedList, Collections.reverseOrder());
		return sortedList.equals(obtainedList);
	}
	
	public boolean verifyAscendingOrder(ArrayList<String> obtainedList) {
		
		// Making copy
		ArrayList<String> sortedList = new ArrayList<>();
		for (String s : obtainedList) {
			sortedList.add(s);
		}
		
		Collections.sort(sortedList);
		return sortedList.equals(obtainedList);
	}
}
