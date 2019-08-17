package com.bridgelab.programming.designpattern.factorydesignpattern;

public class TestFactory {
	public static void main(String[] args) {
		ComputerModel pc = ComputerFactory.getComputerModel("pc", "2 GB", "500 GB", "2.4 GHz");
		ComputerModel server = ComputerFactory.getComputerModel("server", "16 GB", "1 TB", "2.9 GHz");
		System.out.println("Factory PC Config" + pc);
		System.out.println("Factory Server Config" + server);
	}

}
