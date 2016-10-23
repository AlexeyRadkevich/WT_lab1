package test;

import java.util.Arrays;

import core.ShellSorter;
import junit.framework.TestCase;

public class ShellSorterJUnit3Test extends TestCase {
	public void testSort() {
		int[] arr = { 10, 4, 3, 8 };
		int[] expected = { 3, 4, 8, 10 };
		int[] actual = arr;
		ShellSorter.sort(actual);
		assertTrue(Arrays.equals(expected, actual));
	}
}
