package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test; 

public class CalculatorTest {

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
	@Test
	public void testOneNumber(){
		assertEquals(2, Calculator.add("2"));

	}
	@Test
	public void testTwoNumber(){
		assertEquals(5, Calculator.add("2,3"));
		assertEquals(4, Calculator.add("2,2"));
		assertEquals(8, Calculator.add("1,7"));
	}
}	