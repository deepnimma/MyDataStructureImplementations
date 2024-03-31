package org.deepnimma.lists.arraybased;

import java.util.Arrays;
import java.util.Iterator;

import org.deepnimma.abstracts.AbstractUnsortedStructure;
import org.deepnimma.interfaces.GenericStructure;
import org.deepnimma.interfaces.lists.UnsortedStructure;

/**
 * Data structure that allows the user to store any number of elements of type E. Uses an array to store the elements and increments it by a default number or a number
 * set by the user.
 * @param <E> the type of elements to be stored.
 */
public class ArrayList<E> extends AbstractUnsortedStructure<E> implements UnsortedStructure<E>, Iterator<E> {
    private E[] holder;
    private int currEnd = 0;

    /**
     * {@inheritDoc}
     */
    @Override
    protected void _initialize_structure(int initialSize) {
        holder = (E[]) new Object[initialSize];
    } // _initialize_structure

    /**
     * {@inheritDoc}
     */
    @Override
    public Iterator<E> iterator() {
        return Arrays.stream(holder).iterator();
    } // iterator

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean addAll(GenericStructure<? extends E> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean removeAll(GenericStructure<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(GenericStructure<?> c) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(GenericStructure<?> c) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public UnsortedStructure<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E getLast() {
        return null;
    }

    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }
} // ArrayList
