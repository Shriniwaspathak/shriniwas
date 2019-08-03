package com.bridgelabz.programming.function;

public class Power {

	public static void main(String args[]) {
		int n = Integer.parseInt(args[5]);
		int i = 0;
		int powerOfTwo = 1;
		while (i <= n) {
			System.out.println(i + " " + powerOfTwo);
			powerOfTwo = 2 * powerOfTwo;
			i = i + 1;

		}
	}

}
