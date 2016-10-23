package core;

public class MatrixCreator {

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

	public static void printMatrix(int[][] matrix) {
		System.out.println("Matrix:");
	
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
