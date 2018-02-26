package com.rajib.code.model;

/**
 * Factory class for generating different shapes as per the passed command.
 * 
 * @author Rajib
 *
 */
public class ShapeFactory {

	public Shape createShape(Character command) {
		if (command.toString().equalsIgnoreCase("L")) {
			return new Line();
		} else if (command.toString().equalsIgnoreCase("R")) {
			return new Rectangle();
		}
		return null;
	}

}
