package com.rajib.code.model;

public class Circle implements Shape {

	@Override
	public void draw(Shape shape,char[][] canvasArea, int x1, final int y1, final int x2, final int y2, final char mchar) {
		drawCircle(canvasArea, x1, y1, y2-x2, mchar);
	}

	private void drawCircle(char[][] canvasArea, final int x1, final int y1, final int radius,
			final char mchar) {
		//To be implemented
	}

}
