import java.util.ArrayList;
import java.util.Scanner;

import core.SearcherPrimeNumbers;

public class Main {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);

		System.out.print("Input n= ");
		n = in.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("array[" + i + "]= ");
			arr[i] = in.nextInt();
		}
		in.close();
		
		ArrayList<Integer> arrIndex = SearcherPrimeNumbers.searchPrimeNumbers(arr);
		System.out.println("Result: ");
		for (Integer index : arrIndex) {
			System.out.println(index);
		}
		
	}

}
