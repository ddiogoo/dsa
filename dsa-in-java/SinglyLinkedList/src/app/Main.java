package app;

import list.SinglyLinkedList;

public class Main {
	public static void main(String[] args) {
		SinglyLinkedList<Integer> s = new SinglyLinkedList<Integer>();
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		s.addFirst(1);
		s.addFirst(2);
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		s.removeFirst();
	}
}
