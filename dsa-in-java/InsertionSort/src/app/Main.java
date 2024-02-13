package app;

import algorithm.InsertionSort;

public class Main {
	public static void main(String[] args) {
		String myName = "diogo";
		char[] array = myName.toCharArray();
		
		System.out.print("Not ordering: ");
		System.out.println(myName);
		
		InsertionSort.sort(array);
		
		System.out.print("Ordering: ");
		System.out.println(array);
	}
}
