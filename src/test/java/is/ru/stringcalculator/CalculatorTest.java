package is.ru.stringcalculator;

import static org.junit.Asssert.assertEquals;
import org.junit.Test; 

public class CalculatorTest {

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
}