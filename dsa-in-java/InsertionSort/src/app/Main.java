package app;

import algorithm.InsertionSort;

public class Main {
	public static void main(String[] args) {
		String myName = "fedcba";
		char[] data = myName.toCharArray();
		
		System.out.println("unordered: ");
		System.out.println(data);
		System.out.println();
		
		InsertionSort.run(data);
		
		System.out.println("ordered: ");
		System.out.println(data);
	}
}
