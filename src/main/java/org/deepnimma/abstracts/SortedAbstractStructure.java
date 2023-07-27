package org.deepnimma.abstracts;

import org.deepnimma.interfaces.DataStructure;
import org.deepnimma.interfaces.SortedDataStructure;

public abstract class SortedAbstractStructure<T extends Comparable<T>> implements SortedDataStructure<T> {
    protected boolean reversed;

    /**
     * Converts another {@link org.deepnimma.interfaces.DataStructure} to the current data structure.
     * @param otherStructure the other structure to convert.
     */
    protected SortedAbstractStructure(DataStructure<T> otherStructure) {
        insertAll(otherStructure);
    } // SortedAbstractStructure

    /**
     * {@inheritDoc}
     */
    public boolean isEmpty() {
        return size() == 0;
    } // isEmpty
} // SortedAbstractStructure
