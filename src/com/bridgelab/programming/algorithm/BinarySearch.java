package com.bridgelab.programming.algorithm;

public class BinarySearch {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();

		int[] arr = { 85,23,64,97,22,2 };
		//arr = Utility.bubbleSort(arr);
		int n = 87;

		if (Utility.binary(arr, n) == true)
			System.out.println(n + " is Present");
		else
			System.out.println(n + " is Not Present");
	
           long end= System.currentTimeMillis();
           long diff= end - start;
           System.out.println((float) (diff / 1000) + "second");
	}   

   
}