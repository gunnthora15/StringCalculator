package is.ru.stringcalculator; 

public class Calculator {

	public static int add(String text){
		Integer returnValue = 0;

		if (text == "") {
			return 0;
		}

		String numbers[] = text.split(",");

		if (numbers.length > 1) {
			for (String g: numbers) {
				returnValue = returnValue + Integer.parseInt(g);
			}
		}
		else {
			returnValue = Integer.parseInt(numbers[0]);
		}		


		return returnValue;
	}
}