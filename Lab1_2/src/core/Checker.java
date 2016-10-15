package core;

import java.awt.Polygon;

public class Checker {

	public static boolean checkPoint(double x, double y) {
		int xArea[] = { -4, -4, 4, 4, 6, 6, -6 };
		int yArea[] = { 0, 5, 5, 0, 0, -3, -3 };
		return new Polygon(xArea, yArea, xArea.length).contains(x, y);
	}

}
