package core;

import java.util.ArrayList;

public class Basket {
	ArrayList<Ball> balls;

	public Basket() {
		this.balls = new ArrayList<Ball>();
	}

	public void addBall(Ball newBall) {
		if (newBall != null)
			balls.add(newBall);
	}

	public double cheakWeight() {
		double res = 0;
		for (Ball ball : balls)
			res += ball.weight;
		return res;
	}

	public int cheakCountBlueBalls() {
		int res = 0;
		for (Ball ball : balls)
			if (ball.color.equals("blue"))
				res++;
		return res;
	}

}
