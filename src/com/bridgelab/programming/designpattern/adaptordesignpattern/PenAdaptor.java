package com.bridgelab.programming.designpattern.adaptordesignpattern;

import com.bridgelab.programming.designpattern.adaptordesignpattern.pilotpen.PilotPen;

public class PenAdaptor implements Pen {
	PilotPen pp = new PilotPen();

	@Override
	public void write(String str) {
		pp.mark(str);

	}

}
