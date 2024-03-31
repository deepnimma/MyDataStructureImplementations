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
    protected boolean capacityRestriction;

    /**
     * Creates an AbstractUnsortedStructure with the given parameters.
     * @param initialSize The initialSize of the Structure. MUST be {@code initialSize <= CAPACITY}
     * @param capacityRestriction Whether the structure should allow elements to be added past the CAPACITY given.
     * @param capacity The CAPACITY of the Structure, Unneeded if {@code capacityRestriction} is set to false.
     * @throws IllegalArgumentException if the initialSize is less than capacity
     * @throws NullPointerException if any of the parameters are null.
     */
    public AbstractUnsortedStructure(int initialSize, boolean capacityRestriction, int capacity) {
        // Check parameters

        _initialize_structure(initialSize);
        this.size = 0;
        this.capacityRestriction = capacityRestriction;
        this.CAPACITY = capacity;
    } // AbstractUnsortedStructure

    /**
     * Creates an AbstractUnsortedStructure with the given parameters. Defaults CAPACITY to {@code 3 * initialSize}
     * @param initialSize The initialSize of the structure.
     * @param capacityRestriction Whether the structure should allow elements to be added past the CAPACITY
     * @throws NullPointerException if any of the parameters are null.
     */
    public AbstractUnsortedStructure(int initialSize, boolean capacityRestriction) {
        this(initialSize, capacityRestriction, 3 * initialSize);
    } // AbstractUnsortedStructure

    /**
     * Creates an AbstractUnsortedStructure with the given parameters. Defaults capacityRestriction to false.
     * @param initialSize The initialSize of the structure.
     * @throws NullPointerException if any of the parameters are null.
     */
    public AbstractUnsortedStructure(int initialSize) {
        this(initialSize, false, 3 * initialSize);
    } // AbstractUnsortedStructure

    /**
     * Creates an AbstractUnsortedStructure with the given parameter. Defaults initialSize to 10 and capacityRestriction to false.
     */
    public AbstractUnsortedStructure() {
        this(10, false, 3 * 10);
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
    public boolean isEmpty() {
        return this.size() == 0;
    } // isEmpty

    /**
     * {@inheritDoc}
     */
    public int size() {
        return size;
    } // size

    public abstract Iterator<E> iterator() // iterator
    ;
} // AbstractList
