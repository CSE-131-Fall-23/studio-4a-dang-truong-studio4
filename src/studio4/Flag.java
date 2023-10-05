package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(0.5,0.5, 0.32, 0.22);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.5,0.5, 0.3, 0.2);
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.5,0.5, 0.1);
	}
}