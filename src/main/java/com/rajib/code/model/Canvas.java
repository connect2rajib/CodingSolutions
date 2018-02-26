package com.rajib.code.model;

import java.util.ArrayList;
import java.util.List;

import com.rajib.code.model.Shape;

/**
 * Composite Canvas class.
 * 
 * @author Rajib
 *
 */
public class Canvas implements Shape {
	public char[][] canvasArea;
	int canvasWidth, canvasHeight;

	public Canvas(int width, int height) {
		height += 2;
		width += 2;
		this.canvasWidth = width;
		this.canvasHeight = height;
		canvasArea = new char[height][width];
		drawCanvas(0, 0, this.canvasWidth - 1, 0, '-');
		drawCanvas(0, this.canvasHeight - 1, this.canvasWidth - 1, this.canvasHeight - 1, '-');
		drawCanvas(0, 1, 0, this.canvasHeight - 2, '|');
		drawCanvas(this.canvasWidth - 1, 1, this.canvasWidth - 1, this.canvasHeight - 2, '|');
		//drawCanvas1(this.canvasWidth,this.canvasHeight);
		//render();
	}
	
	/*public void drawCanvas1(final int width, final int height) {
		
		for (int i = 0; i < height; i++) {
			char mchar = '-';
			for (int j = 0; j < width; j++) {
				canvasArea[i][j] = mchar;
				if(i >= 1 && i < height -1){
					if((j == 0 || j == width-1)){
						canvasArea[i][j] = '|';
					}else{
						canvasArea[i][j] = ' ';
					}
				}
				
			}
		}
	}*/

	/**
	 * 
	 */
	public void render() {
		for (int i = 0; i < this.canvasHeight; i++) {
			for (int j = 0; j < this.canvasWidth; j++) {
				System.out.print(canvasArea[i][j]);
			}
			System.out.println();
		}
	}

	@Override
	public void draw(Shape sh,char[][] canvasArea, final int x1, final int y1, final int x2, final int y2, final char mchar) {
		sh.draw(sh,canvasArea, x1, y1, x2, y2, mchar);
	}

	public void drawCanvas(final int x1, final int y1, final int x2, final int y2, final char mchar) {
		for (int i = y1; i <= y2; i++) {
			for (int j = x1; j <= x2; j++) {
				canvasArea[i][j] = mchar;
			}
		}
	}

	public void bucketFiller(final int x, final int y, final char color) {
		if ((int) canvasArea[y][x] != 0) {
			return;
		}

		if (x > 0 || x < this.canvasHeight || y > 0 || y < this.canvasWidth) {
			if ((int) canvasArea[y][x] == 0) {
				canvasArea[y][x] = color;
			}
			bucketFiller(x + 1, y, color);
			bucketFiller(x - 1, y, color);
			bucketFiller(x, y - 1, color);
			bucketFiller(x, y + 1, color);
		}
	}
}
