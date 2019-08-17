package com.bridgelab.programming.functional;

import java.util.Scanner;

public class SumOfThreeInteger {

	public static int findDistinctTriplets(int b[], int length) {
		System.out.println();
		int i, j, k, count = 0;
		for (i = 0; i < length; i++) {
			for (j = i + 1; j < length; j++) {
				for (k = j + 1; k < length; k++) {
					if (b[i] + b[j] + b[k] == 0) {
						System.out.println(b[i] + " " + b[j] + " " + b[k]);
						count++;
					}
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {

		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array :");
		int size = sc.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter " + (i + 1) + " Value :");
			arr[i] = sc.nextInt();
		}

		SumOfThreeInteger t1 = new SumOfThreeInteger();
		int sum = t1.findDistinctTriplets(arr, size);
		System.out.println("No.of Tripltes :" + sum);
		System.out.println();
	}
}
