package test;

import java.util.Arrays;

import core.MatrixCreator;
import junit.framework.TestCase;

public class MatrixCreatorJUnit3Test extends TestCase {
	public void testCalculatorFunction() {
		int[] arr = { 1, 2, 3 };
		int[][] expected = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
		int[][] actual;
		actual = MatrixCreator.createMatrix(arr);
		assertTrue(Arrays.equals(expected[2], actual[2]));
	}
}
