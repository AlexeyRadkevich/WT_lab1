package test;

import java.util.Arrays;

import core.MixerIncreasingSequences;
import junit.framework.TestCase;

public class MixerIncreasingSequencesJUnit3Test extends TestCase {
	public void testCalculatorFunction() {
		int[] arr = {1, 5, 7},arr2={4,6};
		int[] expected = {1,4,5,6,7};
		int[] actual;

		actual = MixerIncreasingSequences.Mix(arr, arr2);
		assertTrue(Arrays.equals(expected, actual));
	}
}
