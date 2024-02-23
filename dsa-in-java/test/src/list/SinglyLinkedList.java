package list;

public class SinglyLinkedList<T> {
	private static class Node<T> {
		public T element;
		public Node<T> next;
		
		public Node(T element, Node<T> next) {
			this.element = element;
			this.next = next;
		}
	}
	
	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	public SinglyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void addFirst(T element) {
		head = new Node<T>(element, head);
		if(isEmpty()) tail = head;
		size++;
	}
	
	public void addLast(T element) {
		Node<T> newNode = new Node<T>(element, null);
		if(isEmpty()) head = newNode;
		else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	public T removeFirst() {
		if(isEmpty()) return null;
		T element = head.element;
		head = head.next;
		size--;
		if(isEmpty()) tail = null;
		return element;
	}
	
	public void print() {
		Node<T> curr = head;
		System.out.println("printing values...");
		while(curr != null) {
			System.out.println(curr.element);
			curr = curr.next;
		}
	}
}
