package com.rajib.code.model;

public class Line implements Shape {

	@Override
	public void draw(Shape sh,char[][] canvasArea, final int x1, final int y1, final int x2, final int y2, final char mchar) {
		drawLine(canvasArea, x1, y1, x2, y2, mchar);
	}
}
