package is.ru.stringcalculator; 

import java.util.ArrayList;

public class Calculator {

	public static int add(String text){
		Integer returnValue = 0;

		if (text == "") {
			return 0;
		}

		ArrayList<String> splits = new ArrayList<String>();
		String commaSplits[] = text.split(",");

		for (String g : commaSplits) {
			String newLineSplits[] = g.split("\\r\\n|\\n|\\r");

			for (String n : newLineSplits) {
				splits.add(n);
			}
		}

		for (String g: splits) {
				returnValue = returnValue + Integer.parseInt(g);
		}

		return returnValue;
	}
}