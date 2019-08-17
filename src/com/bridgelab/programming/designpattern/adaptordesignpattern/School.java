package com.bridgelab.programming.designpattern.adaptordesignpattern;

public class School {
	public static void main(String[] args) {
		Assignment asg = new Assignment();
		// PilotPen pp=new PilotPen();
		Pen p = new PenAdaptor();

		asg.setPen(p);
		asg.wirteAssignment("wowowo");

	}
}
