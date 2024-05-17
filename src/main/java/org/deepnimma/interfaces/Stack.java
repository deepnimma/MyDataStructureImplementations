package org.deepnimma.interfaces;

public interface Stack<E> {
    public boolean isEmpty();
    public E peek();
    public E pop();
    public E push(E item);
    public int search(E item);
} // Stack
