package org.deepnimma.abstracts;

import org.deepnimma.interfaces.DataStructure;
import org.deepnimma.interfaces.SortedDataStructure;

public abstract class SortedAbstractStructure<T extends Comparable<T>> implements SortedDataStructure<T>, Cloneable {
    protected boolean reversed;

    /**
     * Default constructor for SortedAbstractStructure
     */
    protected SortedAbstractStructure() {
        reversed = false;
    } // SortedAbstractStructure

    /**
     * Converts another {@link org.deepnimma.interfaces.DataStructure} to the current data structure.
     * @param otherStructure the other structure to convert.
     */
    protected SortedAbstractStructure(DataStructure<T> otherStructure) {
        insertAll(otherStructure);
    } // SortedAbstractStructure

    /**
     * Removes the first element in the list and returns it.
     *
     * @return the first element in the list after removing it. Returns {@code null} if the list is empty.
     */
    @Override
    public T removeFirst() {
        return deleteAt(0);
    } // removeFirst

    /**
     * Removes the last element in the list and returns it.
     *
     * @return the last element in the list after removing it. Returns {@code null} if the list is empty.
     */
    @Override
    public T removeLast() {
        return deleteAt(size() - 1);
    } // removeLast

    /**
     * Delete the given index in the list.
     *
     * @param index the index to delete
     * @throws IndexOutOfBoundsException if the index is <0 or  >=size().
     * @return the deleted value.
     */
    @Override
    public T deleteAt(int index) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException("Index given to delete is out of bounds.");

        return delete(get(index));
    } // deleteAt

    /**
     * Searches for the given data value in the data structure. Return codes appropriately.
     *
     * @param data the data value to search for in the structure.
     * @return {@code true} if found, else {@code false}.
     */
    @Override
    public boolean search(T data) {
        return indexOf(data) != -1;
    }

    /**
     * Inserts all the elements in the second data structure that is passed as a parameter. Adds elements
     * as presented by otherStructure's removeLast method.
     *
     * @param otherStructure The second data structure to get all the new elements from.
     */
    @Override
    public void insertAll(DataStructure<T> otherStructure) {
        for (int i = 0; i < otherStructure.size(); i++) {
            insert(otherStructure.get(i));
        } // for
    } // insertAll

    /**
     * {@inheritDoc}
     */
    public boolean isEmpty() {
        return size() == 0;
    } // isEmpty

    /**
     * {@inheritDoc}
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    } // clone
} // SortedAbstractStructure
