package algorithm;

public class InsertionSort {
	public static void run(String data) {
		char[] dataChar = data.toCharArray();
		
		System.out.println("unordered: ");
		System.out.println(dataChar);
		System.out.println();
		
		sort(dataChar);
		
		System.out.println("ordered: ");
		System.out.println(dataChar);
	}
	
	public static void run(char[] data) {
		System.out.println("unordered: ");
		System.out.println(data);
		System.out.println();
		
		sort(data);
		
		System.out.println("ordered: ");
		System.out.println(data);	
	}
	
	private static void sort(char[] data) {
		int n = data.length;
		for(int i = 1; i < n; i++) {
			char curr = data[i];
			int j = i;
			while(j > 0 && data[j - 1] > curr) {
				data[j] = data[j - 1];
				j--;
			}
			data[j] = curr;
		}
	}
}
