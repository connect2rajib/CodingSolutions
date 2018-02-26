package com.rajib.code;

import com.rajib.code.service.InputService;
import com.rajib.code.service.ScannerInputServiceImpl;

/**
 * 
 * @author Rajib
 *
 */
public class CanvasApp {

	public static void main(String[] args) throws NumberFormatException, InterruptedException {
		InputService service = new ScannerInputServiceImpl();
		service.readInput();
	}
}
