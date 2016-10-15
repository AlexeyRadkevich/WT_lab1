package test;

import core.Calculator;
import junit.framework.TestCase;

public class CalculatorJUnit3Test extends TestCase {

	protected void setUp() throws Exception {

	}

	protected void tearDown() throws Exception {

	}

	public void testCalculate() {
		double expected = 0.5;
		double x = 0, y = 0;
		double actual;

		actual = Calculator.calculate(x, y);
		assertEquals(expected, actual);

		expected = 0.85;
		x = 0;
		y = 1;
		actual = Calculator.calculate(x, y);
		assertEquals(expected, actual, 0.01);
	}
}
