package com.bridgelab.programming.designpattern.singleton;

public class EagerInitialization {
	private static final EagerInitialization instance = new EagerInitialization();

	// Constructor
	private EagerInitialization() {
	}

	// Method which will be static type reference of the method
	public static EagerInitialization getInstance() {
		return instance;

	}

}
