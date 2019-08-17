package com.bridgelab.programming.objectorientedprogram.expressiondemonstration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bridgelab.programming.datastructure.unordered.LinkedList;

public class LinkedListReader {

	public void openfile(LinkedList list) {
		String path = "C:\\Users\\Shriniwas Pathak\\Desktop\\rishu.txt";
		try (Scanner x = new Scanner(new File(path));) {
			StringBuilder sb = new StringBuilder();
			while (x.hasNext()) {
				sb.append(x.nextLine());
			}
			String readtext = sb.toString();
			String[] result = readtext.split(" ");
			for (int i = 0; i < result.length; i++) {
				list.add(result[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		LinkedListReader file = new LinkedListReader();
		LinkedList list = new LinkedList();

		file.openfile(list);
		list.search("my");
	
		list.show();
	
	
	}
}
