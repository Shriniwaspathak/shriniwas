package com.bridgelab.programming.functional;

import java.util.Scanner;

public class Quadratic {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Quadratic fq = new Quadratic();
		fq.findRoot(a, b, c);

	}

	void findRoot(int a, int b, int c) {

		if (a == 0) {
			System.out.println("invalid");
			return;
		}
		int d = b * b - 4 * a * c;
		double sqrt_val = Math.sqrt(Math.abs(d));
		if (d > 0) {
			System.out.println("the vale is ");
			System.out.println((double) (-b + sqrt_val) / (2 * a) + "\n");

		} else {
			System.out.println("this is the value");
			System.out.println(-(double) b / (2 * a) + " " + sqrt_val + "/n" + -(double) b / (2 * a) + " " + sqrt_val);

		}

	}
}
