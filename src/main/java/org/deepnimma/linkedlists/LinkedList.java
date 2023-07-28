package org.deepnimma.linkedlists;

import org.deepnimma.abstracts.UnsortedAbstractStructure;
import org.deepnimma.interfaces.DataStructure;
import org.deepnimma.interfaces.UnsortedDataStructure;
import org.deepnimma.nodes.LinkedListNode;
import org.deepnimma.nodes.Node;

/**
 * A unsorted implementation of the LinkedList data structure.
 */
public class LinkedList<T extends Comparable<T>> extends UnsortedAbstractStructure<T>
        implements UnsortedDataStructure<T> {
    private LinkedListNode<T> head;

    /**
     * Default constructor for creating a new UnsortedLinkedList.
     */
    public LinkedList() {
        super();
        head = null;
    } // LinkedList

    /**
     * Constructor when {@code head}'s data value is given to us.
     * @param data the data value belonging to the head of the LinkedList.
     */
    public LinkedList(T data) {
        super();
        head = new LinkedListNode<>(data);
    } // LinkedList

    /**
     * Converts a different data structure into a LinkedList.
     * @param otherStructure The other data structure to convert into a linkedlist. Must implement
     *                       {@link org.deepnimma.interfaces.DataStructure}.
     */
    public LinkedList(DataStructure<T> otherStructure) {
        super(otherStructure);
    } // LinkedList

    /**
     * {@inheritDoc}
     */
    @Override
    public void insert(T data) {
        if (size() == 0) {
            head = new LinkedListNode<>(data);
            return;
        } // if

        LinkedListNode<T> currPos = head;

        while (currPos.getNext() != null) {
            currPos = currPos.getNext();
        } // while

        currPos.setNext(new LinkedListNode<>(data));
    } // insert

    /**
     * {@inheritDoc}
     */
    @Override
    public T delete(T data) {
        if (indexOf(data) == -1) {
            return null;
        } // if

        if (head.getData().equals(data)) {
            head = head.getNext();
            return data;
        } // if

        LinkedListNode<T> prev = null;
        LinkedListNode<T> currPos = head;

        while (!currPos.getData().equals(data)) {
            prev = currPos;
            currPos = currPos.getNext();
        } // while

        assert prev != null; // just to get IntelliJ to stop yelling at me.
        prev.setNext(currPos.getNext()); // skip currPos to delete it.

        return data;
    } // delete

    /**
     * Changes the value of the node at index to the given value.
     *
     * @param index  the node index to change.
     * @param newVal the value to change the node to.
     * @return the previous value before the node was changed.
     * @throws IndexOutOfBoundsException if the index is out of bounds.
     */
    @Override
    public T set(int index, T newVal) {
        return null;
    }

    /**
     * Returns the index of the given data value if found. Returns -1 if the data value does
     * not exist in the data structure.
     *
     * @param data the data value to search for.
     * @return the index of the data value if found. Returns -1 if the value was not found.
     */
    @Override
    public int indexOf(T data) {
        return recursiveSearch(head, 0, data);
    } // indexOf

    /**
     * Recursively search for the given data item.
     * @param currPos the current position of the iterator
     * @param currIndex the current index of the iterator
     * @param data the data to look for
     * @return -1 if the data is not found, otherwise the current index
     */
    private int recursiveSearch(LinkedListNode<T> currPos, int currIndex, T data) {
        if (currPos == null)
            return -1;

        if (currPos.getData().equals(data))
            return currIndex;

        return recursiveSearch(currPos.getNext(), currIndex + 1, data);
    } // recursiveSearch

    /**
     * {@inheritDoc}
     */
    @Override
    public void print() {
        System.out.print(this);
    } // print

    /**
     * {@inheritDoc}
     */
    @Override
    public T get(int index) {
        return recursiveGet(head, 0, index);
    } // get

    private T recursiveGet(LinkedListNode<T> currPos, int currIndex, int index) {
        if (currPos == null || currIndex > index || currIndex < 0)
            return null;

        if (currIndex == index)
            return currPos.getData();

        return recursiveGet(currPos.getNext(), currIndex + 1, index);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int size() {
        return recursiveSize(head, 0);
    } // size

    /**
     * Recursively find the size of the linked list.
     * @param currPos the current position of the iterator
     * @param counter the current count of the size of the list.
     * @return the size of the list.
     */
    private int recursiveSize(LinkedListNode<T> currPos, int counter) {
        if (currPos == null) {
            return counter;
        } // if

        return recursiveSize(currPos.getNext(), counter + 1);
    } // recursiveSize

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeDuplicates() {
        throw new UnsupportedOperationException("not yet implemented.");
    } // removeDuplicates

    /**
     * {@inheritDoc}
     */
    @Override
    public void combine(DataStructure<T> secondStructure) {
        throw new UnsupportedOperationException("not yet implemented.");
    } // combine

    /**
     * {@inheritDoc}
     */
    @Override
    public void intersect(DataStructure<T> secondStructure) {
        throw new UnsupportedOperationException("not yet implemented.");
    } // intersect

    /**
     * {@inheritDoc}
     */
    @Override
    public DataStructure<T> subStructure(int startIndex, int endIndex) {
        return null;
    } // subStructure

    /**
     * Get the first value of the data structure without removing it.
     *
     * @return the first value or head of the data structure.
     */
    @Override
    public T getFirstValue() {
        return get(0);
    } // getFirstValue

    /**
     * Get the last value of the data structure without removing it.
     *
     * @return the last value or tail of the data structure.
     */
    @Override
    public T getLastValue() {
        return get(size() - 1);
    } // getLastValue

    /**
     * Returns the smallest value in the data structure.
     *
     * @return the smallest value in the data structure. Returns {@code null} if the list is empty.
     */
    @Override
    public T getSmallestValue() {
        if (size() == 0) {
            return null;
        } // if

        LinkedListNode<T> currPos = head;
        T smallestVal = head.getData();

        while (currPos != null) {
            smallestVal = currPos.getData().compareTo(smallestVal) < 0 ? currPos.getData() : smallestVal;
            currPos = currPos.getNext();
        } // while

        return smallestVal;
    } // getSmallestValue

    /**
     * Returns the largest value in the data structure.
     *
     * @return the largest value in the data structure. Returns {@code null} if the list is empty.
     */
    @Override
    public T getLargestValue() {
        if (size() == 0) {
            return null;
        } // if

        LinkedListNode<T> currPos = head;
        T largestVal = head.getData();

        while (currPos != null) {
            largestVal = largestVal.compareTo(currPos.getData()) < 0 ? currPos.getData() : largestVal;
            currPos = currPos.getNext();
        } // while

        return largestVal;
    } // getLargestValue

    /**
     * Converts the data structure into an array and returns it.
     *
     * @return the array form of the current data structure.
     */
    @Override
    public T[] toArray() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void sort() {
        throw new UnsupportedOperationException("not yet implemented.");
    } // sort

    /**
     * {@inheritDoc}
     */
    @Override
    public void reverseSort() {
        throw new UnsupportedOperationException("not yet implemented.");
    } // reverseSort

    /**
     * Insert a data value at a given index.
     *
     * @param index the index to insert at.
     * @param data  the data value to insert.
     * @throws IndexOutOfBoundsException if {@code index} is less than 0 or greater than the size().
     */
    @Override
    public void insert(int index, T data) {

    }

    /**
     * Inserts all the values in {@code otherStructure} at the given index.
     *
     * @param index          the index to start inserting at.
     * @param otherStructure the values to insert.
     * @throws IndexOutOfBoundsException if {@code index} is less than 0 or greater than the size().
     */
    @Override
    public void insertAll(int index, DataStructure<T> otherStructure) {

    }

    /**
     * Insert the given data value at the start of the list.
     *
     * @param data the data value to insert.
     */
    @Override
    public void insertFirst(T data) {

    }

    /**
     * Inserts all the values in otherStructure at the start of the structure.
     *
     * @param otherStructure the values to insert.
     */
    @Override
    public void insertFirst(DataStructure<T> otherStructure) {

    }

    /**
     * Inserts the data value at the end of the list.
     *
     * @param data the value to insert.
     */
    @Override
    public void insertEnd(T data) {

    }

    /**
     * Inserts all the values in otherStructure at the end of the structure.
     *
     * @param otherStructure the values to insert.
     */
    @Override
    public void insertEnd(DataStructure<T> otherStructure) {

    }
} // LinkedList
