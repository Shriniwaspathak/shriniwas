package com.bridgelab.programming.datastructure;

class Node {
	String data;
	Node Next;
}

public class LinkedList {

	private Node head;
	Node next;
	private int size = 0;

	public void add(String ll) {
		Node node = new Node();
		if (head == null) {
			node.data = ll;
			head = node;
		} else {
			Node temp = head;
			while (temp.Next != null) {
				temp = temp.Next;
			}
			node.data = ll;
			temp.Next = node;
		}
	}

	public void show() {
		Node temp = head;
		while (temp!= null) {
			System.out.print(temp.data+" ");
			temp = temp.Next;
		}
		System.out.println();
	}

	public void remove(String word) {
		Node node = head;
		Node prev = null;
		if (head.data.equals(word)) {
			head = head.Next;
			size--;
		}

		while (!node.data.equals(word)) {
			prev = node;
			node = node.Next;
		}
		node = node.Next;

		prev.Next = node;
		node = null;
		size--;

	}

	public void removeAtLast() {
		Node node = head;
		Node prev = null;
		while (node.Next != null) {
			prev = node;
			node = node.Next;
		}
		System.out.println("whatever");
		prev.Next = null;
		size--;
	}

	public void search(String word) {
		Node node = head;
		while(node!=null) {
			if(node.data.equals(word)) {
				System.out.println("Found");
				remove("my");
		return;
			}
			node=node.Next;
		}
		System.out.println("Not found");
		add("parasar");
	}

	public void isEmpty() {
		if (head == null) {
			System.out.println("list is empty");
		} else {
			System.out.println("list is not empty");
		}

	}

	public int size() {
		return size;
	}
}