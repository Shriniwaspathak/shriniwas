package com.bridgelab.programming.datastructure.queuelinkedlist;

import com.bridgelab.programming.datastructure.anagram.*;

class Node {
	int data;
	Node next;
}

public class QueueLinkedList extends AnagramChecker {
	public Node front, rear;
	int size = 0;

	public void enqueue(int n) {
		Node node = new Node();
		if (front == null) {
			front.data = n;
		} else {
			Node temp = front;
			while (temp != null) {
				temp = temp.next;
			}
			node.data = n;
			temp.next = node;
		}
	}

	public void show() {
		Node temp = front;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public void isEmpty() {
		if (front == null) {
			System.out.println("list is empty");
		} else {
			System.out.println("list is not empty");
		}

	}

	public int[] compare(int[] arr1, int[] arr2) {
		int[] arr3 = new int[1000];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					if (arr1[i] > 0 && arr2[j] > 0) {
						System.out.print(" " + arr1[i]);
						arr3[i] = arr1[i];
					}
				}
				System.out.print("\n");

			}

		}
		return arr3;
	}

	public static void main(String[] args) {
		QueueLinkedList ll = new QueueLinkedList();
		int[] arr1 = set();
		int[] arr2 = new int[999];
		for (int i = 0; i < arr2.length; i++) {
			int number = reverse(arr1[i]);
			if (number > 0) {
				arr2[i] = number;
				System.out.print(arr2[i] + " ");
			}

		}
		System.out.println();
		System.out.println("reverse numbers");
		int[] arr3 = ll.compare(arr1, arr2);
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] > 0) {
				ll.enqueue(arr3[i]);
				ll.show();
			}
		}
	}

}
