package com.search.linkedlist;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean exit = false;
		LinkedList ll=new LinkedList();
		Scanner sc = new Scanner(System.in);
		while (!exit) {
			System.out.println("---Menu---");
			System.out.println("1.Add data\n2.Display data\n0.Exit");
			System.out.println("Enter your choice");
			switch (sc.nextInt()) {
			case 1:
				System.out.print("Enter the number of data to add:");
				int count=sc.nextInt();
				System.out.println("Enter "+count+" data:");
				for(int i=0;i<count;i++) {
					ll.insert(sc.nextInt());
				}
				break;
			case 2:
				ll.display();
				break;
			case 0:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid input");
				break;
			
			}
		}

	}

}
