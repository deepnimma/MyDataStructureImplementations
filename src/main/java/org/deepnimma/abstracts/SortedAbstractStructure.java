package org.deepnimma.abstracts;

import org.deepnimma.interfaces.DataStructure;
import org.deepnimma.interfaces.SortedDataStructure;

public abstract class SortedAbstractStructure<T extends Comparable<T>> implements SortedDataStructure<T>, Cloneable {
    protected boolean reversed;

    /**
     * Default constructor for SortedAbstractStructure
     */
    protected SortedAbstractStructure() {
        reversed = false;
    } // SortedAbstractStructure

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

    /**
     * {@inheritDoc}
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    } // clone
} // SortedAbstractStructure
