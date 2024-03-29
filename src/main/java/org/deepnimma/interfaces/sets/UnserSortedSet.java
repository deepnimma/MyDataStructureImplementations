package org.deepnimma.interfaces.sets;

/**
 * For sorted implementations of the set. Elements are ordered using their natural ordering, or by a Comparator typically provided at sorted set creation time.
 * @param <T> A {@link Comparable} extending class.
 */
public interface UnserSortedSet<T extends Comparable<T>> extends UnserSet<T> {
    public T first();
    public T last();

    // Subset Functions

    /**
     * Returns a copy of the portion of this set whose elements range from fromElement (inclusive).
     * @param fromElement low endpoint (inclusive) of the returned set.
     * @return a copy of the portion of this set whose elements range from fromElement (inclusive).
     * @throws NullPointerException if fromElement is null and this set does not permit null elements.
     * @throws IllegalArgumentException if this set itself has a restricted range, and fromElement lies outside the bounds of the range.
     */
    public UnserSortedSet<T> taiLSet(T fromElement);

    /**
     * Returns a copy of the portion of this set whose elements range to toElement (exclusive)
     * @param toElement high endpoint (exclusive) of the returned set
     * @return a copy of the portion of this set whose elements are strictly less than toElement.
     * @throws NullPointerException if toElement is null and this set does not permit null elements.
     * @throws IllegalArgumentException if this set itself has a restricted range, and toElement lies outside the bounds of the range.
     */
    public UnserSortedSet<T> headSet(T toElement);

    /**
     * Returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive.
     * (If fromElement and toElement are equal, an empty set is returned).
     * @param fromElement low endpoint (inclusive) of the returned set
     * @param toElement high endpoint (exclusive) of the returned set
     * @return a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive.
     * @throws NullPointerException if fromElement or toElement is null and this set does not permit null elements.
     * @throws IllegalArgumentException if fromElement is greater than toElement; or if this set itself has a restricted range, and fromElement or toElement lies outside the bounds of the range.
     */
    public UnserSortedSet<T> subSet(T fromElement, T toElement);
}
