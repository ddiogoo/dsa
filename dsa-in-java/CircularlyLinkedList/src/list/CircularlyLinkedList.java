package list;

public class CircularlyLinkedList<E> {
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
	 * We store tail (but not head).
	 * */
	private Node<E> tail;
	
	/**
	 * Number of nodes in the list.
	 * */
	private int size;
	
	/**
	 * Constructor an initially empty list.
	 * */
	public CircularlyLinkedList() {
		this.tail = null;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	/**
	 * Returns (but does not remove) the first element.
	 * */
	public E first() {
		if(isEmpty()) return null;
		return tail.getNext().getElement(); // The head is *after* the tail.
	}
}
