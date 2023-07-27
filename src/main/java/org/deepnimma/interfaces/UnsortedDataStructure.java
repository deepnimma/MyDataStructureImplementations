package org.deepnimma.interfaces;

import javax.xml.crypto.Data;

public interface UnsortedDataStructure<T extends Comparable<T>> extends SortedDataStructure<T> {
    /**
     * Sort the current data structure in ascending order.
     */
    public void sort();

    /**
     * Sort the current data structure in descending order.
     */
    public void reverseSort();

    /**
     * Insert a data value at a given index.
     * @param index the index to insert at.
     * @param data the data value to insert.
     * @throws IndexOutOfBoundsException if {@code index} is less than 0 or greater than the size().
     */
    public void insert(int index, T data);

    /**
     * Inserts all the values in {@code otherStructure} at the given index.
     * @param index the index to start inserting at.
     * @param otherStructure the values to insert.
     * @throws IndexOutOfBoundsException if {@code index} is less than 0 or greater than the size().
     */
    public void insertAll(int index, DataStructure<T> otherStructure);

    /**
     * Insert the given data value at the start of the list.
     * @param data the data value to insert.
     */
    public void insertFirst(T data);

    /**
     * Inserts all the values in otherStructure at the start of the structure.
     * @param otherStructure the values to insert.
     */
    public void insertFirst(DataStructure<T> otherStructure);

    /**
     * Inserts the data value at the end of the list.
     * @param data the value to insert.
     */
    public void insertEnd(T data);

    /**
     * Inserts all the values in otherStructure at the end of the structure.
     * @param otherStructure the values to insert.
     */
    public void insertEnd(DataStructure<T> otherStructure);
} // UnsortedDataStructure
