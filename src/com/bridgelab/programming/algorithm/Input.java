package com.bridgelab.programming.algorithm;

import java.util.Scanner;





public class Input {
	private static Scanner sc = new Scanner(System.in);

	public static int inputInteger() {
		return sc.nextInt();
	}

	public static String inputString() {
		return sc.next();
	}

	public static boolean inputBoolean() {
		return sc.nextBoolean();
	}
  public static double inputDouble() {
	  return sc.nextDouble();
  }



}
