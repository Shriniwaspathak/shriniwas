package com.bridgelab.algorithm;

public class SquareRoot {
	public static double squareRoot(double c) {
		double t=c;
		double epsilon=1e-15;
		while(Math.abs(t-c/t)>epsilon*t) {
			t=(t+c/t)/2;
		}
		return t;
	}
public static void main (String []args) {
	double userInput;
	do {
		System.out.print("enter the double value");
		
		userInput=Input.inputDouble();
		
	}while(userInput<=0.0);
	System.out.println(squareRoot(userInput));
	
}

}
