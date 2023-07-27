package org.deepnimma.interfaces;

public interface UnsortedDataStructure<T extends Comparable<T>> extends DataStructure<T> {
    /**
     * Sort the current data structure in ascending order.
     */
    public void sort();

    /**
     * Sort the current data structure in descending order.
     */
    public void reverseSort();
}
