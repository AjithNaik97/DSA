package com.singlelinkedlist.ass;

public class Main {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.insert(8);
		l.insert(1);
		l.insert(2);
		l.insert(5);
		l.insert(7);
		l.insert(4);
		
		l.display();
		
		System.out.println("Max element in list : "+l.getMaxEle());
		System.out.println("Min element in list : "+l.getMinEle());
		System.out.println("Sum element in list : "+l.sumOfEvenEle());
	}

}
