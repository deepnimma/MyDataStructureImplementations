package org.deepnimma.abstracts;

import org.deepnimma.interfaces.DataStructure;
import org.deepnimma.interfaces.UnsortedDataStructure;

public abstract class UnsortedAbstractStructure<T extends Comparable<T>> extends SortedAbstractStructure<T>
        implements UnsortedDataStructure<T> {

    /**
     * Default constructor for an UnsortedAbstractStructure.
     */
    protected UnsortedAbstractStructure() {
        super();
    } // UnsortedAbstractStructure

    /**
     * Constructor to convert a different DataStructure into an UnsortedAbstractStructure.
     */
    protected UnsortedAbstractStructure(DataStructure<T> otherStructure) {
        super(otherStructure);
    } // UnsortedAbstractStructure
} // UnsortedAbstractStructure
