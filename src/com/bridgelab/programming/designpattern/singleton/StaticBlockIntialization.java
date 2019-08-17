package com.bridgelab.programming.designpattern.singleton;

public class StaticBlockIntialization {
	private static StaticBlockIntialization instance;

	private StaticBlockIntialization() {
	}

	static {
		try {
			instance = new StaticBlockIntialization();

		} catch (Exception e) {

		}
	}

	public static StaticBlockIntialization getInstance() {
		return instance;
	}

}
