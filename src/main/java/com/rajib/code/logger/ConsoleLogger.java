package com.rajib.code.logger;

public class ConsoleLogger implements AppLogger {

	@Override
	public void log(String logMsg) {
		System.out.println(logMsg);

	}

}
