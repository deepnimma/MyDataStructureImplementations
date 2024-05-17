package org.deepnimma.interfaces;

public interface SortedDataStructure<T extends Comparable<T>> extends DataStructure<T> {
    public T first();
    public T last();
} // SortedDataStructure
