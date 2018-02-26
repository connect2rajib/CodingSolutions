package com.rajib.code;

import com.rajib.code.canvas.DrawingServiceImpl;

/**
 * Test case for CanvasApp. TO-Do -> This should be a JUnit test suite
 * 
 * @author Rajib
 *
 */
public class CanvasAppTest {
	static final String[] testCommands = { "C 20 4", "L 1 2 6 2", "L 6 3 6 4", "R 14 1 18 3", "B 10 3 o", "Q" };

	public static void main(String[] args) {
		for (final String command : testCommands) {
			try {
				new DrawingServiceImpl().draw(command);
			} catch (NumberFormatException e) {
				System.out.println("Error occured for command :" + command);
				e.printStackTrace();
			}

		}
	}
}
