package com.rajib.code.util;

import com.rajib.code.command.Commands;

/**
 * Static utility methods pertaining to DrawingCanvas application.
 *
 * @author Rajib
 */
public final class CanvasUtil {

	public static final int BUFFER = 5;

	// Suppress default constructor for noninstantiability
	private CanvasUtil() {
		throw new AssertionError();
	}

	/**
	 * A validator method for validating the passed command.
	 * 
	 * @param command
	 * @return
	 */
	public static boolean isValidCommand(final char command) {
		boolean valid = false;
		for (Commands x : Commands.values()) {
			if (x.asChar() == command) {
				valid = true;
			}
		}
		return valid;
	}
}
