package com.bridgelab.algorithm;

public class WordFindBinarySearch {
	static int binarySearch(String[] arr, String word) {
		int l = 0, r = arr.length-1 ;
		while (l <= r) {
			int middleOfArray = l + (r - l) / 2;
			int res = word.compareTo(arr[middleOfArray]);
			if (res == 0) {
				return middleOfArray;

			}
			if (res > 0) {
				l = middleOfArray +1;
				

			} else {
				r = middleOfArray -1;
               
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		String arr[] = { "abc", "def", "ghi", "jkl","mno","pqr" };
		String word = "pqr";
		int result = binarySearch(arr, word);
		if (result == -1) {
			System.out.println("word is not present");
		} else {
			System.out.println("word is present at index" + result);

		}
	}

}
