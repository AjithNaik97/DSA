package com.assignment1;

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
		l2.insert(3);
		l2.insert(4);
		l2.insert(5);
		
		
		System.out.print("LL1 : "); 
		l1.display();
		System.out.print("LL2 : "); 
		l2.display();
		System.out.println();
		System.out.println("L2 merging with L1 :");
		l1.merge(l2);
		l1.display();
//		System.out.println();
//		System.out.println("L1 merging with L2");
//		l2.merge(l1);
//		l2.display();
		
	}
}
