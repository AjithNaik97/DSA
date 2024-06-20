package com.stack;

public class Main {
	public static void main(String[]  args) {
		System.out.println("----------Stack----------");

		Stack<String> s=new Stack<>(5);
		
		s.push("Bed");
		s.push("Bed Sheet");
		
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		
		System.out.println("----------DoubleStack----------");
		DoubleStack ds=new DoubleStack(5);
		ds.push1(2);
		ds.push2(3);
		ds.push1(4);
		ds.push2(5);
		System.out.println(ds.pop1());
		System.out.println(ds.pop2());
	}
}
