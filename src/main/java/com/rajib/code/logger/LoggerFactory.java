package com.rajib.code.logger;

public class LoggerFactory {
	public AppLogger getLogger(int value) {
		if (value == 1) {
			return new ConsoleLogger();
		} else if (value == 2) {
			return new FileLogger();
		}
		return new ConsoleLogger();
	}
}
