package com.rajib.code.model;

/**
 * 
 * @author Rajib
 *
 */
@FunctionalInterface
public interface Shape {

	default void drawLine(char[][] canvasArea, final int x1, final int y1, final int x2, final int y2,
			final char mchar) {
		for (int i = y1; i <= y2; i++) {
			for (int j = x1; j <= x2; j++) {
				canvasArea[i][j] = mchar;
			}
		}
	}

	default void drawCircle(char[][] canvasArea, final int x1, final int y1, final int x2, final int y2,
			final char mchar) {
		// To be implemented when required.
	}

	public void draw(Shape shape,char[][] canvasArea, final int x1, final int y1, final int x2, final int y2, final char mchar);
}
