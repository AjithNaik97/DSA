package com.singlyll;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean exit = false;
		LinkedList ll=new LinkedList();
		Scanner sc = new Scanner(System.in);
		while (!exit) {
			System.out.println("---Menu---");
			System.out.println("1.Add data\n2.Add at particular position\n3.Delete by value.\n4.Delete by position.\n5.Display data\n6.Display Reverse.\n7.Sort\n0.Exit");
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
				System.out.println("Enter the data and position to insert: ");
				ll.insert(sc.nextInt(), sc.nextInt());
				break;
			case 3:
				System.out.println("Enter the value to be deleted:");
				ll.deleteByVal(sc.nextInt());
				break;
			case 4:
				System.out.println("Enter the position from data to be deleted:");
				ll.deleteByPosition(sc.nextInt());
				break;
			case 5:
				ll.display();
				break;
			case 6:
				ll.displayReverse();
				break;
			case 7:
				ll.bubbleSort();
				break;
			case 8:
				ll.maxEle();
				break;
			case 0:
				System.out.println("Exiting...");
				exit=true;
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
		}

	}

}
