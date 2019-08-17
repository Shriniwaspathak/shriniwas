package com.bridgelab.programming.oops.companylist;

import com.bridgelab.algorithm.Input;

public class CompanyLinked {
	class Node {
		String data;
		Node next;

	}
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
			while (temp.next != null) {
				temp = temp.next;
			}
			node.data = ll;
			temp.next = node;
		}
	}

	public void show() {
		Node temp = head;
		while (temp!= null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void remove(String word) {
		Node node = head;
		Node prev = null;
		if (head.data.equals(word)) {
			head = head.next;
			size--;
		}

		while (!node.data.equals(word)) {
			prev = node;
			node = node.next;
		}
		node = node.next;

		prev.next = node;
		node = null;
		size--;

	}

	public void removeAtLast() {
		Node node = head;
		Node prev = null;
		while (node.next != null) {
			prev = node;
			node = node.next;
		}
		System.out.println("whatever");
		prev.next = null;
		size--;
	}

	public void search(String word) {
		Node node = head;
		while(node!=null) {
			if(node.data.equals(word)) {
				System.out.println("Found");
				
		return;
			}
			node=node.next;
		}
		System.out.println("Not found");
		
	}

	
	
	
	public static void main (String arg[]) {
		CompanyList company=new CompanyList();
	
		CompanyLinked link=new CompanyLinked();
		System.out.println("enter the company name :");
		String companyname=Input.inputString();
		
		System.out.println("enter the company share :");
		String comapanyshare=Input.inputString();
		
		company.setCompanyname(companyname);
		company.setCompanyshare(comapanyshare);
		
		
      System.out.println("choose 1 for insert :\n choose 2 for delete");
		int choose=Input.inputInteger();
		switch(choose) {
		case 1:
			System.out.println("Inserting :");
			
			link.add(companyname);
			
		case 2:
			System.out.print("remove");
		
			link.remove(companyname);
			
			
		}
	}

}
