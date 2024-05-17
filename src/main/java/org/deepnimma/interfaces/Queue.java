package org.deepnimma.interfaces;

public interface Queue<E> {
    public boolean add(E item);
    public E element();
    public boolean offer(E item);
    public E peek();
    public E poll();
    public E remove();
} // Queue
