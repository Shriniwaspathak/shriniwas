package com.bridgelab.algorithm;

import java.util.Scanner;

public class MonthlyPayment {
	public static int monthlyPayment(int principal, double rate, int year) {
		int n = 12 * year;
		double r = rate / (12 * 100);
		double payment = (double) (principal * r / 1 - Math.pow(1 + r, -n));

		System.out.println(payment);

		return 0;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter rate ");
		double rate = sc.nextDouble();
		System.out.print("enter principal amount");
		int principalAmount = sc.nextInt();
		System.out.print("enter the time in year");
		int year = sc.nextInt();
		System.out.print("the monthly payment is " + monthlyPayment(principalAmount, rate, year));

	}

}
