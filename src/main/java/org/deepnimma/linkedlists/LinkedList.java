package org.deepnimma.linkedlists;

import org.deepnimma.interfaces.DataStructure;
import org.deepnimma.interfaces.UnsortedDataStructure;

/**
 * A unsorted implementation of the LinkedList data structure.
 */
public class LinkedList<T extends Comparable<T>> implements UnsortedDataStructure<T> {
    /**
     * {@inheritDoc}
     */
    @Override
    public void insert(T data) {
        throw new UnsupportedOperationException("not yet implemented.");
    } // insert

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(T data) {
        throw new UnsupportedOperationException("not yet implemented.");
    } // delete

    /**
     * {@inheritDoc}
     */
    @Override
    public int search(T data) {
        throw new UnsupportedOperationException("not yet implemented.");
    } // search

    /**
     * {@inheritDoc}
     */
    @Override
    public void print() {
        throw new UnsupportedOperationException("not yet implemented.");
    } // print

    /**
     * {@inheritDoc}
     */
    @Override
    public T get(int index) {
        throw new UnsupportedOperationException("not yet implemented.");
    } // get

    /**
     * {@inheritDoc}
     */
    @Override
    public int size() {
        throw new UnsupportedOperationException("not yet implemented.");
    } // size

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeDuplicates() {
        throw new UnsupportedOperationException("not yet implemented.");
    } // removeDuplicates

    /**
     * {@inheritDoc}
     */
    @Override
    public void combine(DataStructure<T> secondStructure) {
        throw new UnsupportedOperationException("not yet implemented.");
    } // combine

    /**
     * {@inheritDoc}
     */
    @Override
    public void intersect(DataStructure<T> secondStructure) {
        throw new UnsupportedOperationException("not yet implemented.");
    } // intersect

    /**
     * {@inheritDoc}
     */
    @Override
    public DataStructure<T> subStructure(int startIndex, int endIndex) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void sort() {
        throw new UnsupportedOperationException("not yet implemented.");
    } // sort

    /**
     * {@inheritDoc}
     */
    @Override
    public void reverseSort() {
        throw new UnsupportedOperationException("not yet implemented.");
    } // reverseSort
} // LinkedList
