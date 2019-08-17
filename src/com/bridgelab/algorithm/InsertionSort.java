package com.bridgelab.algorithm;

public class InsertionSort {
	public static void main(String args[]) {
		String[] arr = { "manish", "sumit", "shubham", "waqas", "tanmoy", "amres" };
		// int count=0;
		String sortedArray[] = sortSub(arr, arr.length);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);

		}

	}

	public static String[] sortSub(String arr[], int length) {
		String temp;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
