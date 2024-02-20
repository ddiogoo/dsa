package list;

public class SinglyLinkedList<E> {
	private static class Node<E> {
		/**
		 * Reference to the element stored at this node.
		 * */
		private E element;
		
		/**
		 * Reference to the subsequent node in the list.
		 * */
		private Node<E> next;
		
		public Node(E element, Node<E> next) {
			this.element = element;
			this.next = next;
		}
		
		public E getElement() {
			return element;
		}
		
		public Node<E> getNext() {
			return next;
		}
		
		public void setNext(Node<E> next) {
			this.next = next;
		}
	}
	
	/**
	 * Head node of list (or null if empty).
	 * */
	private Node<E> head;
	
	/**
	 * Last node of list (or null if empty);
	 * */
	private Node<E> tail;
	
	/**
	 * Number of nodes in the list.
	 * */
	private int size;
	
	/**
	 * Constructor an initially empty list.
	 * */
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
	
	/**
	 * Returns (but does not remove) the first element.
	 * */
	public E first() {
		if(isEmpty()) return null;
		return head.getElement();
	}
	
	/**
	 * Returns (but does not remove) the last element.
	 * */
	public E last() {
		if(isEmpty()) return null;
		return tail.getElement();
	}
	
	/**
	 * Add element to the front of the list.
	 * */
	public void addFirst(E e) {
		head = new Node<E>(e, head);
		if(size == 0) tail = head;
		size++;
	}
}
