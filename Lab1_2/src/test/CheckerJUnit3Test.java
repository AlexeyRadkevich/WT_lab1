package test;

import core.Checker;
import junit.framework.TestCase;

public class CheckerJUnit3Test extends TestCase {

	public void testCheck() {
		boolean expected = true;
		double x = 0, y = 0;
		boolean actual;

		actual = Checker.checkPoint(x, y);
		assertEquals(expected, actual);

		expected = false;
		x = 7;
		y = 0;
		actual = Checker.checkPoint(x, y);
		assertEquals(expected, actual);
	}
}
