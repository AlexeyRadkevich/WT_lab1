package core;

import java.util.ArrayList;

public class SearcherPrimeNumbers {

	public static ArrayList<Integer> searchPrimeNumbers(int[] arr) {
		ArrayList<Integer> arrRes = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++)
			if (isPrime(arr[i]))
				arrRes.add(i);
		return arrRes;
	}

	private static boolean isPrime(int num) {
		if (num < 2)
			return false;
		if (num == 2)
			return true;
		if (num % 2 == 0)
			return false;
		for (int i = 3; i * i <= num; i += 2)
			if (num % i == 0)
				return false;
		return true;
	}

}
