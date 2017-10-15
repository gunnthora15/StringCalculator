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

		ArrayList<String> negativeInts = new ArrayList<String>();
		for (String s : splits) {
			if (Integer.parseInt(s) < 0) {
				negativeInts.add(s);
			}
		}

		if (negativeInts.size() > 0) {
			String msg = "Negatives is not allowed:";
			for (String n : negativeInts) {
				msg = msg + " " + n;
			}

			throw new RuntimeException(msg); 
		}

		for (String g: splits) {
				returnValue = returnValue + Integer.parseInt(g);
		}

		if(splits.size() > 1000)
		{
			return null; 
		}

		return returnValue;
	}
}