package org.deepnimma.interfaces.lists;

import org.deepnimma.interfaces.GenericStructure;

/**
 * An unsorted ordered collection.
 *
 * @param <E> The type of elements to hold.
 */
public interface UnsortedStructure<E> extends GenericStructure<E> {
    /**
     * Returns a copy of the portion of the list between the specified fromIndex (inclusive) and toIndex (exclusive).
     *
     * @param fromIndex low endpoint (inclusive) of the subList
     * @param toIndex   high endpoint (exclusive) of the subList
     * @return a view of the specified range within this list
     * @throws IndexOutOfBoundsException for an illegal endpoint index value (fromIndex < 0 || toIndex > size || fromIndex > toIndex).
     */
    UnsortedStructure<E> subList(int fromIndex, int toIndex);

    // Index Finders

    /**
     * Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
     *
     * @param o element to search for.
     * @return the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
     * @throws NullPointerException if the specified parameter is null.
     */
    int indexOf(Object o);

    /**
     * Returns the last index of the occurrence of the specified element in this list, or -1 if this list does not contain the element.
     *
     * @param o element to search for.
     * @return the last index of the occurrence of the specified element in this list, or -1 if this list does not contain the element.
     * @throws NullPointerException if the specified parameter is null.
     */
    int lastIndexOf(Object o);

    // Accessors

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index > size())
     */
    E get(int index);

    /**
     * Returns the last element in this list.
     *
     * @return the last element in this list.
     */
    E getLast();

    /**
     * Returns the first element in this list.
     *
     * @return the first element in this list.
     */
    E getFirst();

    // Mutators

    /**
     * Replaces the element at the specified position in this list with the specific element
     *
     * @param index   the index to replace the element at.
     * @param element the element to replace with.
     * @return the previous element
     * @throws IndexOutOfBoundsException if the index given is out of bounds
     * @throws NullPointerException      if any of the given parameters are null.
     */
    E set(int index, E element);
}
