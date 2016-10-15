import java.util.Scanner;

import core.CalculatorFunction;

public class Main {

	public static void main(String[] args) {
		int a, b, h;
		Scanner in = new Scanner(System.in);

		System.out.print("Input a= ");
		a = in.nextInt();
		System.out.print("Input b= ");
		b = in.nextInt();
		System.out.print("Input h= ");
		h = in.nextInt();
		in.close();
		for (int tmp = a; tmp < b; tmp += h) {
			System.out.println(tmp + "	" + CalculatorFunction.calculateFunction(tmp));
		}
	}

}
