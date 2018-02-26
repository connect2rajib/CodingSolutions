package com.rajib.code.command;

public enum Commands {
	C('C'), L('L'), R('R'), B('B'), Q('Q');

	private final char asChar;

	public char asChar() {
		return asChar;
	}

	private Commands(char asChar) {
		this.asChar = asChar;
	}
}
