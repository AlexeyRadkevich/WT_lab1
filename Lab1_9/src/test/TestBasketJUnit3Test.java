package test;

import core.Ball;
import core.Basket;
import junit.framework.TestCase;

public class TestBasketJUnit3Test extends TestCase {
	public void testBasket() {
		Basket basket = new Basket();
		basket.addBall(new Ball("blue", 12.0));
		basket.addBall(new Ball("red", 22.0));
		basket.addBall(new Ball("blue", 38.0));
		int expected = 2;
		int actual;

		actual = basket.cheakCountBlueBalls();
		assertEquals(expected, actual);
	}
}
