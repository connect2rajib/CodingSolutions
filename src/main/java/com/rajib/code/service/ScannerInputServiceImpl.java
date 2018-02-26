package com.rajib.code.service;

import java.util.Scanner;

import com.rajib.code.canvas.DrawingService;
import com.rajib.code.canvas.DrawingServiceImpl;
import com.rajib.code.logger.AppLogger;
import com.rajib.code.logger.LoggerFactory;

public class ScannerInputServiceImpl implements InputService {

	LoggerFactory factory = new LoggerFactory();
	AppLogger logger = factory.getLogger(1);

	@Override
	public void readInput() {
		Scanner scan = new Scanner(System.in);
		String command = new String();
		while (!command.equals("Q")) {
			logger.log("Enter the command :");
			command = scan.nextLine();
			DrawingService service = new DrawingServiceImpl();
			if (command.length() > 0) {
				service.draw(command);
			}
		}
		logger.log("Program Exited!");
		scan.close();

	}

}
