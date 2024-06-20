package com.assignment2;

public class Main {
	public static void main(String []args) {
		LinkedList l1=new LinkedList();
		LinkedList l2=new LinkedList();
		
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		l1.insert(40);
		
		l2.insert(1);
		l2.insert(2);
		
		
		l1.display();
		System.out.println();
		l2.display();
		
		System.out.println();
		l1.merge(l2);
		l1.display();
		
	}
}
