package algorithm;

public class InsertionSort {
	/**
	 * Simple interface that allows the user to pass a string as a parameter, 
	 * but it will be transformed into a char array.
	 * */
	public static void run(String data) {
		char[] dataChar = data.toCharArray();
		
		System.out.println("unordered: ");
		System.out.println(dataChar);
		System.out.println();
		
		sort(dataChar);
		
		System.out.println("ordered: ");
		System.out.println(dataChar);
	}
	
	/**
	 * Simple interface that allows the user to pass a char array as a parameter.
	 * */
	public static void run(char[] data) {
		System.out.println("unordered: ");
		System.out.println(data);
		System.out.println();
		
		sort(data);
		
		System.out.println("ordered: ");
		System.out.println(data);	
	}
	
	/**
	 * Implementing the Insertion Sort algorithm.
	 * 
	 * @param data Array of values ​​of type char.
	 * */
	private static void sort(char[] data) {
		int n = data.length;
		for(int i = 1; i < n; i++) {             // Start in second position.
			char curr = data[i];                 // Take the value that is in the position corresponding to the value of variable "i".
			int j = i;                           // Assign the value referring to position "i" to variable "j".
			while(j > 0 && data[j - 1] > curr) { // As long as variable j does not reach the first position and the value of position j-1 (previous) is greater than the current value.
				data[j] = data[j - 1];           // Assign the value obtained from "j-1" to position "j".
				j--;                             // Move to the previous position.
			}
			data[j] = curr;                      // Assign the current value (curr) to the j position that did not satisfy the while loop condition.
		}
	}
}
