package com.bridgelabz.programming.function;

import java.util.Scanner;

public class Harmonic {
	public static void main(String args[]) {
		System.out.print("enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("the harmonic series is ");
		double result = 0.0;
		while (num > 0) {
			result = result + (double) 1 / num;
			num--;
			System.out.print(result + " ");

		}
		System.out.println(" ");
		System.out.println("output of the harmonic serious is " + result);

	}
}
