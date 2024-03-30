package org.deepnimma.interfaces.lists;

import org.deepnimma.interfaces.GenericStructure;

/**
 * A sorted ordered collection. Allows indexed access to list elements and are zero based.
 *
 * @param <T>
 */
public interface SortedStructure<T extends Comparable<T>> extends GenericStructure<T> {
    /**
     * Returns a list containing the elements of the given Collection, in its iteration order. The given Collection must not be null, and it must not contain any null elements.
     *
     * @param coll a Collection from which elements are drawn, must be non-null
     * @param <E>  The SortedStructure element's type
     * @return a SortedStructure containing the elements of the given collection.
     * @throws NullPointerException if coll is null, or if it contains any nulls
     * @throws ClassCastException   if the coll contains any elements that cannot be added to the copy is.
     */
    static <E extends Comparable<E>> SortedStructure<E> copyOf(GenericStructure<? extends E> coll) {
        throw new UnsupportedOperationException("This method has not been implemented for this class.");
    } // copyOf

    /**
     * Returns a copy of the portion of the list between the specified fromIndex (inclusive) and toIndex (exclusive).
     *
     * @param fromIndex low endpoint (inclusive) of the subList
     * @param toIndex   high endpoint (exclusive) of the subList
     * @return a view of the specified range within this list
     * @throws IndexOutOfBoundsException for an illegal endpoint index value (fromIndex < 0 || toIndex > size || fromIndex > toIndex).
     */
    SortedStructure<T> subList(int fromIndex, int toIndex);

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
    T get(int index);

    /**
     * Returns the last element in this list.
     *
     * @return the last element in this list.
     */
    T getLast();

    /**
     * Returns the first element in this list.
     *
     * @return the first element in this list.
     */
    T getFirst();

} // SortedStructure
