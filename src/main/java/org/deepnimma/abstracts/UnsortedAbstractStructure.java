package org.deepnimma.abstracts;

import org.deepnimma.interfaces.DataStructure;
import org.deepnimma.interfaces.UnsortedDataStructure;

public abstract class UnsortedAbstractStructure<T extends Comparable<T>> extends SortedAbstractStructure<T>
        implements UnsortedDataStructure<T> {
    /**
     * {@inheritDoc}
     */
    protected UnsortedAbstractStructure(DataStructure<T> otherStructure) {
        super(otherStructure);
    } // UnsortedAbstractStructure
} // UnsortedAbstractStructure
