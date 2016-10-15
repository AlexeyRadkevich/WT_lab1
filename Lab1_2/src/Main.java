import java.util.Scanner;

import core.Checker;

public class Main {
	public static void main(String[] args) {
		double x, y;
		Scanner in = new Scanner(System.in);

		System.out.print("Input x= ");
		x = in.nextDouble();
		System.out.print("Input y= ");
		y = in.nextDouble();
		in.close();
		System.out.println("Result= " + Checker.checkPoint(x, y));
	}
}
