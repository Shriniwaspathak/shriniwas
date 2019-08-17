package com.bridgelab.programming.designpattern.faceddesignpattern;

public class ShapeMaker {
	private Shape circle;
	private Shape square;
	private Shape rectangle;

	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	public void drowcircle() {
		circle.drow();
	}

	public void drowreactangle() {
		rectangle.drow();
	}

	public void drowsquare() {
		square.drow();
	}

}
