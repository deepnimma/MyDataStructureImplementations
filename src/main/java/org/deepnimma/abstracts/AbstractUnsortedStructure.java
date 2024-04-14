package org.deepnimma.abstracts;

import java.util.Iterator;

import org.deepnimma.interfaces.GenericStructure;
import org.deepnimma.interfaces.lists.UnsortedStructure;

/**
 * Abstract implementation of some of the methods present in the UnsortedStructure interface.
 * CAPACITY is set to {@code 3 * initialSize} by default.
 * @param <E> the element type.
 */
public abstract class AbstractUnsortedStructure<E> implements UnsortedStructure<E> {
    protected int size;
    protected int CAPACITY;

    // Have to recreate the constructors without the CAPACITY restriction
    public AbstractUnsortedStructure(int initialSize, int initialCapacity) {
        if (initialSize <= 0) throw new ArrayStoreException("Unable to create a structure with a negative (or zero) initial size.");
        if (initialCapacity < initialSize) throw new ArrayStoreException("Unable to create a structure with a capacity less than the initial size.");

        size = 0;
        _initialize_structure(initialSize);
    } // AbstractUnsortedStructure

    public AbstractUnsortedStructure(int initialSize) {
        this(initialSize, 2 * initialSize);
    } // AbstractUnsortedStructure

    public AbstractUnsortedStructure() {
        this(4);
    } // AbstractUnsortedStructure

    /**
     * Converts another {@link GenericStructure} to an {@link AbstractUnsortedStructure}.
     * @param c The {@link GenericStructure} to convert.
     * @throws ClassCastException if the elements in the {@link GenericStructure} do not match with this structure.
     * @throws NullPointerException if the parameter is null or contains any null elements.
     */
    public AbstractUnsortedStructure(GenericStructure<? extends E> c) {
        this.addAll(c);
    } // AbstractUnsortedStructure

    /**
     * Initialization of the data structure. If the data structure has no need for an initial size (for example in LinkedList based implementations), then this
     * method should simply initialize the structure by disregarding initialSize.
     * @param initialSize the initial size of the data structure, can be ignored if the data structure does not need an initial size.
     */
    protected abstract void _initialize_structure(final int initialSize);

    /**
     * {@inheritDoc}
     */
    public boolean addAll(GenericStructure<? extends E> c) {
        if (c == null) throw new NullPointerException("Given Class to add cannot be null.");

        for (int i = 0; i < c.size(); i++) {
            this.add(c.get(i));
        } // for

        return true;
    } // addAll

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
