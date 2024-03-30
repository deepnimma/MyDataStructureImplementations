package org.deepnimma.interfaces.sets;

/**
 * For sorted implementations of the set. Elements are ordered using their natural ordering, or by a Comparator typically provided at sorted set creation time.
 * @param <T> A {@link Comparable} extending class.
 */
public interface DNSortedSet<T extends Comparable<T>> extends DNSet<T> {
    /**
     * Returns the first (lowest) element currently in this set.
     * @return the first (lowest) element currently in this set.
     * @throws java.util.NoSuchElementException if this set is empty.
     */
    public T first();

    /**
     * Returns the last (highest) element currently in this set.
     * @return the last (highest) element currently in this set.
     * @throws java.util.NoSuchElementException if this set is empty.
     */
    public T last();

    // Element Retrieval

    /**
     * Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
     * @param e the value to match
     * @return the least element greater than or equal to e, or null if there is no such element.
     * @throws NullPointerException if the specified element is null.
     */
    public T ceiling(T e);

    /**
     * Returns the greatest element in this set smaller than or equal to the given element, or null if there is no such element.
     * @param e the value to match
     * @return the greatest element lesser than or equal to e, or null if there is no such element.
     * @throws NullPointerException if the specified element is null.
     */
    public T floor(T e);

    /**
     * Returns the smallest element in this set strictly more than the given element, or null if there is no such element
     * @param e the value to match
     * @return the smallest element less than e, or null if there is no such element.
     * @throws NullPointerException if the specified element is null.
     */
    public T higher(T e);

    /**
     * Returns the greatest element in this set strictly less than the given element, or null if there is no such element
     * @param e the value to match.
     * @return the greatest element less than e, or null if there is no such element.
     * @throws NullPointerException if the specified element is null.
     */
    public T lower(T e);

    // Element removal

    /**
     * Retrieves and removes the first (lowest) element, or returns null if this set is empty.
     * @return the first element, or null if this set is empty.
     */
    public T pollFirst();

    /**
     * Retrieves and removes the last (highest) element, or returns null if this set is empty.
     * @return the last element, or null if this set is empty.
     */
    public T pollLast();

    // Subset Functions
    /**
     * Returns a copy of the portion of this set whose elements range to toElement (exclusive)
     * @param toElement high endpoint (exclusive) of the returned set
     * @return a copy of the portion of this set whose elements are strictly less than toElement.
     * @throws NullPointerException if toElement is null and this set does not permit null elements.
     * @throws IllegalArgumentException if toElement lies outside the bounds of the range.
     */
    public DNSortedSet<T> headSet(T toElement);

    /**
     * Returns a copy of the portion of this set whose elements range to toElement (and also allows the user to choose whether toElement is inclusive or exclusive)
     * @param toElement high endpoint of the returned set
     * @param toElementInclusive whether {@code toElement} is inclusive or exclusive
     * @return a copy of the portion of this set according to the parameters.
     * @throws NullPointerException if toElement is null and this set does not permit null elements.
     * @throws IllegalArgumentException if toElement lies outside the bounds of the range.
     */
    public DNSortedSet<T> headSet(T toElement, boolean toElementInclusive);

    /**
     * Returns a copy of the portion of this set whose elements range from fromElement (inclusive).
     * @param fromElement low endpoint (inclusive) of the returned set.
     * @return a copy of the portion of this set whose elements range from fromElement (inclusive).
     * @throws NullPointerException if fromElement is null and this set does not permit null elements.
     * @throws IllegalArgumentException if this set itself has a restricted range, and fromElement lies outside the bounds of the range.
     */
    public DNSortedSet<T> tailSet(T fromElement);

    /**
     * Returns a copy of the portion of this set whose elements range to toElement (and also allows the user to choose whether toElement is inclusive or exclusive)
     * @param fromElement high endpoint of the returned set
     * @param fromElementInclusive whether {@code fromElement} is inclusive or exclusive
     * @return a copy of the portion of this set according to the parameters.
     * @throws NullPointerException if toElement is null and this set does not permit null elements.
     * @throws IllegalArgumentException if toElement lies outside the bounds of the range.
     */
    public DNSortedSet<T> tailSet(T fromElement, boolean fromElementInclusive);

    /**
     * Returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive.
     * (If fromElement and toElement are equal, an empty set is returned).
     * @param fromElement low endpoint (inclusive) of the returned set
     * @param toElement high endpoint (exclusive) of the returned set
     * @return a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive.
     * @throws NullPointerException if fromElement or toElement is null and this set does not permit null elements.
     * @throws IllegalArgumentException if fromElement is greater than toElement; or if this set itself has a restricted range, and fromElement or toElement lies outside the bounds of the range.
     */
    public DNSortedSet<T> subSet(T fromElement, T toElement);

    public DNSet<T> descendingSet();
}
