package com.rajib.code.canvas;

import com.rajib.code.logger.AppLogger;
import com.rajib.code.logger.LoggerFactory;
import com.rajib.code.model.Canvas;
import com.rajib.code.model.Shape;
import com.rajib.code.model.ShapeFactory;
import com.rajib.code.util.CanvasUtil;

/**
 * 
 * @author Rajib
 *
 */
public class DrawingServiceImpl implements DrawingService {
	LoggerFactory logFactory = new LoggerFactory();
	AppLogger logger = logFactory.getLogger(1);

	private static Canvas canvas;

	ShapeFactory shapeFactory;

	public void draw(final String arguments) {
		char command = arguments.charAt(0);
		String[] cmd;
		shapeFactory = new ShapeFactory();
		if (CanvasUtil.isValidCommand(command)) {
			try {
				/*
				 * To-do -> Move this switch case code to a ShapeRenderFactory
				 * class.
				 */
				switch (command) {
				case 'C':
					cmd = arguments.split(" ");
					canvas = new Canvas(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]));
					canvas.render();
					break;
				case 'L':
					cmd = arguments.split(" ");
					if (canvas == null) {
						canvas = new Canvas(Integer.parseInt(cmd[1]) + Integer.parseInt(cmd[3]) + CanvasUtil.BUFFER,
								Integer.parseInt(cmd[2]) + Integer.parseInt(cmd[4]) + CanvasUtil.BUFFER);
					}
					Shape line = shapeFactory.createShape(command);
					canvas.draw(line, canvas.canvasArea, Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]),
							Integer.parseInt(cmd[3]), Integer.parseInt(cmd[4]), 'X');
					canvas.render();

					break;
				case 'R':
					cmd = arguments.split(" ");
					if (canvas == null) {
						canvas = new Canvas(Integer.parseInt(cmd[1]) + Integer.parseInt(cmd[3]) + CanvasUtil.BUFFER,
								Integer.parseInt(cmd[2]) + Integer.parseInt(cmd[4]) + CanvasUtil.BUFFER);
					}
					Shape rectangle = shapeFactory.createShape(command);
					canvas.draw(rectangle, canvas.canvasArea, Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]),
							Integer.parseInt(cmd[3]), Integer.parseInt(cmd[4]), 'X');
					canvas.render();

					break;
				case 'B':
					cmd = arguments.split(" ");
					if (canvas == null) {
						System.err.println("Draw a canvas first");
						return;
					}
					canvas.bucketFiller(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]), cmd[3].charAt(0));
					canvas.render();
					break;

				case 'Q':
					return;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				logger.log("Invalid command. Try again!!\n");
				// e.printStackTrace();
			}
		} else {
			logger.log("Enter valid command please....");
			return;
		}
	}
}
