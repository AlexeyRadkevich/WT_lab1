import java.util.Scanner;

import core.ShellSorter;

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
		ShellSorter.sort(arr);
		ShellSorter.printMatrix(arr);
	}
}
