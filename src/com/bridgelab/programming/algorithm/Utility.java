package com.bridgelab.programming.algorithm;

public class Utility {
	public static int[] bubbleSort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length ; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void bubbleSort(String[] arr) {
		String temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
	}

	public static boolean binary(int[] arr, int n) {
		int high = arr.length - 1, low = 0, mid;
		arr = (bubbleSort(arr));
		while (low <= high) {
			mid = high + low / 2;
			if (n == arr[mid]) {
				return true;
			} else if (arr[mid] < n) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return false;
	}

	public static int binary(String[] arr, String s) {
		int high = arr.length - 1, low = 0, mid;
		bubbleSort(arr);
		while (low <= high) {
			mid = high + low / 2;
			if (s.equalsIgnoreCase(arr[mid])) {
				return mid;

			} else if (arr[mid].compareToIgnoreCase(s) > 0) {
				low = mid + 1;

			} else {
				high = mid - 1;

			}

		}

		return -1;
	}

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[i] = arr[j];
				j--;
			}
			arr[j + 1] = temp;

		}

	}

	public static String[] insertionSort(String[] arr) {
		for (int i = 1; i < arr.length; i++) {
			String temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j].compareToIgnoreCase(temp) < 0) {
				arr[i] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		return arr;
	}

}
