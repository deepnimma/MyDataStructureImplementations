package org.deepnimma.nodes;

public class LinkedListNode<T extends Comparable<T>> extends Node<T> {
    private LinkedListNode<T> next;

    /**
     * Default constructor for LinkedListNode
     */
    public LinkedListNode() {
        super();
        this.next = null;
    } // LinkedListNode

    /**
     * Constructor for LinkedListNode that stores the specified data.
     * @param data the data to store in the node.
     */
    public LinkedListNode(T data) {
        super(data);
        this.next = null;
    } // LinkedListNode

    /**
     * Constructor for LinkedListNode that stores the specified data and the next LinkedListNode.
     * @param data the data to store in the node.
     * @param next the next node in the LinkedList.
     */
    public LinkedListNode(T data, LinkedListNode<T> next) {
        this(data);
        this.next = next;
    } // LinkedListNode

    /**
     * Setter function for the next node.
     * @param next the next node in the LinkedList
     */
    public void setNext(LinkedListNode<T> next) {
        this.next = next;
    } // setNext

    /**
     * Getter function for the next node.
     * @return the next node in the LinkedList.
     */
    public LinkedListNode<T> getNext() {
        return next;
    } // getNext
} // LinkedListNode
