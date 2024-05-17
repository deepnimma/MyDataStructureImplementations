package org.deepnimma.interfaces;

public interface UnsortedDataStructure<T extends Comparable<T>> extends SortedDataStructure<T> {
    public T get(int index);
    public DataStructure<T> subList(int startIndex, int endIndex);

    /**
     * Returns a sorted copy of the current data structure.
     * @return a sorted copy of the current data structure.
     */
    public DataStructure<T> sort();

    public DataStructure<T> reverse();

    public int indexOf(T obj);
    public int lastIndexOf(T obj);
    public int firstIndexOf(T obj);
    public int remove(int index);
    public T set(int index, T obj);
} // UnsortedDataStructure
