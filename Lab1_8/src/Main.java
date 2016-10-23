import java.util.Scanner;

import core.MixerIncreasingSequences;

public class Main {

	public static void main(String[] args) {
		int n, m;
		Scanner in = new Scanner(System.in);

		System.out.print("Input n= ");
		n = in.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("array[" + i + "]= ");
			arr[i] = in.nextInt();
		}

		System.out.print("Input m= ");
		m = in.nextInt();

		int[] arr2 = new int[m];
		for (int i = 0; i < arr2.length; i++) {
			System.out.print("array2[" + i + "]= ");
			arr2[i] = in.nextInt();
		}

		in.close();

		int[] arrIndex = MixerIncreasingSequences.Mix(arr, arr2);
		System.out.println("Result: ");
		for (Integer index : arrIndex) {
			System.out.print(index + " ");
		}

	}

}
