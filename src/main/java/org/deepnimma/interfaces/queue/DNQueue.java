package org.deepnimma.interfaces.queue;

import org.deepnimma.interfaces.GenericStructure;

/**
 * A double sided implementation of a queue.
 * @param <E> The class of the elements in the structure.
 */
public interface DNQueue<E> extends GenericStructure<E> {
    /**
     * Retrieves, but does not remove, the head of this queue. This method differs from {@code peek} only in that it throws an exception if this queue is empty
     *
     * @return the head of this queue
     * @throws java.util.NoSuchElementException if this queue is empty.
     */
    E element();

    /**
     * Works the same way as {@code add}.
     *
     * @param e the element to add
     * @return {@code true} if the element was added to this queue, else false
     */
    boolean offer(E e);

    /**
     * Retrieves but does not remove the head of this queue, returns null if this queue is empty.
     *
     * @return the head of the queue, or null if this queue is empty.
     */
    E peek();

    /**
     * Retrieves and removes the head of this queue, or returns null if this queue is empty
     *
     * @return the head of this queue, or null if this queue is empty.
     */
    E poll();

    /**
     * Retrieves and removes the head of the queue. This method differs from {@code poll} only in that it throws an exception if this queue is empty.
     *
     * @return the head of this queue
     * @throws java.util.NoSuchElementException if this queue is empty.
     */
    E remove();
} // UnserQueue
