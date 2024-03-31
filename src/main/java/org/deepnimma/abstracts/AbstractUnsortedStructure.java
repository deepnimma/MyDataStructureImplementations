package org.deepnimma.abstracts;

import java.util.Iterator;

import org.deepnimma.interfaces.GenericStructure;
import org.deepnimma.interfaces.lists.UnsortedStructure;

/**
 * Abstract implementation of some of the methods present in the UnsortedStructure interface.
 * @param <E> the element type.
 */
public abstract class AbstractUnsortedStructure<E> implements UnsortedStructure<E> {
    public int size;

    /**
     * {@inheritDoc}
     */
    public boolean isEmpty() {
        return this.size() == 0;
    } // isEmpty

    /**
     * {@inheritDoc}
     */
    public int size() {
        return size;
    } // size
} // AbstractList
