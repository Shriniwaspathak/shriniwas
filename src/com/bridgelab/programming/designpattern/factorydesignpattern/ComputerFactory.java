package com.bridgelab.programming.designpattern.factorydesignpattern;

public class ComputerFactory {
	public static ComputerModel getComputerModel(String type, String ram, String hdd, String cpu) {
		if ("PC".equalsIgnoreCase(type))
			return new PC(ram, hdd, cpu);
		else if ("Server".equalsIgnoreCase(type))
			return new Server(ram, hdd, cpu);
		return null;
	}

}
