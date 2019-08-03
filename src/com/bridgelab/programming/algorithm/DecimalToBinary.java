package com.bridgelab.programming.algorithm;

import java.io.*;

public class DecimalToBinary {
	static void decimalToBinary(int n) {
		int[] binaryNumber = new int[100];
		int i = 0;
		while (n > 0) {
			binaryNumber[i] = n % 2;
			n = n / 2;
			i++;

		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(binaryNumber[j]);

		}
	}

	public static void main(String args[]) {
		int n = 7;
		decimalToBinary(n);

	}

}