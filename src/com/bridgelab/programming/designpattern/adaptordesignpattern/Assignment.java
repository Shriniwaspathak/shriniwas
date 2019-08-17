package com.bridgelab.programming.designpattern.adaptordesignpattern;

public class Assignment {
	private Pen pen;

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public void wirteAssignment(String str) {
		pen.write(str);
	}

}
