public class DoublyLinkedList<E> {
    private static class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private Node<E> header;
    private Node<E> trailer;
    private int size;

    public DoublyLinkedList() {
        header = new Node<E>(null, null, null);
        trailer = new Node<E>(null, header, null);
        header.setNext(trailer);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if(isEmpty()) return null;
        return header.getNext().getElement();
    }

    public E last() {
        if(isEmpty()) return null;
        return trailer.getPrev().getElement();
    }

    public void addFirst(E element) {
        addBetween(element, header, header.getNext());
    }

    public void addLast(E element) {
        addBetween(element, trailer.getPrev(), trailer);
    }

    private void addBetween(E element, Node<E> predecessor, Node<E> sucessor) {
        Node<E> newest = new Node<E>(element, predecessor, sucessor);
        predecessor.setNext(sucessor);
        sucessor.setPrev(newest);
        size++;
    }

    public E removeFirst() {
        if(isEmpty()) return null;
        return remove(header.getNext());
    }

    public E removeLast() {
        if(isEmpty()) return null;
        return remove(trailer.getPrev());
    }

    public E remove(Node<E> node) {
        Node<E> predecessor = node.getPrev();
        Node<E> sucessor = node.getNext();
        predecessor.setNext(sucessor);
        sucessor.setPrev(predecessor);
        size--;
        return node.getElement();
    }
}
