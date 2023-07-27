package org.deepnimma.linkedlists;

import org.deepnimma.abstracts.UnsortedAbstractStructure;
import org.deepnimma.interfaces.DataStructure;
import org.deepnimma.interfaces.UnsortedDataStructure;
import org.deepnimma.nodes.LinkedListNode;

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
        throw new UnsupportedOperationException("not yet implemented.");
    } // insert

    /**
     * Inserts all the elements in the second data structure that is passed as a parameter. Adds elements
     * as presented by otherStructure's removeLast method.
     *
     * @param otherStructure The second data structure to get all the new elements from.
     */
    @Override
    public void insertAll(DataStructure<T> otherStructure) {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(T data) {
        throw new UnsupportedOperationException("not yet implemented.");
    } // delete

    /**
     * Delete the given index in the list.
     *
     * @param index the index to delete
     * @throws IndexOutOfBoundsException if the index is <0 or  >=size().
     */
    @Override
    public void deleteAt(int index) {

    }

    /**
     * Removes the first element in the list and returns it.
     *
     * @return the first element in the list after removing it. Returns {@code null} if the list is empty.
     */
    @Override
    public T removeFirst() {
        return null;
    }

    /**
     * Removes the last element in the list and returns it.
     *
     * @return the last element in the list after removing it. Returns {@code null} if the list is empty.
     */
    @Override
    public T removeLast() {
        return null;
    }

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
     * {@inheritDoc}
     */
    @Override
    public boolean search(T data) {
        return indexOf(data) != -1;
    } // search

    /**
     * Returns the index of the given data value if found. Returns -1 if the data value does
     * not exist in the data structure.
     *
     * @param data the data value to search for.
     * @return the index of the data value if found. Returns -1 if the value was not found.
     */
    @Override
    public int indexOf(T data) {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void print() {
        throw new UnsupportedOperationException("not yet implemented.");
    } // print

    /**
     * {@inheritDoc}
     */
    @Override
    public T get(int index) {
        throw new UnsupportedOperationException("not yet implemented.");
    } // get

    /**
     * {@inheritDoc}
     */
    @Override
    public int size() {
        throw new UnsupportedOperationException("not yet implemented.");
    } // size

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
    }

    /**
     * Get the first value of the data structure without removing it.
     *
     * @return the first value or head of the data structure.
     */
    @Override
    public T getFirstValue() {
        return null;
    }

    /**
     * Get the last value of the data structure without removing it.
     *
     * @return the last value or tail of the data structure.
     */
    @Override
    public T getLastValue() {
        return null;
    }

    /**
     * Returns the smallest value in the data structure.
     *
     * @return the smallest value in the data structure.
     */
    @Override
    public T getSmallestValue() {
        return null;
    }

    /**
     * Returns the largest value in the data structure.
     *
     * @return the largest value in the data structure.
     */
    @Override
    public T getLargestValue() {
        return null;
    }

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
