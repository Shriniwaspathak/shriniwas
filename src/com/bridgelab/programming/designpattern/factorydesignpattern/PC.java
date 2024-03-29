package com.bridgelab.programming.designpattern.factorydesignpattern;

public class PC extends ComputerModel{
	private String ram;
	private String hdd;
	private String cpu;
	
	public PC(String ram,String hdd,String cpu) {
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}

	@Override
	public String getRAM() {
		
		return this.ram;
	}

	@Override
	public String getHDD() {
		
		return this.hdd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

}
