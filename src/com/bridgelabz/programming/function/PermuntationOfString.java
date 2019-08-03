package com.bridgelabz.programming.function;

import java.util.Scanner;

public class PermuntationOfString {
	public static String swapString(String a,int i,int j) {
		char[]b=a.toCharArray();
		char ch;
		ch =b[i];
		b[i]=b[j];
		b[j]=ch;
		
	
	return String.valueOf(b);
	}
	
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("enter String");
		String str=sc.nextLine();
		int length=str.length();
		System.out.print("All the permuntation of the string");
		generatePermuntation(str,0,length);
	}
		public static void generatePermuntation(String str,int start,int end) {
			if (start==end-1) {
				System.out.print(str);
			}
			else {
				for(int i=start;i<end;i++) {
					str= swap(str,start,i);
					
				}
			}
		}

		private static String swap(String str, int start, int i) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

