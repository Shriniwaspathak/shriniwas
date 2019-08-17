package com.bridgelab.programming.functional;

import java.util.Random;

public class CouponNumber {
	public static void main(String args[]) {
		int arr[] = { 1, 5, 7, 9, 6, 3, 4, 5, 11, 23, 56, 89, 98, 2 };
		//int i = arr.length;
		for (int j = 1; j <= 5; j++) {
           
			int no = new Random().nextInt(j);

			System.out.println(arr[no]);
		}

	}
}

	


