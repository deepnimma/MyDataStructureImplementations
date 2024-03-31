package org.deepnimma.interfaces;

import java.util.Iterator;

/**
 * The root interface for any of Data Structure present in this project. Both Sorted and Unsorted Data Structures
 * will be implementing this interface. Contains a lot of functions from Java library's Collection and List interfaces
 * <p>
 * Interface also contains optional functions. Should throw {@link UnsupportedOperationException} if the method
 * is not implemented.
 * <p>
 * All general-purpose UnsortedStructure classes should include at least 2 constructors. One void (no arguments) constr-
 * ctor, which creates an empty collection, and a constructor with a single argument of type Collection, which creates
 * a new collection with the same elements as its argument.
 * <p>
 * Most implementations do not allow null elements, and can throw an unchecked NullPointerException.
 *
 * @param <E> The class being held in the data structure. Some data structures (especially the sorted implementations)
 *            will require this class to extend {@link Comparable<E>}.
 */
public interface GenericStructure<E> extends Iterator<E> {

    // addition functions

    /**
     * Ensures that this collection contains the specified element. Returns {@code true} if this collection changed as
     * a result of the cell. (Returns {@code false} if this collection does not permit duplicates and already contains
     * the specified element).
     * <p>
     * If a collection refuses to add a particular element for any reason other than that it already contains the element
     * it must throw an exception (rather than returning {@code false}.
     *
     * @param e element whose presence in this collection must be ensured (man these javadoc writers sure were
     *          pretentious).
     * @return {@code} true if this collection changed as a result of the call.
     * @throws UnsupportedOperationException if the add operation is not supported by this collection.
     * @throws ClassCastException            if the class of the specified element prevents it from being added to this collection.
     * @throws NullPointerException          if the specified element is {@code null} and this collection does not permit {@code null}
     *                                       elements.
     * @throws IllegalArgumentException      if some property of the element prevents it from being added to this collection.
     * @throws IllegalStateException         if the element cannot be added at this time due to insertion restrictions.
     */
    boolean add(E e);

    /**
     * Adds all the elements in the specified collection to this collection. (NOT THREAD SAFE)
     *
     * @param c collection containing elements to be added to this collection.
     * @return {@code true} if this collection was changed as a result of the call.
     * @throws NullPointerException          if the specified collection is null or contains a null element.
     * @throws UnsupportedOperationException if the method is not implemented
     * @throws ClassCastException            if the class of an element of the specified collection prevents it from being added to this collection.
     * @throws IllegalArgumentException      if some property of the element prevents it from being added to this collection.
     * @throws IllegalStateException         if the element cannot be added at this time due to insertion restrictions.
     */
    boolean addAll(GenericStructure<? extends E> c);

    // destructor functions

    /**
     * Removes all the elements from this collection. The collection will be empty after this method returns.
     *
     * @throws UnsupportedOperationException if the {@code clear} operation is not supported by this collection.
     */
    void clear();

    /**
     * Removes a single instance of the specified element from this collection, if it is present. More formally, removes
     * an element e such that Objects.equals(o, e), if this collection contains one or more such elements. Returns {@code true} if this collection contained the specific
     * element (or equivalently, if this collection changed as a result of the call).
     *
     * @param o element to be removed from this collection, if present
     * @return {@code true} if an element was removed as a result of this call.
     * @throws ClassCastException   if the type of the specified element is incompatible with this collection.
     * @throws NullPointerException if the specified element is null.
     */
    boolean remove(Object o);

    /**
     * Removes all of this collection elements that are also contained in the specified collection. After this call returns, this collection will contain no elements in common with the specified collection.
     *
     * @param c collection containing elements to be removed from this collection.
     * @return {@code true} if the collection changed as a result of this call.
     * @throws UnsupportedOperationException if the {@code removeAll} method is not supported by this collection.
     * @throws ClassCastException            if the types of one or more elements in this collection are incompatible with the specified collection.
     * @throws NullPointerException          if any element of the specified collection is null, or the specified collection is null itself.
     */
    boolean removeAll(GenericStructure<?> c);

    /**
     * Retains only the elements that are contained in the specified collection.
     *
     * @param c collection containing elements to be retained.
     * @return {@code true} if the collection changed as a result of the call.
     * @throws UnsupportedOperationException if the retainAll operation is not supported by this collection.
     * @throws ClassCastException            if the types of one or more elements in this collection are incompatible with the specified collection.
     * @throws NullPointerException          if this collection given is null.
     */
    boolean retainAll(GenericStructure<?> c);

    // viewer functions

    /**
     * Returns the number of elements in the collection. if this collection contains more than Integer.MAX_VALUE,
     * returns Integer.MAX_VALUE
     *
     * @return the number of elements in this collection.
     */
    int size();

    // checker functions

    /**
     * Returns {@code true} if this collection contains the specific element. More formally, returns {@code true} if and
     * only if this collection contains at least one element e such that Objects.equals(o, e);
     *
     * @param o element whose presence in this collection is to be tested.
     * @return {@code true} if this collection contains the specified element.
     * @throws NullPointerException if the specified element is null and this collection does not permit null
     *                              elements.
     */
    boolean contains(Object o);

    /**
     * Returns {@code true} if this collection contains all the elements in the specified collection.
     *
     * @param c collection to be checked for containment in this collection.
     * @return {@code true} if this collection contains all the elements in the specific collection.
     * @throws NullPointerException if the specified collection is null or contains any null elements inside of it.
     */
    boolean containsAll(GenericStructure<?> c);

    /**
     * Compares the specified object with this collection for equality.
     *
     * @param o object to be compared for equality with this collection.
     * @return {@code true} if the specified object is equal to this collection.
     */
    boolean equals(Object o);

    /**
     * Returns {@code true} if this collection contains no elements.
     *
     * @return {@code true} if this collection contains no elements.
     */
    boolean isEmpty();

    // converter functions

    /**
     * Returns an array containing all the elements in this GenericStructure.
     *
     * @return an array containing all the elements in this GenericStructure.
     */
    Object[] toArray();

    /**
     * Returns an array containing all the elements in this collection; the runtime type of the returned array is that
     * of the specified array. If the collection fits in the specified array, it is returned therin. Otherwise, a new
     * array is allocated with the runtime type of the specified array and the size of the collection.
     * <p>
     * If this collection fits in the specified array with room to spare, the element in the array immediately following
     * the end of the collection is set to null.
     *
     * @param a   the array into which the elements of this collection are to be stored, if it is big enough; otherwise
     *            a new array of the same runtime type is allocated for this purpose.
     * @param <T> The component type of the array to contain the collection.
     * @return an array containing all the elements in this collection.
     * @throws ArrayStoreException  if the runtime type of any element in this collection is not assignable to the
     *                              runtime component type of the specified array.
     * @throws NullPointerException if the specified array is {@code null}.
     */
    <T> T[] toArray(T[] a);

    /**
     * {@inheritDoc}
     */
    @Override
    String toString();

} // UnsortedStructure
