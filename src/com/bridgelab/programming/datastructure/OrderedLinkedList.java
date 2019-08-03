package com.bridgelab.programming.datastructure;

class NodeB {
	int data;
	NodeB next;

}

public class OrderedLinkedList {
	private NodeB head;
	NodeB next;
	private int size = 0;

	public void add(int n) {
		NodeB node = new NodeB();
		if (head == null) {
			node.data=n;
			head = node;
            
		} else {
			NodeB temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next=node;
			node.data = n;
			size++;
		}
	}

	public void remove(int n) {
		NodeB node = head;
		NodeB prev = null;
		if (head.data == n) {
			head = head.next;
			size--;

		}else {
		while (node.data != n) {
			prev = node;
			node = node.next;

		}

		node = node.next;
		prev.next = node;
		node = null;
		size--;
		}
	}

	public void show() {
		NodeB temp = head;
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}

	public void search(int n) {
		NodeB temp = head;
		while (temp != null) {
			if (temp.data == n) {
				System.out.print("found");
				//sort();
				//remove(n);
				break;
			

			}
			temp=temp.next;
		}

	}

	public void isEmpty() {

		if (head == null) {
			System.out.print("list is empty");
		} else {
			System.out.println("list is not empty");

		}

	}

	public void removeAtLast(int n) {
		NodeB temp = head;
		NodeB prev = null;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;

		}
		System.out.print("some thing");
		prev.next = null;
		size--;

	}

	public void sort() {
		NodeB current = head, index = null;
		int temp;
		if (head == null) {
			return;
		} else {
			while (current != null) {
				index = current.next;
				while (index != null) {
					if (current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = index.next;

				}
				current = current.next;

			}
		}
	}

}
