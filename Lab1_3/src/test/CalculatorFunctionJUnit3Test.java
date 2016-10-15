package test;

import core.CalculatorFunction;
import junit.framework.TestCase;

public class CalculatorFunctionJUnit3Test extends TestCase {

	public void testCalculatorFunction() {
		double expected = 0;
		int x = 0;
		double actual;

		actual = CalculatorFunction.calculateFunction(x);
		assertEquals(expected, actual,0.001);
		
		expected = 1.338;
		x = 180;
		actual = CalculatorFunction.calculateFunction(x);
		assertEquals(expected, actual,0.001);
	}

}
