package org.deepnimma.interfaces;

public interface DataStructure<T extends Comparable<T>> {
    public void add(T obj);
    public void addAll(DataStructure<T> obj);
    public void clear();
    public boolean contains(T obj);
    public boolean containsAll(DataStructure<T> obj);
    public int size();
    public Object[] toArray();
    public boolean remove(T obj);
    public boolean removeAll(DataStructure<T> obj);
    public boolean retainAll(DataStructure<T> obj);
} // DataStructure
