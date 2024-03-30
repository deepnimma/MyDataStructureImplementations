package org.deepnimma.interfaces.queue;

/**
 * A queue that supports insertion and removal at both ends.
 *
 * @param <E> The type of elements held in this deque.
 */
public interface DNDeque<E> extends DNQueue<E> {
    /**
     * Inserts the specified element at the front of the deque. Throws an {@link IllegalStateException} if no space is currently available.
     *
     * @param e the element to add.
     * @throws IllegalStateException    if the element cannot be added due to capacity restrictions.
     * @throws NullPointerException     if the element is null
     * @throws IllegalArgumentException if some property of the element prevents it from being added to this deque.
     */
    void addFirst(E e);

    /**
     * Inserts the specified element at the end of the deque. Throws an {@link IllegalStateException} if no space is currently available.
     *
     * @param e the element to add
     * @throws IllegalStateException    if the element cannot be added due to capacity restrictions.
     * @throws NullPointerException     if the element is null.
     * @throws IllegalArgumentException if some property of the element prevents it from being added to this deque.
     */
    void addLast(E e);

    /**
     * Get the element currently at the start of the deque. Throws {@link java.util.NoSuchElementException} if the deque is empty.
     *
     * @return the element currently at the start of the deque.
     * @throws java.util.NoSuchElementException if the deque is currently empty.
     */
    E getFirst();

    /**
     * Get the element currently at the end of the deque. Throws {@link java.util.NoSuchElementException} if the deque is empty.
     *
     * @return the element currently at the end of the deque.
     * @throws java.util.NoSuchElementException if the deque is currently empty.
     */
    E getLast();

    /**
     * Inserts the specified element at the front of this deque. Does not throw an exception when the deque is a capacity restricted deque.
     *
     * @param e the element to add
     * @return {@code true} if the element has been added, otherwise {@code false}
     * @throws ClassCastException       if the class of the element does not allow the element to be added to the deque.
     * @throws NullPointerException     if the element is null
     * @throws IllegalArgumentException if some property of the element prevents it from being added to this deque.
     */
    boolean offerFirst(E e);

    /**
     * Inserts the specified element at the end of this deque. Does not throw an exception when the deque is a capacity restricted deque.
     *
     * @param e the element to add
     * @return {@code true} if the element has been added, otherwise {@code false}.
     * @throws ClassCastException       if the class of the element does not allow the element to be added to the deque.
     * @throws NullPointerException     if the element is null
     * @throws IllegalArgumentException if some property of the element prevents it from being added to this deque.
     */
    boolean offerLast(E e);

    /**
     * Retrieves but does not remove the element at the start of the deque. Returns {@code null} if the deque is empty.
     *
     * @return the element at the start of the deque, or null if the deque is empty.
     */
    E peekFirst();

    /**
     * Retrieves but does not remove the element at the start of the deque. Returns {@code null} if the deque is empty.
     *
     * @return the element at the end of the deque, or null if the deque is empty.
     */
    E peekLast();

    /**
     * Pushes an element onto the stack represented by this deque. Throws an {@link IllegalStateException} if no space is currently available.
     *
     * @param e the element to add.
     * @throws IllegalStateException    if the element cannot be added due to space restrictions.
     * @throws ClassCastException       if the element's class hinders it from being added to the deque.
     * @throws NullPointerException     if the specified element is null.
     * @throws IllegalArgumentException if any other property of the specified element prevents it from being added to the deque.
     */
    void push(E e);

    /**
     * Pops an element from the stack represented by this deque. In other words, removes and returns the first element in this deque.
     * Equivilant to {@code removeFirst()}
     *
     * @return the element at the front of this deque.
     * @throws java.util.NoSuchElementException if this deque is empty.
     */
    E pop();

    /**
     * Retrieves and removes the first element of this deque. This method differs from pollFirst() only that it throws an exception if this deque is empty.
     *
     * @return the element at the head of this deque.
     * @throws java.util.NoSuchElementException if this deque is empty.
     */
    E removeFirst();

    /**
     * Removes the first occurrence of the specified element from this deque. If the deque does not contain the element, it is unchanged. More formally,
     * removes the first element e such that Objects.equal(o, e) (if such an element exists). Returns {@code true} if this deque contained the specified element
     *
     * @param o the element to be removed from this deque, if present
     * @return {@code true} if an element was removed as a result of this call.
     * @throws ClassCastException   if the class of the specified element is incompatible with this deque
     * @throws NullPointerException if the specified element is null.
     */
    E removeFirstOccurrence(Object o);

    /**
     * Retrieves and removes the last element of this deque. This method differs from pollLast() only that it throws an exception if this deque is empty.
     *
     * @return the element at the tail of this deque.
     * @throws java.util.NoSuchElementException if this deque is empty.
     */
    E removeLast();

    /**
     * Removes the last occurrence of the specified element from this deque. If the deque does not contain the element, it is unchanged. More formally,
     * removes the last element e such that Objects.equal(o, e) (if such an element exists). Returns {@code true} if this deque contained the specified element.
     *
     * @param o the element to be removed from this deque, if present
     * @return {@code true} if an element was removed as a result of this call
     * @throws ClassCastException   if the class of the specified element is incompatible with this deque
     * @throws NullPointerException if the specified element is null.
     */
    E removeLastOccurrence(Object o);
} // UnserDeque
