package com.bridgelab.algorithm;

public class BubbleSort {
	public void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
	}

	public void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}

	public static void main(String args[]) {
		BubbleSort ob = new BubbleSort();
		int arr[] = { 65, 69, 69, 25, 75, 36, 56 };
		ob.bubbleSort(arr);
		System.out.println("sorted array is");
       ob.printArray(arr);
	}

}
