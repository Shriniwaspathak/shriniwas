package com.bridgelab.programming.datastructure.ordered;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OrderedFileReader {

	public void openfile(OrderedLinkedList list) throws FileNotFoundException {

		File file = new File(
				"C:\\Users\\Shriniwas Pathak\\eclipse-workspace\\BridgeLab\\src\\com\\bridgelab\\programming\\datastructure\\number.txt");
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(file);

		
		int i = 0;
		while (sc.hasNextLine()) {
			sb.append(sc.nextLine());
		}
		String n = sb.toString();
		String[] nospace = n.split(" ");
		
		int length = nospace.length;
		int[] a = new int[length];
		for (int j = 0; j < length; j++) {
			a[j] = Integer.parseInt(nospace[j]);

		}
		for (int k = 0;k < a.length; k++) {
			list.add(a[k]);

		}
	}

	public static void main(String arg[]) throws FileNotFoundException {
		OrderedFileReader file1 = new OrderedFileReader();
		OrderedLinkedList list = new OrderedLinkedList();
		file1.openfile(list);
		list.remove(5);
        //list.sort();
		list.show();

	}

}
