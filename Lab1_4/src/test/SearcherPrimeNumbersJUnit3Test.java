package test;

import core.SearcherPrimeNumbers;
import junit.framework.TestCase;

public class SearcherPrimeNumbersJUnit3Test extends TestCase {
	public void testCalculatorFunction() {
		int[] arr = {10, 12, 7, 4};
		int expected = 2;
		int actual;

		actual = SearcherPrimeNumbers.searchPrimeNumbers(arr).get(0);
		assertEquals(expected, actual);

	}
}
