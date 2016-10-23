package core;

public class ShellSorter {

	public static int[][] createMatrix(int[] arr) {
		int n = arr.length;
		int[] tmp = arr;
		int[][] matrix = new int[n][n];
		System.out.println("Matrix:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				matrix[i][j] = tmp[(i + j) % n];
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		return matrix;
	}

	public static void printMatrix(int[] matrix) {
		System.out.println("Matrix:");
		for (int i = 0; i < matrix.length; i++)
			System.out.print(matrix[i] + " ");
		System.out.println();
	}
	
	public static void sort(int[] arr) {
		int i = 0, tmp;
		while (i < arr.length - 1) {
			if (arr[i] <= arr[i + 1])
				i++;
			else {
				tmp = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = tmp;
				if (i > 0)
					i--;
			}
		}
	}

}
