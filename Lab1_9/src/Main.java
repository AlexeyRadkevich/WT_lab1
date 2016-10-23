import java.util.Scanner;

import core.Ball;
import core.Basket;

public class Main {

	public static void main(String[] args) {
		String color;
		double weight;
		int n;

		Scanner in = new Scanner(System.in);

		System.out.print("Input n= ");
		n = in.nextInt();

		Basket basket = new Basket();

		for (int i = 0; i < n; i++) {
			in.nextLine();
			System.out.print((i + 1) + "st ball color is ");
			color = in.nextLine();
			System.out.print((i + 1) + "st ball weight is ");
			weight = in.nextDouble();
			basket.addBall(new Ball(color, weight));
		}

		in.close();

		System.out.println("Count of blue balls is " + basket.cheakCountBlueBalls());
		System.out.println("Weight of basket is " + basket.cheakWeight());

	}

}
