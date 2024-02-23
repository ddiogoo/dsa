package exec;

import list.SinglyLinkedList;

public class RunLists {
	public static void run() {
		runSinglyLinkedList();
	}
	
	private static void runSinglyLinkedList() {
		SinglyLinkedList<Integer> s = new SinglyLinkedList<Integer>();
		System.out.println("empty: " + s.isEmpty());
		System.out.println("size: " + s.size());
		s.addFirst(1);
		s.addFirst(2);
		s.addLast(3);
		s.addLast(4);
		System.out.println("empty: " + s.isEmpty());
		System.out.println("size: " + s.size());
		s.removeFirst();
		s.removeFirst();
		System.out.println("empty: " + s.isEmpty());
		System.out.println("size: " + s.size());
		s.print();
	}
}
