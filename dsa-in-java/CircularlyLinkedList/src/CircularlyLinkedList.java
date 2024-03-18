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
	
	/**
	 * Returns (but does not remove) the last element.
	 * */
	public E last() {
		if(isEmpty()) return null;
		return tail.getElement();
	}
	
	/**
	 * Rotate the first element to the back of the list.
	 * */
	public void rotate() {
		if(tail != null)           // if empty, do nothing
			tail = tail.getNext(); // the old head becomes the new tail
	}
	
	/**
	 * Adds element to the front of the list.
	 * */
	public void addFirst(E e) {
		if(isEmpty()) {
			tail = new Node<E>(e, null);
			tail.setNext(tail); // link to itself circularly
		} else {
			Node<E> newest = new Node<E>(e, tail.getNext());
			tail.setNext(newest);
		}
		size++;
	}
	
	/**
	 * Adds element to the end of the list.
	 * */
	public void addLast(E e) {
		addFirst(e);           // insert new element at front of list.
		tail = tail.getNext(); // now new element becomes the tail.
	}
	
	/**
	 * Removes element to the end of the list.
	 * */
	public E removeFirst() {
		if(isEmpty()) return null; // Nothing to remove.
		Node<E> head = tail.getNext();
		if(head == tail) tail = null; // Must be the only node left.
		else tail.setNext(head.getNext()); // Removes "head" of the list.
		size--;
		return head.getElement();
	}
}
