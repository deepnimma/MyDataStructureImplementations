package org.deepnimma.interfaces;

public interface Deque<E> extends Queue<E> {
    public boolean addAll(DataStructure<? extends E> obj);
    public void addFirst(E obj);
    public void addLast(E obj);
    public boolean contains(E obj);
    public E getFirst();
    public E getLast();
    public boolean offerFirst(E item);
    public boolean offerLast(E item);
    public E peekFirst();
    public E peekLast();
    public E pollFirst();
    public E pollLast();
    public E removeFirst();
    public E removeFirstOccurrence(E item);
    public E removeLast();
    public E removeLastOccurrence(E item);
    public int size();
} // Deque
