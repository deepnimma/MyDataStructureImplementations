package org.deepnimma.interfaces.queue;

import org.deepnimma.interfaces.GenericStructure;

public interface DNQueue<E> extends GenericStructure<E> {
    /**
     * Retrieves, but does not remove, the head of this queue. This method differs from {@code peek} only in that it throws an exception if this queue is empty
     * @return the head of this queue
     * @throws java.util.NoSuchElementException if this queue is empty.
     */
    public E element();

    /**
     * Works the same way as {@code add}.
     * @param e the element to add
     * @return {@code true} if the element was added to this queue, else false
     */
    public boolean offer(E e);

    /**
     * Retrieves but does not remove the head of this queue, returns null if this queue is empty.
     * @return the head of the queue, or null if this queue is empty.
     */
    public E peek();

    /**
     * Retrieves and removes the head of this queue, or returns null if this queue is empty
     * @return the head of this queue, or null if this queue is empty.
     */
    public E poll();

    /**
     * Retrieves and removes the head of the queue. This method differs from {@code poll} only in that it throws an exception if this queue is empty.
     * @return the head of this queue
     * @throws java.util.NoSuchElementException if this queue is empty.
     */
    public E remove();
} // UnserQueue
