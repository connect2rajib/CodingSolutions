package com.rajib.code.model;

public class Rectangle implements Shape {

	@Override
	public void draw(Shape sh,char[][] canvasArea, int x1, final int y1, final int x2, final int y2, final char mchar) {
		drawRectangle(canvasArea, x1, y1, x2, y2, mchar);
	}

	private void drawRectangle(char[][] canvasArea, final int x1, final int y1, final int x2, final int y2,
			final char mchar) {
		drawLine(canvasArea, x1, y1, x2, y1, mchar);
		drawLine(canvasArea, x1, y1, x1, y2, mchar);
		drawLine(canvasArea, x2, y1, x2, y2, mchar);
		drawLine(canvasArea, x1, y2, x2, y2, mchar);
	}

}
